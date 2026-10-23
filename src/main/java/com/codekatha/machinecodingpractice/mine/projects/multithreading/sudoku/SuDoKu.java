package com.codekatha.machinecodingpractice.mine.projects.multithreading.sudoku;

public class SuDoKu {

    private final int[][] board;

    public SuDoKu(int[][] board) {
        // TODO: store the board. Defensive copy needed, or is reference fine here?
        this.board = board;
    }

    public boolean isValid() {
        // TODO: run checkRow/checkCol/checkBox for all 9 indices, single-threaded for now.
        for(int i=0;i<9;i++){
            if(!checkRow(i)) return false;
        }
        for(int i=0;i<9;i++){
            if(!checkCol(i)) return false;
        }
        for(int i=0;i<9;i++){
            if(!checkBox(i)) return false;
        }
        return true;
    }

    private boolean checkRow(int row) {
        // TODO: 1-9 must be unique in this row, ignore empty cells.
        boolean[] seen = new boolean[10];//0-9 value total 10
        for(int i=0;i<9;i++){
            if(board[row][i]==0) continue;
            if(seen[board[row][i]]) return false;
            seen[board[row][i]] = true;
        }
        return true;
    }

    private boolean checkCol(int col) {
        // TODO: 1-9 must be unique in this column, ignore empty cells.
        boolean[] seen = new boolean[10];//0-9 value total 10
        for(int i=0;i<9;i++){
            if(board[i][col]==0) continue;
            if(seen[board[i][col]]) return false;
            seen[board[i][col]] = true;
        }
        return true;
    }

    private boolean checkBox(int boxIndex) {
        // TODO: boxIndex is 0-8. Derive startRow/startCol from it, then check the 3x3 block.
        int startRow = (boxIndex/3) * 3;
        int startCol = (boxIndex%3) * 3;
        boolean[] seen = new boolean[10];//0-9

        for(int r=startRow; r<startRow+3; r++){
            for(int c=startCol; c<startCol+3; c++){
                if(board[r][c]==0) continue;
                if(seen[board[r][c]]) return false;
                seen[board[r][c]] = true;
            }
        }
        return true;
    }
}
