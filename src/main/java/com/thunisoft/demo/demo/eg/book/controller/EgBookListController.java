package com.thunisoft.demo.demo.eg.book.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.thunisoft.demo.demo.eg.book.service.IEgBookService;
import com.thunisoft.demo.demo.pojo.EgBook;

import io.swagger.annotations.ApiOperation;

import com.thunisoft.artery.data.QueryManager;
import com.thunisoft.artery.data.annotation.DataTranslate;
import com.thunisoft.artery.data.annotation.ExceptionTips;
import com.thunisoft.artery.data.model.IQueryInfo;

/**
 * 
 * EgBookListController
 *
 * @description 图书列表
 * @author artery6一键生成
 * @author Administrator
 * @date 2019年08月22日 14:37
 * @version 1.0
 */
@Controller
@RequestMapping("eg/book/egBookList")
public class EgBookListController {
    @Autowired
    IEgBookService egBookService;

    /**
     * html模板入口
     * 
     * @return 'resources/templates'下的html模板
     */
    @GetMapping()
    public String index(HttpServletRequest request) {
        return "eg/book/egBookList";
    }

    /**
     * 列表数据
     * @param qp
     * @return
     */
    @ApiOperation(value="展示首页信息value", notes = "展示首页信息notes")
    @RequestMapping("/rs")
    @ResponseBody
    @DataTranslate
    @ExceptionTips("加载图书列表数据出错")
    public Object rs(IQueryInfo qp) {
        return QueryManager.queryPageDataForMybatis(qp, EgBook.class, egBookService::selectAll);
    }

    /**
     * 删除数据
     * @param id
     * @return
     */
    @ApiOperation(value="展示要删除图书的信息value", notes = "展示要删除图书的信息notes")
    @RequestMapping("/doDelete/{id}")
    @ExceptionTips("删除图书失败")
    @ResponseBody
    public Object doDelete(@PathVariable String id) {
        egBookService.deleteByPrimaryKey(id);
        return "ok";
    }
}