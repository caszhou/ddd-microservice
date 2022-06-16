package com.caszhou.ddd.customer;

import org.apache.ibatis.annotations.Mapper;

/**
 * @author caszhou
 * @date 2022/6/16
 */
@Mapper
public interface CustomerMapper {
    CustomerDo getById(String customerId);
}
