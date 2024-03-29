package com.thunisoft.demo.demo.eg.book.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thunisoft.demo.demo.eg.book.service.IEgBookService;

import com.thunisoft.demo.demo.mapper.EgBookMapper;
import com.thunisoft.demo.demo.pojo.EgBook;

@Service
public class EgBookService implements IEgBookService {

    @Autowired
    private EgBookMapper egBookMapper;

    @Override
    public EgBook selectByPrimaryKey(String id) {
        return egBookMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<EgBook> selectAll() {
        return egBookMapper.selectAll();
    }

    @Override
    public int updateByPrimaryKey(EgBook egBook) {
        return egBookMapper.updateByPrimaryKey(egBook);
    }

    @Override
    public int deleteByPrimaryKey(String id) {
        return egBookMapper.deleteByPrimaryKey(id);
    }
    
    @Override
    public int insert(EgBook egBook) {
        return egBookMapper.insert(egBook);
    }
}
