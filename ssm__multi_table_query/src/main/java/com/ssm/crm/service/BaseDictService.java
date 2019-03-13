package com.ssm.crm.service;


import com.ssm.crm.daomain.BaseDict;

import java.util.List;

public interface BaseDictService {

	/**
	 * 根据typecode查询下拉列表的信息(数据字典)
	 * @param typecode
	 * @return
	 */
	public List<BaseDict> selectBaseDictByTypeCode(String typecode);
}
