package com.example.scheduler;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class TestScheduler {
    // k8s create job
    // add cron to job
    // call api which you create: v1/scheduler/birthday for example

    //different types of make service repetitive, in detail please check ->
    // -> https://www.baeldung.com/spring-scheduled-tasks
    @Scheduled(fixedDelayString = "PT1M") //every 1 min
/*
           @SchedulerLock(name = "print-hello-world",
           lockAtLeastForString = "PT5M",
            lockAtMostForString = "PT30M")

 */
    public void printTestScheduler() {
        System.out.println("Test Scheduler Worked");
    }
}