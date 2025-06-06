package com.ruoyi.CustomerInformation.mapper;

import java.util.List;
import com.ruoyi.CustomerInformation.domain.CustomerinformationSatisfaction;

/**
 * 满意度调查Mapper接口
 * 
 * @author ruoyi
 * @date 2025-04-28
 */
public interface CustomerinformationSatisfactionMapper 
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
     * 删除满意度调查
     * 
     * @param surveyId 满意度调查主键
     * @return 结果
     */
    public int deleteCustomerinformationSatisfactionBySurveyId(Long surveyId);

    /**
     * 批量删除满意度调查
     * 
     * @param surveyIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteCustomerinformationSatisfactionBySurveyIds(String[] surveyIds);
}
