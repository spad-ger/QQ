package com.thunisoft.demo.demo.szq.reserve.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.thunisoft.artery.data.annotation.DataTranslate;
import com.thunisoft.demo.demo.szq.reserve.service.IReserveService;

/**
 * 
 * ReserveDetailController
 *
 * @description 预定信息表详情
 * @author artery6一键生成
 * @author Administrator
 * @date 2019年08月22日 14:38
 * @version 1.0
 */
@Controller
@RequestMapping("szq/reserve/reserveDetail")
public class ReserveDetailController {
    @Autowired
    IReserveService reserveService;

    @GetMapping(value= {"/{id}", "/"})
    @DataTranslate
    public String index(HttpServletRequest request, @PathVariable String id) {
        request.setAttribute("rs", reserveService.selectByPrimaryKey(id));
        return "szq/reserve/reserveDetail";
    }
}