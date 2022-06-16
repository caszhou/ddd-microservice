
package com.caszhou.ddd.customer.executor;

import org.springframework.stereotype.Component;

import com.alibaba.cola.dto.Response;
import com.alibaba.cola.exception.BizException;
import com.caszhou.ddd.dto.CustomerAddCmd;
import com.caszhou.ddd.dto.data.ErrorCode;

/**
 * @author caszhou
 * @date 2022/6/16
 */
@Component
public class CustomerAddCmdExe {
    public Response execute(CustomerAddCmd cmd) {
        // The flow of usecase is defined here.
        // The core ablility should be implemented in Domain. or sink to Domian gradually
        if (cmd.getCustomerDto().getCompanyName().equals("ConflictCompanyName")) {
            throw new BizException(ErrorCode.B_CUSTOMER_companyNameConflict.getErrCode(), "公司名冲突");
        }
        return Response.buildSuccess();
    }
}
