package com.ruoyi.Commoditylnformation.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 商品单位实体类
 * 对应数据库中的商品单位表，用于存储商品单位信息
 *
 * @author ruoyi
 * @date 2025-04-26
 */
public class CommoditylnformationUnit extends BaseEntity {
    private static final long serialVersionUID = 1L;

    /** 单位ID */
    private Long id;

    /** 单位名称 */
    @Excel(name = "单位名称")
    private String unitName;

    /** 状态：0-禁用，1-启用 */
    @Excel(name = "状态", readConverterExp = "0=禁用,1=启用")
    private Long status;

    /**
     * 获取单位ID
     * @return 单位ID
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置单位ID
     * @param id 单位ID
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取单位名称
     * @return 单位名称
     */
    public String getUnitName() {
        return unitName;
    }

    /**
     * 设置单位名称
     * @param unitName 单位名称
     */
    public void setUnitName(String unitName) {
        this.unitName = unitName;
    }

    /**
     * 获取状态
     * @return 状态：0-禁用，1-启用
     */
    public Long getStatus() {
        return status;
    }

    /**
     * 获取状态文本表示
     * @return 状态文本："启用"或"禁用"
     */
    public String getStatusText() {
        if (status == null) return "";
        return status == 1 ? "启用" : "禁用";
    }

    /**
     * 设置状态
     * @param status 状态：0-禁用，1-启用
     */
    public void setStatus(Long status) {
        this.status = status;
    }

    /**
     * 重写toString方法
     * @return 对象的字符串表示
     */
    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
                .append("id", getId())
                .append("unitName", getUnitName())
                .append("status", getStatusText()) // 使用文本表示
                .toString();
    }
}