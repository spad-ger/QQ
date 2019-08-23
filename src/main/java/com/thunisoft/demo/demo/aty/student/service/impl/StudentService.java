package com.thunisoft.demo.demo.aty.student.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thunisoft.demo.demo.aty.student.service.IStudentService;

import com.thunisoft.demo.demo.mapper.StudentMapper;
import com.thunisoft.demo.demo.pojo.Student;

@Service
public class StudentService implements IStudentService {

    @Autowired
    private StudentMapper studentMapper;

    @Override
    public Student selectByPrimaryKey(String id) {
        return studentMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<Student> selectAll() {
        return studentMapper.selectAll();
    }

    @Override
    public int updateByPrimaryKey(Student student) {
        return studentMapper.updateByPrimaryKey(student);
    }

    @Override
    public int deleteByPrimaryKey(String id) {
        return studentMapper.deleteByPrimaryKey(id);
    }
    
    @Override
    public int insert(Student student) {
        return studentMapper.insert(student);
    }
}
