package com.ruoyi.Commoditylnformation.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.Commoditylnformation.mapper.CommoditylnformationClassificationMapper;
import com.ruoyi.Commoditylnformation.domain.CommoditylnformationClassification;
import com.ruoyi.Commoditylnformation.service.ICommoditylnformationClassificationService;
import com.ruoyi.common.core.text.Convert;
import com.ruoyi.common.exception.ServiceException;
import com.ruoyi.common.utils.StringUtils;

/**
 * 商品分类Service业务层处理
 *
 * @author ruoyi
 * @date 2025-04-26
 */
@Service
public class CommoditylnformationClassificationServiceImpl implements ICommoditylnformationClassificationService
{
    @Autowired
    private CommoditylnformationClassificationMapper commoditylnformationClassificationMapper;

    /**
     * 查询商品分类
     *
     * @param id 商品分类主键
     * @return 商品分类
     */
    @Override
    public CommoditylnformationClassification selectCommoditylnformationClassificationById(Long id)
    {
        return commoditylnformationClassificationMapper.selectCommoditylnformationClassificationById(id);
    }

    /**
     * 查询商品分类列表
     *
     * @param commoditylnformationClassification 商品分类
     * @return 商品分类
     */
    @Override
    public List<CommoditylnformationClassification> selectCommoditylnformationClassificationList(CommoditylnformationClassification commoditylnformationClassification)
    {
        return commoditylnformationClassificationMapper.selectCommoditylnformationClassificationList(commoditylnformationClassification);
    }

    /**
     * 新增商品分类
     *
     * @param commoditylnformationClassification 商品分类
     * @return 结果
     */
    @Override
    public int insertCommoditylnformationClassification(CommoditylnformationClassification commoditylnformationClassification)
    {
        // 校验分类名称
        validateCategory(commoditylnformationClassification);

        // 默认启用状态
        if (commoditylnformationClassification.getStatus() == null) {
            commoditylnformationClassification.setStatus(1L);
        }

        return commoditylnformationClassificationMapper.insertCommoditylnformationClassification(commoditylnformationClassification);
    }

    /**
     * 修改商品分类
     *
     * @param commoditylnformationClassification 商品分类
     * @return 结果
     */
    @Override
    public int updateCommoditylnformationClassification(CommoditylnformationClassification commoditylnformationClassification)
    {
        // 校验分类名称
        validateCategory(commoditylnformationClassification);
        return commoditylnformationClassificationMapper.updateCommoditylnformationClassification(commoditylnformationClassification);
    }

    /**
     * 修改商品分类状态
     *
     * @param commoditylnformationClassification 商品分类
     * @return 结果
     */
    @Override
    public int updateClassificationStatus(CommoditylnformationClassification commoditylnformationClassification)
    {
        return commoditylnformationClassificationMapper.updateClassificationStatus(commoditylnformationClassification);
    }

    /**
     * 校验分类名称
     */
    private void validateCategory(CommoditylnformationClassification classification) {
        // 1. 检查必填
        if (StringUtils.isEmpty(classification.getCategoryName())) {
            throw new ServiceException("商品分类名称必填，请重新输入");
        }

        // 2. 检查长度 (2-16个字符)
        int length = classification.getCategoryName().length();
        if (length < 2 || length > 16) {
            throw new ServiceException("商品分类名称长度需在2-16个字符之间");
        }

        // 3. 检查唯一性
        if (!checkCategoryNameUnique(classification.getCategoryName(), classification.getId())) {
            throw new ServiceException("商品分类名称重复，请重新输入");
        }
    }

    /**
     * 检查分类名称是否唯一
     */
    @Override
    public boolean checkCategoryNameUnique(String categoryName, Long id) {
        int count = commoditylnformationClassificationMapper.checkCategoryNameUnique(categoryName, id);
        return count == 0;
    }

    /**
     * 批量删除商品分类
     *
     * @param ids 需要删除的商品分类主键
     * @return 结果
     */
    @Override
    public int deleteCommoditylnformationClassificationByIds(String ids)
    {
        return commoditylnformationClassificationMapper.deleteCommoditylnformationClassificationByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除商品分类信息
     *
     * @param id 商品分类主键
     * @return 结果
     */
    @Override
    public int deleteCommoditylnformationClassificationById(Long id)
    {
        return commoditylnformationClassificationMapper.deleteCommoditylnformationClassificationById(id);
    }
}