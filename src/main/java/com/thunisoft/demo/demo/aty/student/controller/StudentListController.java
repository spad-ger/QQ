package com.thunisoft.demo.demo.aty.student.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.thunisoft.demo.demo.aty.student.service.IStudentService;
import com.thunisoft.demo.demo.pojo.Student;
import com.thunisoft.artery.data.QueryManager;
import com.thunisoft.artery.data.annotation.DataTranslate;
import com.thunisoft.artery.data.annotation.ExceptionTips;
import com.thunisoft.artery.data.model.IQueryInfo;

/**
 * 
 * StudentListController
 *
 * @description 学生列表
 * @author artery6一键生成
 * @author Administrator
 * @date 2019年08月19日 10:45
 * @version 1.0
 */
@Controller
@RequestMapping("aty/student/studentList")
public class StudentListController {
    @Autowired
    IStudentService studentService;

    /**
     * html模板入口
     * 
     * @return 'resources/templates'下的html模板
     */
    @GetMapping()
    public String index(HttpServletRequest request) {
        return "aty/student/studentList";
    }

    /**
     * 列表数据
     * @param qp
     * @return
     */
    @RequestMapping("/rs")
    @ResponseBody
    @DataTranslate
    @ExceptionTips("加载学生列表数据出错")
    public Object rs(IQueryInfo qp) {
        return QueryManager.queryPageDataForMybatis(qp, Student.class, studentService::selectAll);
    }

    /**
     * 删除数据
     * @param id
     * @return
     */
    @RequestMapping("/doDelete/{id}")
    @ExceptionTips("删除学生失败")
    @ResponseBody
    public Object doDelete(@PathVariable String id) {
        studentService.deleteByPrimaryKey(id);
        return "ok";
    }
}