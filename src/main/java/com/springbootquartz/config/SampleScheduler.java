//package com.springbootquartz.config;
//
//import com.springbootquartz.job.SampleJob;
//import org.quartz.*;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//@Configuration
//public class SampleScheduler {
//    @Bean
//    public JobDetail sampleJobDetail(){
//
//        return JobBuilder.newJob(SampleJob.class).withIdentity("SampleJob")
//                .usingJobData("name","sida").storeDurably().build();
//    }
//
//    @Bean
//    public Trigger sampleJobTrigger(){
//
//        //每隔两秒执行一次
//        SimpleScheduleBuilder scheduleBuilder = SimpleScheduleBuilder.simpleSchedule()
//                .withIntervalInSeconds(100).repeatForever();
//        return TriggerBuilder.newTrigger().forJob(sampleJobDetail())
//                .withIdentity("sampletrigger").withSchedule(scheduleBuilder).build();
//
//    }
//}
