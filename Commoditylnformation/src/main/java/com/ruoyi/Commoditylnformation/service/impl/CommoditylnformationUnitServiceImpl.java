package com.ruoyi.Commoditylnformation.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.Commoditylnformation.mapper.CommoditylnformationUnitMapper;
import com.ruoyi.Commoditylnformation.domain.CommoditylnformationUnit;
import com.ruoyi.Commoditylnformation.service.ICommoditylnformationUnitService;
import com.ruoyi.common.core.text.Convert;

/**
 * 商品单位Service业务层处理
 * 
 * @author ruoyi
 * @date 2025-04-26
 */
@Service
public class CommoditylnformationUnitServiceImpl implements ICommoditylnformationUnitService 
{
    @Autowired
    private CommoditylnformationUnitMapper commoditylnformationUnitMapper;

    /**
     * 查询商品单位
     * 
     * @param id 商品单位主键
     * @return 商品单位
     */
    @Override
    public CommoditylnformationUnit selectCommoditylnformationUnitById(Long id)
    {
        return commoditylnformationUnitMapper.selectCommoditylnformationUnitById(id);
    }

    /**
     * 查询商品单位列表
     * 
     * @param commoditylnformationUnit 商品单位
     * @return 商品单位
     */
    @Override
    public List<CommoditylnformationUnit> selectCommoditylnformationUnitList(CommoditylnformationUnit commoditylnformationUnit)
    {
        return commoditylnformationUnitMapper.selectCommoditylnformationUnitList(commoditylnformationUnit);
    }

    /**
     * 新增商品单位
     * 
     * @param commoditylnformationUnit 商品单位
     * @return 结果
     */
    @Override
    public int insertCommoditylnformationUnit(CommoditylnformationUnit commoditylnformationUnit)
    {
        return commoditylnformationUnitMapper.insertCommoditylnformationUnit(commoditylnformationUnit);
    }

    /**
     * 修改商品单位
     * 
     * @param commoditylnformationUnit 商品单位
     * @return 结果
     */
    @Override
    public int updateCommoditylnformationUnit(CommoditylnformationUnit commoditylnformationUnit)
    {
        return commoditylnformationUnitMapper.updateCommoditylnformationUnit(commoditylnformationUnit);
    }

    /**
     * 批量删除商品单位
     * 
     * @param ids 需要删除的商品单位主键
     * @return 结果
     */
    @Override
    public int deleteCommoditylnformationUnitByIds(String ids)
    {
        return commoditylnformationUnitMapper.deleteCommoditylnformationUnitByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除商品单位信息
     * 
     * @param id 商品单位主键
     * @return 结果
     */
    @Override
    public int deleteCommoditylnformationUnitById(Long id)
    {
        return commoditylnformationUnitMapper.deleteCommoditylnformationUnitById(id);
    }
}
