package com.caszhou.ddd.dto.data;

/**
 * @author caszhou
 * @date 2022/6/16
 */
public enum ErrorCode {
    // 客户公司名冲突
    B_CUSTOMER_companyNameConflict("B_CUSTOMER_companyNameConflict", "客户公司名冲突");

    private final String errCode;

    private final String errDesc;

    private ErrorCode(String errCode, String errDesc) {
        this.errCode = errCode;
        this.errDesc = errDesc;
    }

    public String getErrCode() {
        return errCode;
    }

    public String getErrDesc() {
        return errDesc;
    }
}
