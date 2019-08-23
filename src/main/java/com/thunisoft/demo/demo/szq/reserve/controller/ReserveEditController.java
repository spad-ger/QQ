package com.thunisoft.demo.demo.szq.reserve.controller;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.thunisoft.demo.demo.szq.reserve.service.IReserveService;
import com.thunisoft.demo.demo.pojo.Reserve;
import com.thunisoft.artery.data.annotation.DataTranslate;
import com.thunisoft.artery.data.annotation.ExceptionTips;
import com.thunisoft.artery.util.uuid.UUIDHelper;

/**
 * 
 * ReserveEditController
 *
 * @description 预定信息表新增、编辑
 * @author artery6一键生成
 * @author Administrator
 * @date 2019年08月22日 14:38
 * @version 1.0
 */
@Controller
@RequestMapping("szq/reserve/reserveEdit")
public class ReserveEditController {
    @Autowired
    IReserveService reserveService;

    /**
     * html模板入口
     * 
     * @return 'resources/templates'下的html模板
     */
    @GetMapping(value= {"/insert", "/"})
    public String index(HttpServletRequest request) {
        return "szq/reserve/reserveEdit";
    }

    @GetMapping("/update/{id}")
    @DataTranslate
    public String update(HttpServletRequest request, @PathVariable String id) {
        request.setAttribute("rs", reserveService.selectByPrimaryKey(id));
        return "szq/reserve/reserveEdit";
    }

    @RequestMapping("/doUpdate")
    @ExceptionTips("保存人员失败")
    @ResponseBody
    public Object doUpdate(@RequestBody Reserve reserve) {
        if (StringUtils.isBlank(reserve.getId())) {
            reserve.setId(UUIDHelper.getUuid());
            reserveService.insert(reserve);
        } else {
            reserveService.updateByPrimaryKey(reserve);
        }
        return "ok";
    }
}