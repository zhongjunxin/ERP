package com.ruoyi.Commoditylnformation.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.Commoditylnformation.mapper.CommoditylnformationClassificationMapper;
import com.ruoyi.Commoditylnformation.domain.CommoditylnformationClassification;
import com.ruoyi.Commoditylnformation.service.ICommoditylnformationClassificationService;
import com.ruoyi.common.core.text.Convert;

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
        return commoditylnformationClassificationMapper.updateCommoditylnformationClassification(commoditylnformationClassification);
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
