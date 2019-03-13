package com.ssm.crm.service;

import com.ssm.crm.daomain.Customer;
import com.ssm.crm.daomain.QueryVo;
import com.ssm.crm.mapper.CustomerMapper;
import com.ssm.crm.utils.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerMapper customerMapper;

    @Override
    public Page<Customer> getCustomerList(QueryVo queryVo) {
        Integer total=0;
        Page<Customer> page=new Page<>();

        queryVo.setStart((queryVo.getPage()-1) * queryVo.getSize());

        List<Customer> customerList=customerMapper.getCustomerList(queryVo);
        page.setRows(customerList);

        total=customerMapper.getTotal(queryVo);

        page.setTotal(total);

        page.setPage(queryVo.getPage());

        page.setSize(queryVo.getSize());
        return page;
    }
}
