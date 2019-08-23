package com.thunisoft.demo.demo.aty.student.service;

import java.util.List;

import com.thunisoft.demo.demo.pojo.Student;

/**
 * 
 * IStudentService
 *
 * @description 学生列表
 * @author artery6一键生成
 * @author Administrator
 * @date 2019年08月19日 10:45
 * @version 1.0
 */
public interface IStudentService {

    /**
     * 根据主键查询
     * 
     * @param id
     * @return
     */
    public Student selectByPrimaryKey(String id);

    /**
     * 查询所有
     * 
     * @return
     */
    public List<Student> selectAll();

    /**
     * 根据主键更新
     * 
     * @param student
     * @return
     */
    public int updateByPrimaryKey(Student student);

    /**
     * 删除所有
     * 
     * @param id
     * @return
     */
    public int deleteByPrimaryKey(String id);
    
    /**
     * 插入
     * 
     * @param jzglLog
     * @return
     */
    public int insert(Student student);
}