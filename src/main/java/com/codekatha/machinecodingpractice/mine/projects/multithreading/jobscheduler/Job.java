package com.codekatha.machinecodingpractice.mine.projects.multithreading.jobscheduler;

import lombok.Getter;

@Getter
public class Job implements Comparable<Job> {
    private final String jobId;
    private final Runnable task;
    private final long scheduledTime;   // epoch millis - kab chalna hai
    private final long intervalMillis;  // 0 = one-time, >0 = recurring
    private final int priority;

    private Job(JobBuilder b) {
        this.jobId = b.jobId;
        this.task = b.task;
        this.scheduledTime = b.scheduledTime;
        this.intervalMillis = b.intervalMillis;
        this.priority = b.priority;
    }


    @Override
    public int compareTo(Job other) {
        int val = Long.compare(this.scheduledTime,other.scheduledTime);
        if(val==0){
            return Long.compare(other.priority,this.priority);
        }
        return val;
    }
    public static class JobBuilder{
        String jobId;
        Runnable task;
        long scheduledTime;
        long intervalMillis;
        int priority;

        public JobBuilder jobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public JobBuilder task(Runnable task) {
            this.task = task;
            return this;
        }
        public JobBuilder scheduledTime(long scheduledTime) {
            this.scheduledTime = scheduledTime;
            return this;
        }
        public JobBuilder intervalMillis(long intervalMillis) {
            this.intervalMillis = intervalMillis;
            return this;
        }
        public JobBuilder priority(int priority) {
            this.priority = priority;
            return this;
        }

        public Job build(){
            return new Job(this);
        }
    }
}
