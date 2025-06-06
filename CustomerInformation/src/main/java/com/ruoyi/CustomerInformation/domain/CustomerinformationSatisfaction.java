package com.ruoyi.CustomerInformation.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

/**
 * 满意度调查对象 customerinformation_satisfaction
 * 
 * @author ruoyi
 * @date 2025-04-28
 */
public class CustomerinformationSatisfaction extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 调查ID */
    @Excel(name = "调查ID")
    private Long surveyId;

    /** 客户编号 */
    @Excel(name = "客户编号")
    private String customerId;

    /** 调查时间 */
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    @Excel(name = "调查时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date surveyTime;

    /** 满意度评分 */
    @Excel(name = "满意度评分")
    @Min(value = 1, message = "评分只能填写1~5分，1分最低分，5分最高分")
    @Max(value = 5, message = "评分只能填写1~5分，1分最低分，5分最高分")
    private Long score;

    /** 反馈内容 */
    @Excel(name = "反馈内容")
    private String feedback;

    /** 处理状态：0-待处理，1-已跟进 */
    @Excel(name = "处理状态：0-待处理，1-已跟进")
    private Long processStatus;

    public void setSurveyId(Long surveyId) 
    {
        this.surveyId = surveyId;
    }

    public Long getSurveyId() 
    {
        return surveyId;
    }

    public void setCustomerId(String customerId) 
    {
        this.customerId = customerId;
    }

    public String getCustomerId() 
    {
        return customerId;
    }

    public void setSurveyTime(Date surveyTime) 
    {
        this.surveyTime = surveyTime;
    }

    public Date getSurveyTime() 
    {
        return surveyTime;
    }

    public void setScore(Long score) 
    {
        this.score = score;
    }

    public Long getScore() 
    {
        return score;
    }

    public void setFeedback(String feedback) 
    {
        this.feedback = feedback;
    }

    public String getFeedback() 
    {
        return feedback;
    }

    public void setProcessStatus(Long processStatus) 
    {
        this.processStatus = processStatus;
    }

    public Long getProcessStatus() 
    {
        return processStatus;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("surveyId", getSurveyId())
            .append("customerId", getCustomerId())
            .append("surveyTime", getSurveyTime())
            .append("score", getScore())
            .append("feedback", getFeedback())
            .append("processStatus", getProcessStatus())
            .toString();
    }
}
