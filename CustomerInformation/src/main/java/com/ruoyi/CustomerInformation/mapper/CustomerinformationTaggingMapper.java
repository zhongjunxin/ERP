package com.ruoyi.CustomerInformation.mapper;

import java.util.List;
import com.ruoyi.CustomerInformation.domain.CustomerinformationTagging;

/**
 * 客户分类标签Mapper接口
 * 
 * @author ruoyi
 * @date 2025-04-28
 */
public interface CustomerinformationTaggingMapper 
{
    /**
     * 查询客户分类标签
     * 
     * @param tagId 客户分类标签主键
     * @return 客户分类标签
     */
    public CustomerinformationTagging selectCustomerinformationTaggingByTagId(Long tagId);

    /**
     * 查询客户分类标签列表
     * 
     * @param customerinformationTagging 客户分类标签
     * @return 客户分类标签集合
     */
    public List<CustomerinformationTagging> selectCustomerinformationTaggingList(CustomerinformationTagging customerinformationTagging);

    /**
     * 新增客户分类标签
     * 
     * @param customerinformationTagging 客户分类标签
     * @return 结果
     */
    public int insertCustomerinformationTagging(CustomerinformationTagging customerinformationTagging);

    /**
     * 修改客户分类标签
     * 
     * @param customerinformationTagging 客户分类标签
     * @return 结果
     */
    public int updateCustomerinformationTagging(CustomerinformationTagging customerinformationTagging);

    /**
     * 删除客户分类标签
     * 
     * @param tagId 客户分类标签主键
     * @return 结果
     */
    public int deleteCustomerinformationTaggingByTagId(Long tagId);

    /**
     * 批量删除客户分类标签
     * 
     * @param tagIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteCustomerinformationTaggingByTagIds(String[] tagIds);
}
