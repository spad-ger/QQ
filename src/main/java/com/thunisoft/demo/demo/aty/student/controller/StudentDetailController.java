package com.thunisoft.demo.demo.aty.student.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.thunisoft.artery.data.annotation.DataTranslate;
import com.thunisoft.demo.demo.aty.student.service.IStudentService;

/**
 * 
 * StudentDetailController
 *
 * @description 学生详情
 * @author artery6一键生成
 * @author Administrator
 * @date 2019年08月19日 10:45
 * @version 1.0
 */
@Controller
@RequestMapping("aty/student/studentDetail")
public class StudentDetailController {
    @Autowired
    IStudentService studentService;

    @GetMapping(value= {"/{id}", "/"})
    @DataTranslate
    public String index(HttpServletRequest request, @PathVariable String id) {
        request.setAttribute("rs", studentService.selectByPrimaryKey(id));
        return "aty/student/studentDetail";
    }
}