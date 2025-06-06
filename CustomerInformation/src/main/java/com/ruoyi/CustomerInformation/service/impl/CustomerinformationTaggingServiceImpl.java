package com.ruoyi.CustomerInformation.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.CustomerInformation.mapper.CustomerinformationTaggingMapper;
import com.ruoyi.CustomerInformation.domain.CustomerinformationTagging;
import com.ruoyi.CustomerInformation.service.ICustomerinformationTaggingService;
import com.ruoyi.common.core.text.Convert;

/**
 * 客户分类标签Service业务层处理
 * 
 * @author ruoyi
 * @date 2025-04-28
 */
@Service
public class CustomerinformationTaggingServiceImpl implements ICustomerinformationTaggingService 
{
    @Autowired
    private CustomerinformationTaggingMapper customerinformationTaggingMapper;

    /**
     * 查询客户分类标签
     * 
     * @param tagId 客户分类标签主键
     * @return 客户分类标签
     */
    @Override
    public CustomerinformationTagging selectCustomerinformationTaggingByTagId(Long tagId)
    {
        return customerinformationTaggingMapper.selectCustomerinformationTaggingByTagId(tagId);
    }

    /**
     * 查询客户分类标签列表
     * 
     * @param customerinformationTagging 客户分类标签
     * @return 客户分类标签
     */
    @Override
    public List<CustomerinformationTagging> selectCustomerinformationTaggingList(CustomerinformationTagging customerinformationTagging)
    {
        return customerinformationTaggingMapper.selectCustomerinformationTaggingList(customerinformationTagging);
    }

    /**
     * 新增客户分类标签
     * 
     * @param customerinformationTagging 客户分类标签
     * @return 结果
     */
    @Override
    public int insertCustomerinformationTagging(CustomerinformationTagging customerinformationTagging)
    {
        customerinformationTagging.setCreateTime(DateUtils.getNowDate());
        return customerinformationTaggingMapper.insertCustomerinformationTagging(customerinformationTagging);
    }

    /**
     * 修改客户分类标签
     * 
     * @param customerinformationTagging 客户分类标签
     * @return 结果
     */
    @Override
    public int updateCustomerinformationTagging(CustomerinformationTagging customerinformationTagging)
    {
        return customerinformationTaggingMapper.updateCustomerinformationTagging(customerinformationTagging);
    }

    /**
     * 批量删除客户分类标签
     * 
     * @param tagIds 需要删除的客户分类标签主键
     * @return 结果
     */
    @Override
    public int deleteCustomerinformationTaggingByTagIds(String tagIds)
    {
        return customerinformationTaggingMapper.deleteCustomerinformationTaggingByTagIds(Convert.toStrArray(tagIds));
    }

    /**
     * 删除客户分类标签信息
     * 
     * @param tagId 客户分类标签主键
     * @return 结果
     */
    @Override
    public int deleteCustomerinformationTaggingByTagId(Long tagId)
    {
        return customerinformationTaggingMapper.deleteCustomerinformationTaggingByTagId(tagId);
    }
}
