package com.thunisoft.demo.demo.szq.reserve.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.thunisoft.demo.demo.szq.reserve.service.IReserveService;
import com.thunisoft.demo.demo.pojo.Reserve;
import com.thunisoft.artery.data.QueryManager;
import com.thunisoft.artery.data.annotation.DataTranslate;
import com.thunisoft.artery.data.annotation.ExceptionTips;
import com.thunisoft.artery.data.model.IQueryInfo;

/**
 * 
 * ReserveListController
 *
 * @description 预定信息表列表
 * @author artery6一键生成
 * @author Administrator
 * @date 2019年08月22日 14:38
 * @version 1.0
 */
@Controller
@RequestMapping("szq/reserve/reserveList")
public class ReserveListController {
    @Autowired
    IReserveService reserveService;

    /**
     * html模板入口
     * 
     * @return 'resources/templates'下的html模板
     */
    @GetMapping()
    public String index(HttpServletRequest request) {
        return "szq/reserve/reserveList";
    }

    /**
     * 列表数据
     * @param qp
     * @return
     */
    @RequestMapping("/rs")
    @ResponseBody
    @DataTranslate
    @ExceptionTips("加载预定信息表列表数据出错")
    public Object rs(IQueryInfo qp) {
        return QueryManager.queryPageDataForMybatis(qp, Reserve.class, reserveService::selectAll);
    }

    /**
     * 删除数据
     * @param id
     * @return
     */
    @RequestMapping("/doDelete/{id}")
    @ExceptionTips("删除预定信息表失败")
    @ResponseBody
    public Object doDelete(@PathVariable String id) {
        reserveService.deleteByPrimaryKey(id);
        return "ok";
    }
}