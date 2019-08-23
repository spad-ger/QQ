package com.thunisoft.demo.demo.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.thunisoft.artery.data.mybatis.page.BaseMapper;
import com.thunisoft.demo.demo.pojo.Reserve;

/**
 * 
 * ReserveMapper
 * 
 * @description ReserveMapper
 * @author  Administrator
 * @date 2019年08月22日 14:38
 * @version 1.0
 */
@Mapper
public interface ReserveMapper extends BaseMapper<Reserve, String> {

    
}
