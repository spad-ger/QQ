package com.thunisoft.demo.demo.aty.student.controller;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.thunisoft.demo.demo.aty.student.service.IStudentService;
import com.thunisoft.demo.demo.pojo.Student;
import com.thunisoft.artery.data.annotation.DataTranslate;
import com.thunisoft.artery.data.annotation.ExceptionTips;
import com.thunisoft.artery.util.uuid.UUIDHelper;

/**
 * 
 * StudentEditController
 *
 * @description 学生新增、编辑
 * @author artery6一键生成
 * @author Administrator
 * @date 2019年08月19日 10:45
 * @version 1.0
 */
@Controller
@RequestMapping("aty/student/studentEdit")
public class StudentEditController {
    @Autowired
    IStudentService studentService;

    /**
     * html模板入口
     * 
     * @return 'resources/templates'下的html模板
     */
    @GetMapping(value= {"/insert", "/"})	
    public String index(HttpServletRequest request) {
        return "aty/student/studentEdit";
    }

    @GetMapping("/update/{id}")
    @DataTranslate
    public String update(HttpServletRequest request, @PathVariable String id) {
        request.setAttribute("rs", studentService.selectByPrimaryKey(id));
        return "aty/student/studentEdit";
    }

    @RequestMapping("/doUpdate")
    @ExceptionTips("保存人员失败")
    @ResponseBody
    public Object doUpdate(@RequestBody Student student) {
        if (StringUtils.isBlank(student.getId())) {
            student.setId(UUIDHelper.getUuid());
            studentService.insert(student);
        } else {
            studentService.updateByPrimaryKey(student);
        }
        return "ok";
    }
}