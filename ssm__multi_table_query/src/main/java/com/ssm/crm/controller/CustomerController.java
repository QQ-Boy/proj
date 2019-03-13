package com.ssm.crm.controller;


import com.ssm.crm.daomain.BaseDict;
import com.ssm.crm.daomain.Customer;
import com.ssm.crm.daomain.QueryVo;
import com.ssm.crm.service.BaseDictService;
import com.ssm.crm.service.CustomerService;
import com.ssm.crm.utils.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/customer")
public class CustomerController {
    @Autowired
    private BaseDictService baseDictService;

    @Autowired
    private CustomerService customerService;

    @RequestMapping("/list.action")
      public String queryCustomerList(Model model, QueryVo queryVo){
            //调用service层获取下拉列表数据
          List<BaseDict> fromType = baseDictService.selectBaseDictByTypeCode("002");
          List<BaseDict> industryType = baseDictService.selectBaseDictByTypeCode("001");
          List<BaseDict> levelType = baseDictService.selectBaseDictByTypeCode("006");


            model.addAttribute("fromType", fromType);
            model.addAttribute("industryType", industryType);
            model.addAttribute("levelType", levelType);

        //查询客户信息列表（查询条件带过去）
        Page<Customer> page = customerService.getCustomerList(queryVo);
        //将page数据放到model中
        model.addAttribute("page", page);
        return "customer";
      }

}
