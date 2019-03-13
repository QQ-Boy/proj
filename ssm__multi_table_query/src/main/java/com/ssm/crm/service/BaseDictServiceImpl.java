package com.ssm.crm.service;

import com.ssm.crm.daomain.BaseDict;
import com.ssm.crm.mapper.BaseDictMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class BaseDictServiceImpl implements BaseDictService {

	@Autowired
	private BaseDictMapper baseDictMapper;
	
	
	@Override
	public List<BaseDict> selectBaseDictByTypeCode(String typecode) {
		/*//封装查询条件的类
		BaseDictExample example = new BaseDictExample();
		Criteria criteria = example.createCriteria();
		
		//封装查询条件
		criteria.andDictTypeCodeEqualTo(typecode);*/
		
		//List<BaseDict> list = baseDictMapper.selectByExample(example);
		List<BaseDict> list = baseDictMapper.selectByExample(typecode);
		return list;
	}

}
