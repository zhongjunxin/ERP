package com.ruoyi.SupplierInformation.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 供应商档案管理对象 supplierinformation_supplierprofile
 * 
 * @author ruoyi
 * @date 2025-04-28
 */
public class SupplierinformationSupplierprofile extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 供应商编号（例：GYS-001） */
    private String supplierId;

    /** 供应商名称 */
    @Excel(name = "供应商名称")
    private String supplierName;

    /** 主营品类 */
    @Excel(name = "主营品类")
    private String mainCategory;

    /** 联系人 */
    @Excel(name = "联系人")
    private String contactPerson;

    /** 联系电话 */
    @Excel(name = "联系电话")
    private String contactPhone;

    /** 合作开始时间 */
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    @Excel(name = "合作开始时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date cooperationStart;

    /** 合作状态：1-合作中，2-暂停，3-终止 */
    @Excel(name = "合作状态：1-合作中，2-暂停，3-终止")
    private Long cooperationStatus;

    /** 信用评级 */
    @Excel(name = "信用评级")
    private String creditRating;

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

    public void setMainCategory(String mainCategory) 
    {
        this.mainCategory = mainCategory;
    }

    public String getMainCategory() 
    {
        return mainCategory;
    }

    public void setContactPerson(String contactPerson) 
    {
        this.contactPerson = contactPerson;
    }

    public String getContactPerson() 
    {
        return contactPerson;
    }

    public void setContactPhone(String contactPhone) 
    {
        this.contactPhone = contactPhone;
    }

    public String getContactPhone() 
    {
        return contactPhone;
    }

    public void setCooperationStart(Date cooperationStart) 
    {
        this.cooperationStart = cooperationStart;
    }

    public Date getCooperationStart() 
    {
        return cooperationStart;
    }

    public void setCooperationStatus(Long cooperationStatus) 
    {
        this.cooperationStatus = cooperationStatus;
    }

    public Long getCooperationStatus() 
    {
        return cooperationStatus;
    }

    public void setCreditRating(String creditRating) 
    {
        this.creditRating = creditRating;
    }

    public String getCreditRating() 
    {
        return creditRating;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("supplierId", getSupplierId())
            .append("supplierName", getSupplierName())
            .append("mainCategory", getMainCategory())
            .append("contactPerson", getContactPerson())
            .append("contactPhone", getContactPhone())
            .append("cooperationStart", getCooperationStart())
            .append("cooperationStatus", getCooperationStatus())
            .append("creditRating", getCreditRating())
            .toString();
    }
}
