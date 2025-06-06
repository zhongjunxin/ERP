package com.ruoyi.Commoditylnformation.mapper;

import java.util.List;
import com.ruoyi.Commoditylnformation.domain.CommoditylnformationManage;

/**
 * 商品管理Mapper接口
 * 
 * @author ruoyi
 * @date 2025-04-26
 */
public interface CommoditylnformationManageMapper 
{
    /**
     * 查询商品管理
     * 
     * @param productNumber 商品管理主键
     * @return 商品管理
     */
    public CommoditylnformationManage selectCommoditylnformationManageByProductNumber(String productNumber);

    /**
     * 查询商品管理列表
     * 
     * @param commoditylnformationManage 商品管理
     * @return 商品管理集合
     */
    public List<CommoditylnformationManage> selectCommoditylnformationManageList(CommoditylnformationManage commoditylnformationManage);

    /**
     * 新增商品管理
     * 
     * @param commoditylnformationManage 商品管理
     * @return 结果
     */
    public int insertCommoditylnformationManage(CommoditylnformationManage commoditylnformationManage);

    /**
     * 修改商品管理
     * 
     * @param commoditylnformationManage 商品管理
     * @return 结果
     */
    public int updateCommoditylnformationManage(CommoditylnformationManage commoditylnformationManage);

    /**
     * 删除商品管理
     * 
     * @param productNumber 商品管理主键
     * @return 结果
     */
    public int deleteCommoditylnformationManageByProductNumber(String productNumber);

    /**
     * 批量删除商品管理
     * 
     * @param productNumbers 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteCommoditylnformationManageByProductNumbers(String[] productNumbers);
}
