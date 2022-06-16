package com.caszhou.ddd.customer;

import lombok.Data;

/**
 * @author caszhou
 * @date 2022/6/16
 */
@Data
public class CustomerDo {
    private String customerId;

    private String memberId;

    private String globalId;

    private long registeredCapital;

    private String companyName;
}
