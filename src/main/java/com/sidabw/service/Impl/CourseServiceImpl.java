package com.sidabw.service.Impl;

import com.sidabw.dao.Course;
import com.sidabw.dao.CourseMapper;
import com.sidabw.service.ICourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/***
 *  Created by shao.guangze on 2019/12/8
 */
@Service
public class CourseServiceImpl implements ICourseService {

    @Autowired
    private CourseMapper courseMapper;

    @Override
    public Course getCourse() {
        return courseMapper.selectByPrimaryKey("3-105");
    }

    @Override
    public int saveCourseInfo() {
        Course course = new Course();
        course.setCname("sida");
        course.setCno("3-101");
        course.setTno("856");
        return courseMapper.insert(course);
    }
}
