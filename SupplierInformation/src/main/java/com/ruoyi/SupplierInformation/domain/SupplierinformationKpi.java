package com.ruoyi.SupplierInformation.domain;

import java.math.BigDecimal;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

import javax.validation.constraints.Pattern;

/**
 * 评估指标系统对象 supplierinformation_kpi
 * 
 * @author ruoyi
 * @date 2025-04-28
 */
public class SupplierinformationKpi extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 评估ID */
    private Long evaluationId;

    /** 供应商编号 */
    @Excel(name = "供应商编号")
    private String supplierId;

    /** 评估周期 */
    @Excel(name = "评估周期")
    @Pattern(regexp = "季度|年度", message = "只能以年度或季度进行考察")
    private String evaluationPeriod;

    /** 商品合格率（%） */
    @Excel(name = "商品合格率", readConverterExp = "%=")
    private BigDecimal passRate;

    /** 交货准时率（%） */
    @Excel(name = "交货准时率", readConverterExp = "%=")
    private BigDecimal onTimeRate;

    /** 服务响应评分 */
    @Excel(name = "服务响应评分")
    private BigDecimal serviceScore;

    /** 综合得分 */
    @Excel(name = "综合得分")
    private BigDecimal totalScore;

    /** 评估日期 */
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    @Excel(name = "评估日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date evaluationDate;

    /** 评估人 */
    @Excel(name = "评估人")
    private String evaluator;

    public void setEvaluationId(Long evaluationId) 
    {
        this.evaluationId = evaluationId;
    }

    public Long getEvaluationId() 
    {
        return evaluationId;
    }

    public void setSupplierId(String supplierId) 
    {
        this.supplierId = supplierId;
    }

    public String getSupplierId() 
    {
        return supplierId;
    }

    public void setEvaluationPeriod(String evaluationPeriod) 
    {
        this.evaluationPeriod = evaluationPeriod;
    }

    public String getEvaluationPeriod() 
    {
        return evaluationPeriod;
    }

    public void setPassRate(BigDecimal passRate) 
    {
        this.passRate = passRate;
    }

    public BigDecimal getPassRate() 
    {
        return passRate;
    }

    public void setOnTimeRate(BigDecimal onTimeRate) 
    {
        this.onTimeRate = onTimeRate;
    }

    public BigDecimal getOnTimeRate() 
    {
        return onTimeRate;
    }

    public void setServiceScore(BigDecimal serviceScore) 
    {
        this.serviceScore = serviceScore;
    }

    public BigDecimal getServiceScore() 
    {
        return serviceScore;
    }

    public void setTotalScore(BigDecimal totalScore) 
    {
        this.totalScore = totalScore;
    }

    public BigDecimal getTotalScore() 
    {
        return totalScore;
    }

    public void setEvaluationDate(Date evaluationDate) 
    {
        this.evaluationDate = evaluationDate;
    }

    public Date getEvaluationDate() 
    {
        return evaluationDate;
    }

    public void setEvaluator(String evaluator) 
    {
        this.evaluator = evaluator;
    }

    public String getEvaluator() 
    {
        return evaluator;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("evaluationId", getEvaluationId())
            .append("supplierId", getSupplierId())
            .append("evaluationPeriod", getEvaluationPeriod())
            .append("passRate", getPassRate())
            .append("onTimeRate", getOnTimeRate())
            .append("serviceScore", getServiceScore())
            .append("totalScore", getTotalScore())
            .append("evaluationDate", getEvaluationDate())
            .append("evaluator", getEvaluator())
            .toString();
    }
}
