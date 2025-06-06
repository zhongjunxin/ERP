package com.ruoyi.WarehouseInformation.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 仓库操作管理对象 warehouseinformation_operations
 * 
 * @author ruoyi
 * @date 2025-04-26
 */
public class WarehouseinformationOperations extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 操作流水号 */
    @Excel(name = "操作流水号")
    private Long operationId;

    /** 操作类型 */
    @Excel(name = "操作类型")
    private String operationType;

    /** 关联单据号 */
    @Excel(name = "关联单据号")
    private String relatedOrder;

    /** 仓库编号 */
    @Excel(name = "仓库编号")
    private String warehouseId;

    /** 操作商品种类数 */
    @Excel(name = "操作商品种类数")
    private Long productTypes;

    /** 操作人 */
    @Excel(name = "操作人")
    private String operator;

    /** 操作时间 */
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    @Excel(name = "操作时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date operationTime;

    /** 审核状态：0-待审核，1-已通过 */
    @Excel(name = "审核状态：0-待审核，1-已通过")
    private Long auditStatus;

    public void setOperationId(Long operationId) 
    {
        this.operationId = operationId;
    }

    public Long getOperationId() 
    {
        return operationId;
    }

    public void setOperationType(String operationType) 
    {
        this.operationType = operationType;
    }

    public String getOperationType() 
    {
        return operationType;
    }

    public void setRelatedOrder(String relatedOrder) 
    {
        this.relatedOrder = relatedOrder;
    }

    public String getRelatedOrder() 
    {
        return relatedOrder;
    }

    public void setWarehouseId(String warehouseId) 
    {
        this.warehouseId = warehouseId;
    }

    public String getWarehouseId() 
    {
        return warehouseId;
    }

    public void setProductTypes(Long productTypes) 
    {
        this.productTypes = productTypes;
    }

    public Long getProductTypes() 
    {
        return productTypes;
    }

    public void setOperator(String operator) 
    {
        this.operator = operator;
    }

    public String getOperator() 
    {
        return operator;
    }

    public void setOperationTime(Date operationTime) 
    {
        this.operationTime = operationTime;
    }

    public Date getOperationTime() 
    {
        return operationTime;
    }

    public void setAuditStatus(Long auditStatus) 
    {
        this.auditStatus = auditStatus;
    }

    public Long getAuditStatus() 
    {
        return auditStatus;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("operationId", getOperationId())
            .append("operationType", getOperationType())
            .append("relatedOrder", getRelatedOrder())
            .append("warehouseId", getWarehouseId())
            .append("productTypes", getProductTypes())
            .append("operator", getOperator())
            .append("operationTime", getOperationTime())
            .append("auditStatus", getAuditStatus())
            .append("remark", getRemark())
            .toString();
    }
}
