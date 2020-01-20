package com.quartz;

import org.quartz.*;
import org.quartz.impl.StdSchedulerFactory;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class MySchedulerTest {

    public static void main(String args[]) throws Exception {

        Date date = new Date();
        SimpleDateFormat sf = new SimpleDateFormat("yy-MM-dd HH-mm-ss");
        //距离当前时间3秒后开始执行
        date.setTime(date.getTime()+1000L);
        Date endDate = new Date();
        //距离当前时间6秒后结束
        endDate.setTime(endDate.getTime()+3000L);
        //1创建调度器Scheduler
        StdSchedulerFactory schedulerFactory  = new StdSchedulerFactory();
        Scheduler scheduler = schedulerFactory.getScheduler();

        //2创建JobDetail实例，并与JobTest类绑定(Job执行内容)
        JobDetail jobDetail = JobBuilder.newJob(JobTest.class).withIdentity("trigger1", "triggerGroup1").build();
        //3创建Tigger实例，每隔一秒执行一次
        Trigger trigger = TriggerBuilder.newTrigger().withIdentity("trigger1", "triggerGroup1")
//                .startAt(date)
//                .endAt(endDate)
               // .withSchedule(SimpleScheduleBuilder.simpleSchedule().withIntervalInSeconds(2)).build();
                .withSchedule(CronScheduleBuilder.cronSchedule("* * * * * ?")).build();

        //4执行
        scheduler.scheduleJob(jobDetail,trigger);
        System.out.println("--------scheduler start ! ------------");
        scheduler.start();
        //5睡眠 一分钟后停止
        //TimeUnit.MINUTES.sleep(1);
        TimeUnit.SECONDS.sleep(3);
        //shutdown(true)表示等待所有正在执行额job执行完毕之后，再关闭scheduler
        //shutdown（false）即shutdown()表示直接关闭scheduler
        scheduler.shutdown(true);

        System.out.println("scheduler  shutdown ! !");
//        System.exit(-1);
    }
}
