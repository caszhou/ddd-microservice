package com.caszhou.ddd.customer;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.alibaba.cola.catchlog.CatchAndLog;
import com.alibaba.cola.dto.MultiResponse;
import com.alibaba.cola.dto.Response;
import com.caszhou.ddd.api.ICustomerService;
import com.caszhou.ddd.customer.executor.CustomerAddCmdExe;
import com.caszhou.ddd.customer.executor.query.CustomerListByNameQryExe;
import com.caszhou.ddd.dto.CustomerAddCmd;
import com.caszhou.ddd.dto.CustomerListByNameQry;
import com.caszhou.ddd.dto.data.CustomerDto;

/**
 * @author caszhou
 * @date 2022/6/16
 */
@Service
@CatchAndLog
public class CustomerServiceImpl implements ICustomerService {
    @Resource
    private CustomerAddCmdExe customerAddCmdExe;

    @Resource
    private CustomerListByNameQryExe customerListByNameQryExe;

    public Response addCustomer(CustomerAddCmd customerAddCmd) {
        return customerAddCmdExe.execute(customerAddCmd);
    }

    @Override
    public MultiResponse<CustomerDto> listByName(CustomerListByNameQry customerListByNameQry) {
        return customerListByNameQryExe.execute(customerListByNameQry);
    }
}
