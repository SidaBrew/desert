package com.sidabw.service;

import com.sidabw.dao.Course;

/***
 *  Created by shao.guangze on 2019/12/8
 */

public interface ICourseService {
    Course getCourse();

    int saveCourseInfo();
}
