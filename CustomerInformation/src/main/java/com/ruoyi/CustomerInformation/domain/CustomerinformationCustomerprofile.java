package com.ruoyi.CustomerInformation.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 客户档案管理对象 customerinformation_customerprofile
 * 
 * @author ruoyi
 * @date 2025-04-28
 */
public class CustomerinformationCustomerprofile extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 客户编号（例：KH-001） */
    @Excel(name = "客户编号", readConverterExp = "例=：KH-001")
    private String customerId;

    /** 客户名称 */
    @Excel(name = "客户名称")
    private String customerName;

    /** 客户类型 */
    @Excel(name = "客户类型")
    private String customerType;

    /** 联系方式 */
    @Excel(name = "联系方式")
    private String contact;

    /** 注册地址 */
    @Excel(name = "注册地址")
    private String address;

    /** 信用等级 */
    @Excel(name = "信用等级")
    private String creditRating;

    /** 客户等级 */
    @Excel(name = "客户等级")
    private String customerLevel;

    /** 状态：0-冻结，1-有效 */
    @Excel(name = "状态：0-冻结，1-有效")
    private Long status;

    public void setCustomerId(String customerId) 
    {
        this.customerId = customerId;
    }

    public String getCustomerId() 
    {
        return customerId;
    }

    public void setCustomerName(String customerName) 
    {
        this.customerName = customerName;
    }

    public String getCustomerName() 
    {
        return customerName;
    }

    public void setCustomerType(String customerType) 
    {
        this.customerType = customerType;
    }

    public String getCustomerType() 
    {
        return customerType;
    }

    public void setContact(String contact) 
    {
        this.contact = contact;
    }

    public String getContact() 
    {
        return contact;
    }

    public void setAddress(String address) 
    {
        this.address = address;
    }

    public String getAddress() 
    {
        return address;
    }

    public void setCreditRating(String creditRating) 
    {
        this.creditRating = creditRating;
    }

    public String getCreditRating() 
    {
        return creditRating;
    }

    public void setCustomerLevel(String customerLevel) 
    {
        this.customerLevel = customerLevel;
    }

    public String getCustomerLevel() 
    {
        return customerLevel;
    }

    public void setStatus(Long status) 
    {
        this.status = status;
    }

    public Long getStatus() 
    {
        return status;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("customerId", getCustomerId())
            .append("customerName", getCustomerName())
            .append("customerType", getCustomerType())
            .append("contact", getContact())
            .append("address", getAddress())
            .append("creditRating", getCreditRating())
            .append("customerLevel", getCustomerLevel())
            .append("status", getStatus())
            .toString();
    }
}
