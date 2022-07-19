package com.caszhou.ddd.test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.alibaba.cola.dto.Response;
import com.caszhou.ddd.api.ICustomerService;
import com.caszhou.ddd.dto.cmd.CustomerAddCmd;
import com.caszhou.ddd.dto.data.CustomerDto;
import com.caszhou.ddd.dto.data.ErrorCode;

/**
 * @author caszhou
 * @date 2022/6/16
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class CustomerServiceTest {
    @Autowired
    private ICustomerService customerService;

    @Before
    public void setUp() {

    }

    @Test
    public void testCustomerAddSuccess() {
        // 1.prepare
        CustomerAddCmd customerAddCmd = new CustomerAddCmd();
        CustomerDto customerDTO = new CustomerDto();
        customerDTO.setCompanyName("NormalName");
        customerAddCmd.setCustomerDto(customerDTO);

        // 2.execute
        Response response = customerService.addCustomer(customerAddCmd);

        // 3.assert
        Assert.assertTrue(response.isSuccess());
    }

    @Test
    public void testCustomerAddCompanyNameConflict() {
        // 1.prepare
        CustomerAddCmd customerAddCmd = new CustomerAddCmd();
        CustomerDto customerDTO = new CustomerDto();
        customerDTO.setCompanyName("ConflictCompanyName");
        customerAddCmd.setCustomerDto(customerDTO);

        // 2.execute
        Response response = customerService.addCustomer(customerAddCmd);

        // 3.assert error
        Assert.assertEquals(ErrorCode.B_CUSTOMER_companyNameConflict.getErrCode(), response.getErrCode());
    }
}
