package com.codekatha.machinecodingpractice.mine.projects.multithreading.sudoku;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicBoolean;


public class SuDoKuConcurrent {

    private final int[][] board;

    public SuDoKuConcurrent(int[][] board) {
        this.board = board;
    }

    // ---------------------------------------------------------------------
    // Already-solved single-threaded checks, carried over as-is from SuDoKu.java.
    // These are correct - reuse them as the actual work each thread will do.
    // ---------------------------------------------------------------------

    private boolean checkRow(int row) {
        boolean[] seen = new boolean[10];
        for (int i = 0; i < 9; i++) {
            if (board[row][i] == 0) continue;
            if (seen[board[row][i]]) return false;
            seen[board[row][i]] = true;
        }
        return true;
    }

    private boolean checkCol(int col) {
        boolean[] seen = new boolean[10];
        for (int i = 0; i < 9; i++) {
            if (board[i][col] == 0) continue;
            if (seen[board[i][col]]) return false;
            seen[board[i][col]] = true;
        }
        return true;
    }

    private boolean checkBox(int boxIndex) {
        int startRow = (boxIndex / 3) * 3;
        int startCol = (boxIndex % 3) * 3;
        boolean[] seen = new boolean[10];
        for (int r = startRow; r < startRow + 3; r++) {
            for (int c = startCol; c < startCol + 3; c++) {
                if (board[r][c] == 0) continue;
                if (seen[board[r][c]]) return false;
                seen[board[r][c]] = true;
            }
        }
        return true;
    }

    // ---------------------------------------------------------------------
    // YOUR PART: make this run concurrently instead of sequentially.
    //
    // There are 27 independent checks total (9 rows + 9 cols + 9 boxes). None of
    // them write to `board` - they only read it - so there's nothing to
    // synchronize about the board itself. That's the whole reason this problem
    // is a clean fit for multithreading.
    //
    // STEP 1 - Create a thread pool.
    //   ExecutorService pool = Executors.newFixedThreadPool(?)
    //   Pick a pool size and be ready to explain WHY you picked it.
    //
    // STEP 2 - Build the task list.
    //   List<Callable<Boolean>> tasks = new ArrayList<>();
    //   For i = 0 to 8, add THREE Callable<Boolean> entries: one running
    //   checkRow(i), one running checkCol(i), one running checkBox(i).
    //   A Callable is just: () -> checkRow(someIndex)
    //   Gotcha to watch for: a plain for-loop variable `i` is not
    //   effectively-final, so a lambda capturing it directly won't compile -
    //   you'll need a final copy inside the loop body.
    //
    // STEP 3 - Run them and wait for all results.
    //   List<Future<Boolean>> results = pool.invokeAll(tasks);
    //   invokeAll submits every task to the pool and BLOCKS the calling thread
    //   until every single one has finished, then hands back a Future per task
    //   in the same order you submitted them.
    //
    // STEP 4 - Read the results.
    //   Loop over `results`, call future.get() on each. If any of them is
    //   false, the board is invalid. get() declares checked exceptions
    //   (InterruptedException, ExecutionException) - decide how this method
    //   should handle or propagate those.
    //
    // STEP 5 - Shut the pool down.
    //   Always pool.shutdown() in a finally block, so the worker threads don't
    //   sit alive forever after this method returns.
    // ---------------------------------------------------------------------
    public boolean isValidConcurrent() throws Exception {
        // TODO: implement using the steps above.
        ExecutorService pool = Executors.newFixedThreadPool(9);

        List<Callable<Boolean>> task = new ArrayList<>();

        for(int i=0; i<9; i++){
            final int idx = i; // lambda me bas final paas hota hai.
            task.add(()->checkRow(idx));
            task.add(()->checkCol(idx));
            task.add(()->checkBox(idx));
        }
        try {
            List<Future<Boolean>> results = pool.invokeAll(task);
            AtomicBoolean invalid = new AtomicBoolean(false);
            for (var r : results) {
                if (!r.get()) return false;
            }
            return true;
        } catch (InterruptedException e) {
            //gar InterruptedException catch kiya aur khud turant rukk nahi rahe ho,
            // to interrupt() call karke signal ko aage pass karo — chup mat raho.
            Thread.currentThread().interrupt();
            throw new RuntimeException(e);
        }finally {
            pool.shutdown();
        }
    }
    // ---------------------------------------------------------------------
    // FOLLOW-UP: early-exit version.
    //
    // isValidConcurrent() above waits for all 27 tasks to finish even if the
    // very first one already proves the board invalid. Fix that using a
    // shared AtomicBoolean flag that every task checks before doing its real
    // work.
    //
    // STEP 1 - Create ONE shared flag before building the task list:
    //   AtomicBoolean invalid = new AtomicBoolean(false);
    //   (declare it once, outside the loop, so every lambda captures the
    //   same instance - unlike the int idx trick, you don't need a "final
    //   copy per iteration" here. Think about why: is the *reference* to
    //   the AtomicBoolean object changing each loop iteration, or only the
    //   *value inside* it?)
    //
    // STEP 2 - Change how each Callable is built. Instead of
    //   () -> checkRow(idx)
    //   it now needs to be roughly:
    //   () -> {
    //       if (invalid.get()) return false;         // someone already failed, skip real work
    //       boolean ok = checkRow(idx);
    //       if (!ok) invalid.set(true);               // tell everyone else
    //       return ok;
    //   }
    //   Do this for checkRow, checkCol AND checkBox versions of the lambda.
    //
    // STEP 3, 4, 5 - same as isValidConcurrent(): pool.invokeAll(tasks),
    //   loop the Futures checking .get(), shutdown in finally, restore the
    //   interrupt flag on InterruptedException same as before.
    // ---------------------------------------------------------------------
    public boolean isValidConcurrentEarlyExit() throws Exception {
        AtomicBoolean invalid = new AtomicBoolean(false); // ek hi shared flag, sab lambdas isi ko dekhenge

        ExecutorService pool = Executors.newFixedThreadPool(9);
        List<Callable<Boolean>> tasks = new ArrayList<>();

        for (int i = 0; i < 9; i++) {
            final int idx = i; // idx ka apna copy chahiye (jaisa pehle wale method me kiya tha)

            tasks.add(() -> {
                if (invalid.get()) return false;       // koi aur pehle hi fail kar chuka -> kaam mat karo
                boolean ok = checkRow(idx);
                if (!ok) invalid.set(true);             // baaki sabko batao
                return ok;
            });
            tasks.add(() -> {
                if (invalid.get()) return false;
                boolean ok = checkCol(idx);
                if (!ok) invalid.set(true);
                return ok;
            });
            tasks.add(() -> {
                if (invalid.get()) return false;
                boolean ok = checkBox(idx);
                if (!ok) invalid.set(true);
                return ok;
            });
        }

        try {
            List<Future<Boolean>> results = pool.invokeAll(tasks);
            for (var r : results) {
                if (!r.get()) return false;
            }
            return true;
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw new RuntimeException(e);
        } finally {
            pool.shutdown();
        }
    }
}
