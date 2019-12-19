//package com.quartz;
//
//import org.quartz.*;
//import org.quartz.impl.StdSchedulerFactory;
//
//import java.util.concurrent.TimeUnit;
//
//public class MySchedulerTest {
//
//    public static void main(String args[]) throws Exception {
//
//        //1创建调度器Scheduler
//        StdSchedulerFactory schedulerFactory  = new StdSchedulerFactory();
//        Scheduler scheduler = schedulerFactory.getScheduler();
//        //2创建JobDetail实例，并与JobTest类绑定(Job执行内容)
//        JobDetail jobDetail = JobBuilder.newJob(JobTest.class).withIdentity("job1", "group1").build();
//        //3创建Tigger实例，每隔一秒执行一次
//        Trigger trigger = TriggerBuilder.newTrigger().withIdentity("trigger1", "triggerGroup1")
//                .startNow()//立即生效
//                //每隔一秒执行一次，一直执行
//                //.withSchedule(SimpleScheduleBuilder.simpleSchedule().withIntervalInSeconds(1).repeatForever()).build();
//                .withSchedule(CronScheduleBuilder.cronSchedule("0/5 * * * * ?")).build();
//
//        //4执行
//        scheduler.scheduleJob(jobDetail,trigger);
//        System.out.println("--------scheduler start ! ------------");
//        scheduler.start();
//        //5睡眠
//        TimeUnit.MINUTES.sleep(1);
//        scheduler.shutdown();
//
//        System.out.println("scheduler  shutdown ! !");
//    }
//}
