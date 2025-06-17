package com.ruoyi.Commoditylnformation.domain;

import java.math.BigDecimal;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 商品管理对象 commoditylnformation_manage
 *
 * @author ruoyi
 * @date 2025-04-26
 */
public class CommoditylnformationManage extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 商品编号 */
    private String productNumber;

    /** 商品图片路径 */
    @Excel(name = "商品图片路径")
    private String productImage;

    /** 商品名称 */
    @Excel(name = "商品名称")
    private String productName;

    /** 商品分类ID */
    @Excel(name = "商品分类ID")
    private Long categoryId;

    /** 商品分类名称 */
    private String categoryName;

    /** 商品品牌ID */
    @Excel(name = "商品品牌ID")
    private Long brandId;

    /** 商品品牌名称 */
    private String brandName;

    /** 商品单位ID */
    @Excel(name = "商品单位ID")
    private Long unitId;

    /** 商品单位名称 */
    private String unitName;

    /** 建议采购价格 */
    @Excel(name = "建议采购价格")
    private BigDecimal suggestedPurchasePrice;

    /** 建议销售价格 */
    @Excel(name = "建议销售价格")
    private BigDecimal suggestedSalePrice;

    /** 状态（0-启用 1-禁用） */
    @Excel(name = "状态", readConverterExp = "0=启用,1=禁用")
    private String status;

    public void setProductNumber(String productNumber)
    {
        this.productNumber = productNumber;
    }

    public String getProductNumber()
    {
        return productNumber;
    }

    public void setProductImage(String productImage)
    {
        this.productImage = productImage;
    }

    public String getProductImage()
    {
        return productImage;
    }

    public void setProductName(String productName)
    {
        this.productName = productName;
    }

    public String getProductName()
    {
        return productName;
    }

    public void setCategoryId(Long categoryId)
    {
        this.categoryId = categoryId;
    }

    public Long getCategoryId()
    {
        return categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public void setBrandId(Long brandId)
    {
        this.brandId = brandId;
    }

    public Long getBrandId()
    {
        return brandId;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public void setUnitId(Long unitId)
    {
        this.unitId = unitId;
    }

    public Long getUnitId()
    {
        return unitId;
    }

    public String getUnitName() {
        return unitName;
    }

    public void setUnitName(String unitName) {
        this.unitName = unitName;
    }

    public void setSuggestedPurchasePrice(BigDecimal suggestedPurchasePrice)
    {
        this.suggestedPurchasePrice = suggestedPurchasePrice;
    }

    public BigDecimal getSuggestedPurchasePrice()
    {
        return suggestedPurchasePrice;
    }

    public void setSuggestedSalePrice(BigDecimal suggestedSalePrice)
    {
        this.suggestedSalePrice = suggestedSalePrice;
    }

    public BigDecimal getSuggestedSalePrice()
    {
        return suggestedSalePrice;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
                .append("productNumber", getProductNumber())
                .append("productImage", getProductImage())
                .append("productName", getProductName())
                .append("categoryId", getCategoryId())
                .append("categoryName", getCategoryName())
                .append("brandId", getBrandId())
                .append("brandName", getBrandName())
                .append("unitId", getUnitId())
                .append("unitName", getUnitName())
                .append("suggestedPurchasePrice", getSuggestedPurchasePrice())
                .append("suggestedSalePrice", getSuggestedSalePrice())
                .append("status", getStatus())
                .append("createBy", getCreateBy())
                .append("createTime", getCreateTime())
                .append("updateBy", getUpdateBy())
                .append("updateTime", getUpdateTime())
                .append("remark", getRemark())
                .toString();
    }
}