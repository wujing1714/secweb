package com.sec.demo.dao;

import java.util.List;

import com.sec.demo.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;



/**
 * Created by WangZJ on 2018/8/13.
 */
@Mapper
public interface UserDao {
    @Select("select password from user where username = #{username}")
    String getPasswordByUserName(@Param("username") String username);
    
    @Select("SELECT u.* FROM user u inner join user_role ur on ur.uid=u.uid WHERE username=#{name};")
    User findUserByName(@Param("name") String name);
    
    @Select("select uid,username from user")
    List<User> findAllUser();
}
