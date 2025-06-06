package com.ruoyi.WarehouseInformation.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 库存监控对象 warehouseinformation_inventorymonitoring
 * 
 * @author ruoyi
 * @date 2025-04-26
 */
public class WarehouseinformationInventorymonitoring extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 商品编号 */
    @Excel(name = "商品编号")
    private String productNumber;

    /** 仓库编号 */
    @Excel(name = "仓库编号")
    private String warehouseId;

    /** 当前库存量 */
    @Excel(name = "当前库存量")
    private Long currentStock;

    /** 安全库存量 */
    @Excel(name = "安全库存量")
    private Long safetyStock;

    /** 最近入库时间 */
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    @Excel(name = "最近入库时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date lastInbound;

    /** 最近出库时间 */
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    @Excel(name = "最近出库时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date lastOutbound;

    /** 库存预警状态：0-正常，1-不足，2-积压 */
    @Excel(name = "库存预警状态：0-正常，1-不足，2-积压")
    private Long alertStatus;

    public void setProductNumber(String productNumber) 
    {
        this.productNumber = productNumber;
    }

    public String getProductNumber() 
    {
        return productNumber;
    }

    public void setWarehouseId(String warehouseId) 
    {
        this.warehouseId = warehouseId;
    }

    public String getWarehouseId() 
    {
        return warehouseId;
    }

    public void setCurrentStock(Long currentStock) 
    {
        this.currentStock = currentStock;
    }

    public Long getCurrentStock() 
    {
        return currentStock;
    }

    public void setSafetyStock(Long safetyStock) 
    {
        this.safetyStock = safetyStock;
    }

    public Long getSafetyStock() 
    {
        return safetyStock;
    }

    public void setLastInbound(Date lastInbound) 
    {
        this.lastInbound = lastInbound;
    }

    public Date getLastInbound() 
    {
        return lastInbound;
    }

    public void setLastOutbound(Date lastOutbound) 
    {
        this.lastOutbound = lastOutbound;
    }

    public Date getLastOutbound() 
    {
        return lastOutbound;
    }

    public void setAlertStatus(Long alertStatus) 
    {
        this.alertStatus = alertStatus;
    }

    public Long getAlertStatus() 
    {
        return alertStatus;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("productNumber", getProductNumber())
            .append("warehouseId", getWarehouseId())
            .append("currentStock", getCurrentStock())
            .append("safetyStock", getSafetyStock())
            .append("lastInbound", getLastInbound())
            .append("lastOutbound", getLastOutbound())
            .append("alertStatus", getAlertStatus())
            .toString();
    }
}
