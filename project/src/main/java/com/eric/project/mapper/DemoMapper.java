package com.eric.project.mapper;


import com.eric.project.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 *
 * @author ericzhang 2021/11/12 10:19 下午
 */
@Repository
@Mapper
public interface DemoMapper {

     List<User> findAll();
}
