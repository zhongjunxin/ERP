package com.ruoyi.CustomerInformation.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.CustomerInformation.mapper.CustomerinformationCustomerprofileMapper;
import com.ruoyi.CustomerInformation.domain.CustomerinformationCustomerprofile;
import com.ruoyi.CustomerInformation.service.ICustomerinformationCustomerprofileService;
import com.ruoyi.common.core.text.Convert;

/**
 * 客户档案管理Service业务层处理
 * 
 * @author ruoyi
 * @date 2025-04-28
 */
@Service
public class CustomerinformationCustomerprofileServiceImpl implements ICustomerinformationCustomerprofileService 
{
    @Autowired
    private CustomerinformationCustomerprofileMapper customerinformationCustomerprofileMapper;

    /**
     * 查询客户档案管理
     * 
     * @param customerId 客户档案管理主键
     * @return 客户档案管理
     */
    @Override
    public CustomerinformationCustomerprofile selectCustomerinformationCustomerprofileByCustomerId(String customerId)
    {
        return customerinformationCustomerprofileMapper.selectCustomerinformationCustomerprofileByCustomerId(customerId);
    }

    /**
     * 查询客户档案管理列表
     * 
     * @param customerinformationCustomerprofile 客户档案管理
     * @return 客户档案管理
     */
    @Override
    public List<CustomerinformationCustomerprofile> selectCustomerinformationCustomerprofileList(CustomerinformationCustomerprofile customerinformationCustomerprofile)
    {
        return customerinformationCustomerprofileMapper.selectCustomerinformationCustomerprofileList(customerinformationCustomerprofile);
    }

    /**
     * 新增客户档案管理
     * 
     * @param customerinformationCustomerprofile 客户档案管理
     * @return 结果
     */
    @Override
    public int insertCustomerinformationCustomerprofile(CustomerinformationCustomerprofile customerinformationCustomerprofile)
    {
        return customerinformationCustomerprofileMapper.insertCustomerinformationCustomerprofile(customerinformationCustomerprofile);
    }

    /**
     * 修改客户档案管理
     * 
     * @param customerinformationCustomerprofile 客户档案管理
     * @return 结果
     */
    @Override
    public int updateCustomerinformationCustomerprofile(CustomerinformationCustomerprofile customerinformationCustomerprofile)
    {
        return customerinformationCustomerprofileMapper.updateCustomerinformationCustomerprofile(customerinformationCustomerprofile);
    }

    /**
     * 批量删除客户档案管理
     * 
     * @param customerIds 需要删除的客户档案管理主键
     * @return 结果
     */
    @Override
    public int deleteCustomerinformationCustomerprofileByCustomerIds(String customerIds)
    {
        return customerinformationCustomerprofileMapper.deleteCustomerinformationCustomerprofileByCustomerIds(Convert.toStrArray(customerIds));
    }

    /**
     * 删除客户档案管理信息
     * 
     * @param customerId 客户档案管理主键
     * @return 结果
     */
    @Override
    public int deleteCustomerinformationCustomerprofileByCustomerId(String customerId)
    {
        return customerinformationCustomerprofileMapper.deleteCustomerinformationCustomerprofileByCustomerId(customerId);
    }
}
