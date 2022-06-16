package com.caszhou.ddd.domain.customer;

import com.alibaba.cola.domain.Entity;
import com.alibaba.cola.exception.BizException;

import lombok.Data;

/**
 * @author caszhou
 * @date 2022/6/16
 */
@Data
@Entity
public class Customer {
    private String customerId;

    private String memberId;

    private String globalId;

    private long registeredCapital;

    private String companyName;

    private SourceType sourceType;

    private CompanyType companyType;

    public Customer() {

    }

    public boolean isBigCompany() {
        // 注册资金大于1000万的是大企业
        return registeredCapital > 10000000;
    }

    public boolean isSme() {
        // 注册资金大于10万小于100万的为中小企业
        return registeredCapital > 10000 && registeredCapital < 1000000;
    }

    public void checkConflict() {
        // Per different biz, the check policy could be different, if so, use ExtensionPoint
        if ("ConflictCompanyName".equals(this.companyName)) {
            throw new BizException(this.companyName + " has already existed, you can not add it");
        }
    }
}
