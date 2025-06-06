package com.ruoyi.WarehouseInformation.domain;

import java.math.BigDecimal;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 仓库档案管理对象 warehouseinformation_warehouseprofile
 * 
 * @author ruoyi
 * @date 2025-04-26
 */
public class WarehouseinformationWarehouseprofile extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 仓库编号（例：CK-001） */
    @Excel(name = "仓库编号", readConverterExp = "例=：CK-001")
    private String warehouseId;

    /** 仓库名称 */
    @Excel(name = "仓库名称")
    private String warehouseName;

    /** 仓库地址 */
    @Excel(name = "仓库地址")
    private String address;

    /** 仓库负责人 */
    @Excel(name = "仓库负责人")
    private String manager;

    /** 联系方式 */
    @Excel(name = "联系方式")
    private String contact;

    /** 仓库容量（单位：立方米） */
    @Excel(name = "仓库容量", readConverterExp = "单=位：立方米")
    private BigDecimal capacity;

    /** 状态：0-停用，1-启用 */
    @Excel(name = "状态：0-停用，1-启用")
    private Long status;

    public void setWarehouseId(String warehouseId) 
    {
        this.warehouseId = warehouseId;
    }

    public String getWarehouseId() 
    {
        return warehouseId;
    }

    public void setWarehouseName(String warehouseName) 
    {
        this.warehouseName = warehouseName;
    }

    public String getWarehouseName() 
    {
        return warehouseName;
    }

    public void setAddress(String address) 
    {
        this.address = address;
    }

    public String getAddress() 
    {
        return address;
    }

    public void setManager(String manager) 
    {
        this.manager = manager;
    }

    public String getManager() 
    {
        return manager;
    }

    public void setContact(String contact) 
    {
        this.contact = contact;
    }

    public String getContact() 
    {
        return contact;
    }

    public void setCapacity(BigDecimal capacity) 
    {
        this.capacity = capacity;
    }

    public BigDecimal getCapacity() 
    {
        return capacity;
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
            .append("warehouseId", getWarehouseId())
            .append("warehouseName", getWarehouseName())
            .append("address", getAddress())
            .append("manager", getManager())
            .append("contact", getContact())
            .append("capacity", getCapacity())
            .append("status", getStatus())
            .toString();
    }
}
