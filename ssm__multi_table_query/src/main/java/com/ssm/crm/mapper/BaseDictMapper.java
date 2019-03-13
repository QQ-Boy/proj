package com.ssm.crm.mapper;

import com.ssm.crm.daomain.BaseDict;

import java.util.List;

public interface BaseDictMapper {

    List<BaseDict> selectByExample(String typecode);
}
