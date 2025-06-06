package com.ruoyi.ProcurementManagement.domain;

import java.math.BigDecimal;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 采购入库对象 putintostorage
 * 
 * @author zjx
 * @date 2025-06-06
 */
public class Putintostorage extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 入库编号 */
    private Long incomingId;

    /** 仓库编号 */
    @Excel(name = "仓库编号")
    private String warehouseId;

    /** 供应商编号 */
    @Excel(name = "供应商编号")
    private String supplierId;

    /** 供应商名称 */
    @Excel(name = "供应商名称")
    private String supplierName;

    /** 商品种类数 */
    @Excel(name = "商品种类数")
    private Long productTypes;

    /** 采购结算总金额 */
    @Excel(name = "采购结算总金额")
    private BigDecimal totalAmount;

    /** 审核状态：0-待审核，1-已通过 */
    @Excel(name = "审核状态：0-待审核，1-已通过")
    private Long auditStatus;

    /** 发起人 */
    @Excel(name = "发起人")
    private String initiator;

    /** 操作时间 */
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    @Excel(name = "操作时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date operationTime;

    /** 审核人 */
    @Excel(name = "审核人")
    private String auditor;

    /** 审核时间 */
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    @Excel(name = "审核时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date auditTime;

    public void setIncomingId(Long incomingId) 
    {
        this.incomingId = incomingId;
    }

    public Long getIncomingId() 
    {
        return incomingId;
    }

    public void setWarehouseId(String warehouseId) 
    {
        this.warehouseId = warehouseId;
    }

    public String getWarehouseId() 
    {
        return warehouseId;
    }

    public void setSupplierId(String supplierId) 
    {
        this.supplierId = supplierId;
    }

    public String getSupplierId() 
    {
        return supplierId;
    }

    public void setSupplierName(String supplierName) 
    {
        this.supplierName = supplierName;
    }

    public String getSupplierName() 
    {
        return supplierName;
    }

    public void setProductTypes(Long productTypes) 
    {
        this.productTypes = productTypes;
    }

    public Long getProductTypes() 
    {
        return productTypes;
    }

    public void setTotalAmount(BigDecimal totalAmount) 
    {
        this.totalAmount = totalAmount;
    }

    public BigDecimal getTotalAmount() 
    {
        return totalAmount;
    }

    public void setAuditStatus(Long auditStatus) 
    {
        this.auditStatus = auditStatus;
    }

    public Long getAuditStatus() 
    {
        return auditStatus;
    }

    public void setInitiator(String initiator) 
    {
        this.initiator = initiator;
    }

    public String getInitiator() 
    {
        return initiator;
    }

    public void setOperationTime(Date operationTime) 
    {
        this.operationTime = operationTime;
    }

    public Date getOperationTime() 
    {
        return operationTime;
    }

    public void setAuditor(String auditor) 
    {
        this.auditor = auditor;
    }

    public String getAuditor() 
    {
        return auditor;
    }

    public void setAuditTime(Date auditTime) 
    {
        this.auditTime = auditTime;
    }

    public Date getAuditTime() 
    {
        return auditTime;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("incomingId", getIncomingId())
            .append("warehouseId", getWarehouseId())
            .append("supplierId", getSupplierId())
            .append("supplierName", getSupplierName())
            .append("productTypes", getProductTypes())
            .append("totalAmount", getTotalAmount())
            .append("auditStatus", getAuditStatus())
            .append("initiator", getInitiator())
            .append("operationTime", getOperationTime())
            .append("auditor", getAuditor())
            .append("auditTime", getAuditTime())
            .toString();
    }
}
