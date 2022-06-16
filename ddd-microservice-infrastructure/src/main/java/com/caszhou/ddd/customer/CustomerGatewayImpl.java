package com.caszhou.ddd.customer;

import org.springframework.stereotype.Component;

import com.caszhou.ddd.domain.customer.Customer;
import com.caszhou.ddd.domain.customer.gateway.CustomerGateway;

/**
 * @author caszhou
 * @date 2022/6/16
 */
@Component
public class CustomerGatewayImpl implements CustomerGateway {
    private final CustomerMapper customerMapper;

    public CustomerGatewayImpl(CustomerMapper customerMapper) {
        this.customerMapper = customerMapper;
    }

    public Customer getByById(String customerId) {
        CustomerDo customerDO = customerMapper.getById(customerId);
        // Convert to Customer
        return null;
    }
}
