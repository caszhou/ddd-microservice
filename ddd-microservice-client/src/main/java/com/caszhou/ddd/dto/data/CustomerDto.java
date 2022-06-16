package com.caszhou.ddd.dto.data;

import javax.validation.constraints.NotEmpty;

import lombok.Data;

/**
 * @author caszhou
 * @date 2022/6/16
 */
@Data
public class CustomerDto {
    private String customerId;

    private String memberId;

    private String customerName;

    private String customerType;

    @NotEmpty
    private String companyName;

    @NotEmpty
    private String source;
}
