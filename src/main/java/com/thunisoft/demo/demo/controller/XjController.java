package com.thunisoft.demo.demo.controller;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.thunisoft.demo.demo.pojo.Xj;


/**
 * XjController Controller
 * 
 *
 * @author Administrator
 * @date 2019-08-20
 */
@Controller
@RequestMapping("xj")
public class XjController {
    /**
     * html模板入口
     * @return 'resources/templates'下的html模板
     */
    @GetMapping()
    public String index(HttpServletRequest request) {
    	
        return "/新建";
 	}

	/**
	 *
	 * @param obj TODO
	 */
	@PostMapping("/Xj")
	@ResponseBody
	public Object save(@Valid @RequestBody Xj xj/* 此处需改成一个实际接收参数对象 */) {
	    System.out.println(xj);
		return "成功！";
	}
}