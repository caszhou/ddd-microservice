package com.caszhou.ddd.api;

import com.alibaba.cola.dto.MultiResponse;
import com.alibaba.cola.dto.Response;
import com.caszhou.ddd.dto.cmd.CustomerAddCmd;
import com.caszhou.ddd.dto.data.CustomerDto;
import com.caszhou.ddd.dto.query.CustomerListByNameQry;

/**
 * @author caszhou
 * @date 2022/6/16
 */
public interface ICustomerService {
    Response addCustomer(CustomerAddCmd customerAddCmd);

    MultiResponse<CustomerDto> listByName(CustomerListByNameQry customerListByNameQry);
}
