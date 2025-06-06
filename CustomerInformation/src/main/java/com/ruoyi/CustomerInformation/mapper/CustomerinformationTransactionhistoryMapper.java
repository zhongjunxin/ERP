package com.ruoyi.CustomerInformation.mapper;

import java.util.List;
import com.ruoyi.CustomerInformation.domain.CustomerinformationTransactionhistory;

/**
 * 交易历史记录Mapper接口
 * 
 * @author ruoyi
 * @date 2025-04-28
 */
public interface CustomerinformationTransactionhistoryMapper 
{
    /**
     * 查询交易历史记录
     * 
     * @param transactionId 交易历史记录主键
     * @return 交易历史记录
     */
    public CustomerinformationTransactionhistory selectCustomerinformationTransactionhistoryByTransactionId(Long transactionId);

    /**
     * 查询交易历史记录列表
     * 
     * @param customerinformationTransactionhistory 交易历史记录
     * @return 交易历史记录集合
     */
    public List<CustomerinformationTransactionhistory> selectCustomerinformationTransactionhistoryList(CustomerinformationTransactionhistory customerinformationTransactionhistory);

    /**
     * 新增交易历史记录
     * 
     * @param customerinformationTransactionhistory 交易历史记录
     * @return 结果
     */
    public int insertCustomerinformationTransactionhistory(CustomerinformationTransactionhistory customerinformationTransactionhistory);

    /**
     * 修改交易历史记录
     * 
     * @param customerinformationTransactionhistory 交易历史记录
     * @return 结果
     */
    public int updateCustomerinformationTransactionhistory(CustomerinformationTransactionhistory customerinformationTransactionhistory);

    /**
     * 删除交易历史记录
     * 
     * @param transactionId 交易历史记录主键
     * @return 结果
     */
    public int deleteCustomerinformationTransactionhistoryByTransactionId(Long transactionId);

    /**
     * 批量删除交易历史记录
     * 
     * @param transactionIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteCustomerinformationTransactionhistoryByTransactionIds(String[] transactionIds);
}
