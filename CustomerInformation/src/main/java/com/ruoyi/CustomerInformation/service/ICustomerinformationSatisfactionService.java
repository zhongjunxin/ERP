package com.ruoyi.CustomerInformation.service;

import java.util.List;
import com.ruoyi.CustomerInformation.domain.CustomerinformationSatisfaction;

/**
 * 满意度调查Service接口
 * 
 * @author ruoyi
 * @date 2025-04-28
 */
public interface ICustomerinformationSatisfactionService 
{
    /**
     * 查询满意度调查
     * 
     * @param surveyId 满意度调查主键
     * @return 满意度调查
     */
    public CustomerinformationSatisfaction selectCustomerinformationSatisfactionBySurveyId(Long surveyId);

    /**
     * 查询满意度调查列表
     * 
     * @param customerinformationSatisfaction 满意度调查
     * @return 满意度调查集合
     */
    public List<CustomerinformationSatisfaction> selectCustomerinformationSatisfactionList(CustomerinformationSatisfaction customerinformationSatisfaction);

    /**
     * 新增满意度调查
     * 
     * @param customerinformationSatisfaction 满意度调查
     * @return 结果
     */
    public int insertCustomerinformationSatisfaction(CustomerinformationSatisfaction customerinformationSatisfaction);

    /**
     * 修改满意度调查
     * 
     * @param customerinformationSatisfaction 满意度调查
     * @return 结果
     */
    public int updateCustomerinformationSatisfaction(CustomerinformationSatisfaction customerinformationSatisfaction);

    /**
     * 批量删除满意度调查
     * 
     * @param surveyIds 需要删除的满意度调查主键集合
     * @return 结果
     */
    public int deleteCustomerinformationSatisfactionBySurveyIds(String surveyIds);

    /**
     * 删除满意度调查信息
     * 
     * @param surveyId 满意度调查主键
     * @return 结果
     */
    public int deleteCustomerinformationSatisfactionBySurveyId(Long surveyId);
}
