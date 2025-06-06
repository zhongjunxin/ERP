package com.ruoyi.Commoditylnformation.mapper;

import java.util.List;
import com.ruoyi.Commoditylnformation.domain.CommoditylnformationClassification;

/**
 * 商品分类Mapper接口
 * 
 * @author ruoyi
 * @date 2025-04-26
 */
public interface CommoditylnformationClassificationMapper 
{
    /**
     * 查询商品分类
     * 
     * @param id 商品分类主键
     * @return 商品分类
     */
    public CommoditylnformationClassification selectCommoditylnformationClassificationById(Long id);

    /**
     * 查询商品分类列表
     * 
     * @param commoditylnformationClassification 商品分类
     * @return 商品分类集合
     */
    public List<CommoditylnformationClassification> selectCommoditylnformationClassificationList(CommoditylnformationClassification commoditylnformationClassification);

    /**
     * 新增商品分类
     * 
     * @param commoditylnformationClassification 商品分类
     * @return 结果
     */
    public int insertCommoditylnformationClassification(CommoditylnformationClassification commoditylnformationClassification);

    /**
     * 修改商品分类
     * 
     * @param commoditylnformationClassification 商品分类
     * @return 结果
     */
    public int updateCommoditylnformationClassification(CommoditylnformationClassification commoditylnformationClassification);

    /**
     * 删除商品分类
     * 
     * @param id 商品分类主键
     * @return 结果
     */
    public int deleteCommoditylnformationClassificationById(Long id);

    /**
     * 批量删除商品分类
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteCommoditylnformationClassificationByIds(String[] ids);
}
