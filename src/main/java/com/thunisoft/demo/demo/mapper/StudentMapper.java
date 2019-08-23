package com.thunisoft.demo.demo.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.thunisoft.artery.data.mybatis.page.BaseMapper;
import com.thunisoft.demo.demo.pojo.Student;

/**
 * 
 * StudentMapper
 * 
 * @description StudentMapper
 * @author  Administrator
 * @date 2019年08月19日 10:45
 * @version 1.0
 */
@Mapper
public interface StudentMapper extends BaseMapper<Student, String> {

    
}
