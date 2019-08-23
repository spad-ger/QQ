package com.thunisoft.demo.demo.szq.reserve.service;

import java.util.List;

import com.thunisoft.demo.demo.pojo.Reserve;

/**
 * 
 * IReserveService
 *
 * @description 预定信息表列表
 * @author artery6一键生成
 * @author Administrator
 * @date 2019年08月22日 14:38
 * @version 1.0
 */
public interface IReserveService {

    /**
     * 根据主键查询
     * 
     * @param id
     * @return
     */
    public Reserve selectByPrimaryKey(String id);

    /**
     * 查询所有
     * 
     * @return
     */
    public List<Reserve> selectAll();

    /**
     * 根据主键更新
     * 
     * @param reserve
     * @return
     */
    public int updateByPrimaryKey(Reserve reserve);

    /**
     * 删除所有
     * 
     * @param id
     * @return
     */
    public int deleteByPrimaryKey(String id);
    
    /**
     * 插入
     * 
     * @param jzglLog
     * @return
     */
    public int insert(Reserve reserve);
}