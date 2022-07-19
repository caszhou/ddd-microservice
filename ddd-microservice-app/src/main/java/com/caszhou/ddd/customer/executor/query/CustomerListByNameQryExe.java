package com.caszhou.ddd.customer.executor.query;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.alibaba.cola.dto.MultiResponse;
import com.caszhou.ddd.dto.data.CustomerDto;
import com.caszhou.ddd.dto.query.CustomerListByNameQry;

/**
 * @author caszhou
 * @date 2022/6/16
 */
@Component
public class CustomerListByNameQryExe {
    public MultiResponse<CustomerDto> execute(CustomerListByNameQry cmd) {
        List<CustomerDto> customerDtoList = new ArrayList<>();
        CustomerDto customerDTO = new CustomerDto();
        customerDTO.setCustomerName("Frank");
        customerDtoList.add(customerDTO);
        return MultiResponse.of(customerDtoList);
    }
}
