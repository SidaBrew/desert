package com.example2.service;

import com.example2.SchedulerJob;
import com.example2.SchedulerJobMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/***
 *  Created by shao.guangze on 2019/6/4
 */
@Service
public class SchedulerJobService {
    @Autowired
    private SchedulerJobMapper schedulerJobMapper;

    public void method(){
        SchedulerJob schedulerJob = new SchedulerJob();
        schedulerJob.setUserId("1");
        schedulerJob.setUserName("brew");
        schedulerJob.setUserJob("php");
        schedulerJobMapper.insert(schedulerJob);
        System.out.println("jinlaila ");
    }
}
