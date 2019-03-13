package com.ssm.crm.service;

import com.ssm.crm.daomain.Customer;
import com.ssm.crm.daomain.QueryVo;
import com.ssm.crm.utils.Page;

public interface CustomerService {
    Page<Customer> getCustomerList(QueryVo queryVo);
}
