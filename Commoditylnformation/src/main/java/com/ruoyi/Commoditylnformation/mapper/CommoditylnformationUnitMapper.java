package com.ruoyi.Commoditylnformation.mapper;

import java.util.List;
import com.ruoyi.Commoditylnformation.domain.CommoditylnformationUnit;

/**
 * 商品单位Mapper接口
 * 
 * @author ruoyi
 * @date 2025-04-26
 */
public interface CommoditylnformationUnitMapper 
{
    /**
     * 查询商品单位
     * 
     * @param id 商品单位主键
     * @return 商品单位
     */
    public CommoditylnformationUnit selectCommoditylnformationUnitById(Long id);

    /**
     * 查询商品单位列表
     * 
     * @param commoditylnformationUnit 商品单位
     * @return 商品单位集合
     */
    public List<CommoditylnformationUnit> selectCommoditylnformationUnitList(CommoditylnformationUnit commoditylnformationUnit);

    /**
     * 新增商品单位
     * 
     * @param commoditylnformationUnit 商品单位
     * @return 结果
     */
    public int insertCommoditylnformationUnit(CommoditylnformationUnit commoditylnformationUnit);

    /**
     * 修改商品单位
     * 
     * @param commoditylnformationUnit 商品单位
     * @return 结果
     */
    public int updateCommoditylnformationUnit(CommoditylnformationUnit commoditylnformationUnit);

    /**
     * 删除商品单位
     * 
     * @param id 商品单位主键
     * @return 结果
     */
    public int deleteCommoditylnformationUnitById(Long id);

    /**
     * 批量删除商品单位
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteCommoditylnformationUnitByIds(String[] ids);
}
