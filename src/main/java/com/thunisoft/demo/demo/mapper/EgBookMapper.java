package com.thunisoft.demo.demo.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.thunisoft.artery.data.mybatis.page.BaseMapper;
import com.thunisoft.demo.demo.pojo.EgBook;

/**
 * 
 * EgBookMapper
 * 
 * @description EgBookMapper
 * @author  Administrator
 * @date 2019年08月20日 09:16
 * @version 1.0
 */
@Mapper
public interface EgBookMapper extends BaseMapper<EgBook, String> {

    
}
