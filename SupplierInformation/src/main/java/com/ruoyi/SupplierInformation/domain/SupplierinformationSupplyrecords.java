package com.ruoyi.SupplierInformation.domain;

import java.math.BigDecimal;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 供应记录管理对象 supplierinformation_supplyrecords
 * 
 * @author ruoyi
 * @date 2025-04-28
 */
public class SupplierinformationSupplyrecords extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 供应记录ID */
    @Excel(name = "供应记录ID")
    private Long recordId;

    /** 供应商编号 */
    @Excel(name = "供应商编号")
    private String supplierId;

    /** 商品编号 */
    @Excel(name = "商品编号")
    private String productNumber;

    /** 供应批次 */
    @Excel(name = "供应批次")
    private String batchNumber;

    /** 供应数量 */
    @Excel(name = "供应数量")
    private Long quantity;

    /** 供应单价 */
    @Excel(name = "供应单价")
    private BigDecimal unitPrice;

    /** 供应日期 */
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    @Excel(name = "供应日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date supplyDate;

    /** 质检结果 */
    @Excel(name = "质检结果")
    private String qualityStatus;

    public void setRecordId(Long recordId) 
    {
        this.recordId = recordId;
    }

    public Long getRecordId() 
    {
        return recordId;
    }

    public void setSupplierId(String supplierId) 
    {
        this.supplierId = supplierId;
    }

    public String getSupplierId() 
    {
        return supplierId;
    }

    public void setProductNumber(String productNumber) 
    {
        this.productNumber = productNumber;
    }

    public String getProductNumber() 
    {
        return productNumber;
    }

    public void setBatchNumber(String batchNumber) 
    {
        this.batchNumber = batchNumber;
    }

    public String getBatchNumber() 
    {
        return batchNumber;
    }

    public void setQuantity(Long quantity) 
    {
        this.quantity = quantity;
    }

    public Long getQuantity() 
    {
        return quantity;
    }

    public void setUnitPrice(BigDecimal unitPrice) 
    {
        this.unitPrice = unitPrice;
    }

    public BigDecimal getUnitPrice() 
    {
        return unitPrice;
    }

    public void setSupplyDate(Date supplyDate) 
    {
        this.supplyDate = supplyDate;
    }

    public Date getSupplyDate() 
    {
        return supplyDate;
    }

    public void setQualityStatus(String qualityStatus) 
    {
        this.qualityStatus = qualityStatus;
    }

    public String getQualityStatus() 
    {
        return qualityStatus;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("recordId", getRecordId())
            .append("supplierId", getSupplierId())
            .append("productNumber", getProductNumber())
            .append("batchNumber", getBatchNumber())
            .append("quantity", getQuantity())
            .append("unitPrice", getUnitPrice())
            .append("supplyDate", getSupplyDate())
            .append("qualityStatus", getQualityStatus())
            .toString();
    }
}
