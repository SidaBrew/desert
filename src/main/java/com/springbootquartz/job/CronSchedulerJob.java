//package com.springbootquartz.job;
//
//import org.quartz.*;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
//
//@Component
//public class CronSchedulerJob {
//    @Autowired
//    private SchedulerFactory schedulerFactoryBean;
//
//    public void schedulerJob1(Scheduler scheduler) throws SchedulerException {
//
//        JobDetail jobDetail = JobBuilder.newJob(ScheduledJob.class).withIdentity("job1", "groupid").build();
//        // 6的倍数秒执行 也就是 6 12 18 24 30 36 42 ....
//        CronScheduleBuilder cronScheduleBuilder = CronScheduleBuilder.cronSchedule("0/6 * * * * ?");
//        CronTrigger cronTrigger = TriggerBuilder.newTrigger().withIdentity("trigger1", "group1")
//                .usingJobData("name", "lala").withSchedule(cronScheduleBuilder).build();
//
//        scheduler.scheduleJob(jobDetail, cronTrigger);
//
//    }
//
//    public void schedulerJob2(Scheduler scheduler) throws SchedulerException {
//
//        JobDetail jobDetail = JobBuilder.newJob(ScheduledJob2.class).withIdentity("job1", "group1").build();
//        // 6的倍数秒执行 也就是 6 12 18 24 30 36 42 ....
//        CronScheduleBuilder cronSchedule = CronScheduleBuilder.cronSchedule("0/6 * * * * ?");
//        CronTrigger cronTrigger = TriggerBuilder.newTrigger().withIdentity("trigger1", "group1")
//                .usingJobData("name", "brew").withSchedule(cronSchedule).build();
//
//        scheduler.scheduleJob(jobDetail, cronTrigger);
//    }
//
//    /**
//     * 同时启动两个定时任务
//     *
//     * @throws SchedulerException
//     */
//    public void schedulerJobs() throws SchedulerException {
//
//        Scheduler scheduler = schedulerFactoryBean.getScheduler();
//        schedulerJob1(scheduler);
//        schedulerJob2(scheduler);
//    }
//
//}
//
