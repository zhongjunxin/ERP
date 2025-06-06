package com.ruoyi.CustomerInformation.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.CustomerInformation.mapper.CustomerinformationTransactionhistoryMapper;
import com.ruoyi.CustomerInformation.domain.CustomerinformationTransactionhistory;
import com.ruoyi.CustomerInformation.service.ICustomerinformationTransactionhistoryService;
import com.ruoyi.common.core.text.Convert;

/**
 * 交易历史记录Service业务层处理
 * 
 * @author ruoyi
 * @date 2025-04-28
 */
@Service
public class CustomerinformationTransactionhistoryServiceImpl implements ICustomerinformationTransactionhistoryService 
{
    @Autowired
    private CustomerinformationTransactionhistoryMapper customerinformationTransactionhistoryMapper;

    /**
     * 查询交易历史记录
     * 
     * @param transactionId 交易历史记录主键
     * @return 交易历史记录
     */
    @Override
    public CustomerinformationTransactionhistory selectCustomerinformationTransactionhistoryByTransactionId(Long transactionId)
    {
        return customerinformationTransactionhistoryMapper.selectCustomerinformationTransactionhistoryByTransactionId(transactionId);
    }

    /**
     * 查询交易历史记录列表
     * 
     * @param customerinformationTransactionhistory 交易历史记录
     * @return 交易历史记录
     */
    @Override
    public List<CustomerinformationTransactionhistory> selectCustomerinformationTransactionhistoryList(CustomerinformationTransactionhistory customerinformationTransactionhistory)
    {
        return customerinformationTransactionhistoryMapper.selectCustomerinformationTransactionhistoryList(customerinformationTransactionhistory);
    }

    /**
     * 新增交易历史记录
     * 
     * @param customerinformationTransactionhistory 交易历史记录
     * @return 结果
     */
    @Override
    public int insertCustomerinformationTransactionhistory(CustomerinformationTransactionhistory customerinformationTransactionhistory)
    {
        return customerinformationTransactionhistoryMapper.insertCustomerinformationTransactionhistory(customerinformationTransactionhistory);
    }

    /**
     * 修改交易历史记录
     * 
     * @param customerinformationTransactionhistory 交易历史记录
     * @return 结果
     */
    @Override
    public int updateCustomerinformationTransactionhistory(CustomerinformationTransactionhistory customerinformationTransactionhistory)
    {
        return customerinformationTransactionhistoryMapper.updateCustomerinformationTransactionhistory(customerinformationTransactionhistory);
    }

    /**
     * 批量删除交易历史记录
     * 
     * @param transactionIds 需要删除的交易历史记录主键
     * @return 结果
     */
    @Override
    public int deleteCustomerinformationTransactionhistoryByTransactionIds(String transactionIds)
    {
        return customerinformationTransactionhistoryMapper.deleteCustomerinformationTransactionhistoryByTransactionIds(Convert.toStrArray(transactionIds));
    }

    /**
     * 删除交易历史记录信息
     * 
     * @param transactionId 交易历史记录主键
     * @return 结果
     */
    @Override
    public int deleteCustomerinformationTransactionhistoryByTransactionId(Long transactionId)
    {
        return customerinformationTransactionhistoryMapper.deleteCustomerinformationTransactionhistoryByTransactionId(transactionId);
    }
}
