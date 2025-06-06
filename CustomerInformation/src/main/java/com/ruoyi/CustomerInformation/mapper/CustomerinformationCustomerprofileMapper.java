package com.ruoyi.CustomerInformation.mapper;

import java.util.List;
import com.ruoyi.CustomerInformation.domain.CustomerinformationCustomerprofile;

/**
 * 客户档案管理Mapper接口
 * 
 * @author ruoyi
 * @date 2025-04-28
 */
public interface CustomerinformationCustomerprofileMapper 
{
    /**
     * 查询客户档案管理
     * 
     * @param customerId 客户档案管理主键
     * @return 客户档案管理
     */
    public CustomerinformationCustomerprofile selectCustomerinformationCustomerprofileByCustomerId(String customerId);

    /**
     * 查询客户档案管理列表
     * 
     * @param customerinformationCustomerprofile 客户档案管理
     * @return 客户档案管理集合
     */
    public List<CustomerinformationCustomerprofile> selectCustomerinformationCustomerprofileList(CustomerinformationCustomerprofile customerinformationCustomerprofile);

    /**
     * 新增客户档案管理
     * 
     * @param customerinformationCustomerprofile 客户档案管理
     * @return 结果
     */
    public int insertCustomerinformationCustomerprofile(CustomerinformationCustomerprofile customerinformationCustomerprofile);

    /**
     * 修改客户档案管理
     * 
     * @param customerinformationCustomerprofile 客户档案管理
     * @return 结果
     */
    public int updateCustomerinformationCustomerprofile(CustomerinformationCustomerprofile customerinformationCustomerprofile);

    /**
     * 删除客户档案管理
     * 
     * @param customerId 客户档案管理主键
     * @return 结果
     */
    public int deleteCustomerinformationCustomerprofileByCustomerId(String customerId);

    /**
     * 批量删除客户档案管理
     * 
     * @param customerIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteCustomerinformationCustomerprofileByCustomerIds(String[] customerIds);
}
