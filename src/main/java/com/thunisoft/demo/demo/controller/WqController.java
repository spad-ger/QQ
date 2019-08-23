package com.thunisoft.demo.demo.controller;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.thunisoft.demo.demo.pojo.Wq;


/**
 * WqController Controller
 * 
 *
 * @author Administrator
 * @date 2019-08-20
 */
@Controller
@RequestMapping("wq")
public class WqController {
    /**
     * html模板入口
     * @return 'resources/templates'下的html模板
     */
    @GetMapping()
    public String index(HttpServletRequest request) {
        return "/wq";
 	}

	/**
	 *
	 * @param obj TODO
	 */
	
	@PostMapping("/wq")
	@ResponseBody
	public Object wq(@Valid @RequestBody Wq wq/* 此处需改成一个实际接收参数对象 */) {
	    return null;
	}
    
}