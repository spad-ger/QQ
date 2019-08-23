package com.thunisoft.demo.demo.eg.book.controller;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.thunisoft.demo.demo.eg.book.service.IEgBookService;
import com.thunisoft.demo.demo.pojo.EgBook;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import com.thunisoft.artery.data.annotation.DataTranslate;
import com.thunisoft.artery.data.annotation.ExceptionTips;
import com.thunisoft.artery.util.uuid.UUIDHelper;

/**
 * 
 * EgBookEditController
 *
 * @description 图书新增、编辑
 * @author artery6一键生成
 * @author Administrator
 * @date 2019年08月22日 14:37
 * @version 1.0
 */
@Api(tags= {"图书维护Api"})
@Controller
@RequestMapping("eg/book/egBookEdit")
public class EgBookEditController {
    @Autowired
    IEgBookService egBookService;

    /**
     * html模板入口
     * 
     * @return 'resources/templates'下的html模板
     */
    @ApiOperation(value="展示添加图书信息value", notes = "展示添加图书信息notes")
    @GetMapping(value= {"/insert", "/"})
    public String index(HttpServletRequest request) {
        return "eg/book/egBookEdit";
    }
    @ApiOperation(value="修改图书信息value", notes = "展示图书信息notes")
    @GetMapping("/update/{id}")
    @DataTranslate
    public String update(HttpServletRequest request, @PathVariable String id) {
        request.setAttribute("rs", egBookService.selectByPrimaryKey(id));
        return "eg/book/egBookEdit";
    }

    @RequestMapping("/doUpdate")
    @ExceptionTips("保存人员失败")
    @ResponseBody
    public Object doUpdate(@RequestBody EgBook egBook) {
        if (StringUtils.isBlank(egBook.getId())) {
            egBook.setId(UUIDHelper.getUuid());
            egBookService.insert(egBook);
        } else {
            egBookService.updateByPrimaryKey(egBook);
        }
        return "ok";
    }
}