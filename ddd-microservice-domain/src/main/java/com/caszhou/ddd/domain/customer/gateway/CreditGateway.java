package com.caszhou.ddd.domain.customer.gateway;

import com.caszhou.ddd.domain.customer.Credit;

/**
 * @author caszhou
 * @date 2022/6/16
 */
public interface CreditGateway {
    Credit getCredit(String customerId);
}
