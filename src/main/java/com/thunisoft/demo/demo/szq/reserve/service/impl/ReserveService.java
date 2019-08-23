package com.thunisoft.demo.demo.szq.reserve.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thunisoft.demo.demo.szq.reserve.service.IReserveService;

import com.thunisoft.demo.demo.mapper.ReserveMapper;
import com.thunisoft.demo.demo.pojo.Reserve;

@Service
public class ReserveService implements IReserveService {

    @Autowired
    private ReserveMapper reserveMapper;

    @Override
    public Reserve selectByPrimaryKey(String id) {
        return reserveMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<Reserve> selectAll() {
        return reserveMapper.selectAll();
    }

    @Override
    public int updateByPrimaryKey(Reserve reserve) {
        return reserveMapper.updateByPrimaryKey(reserve);
    }

    @Override
    public int deleteByPrimaryKey(String id) {
        return reserveMapper.deleteByPrimaryKey(id);
    }
    
    @Override
    public int insert(Reserve reserve) {
        return reserveMapper.insert(reserve);
    }
}
