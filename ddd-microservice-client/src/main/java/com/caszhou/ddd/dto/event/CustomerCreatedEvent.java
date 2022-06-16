package com.caszhou.ddd.dto.event;

import lombok.Getter;
import lombok.Setter;

/**
 * @author caszhou
 * @date 2022/6/16
 */
@Getter
@Setter
public class CustomerCreatedEvent {
    private String customerId;
}
