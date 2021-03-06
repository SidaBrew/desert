package com.dao.example.service;

import com.dao.example.entity.User;
import com.dao.example.mapper.UserMapper;
import com.github.pagehelper.PageHelper;
import com.utils.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/***
 *  Created by shao.guangze on 2019/5/31
 */
@Service
public class UserService {

    @Autowired
    UserMapper userMapper;


    public User Sel(int id){

        return userMapper.Sel(id);
    }

    public List<User> selectUser(){
        return userMapper.selectUser();
    }

    public List<User> findItemByPage(int currentPage,int pageSize) {
        //设置分页信息，分别是当前页数和每页显示的总记录数【记住：必须在mapper接口中的方法执行之前设置该分页信息】
        PageHelper.startPage(currentPage, pageSize);

        List<User> allItems = userMapper.selectUser();        //全部商品
        //int countNums = userMapper.countItem();            //总记录数
        PageBean pageData = new PageBean(currentPage, pageSize);
        pageData.setItems(allItems);
        return pageData.getItems();
    }


    public void mehtod (){
        String a = "";
        if("".equals(a)){
            System.out.println("会报错吗？");
        }
        System.out.println("is null");
    }

    public int[] sum (){
      int nums[] = new int[] {3,2,4};
        int result[] = new int[2];
        Map<Integer,Integer> map = new HashMap();
      int target = 6;
      for(int i=0;i<nums.length;i++){
          for (int j = i+1;j<nums.length;j++){

              if(map.containsKey(target-nums[i])){
                  result[0]= i;
                  result[1] = map.get(target-nums[i]);
              }
              map.put(nums[i],i);
          }

      }
        return  result;
    }
}
