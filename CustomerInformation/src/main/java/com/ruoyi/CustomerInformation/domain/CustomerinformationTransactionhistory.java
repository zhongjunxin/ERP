package com.ruoyi.CustomerInformation.domain;

import java.math.BigDecimal;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 交易历史记录对象 customerinformation_transactionhistory
 * 
 * @author ruoyi
 * @date 2025-04-28
 */
public class CustomerinformationTransactionhistory extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 交易编号 */
    private Long transactionId;

    /** 客户编号 */
    @Excel(name = "客户编号")
    private String customerId;

    /** 订单编号 */
    @Excel(name = "订单编号")
    private String orderId;

    /** 交易类型 */
    @Excel(name = "交易类型")
    private String transactionType;

    /** 交易金额 */
    @Excel(name = "交易金额")
    private BigDecimal amount;

    /** 交易时间 */
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    @Excel(name = "交易时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date transactionTime;

    /** 结算方式 */
    @Excel(name = "结算方式")
    private String paymentMethod;

    /** 经手人 */
    @Excel(name = "经手人")
    private String handler;

    public void setTransactionId(Long transactionId) 
    {
        this.transactionId = transactionId;
    }

    public Long getTransactionId() 
    {
        return transactionId;
    }

    public void setCustomerId(String customerId) 
    {
        this.customerId = customerId;
    }

    public String getCustomerId() 
    {
        return customerId;
    }

    public void setOrderId(String orderId) 
    {
        this.orderId = orderId;
    }

    public String getOrderId() 
    {
        return orderId;
    }

    public void setTransactionType(String transactionType) 
    {
        this.transactionType = transactionType;
    }

    public String getTransactionType() 
    {
        return transactionType;
    }

    public void setAmount(BigDecimal amount) 
    {
        this.amount = amount;
    }

    public BigDecimal getAmount() 
    {
        return amount;
    }

    public void setTransactionTime(Date transactionTime) 
    {
        this.transactionTime = transactionTime;
    }

    public Date getTransactionTime() 
    {
        return transactionTime;
    }

    public void setPaymentMethod(String paymentMethod) 
    {
        this.paymentMethod = paymentMethod;
    }

    public String getPaymentMethod() 
    {
        return paymentMethod;
    }

    public void setHandler(String handler) 
    {
        this.handler = handler;
    }

    public String getHandler() 
    {
        return handler;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("transactionId", getTransactionId())
            .append("customerId", getCustomerId())
            .append("orderId", getOrderId())
            .append("transactionType", getTransactionType())
            .append("amount", getAmount())
            .append("transactionTime", getTransactionTime())
            .append("paymentMethod", getPaymentMethod())
            .append("handler", getHandler())
            .toString();
    }
}
