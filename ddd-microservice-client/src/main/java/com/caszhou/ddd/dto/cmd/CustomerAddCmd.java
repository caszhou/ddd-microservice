package com.caszhou.ddd.dto.cmd;

import com.caszhou.ddd.dto.data.CustomerDto;

import lombok.Data;

/**
 * @author caszhou
 * @date 2022/6/16
 */
@Data
public class CustomerAddCmd {
    private CustomerDto customerDto;
}
