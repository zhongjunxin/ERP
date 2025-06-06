package com.ruoyi.CustomerInformation.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.CustomerInformation.mapper.CustomerinformationSatisfactionMapper;
import com.ruoyi.CustomerInformation.domain.CustomerinformationSatisfaction;
import com.ruoyi.CustomerInformation.service.ICustomerinformationSatisfactionService;
import com.ruoyi.common.core.text.Convert;

/**
 * 满意度调查Service业务层处理
 * 
 * @author ruoyi
 * @date 2025-04-28
 */
@Service
public class CustomerinformationSatisfactionServiceImpl implements ICustomerinformationSatisfactionService 
{
    @Autowired
    private CustomerinformationSatisfactionMapper customerinformationSatisfactionMapper;

    /**
     * 查询满意度调查
     * 
     * @param surveyId 满意度调查主键
     * @return 满意度调查
     */
    @Override
    public CustomerinformationSatisfaction selectCustomerinformationSatisfactionBySurveyId(Long surveyId)
    {
        return customerinformationSatisfactionMapper.selectCustomerinformationSatisfactionBySurveyId(surveyId);
    }

    /**
     * 查询满意度调查列表
     * 
     * @param customerinformationSatisfaction 满意度调查
     * @return 满意度调查
     */
    @Override
    public List<CustomerinformationSatisfaction> selectCustomerinformationSatisfactionList(CustomerinformationSatisfaction customerinformationSatisfaction)
    {
        return customerinformationSatisfactionMapper.selectCustomerinformationSatisfactionList(customerinformationSatisfaction);
    }

    /**
     * 新增满意度调查
     * 
     * @param customerinformationSatisfaction 满意度调查
     * @return 结果
     */
    @Override
    public int insertCustomerinformationSatisfaction(CustomerinformationSatisfaction customerinformationSatisfaction)
    {
        return customerinformationSatisfactionMapper.insertCustomerinformationSatisfaction(customerinformationSatisfaction);
    }

    /**
     * 修改满意度调查
     * 
     * @param customerinformationSatisfaction 满意度调查
     * @return 结果
     */
    @Override
    public int updateCustomerinformationSatisfaction(CustomerinformationSatisfaction customerinformationSatisfaction)
    {
        return customerinformationSatisfactionMapper.updateCustomerinformationSatisfaction(customerinformationSatisfaction);
    }

    /**
     * 批量删除满意度调查
     * 
     * @param surveyIds 需要删除的满意度调查主键
     * @return 结果
     */
    @Override
    public int deleteCustomerinformationSatisfactionBySurveyIds(String surveyIds)
    {
        return customerinformationSatisfactionMapper.deleteCustomerinformationSatisfactionBySurveyIds(Convert.toStrArray(surveyIds));
    }

    /**
     * 删除满意度调查信息
     * 
     * @param surveyId 满意度调查主键
     * @return 结果
     */
    @Override
    public int deleteCustomerinformationSatisfactionBySurveyId(Long surveyId)
    {
        return customerinformationSatisfactionMapper.deleteCustomerinformationSatisfactionBySurveyId(surveyId);
    }
}
