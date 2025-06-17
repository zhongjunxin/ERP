package com.ruoyi.Commoditylnformation.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 商品品牌对象 commoditylnformation_brand
 *
 * @author ruoyi
 * @date 2025-04-26
 */
public class CommoditylnformationBrand extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 品牌ID */
    private Long id;

    /** 品牌名称 */
    @Excel(name = "品牌名称")
    private String brandName;

    /** 状态：0-禁用，1-启用 */
    @Excel(name = "状态", readConverterExp = "0=禁用,1=启用")
    private Long status;

//    /** 品牌首字母 */
//    @Excel(name = "品牌首字母")
//    private String brandInitial;
//
//    /** 排序 */
//    @Excel(name = "排序")
//    private Long sort;

    public void setId(Long id)
    {
        this.id = id;
    }

    public Long getId()
    {
        return id;
    }

    public void setBrandName(String brandName)
    {
        this.brandName = brandName;
    }

    public String getBrandName()
    {
        return brandName;
    }

    public void setStatus(Long status)
    {
        this.status = status;
    }

    public Long getStatus()
    {
        return status;
    }
//
//    public String getBrandInitial() {
//        return brandInitial;
//    }
//
//    public void setBrandInitial(String brandInitial) {
//        this.brandInitial = brandInitial;
//    }
//
//    public Long getSort() {
//        return sort;
//    }
//
//    public void setSort(Long sort) {
//        this.sort = sort;
//    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
                .append("id", getId())
                .append("brandName", getBrandName())
                .append("status", getStatus())
//                .append("brandInitial", getBrandInitial())
//                .append("sort", getSort())
                .toString();
    }
}