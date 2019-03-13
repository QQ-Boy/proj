package com.ssm.crm.mapper;

import com.ssm.crm.daomain.Customer;
import com.ssm.crm.daomain.QueryVo;
import com.ssm.crm.utils.Page;

import java.util.List;

public interface CustomerMapper {
    List<Customer> getCustomerList(QueryVo queryVo);

    Integer getTotal(QueryVo queryVo);
}
