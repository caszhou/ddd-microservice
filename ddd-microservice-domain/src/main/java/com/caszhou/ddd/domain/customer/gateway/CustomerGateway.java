package com.caszhou.ddd.domain.customer.gateway;

import com.caszhou.ddd.domain.customer.Customer;

/**
 * @author caszhou
 * @date 2022/6/16
 */
public interface CustomerGateway {
    Customer getByById(String customerId);
}
