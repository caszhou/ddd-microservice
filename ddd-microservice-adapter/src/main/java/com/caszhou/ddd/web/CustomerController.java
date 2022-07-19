package com.caszhou.ddd.web;

import org.springframework.web.bind.annotation.*;

import com.alibaba.cola.dto.MultiResponse;
import com.alibaba.cola.dto.Response;
import com.caszhou.ddd.api.ICustomerService;
import com.caszhou.ddd.dto.cmd.CustomerAddCmd;
import com.caszhou.ddd.dto.data.CustomerDto;
import com.caszhou.ddd.dto.query.CustomerListByNameQry;

/**
 * @author caszhou
 * @date 2022/6/16
 */
@RestController
public class CustomerController {
    private final ICustomerService customerService;

    public CustomerController(ICustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping(value = "/hello")
    public String hello() {
        return "world";
    }

    @GetMapping(value = "/customer")
    public MultiResponse<CustomerDto> listCustomerByName(@RequestParam(required = false) String name) {
        CustomerListByNameQry customerListByNameQry = new CustomerListByNameQry();
        customerListByNameQry.setName(name);
        return customerService.listByName(customerListByNameQry);
    }

    @PostMapping(value = "/customer")
    public Response addCustomer(@RequestBody CustomerAddCmd customerAddCmd) {
        return customerService.addCustomer(customerAddCmd);
    }
}
