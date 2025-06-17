package com.ruoyi.Commoditylnformation.service;

import java.util.List;
import com.ruoyi.Commoditylnformation.domain.CommoditylnformationBrand;

/**
 * 商品品牌Service接口
 *
 * @author ruoyi
 * @date 2025-04-26
 */
public interface ICommoditylnformationBrandService
{
    /**
     * 查询商品品牌
     *
     * @param id 商品品牌主键
     * @return 商品品牌
     */
    public CommoditylnformationBrand selectCommoditylnformationBrandById(Long id);

    /**
     * 查询商品品牌列表
     *
     * @param commoditylnformationBrand 商品品牌
     * @return 商品品牌集合
     */
    public List<CommoditylnformationBrand> selectCommoditylnformationBrandList(CommoditylnformationBrand commoditylnformationBrand);

    /**
     * 新增商品品牌
     *
     * @param commoditylnformationBrand 商品品牌
     * @return 结果
     */
    public int insertCommoditylnformationBrand(CommoditylnformationBrand commoditylnformationBrand);

    /**
     * 修改商品品牌
     *
     * @param commoditylnformationBrand 商品品牌
     * @return 结果
     */
    public int updateCommoditylnformationBrand(CommoditylnformationBrand commoditylnformationBrand);

    /**
     * 批量删除商品品牌
     *
     * @param ids 需要删除的商品品牌主键集合
     * @return 结果
     */
    public int deleteCommoditylnformationBrandByIds(String ids);

    /**
     * 删除商品品牌信息
     *
     * @param id 商品品牌主键
     * @return 结果
     */
    public int deleteCommoditylnformationBrandById(Long id);
}