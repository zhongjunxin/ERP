package com.ruoyi.Commoditylnformation.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.Commoditylnformation.mapper.CommoditylnformationManageMapper;
import com.ruoyi.Commoditylnformation.domain.CommoditylnformationManage;
import com.ruoyi.Commoditylnformation.service.ICommoditylnformationManageService;
import com.ruoyi.common.core.text.Convert;

/**
 * 商品管理Service业务层处理
 * 
 * @author ruoyi
 * @date 2025-04-26
 */
@Service
public class CommoditylnformationManageServiceImpl implements ICommoditylnformationManageService 
{
    @Autowired
    private CommoditylnformationManageMapper commoditylnformationManageMapper;

    /**
     * 查询商品管理
     * 
     * @param productNumber 商品管理主键
     * @return 商品管理
     */
    @Override
    public CommoditylnformationManage selectCommoditylnformationManageByProductNumber(String productNumber)
    {
        return commoditylnformationManageMapper.selectCommoditylnformationManageByProductNumber(productNumber);
    }

    /**
     * 查询商品管理列表
     * 
     * @param commoditylnformationManage 商品管理
     * @return 商品管理
     */
    @Override
    public List<CommoditylnformationManage> selectCommoditylnformationManageList(CommoditylnformationManage commoditylnformationManage)
    {
        return commoditylnformationManageMapper.selectCommoditylnformationManageList(commoditylnformationManage);
    }

    /**
     * 新增商品管理
     * 
     * @param commoditylnformationManage 商品管理
     * @return 结果
     */
    @Override
    public int insertCommoditylnformationManage(CommoditylnformationManage commoditylnformationManage)
    {
        return commoditylnformationManageMapper.insertCommoditylnformationManage(commoditylnformationManage);
    }

    /**
     * 修改商品管理
     * 
     * @param commoditylnformationManage 商品管理
     * @return 结果
     */
    @Override
    public int updateCommoditylnformationManage(CommoditylnformationManage commoditylnformationManage)
    {
        return commoditylnformationManageMapper.updateCommoditylnformationManage(commoditylnformationManage);
    }

    /**
     * 批量删除商品管理
     * 
     * @param productNumbers 需要删除的商品管理主键
     * @return 结果
     */
    @Override
    public int deleteCommoditylnformationManageByProductNumbers(String productNumbers)
    {
        return commoditylnformationManageMapper.deleteCommoditylnformationManageByProductNumbers(Convert.toStrArray(productNumbers));
    }

    /**
     * 删除商品管理信息
     * 
     * @param productNumber 商品管理主键
     * @return 结果
     */
    @Override
    public int deleteCommoditylnformationManageByProductNumber(String productNumber)
    {
        return commoditylnformationManageMapper.deleteCommoditylnformationManageByProductNumber(productNumber);
    }
}
