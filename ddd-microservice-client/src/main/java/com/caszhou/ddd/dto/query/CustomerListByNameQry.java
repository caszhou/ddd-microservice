package com.caszhou.ddd.dto.query;

import com.alibaba.cola.dto.Query;

import lombok.Data;

/**
 * @author caszhou
 * @date 2022/6/16
 */
@Data
public class CustomerListByNameQry extends Query {
    private String name;
}
