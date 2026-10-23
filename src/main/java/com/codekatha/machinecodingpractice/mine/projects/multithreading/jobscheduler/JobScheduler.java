package com.codekatha.machinecodingpractice.mine.projects.multithreading.jobscheduler;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.PriorityBlockingQueue;

public class JobScheduler {

    private final PriorityBlockingQueue<Job> queue = new PriorityBlockingQueue<>();
    private final ExecutorService workers;
    private final Thread dispatcher;
    private volatile boolean running = true;

    public JobScheduler(int workerCount) {
        this.workers = Executors.newFixedThreadPool(workerCount);
        this.dispatcher = new Thread(this::dispatchLoop);
    }

    public void submit(Job job) {
        queue.offer(job);
    }

    private void dispatchLoop() {
        while (running) {
            try {
                Job job = queue.take();
                long delay = job.getScheduledTime() - System.currentTimeMillis();
                if (delay > 0) {
                    queue.offer(job);
                    Thread.sleep(Math.min(delay, 100));
                }
                workers.submit(() -> runJob(job));
            }
        catch(InterruptedException ex){
            Thread.currentThread().interrupt();
            System.out.println(ex.getMessage());
            break;
        }
    }
    }

    private void runJob(Job job) {
        // TODO: job.task.run() try-catch me (ek job fail ho to poora scheduler na mare)
        // TODO: finally me - agar recurring hai (intervalMillis > 0) aur running hai,
        //       naya scheduledTime set karo aur job ko wapas queue me daalo
    }

    public void shutdown() {
        // TODO: running = false, dispatcher.interrupt(), workers.shutdown()
    }

}
