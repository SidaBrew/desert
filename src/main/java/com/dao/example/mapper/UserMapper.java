package com.dao.example.mapper;

import com.dao.example.entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;

/***
 *  Created by shao.guangze on 2019/5/31
 */
@Repository
public interface UserMapper {

    User Sel(int id);

    List<User> selectUser();

}
