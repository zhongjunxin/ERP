package com.ruoyi.Commoditylnformation.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.Commoditylnformation.mapper.CommoditylnformationBrandMapper;
import com.ruoyi.Commoditylnformation.domain.CommoditylnformationBrand;
import com.ruoyi.Commoditylnformation.service.ICommoditylnformationBrandService;
import com.ruoyi.common.core.text.Convert;

/**
 * 商品品牌Service业务层处理
 *
 * @author ruoyi
 * @date 2025-04-26
 */
@Service
public class CommoditylnformationBrandServiceImpl implements ICommoditylnformationBrandService
{
    @Autowired
    private CommoditylnformationBrandMapper commoditylnformationBrandMapper;

    /**
     * 查询商品品牌
     *
     * @param id 商品品牌主键
     * @return 商品品牌
     */
    @Override
    public CommoditylnformationBrand selectCommoditylnformationBrandById(Long id)
    {
        return commoditylnformationBrandMapper.selectCommoditylnformationBrandById(id);
    }

    /**
     * 查询商品品牌列表
     *
     * @param commoditylnformationBrand 商品品牌
     * @return 商品品牌
     */
    @Override
    public List<CommoditylnformationBrand> selectCommoditylnformationBrandList(CommoditylnformationBrand commoditylnformationBrand)
    {
        return commoditylnformationBrandMapper.selectCommoditylnformationBrandList(commoditylnformationBrand);
    }

    /**
     * 新增商品品牌
     *
     * @param commoditylnformationBrand 商品品牌
     * @return 结果
     */
    @Override
    public int insertCommoditylnformationBrand(CommoditylnformationBrand commoditylnformationBrand)
    {
        return commoditylnformationBrandMapper.insertCommoditylnformationBrand(commoditylnformationBrand);
    }

    /**
     * 修改商品品牌
     *
     * @param commoditylnformationBrand 商品品牌
     * @return 结果
     */
    @Override
    public int updateCommoditylnformationBrand(CommoditylnformationBrand commoditylnformationBrand)
    {
        return commoditylnformationBrandMapper.updateCommoditylnformationBrand(commoditylnformationBrand);
    }

    /**
     * 批量删除商品品牌
     *
     * @param ids 需要删除的商品品牌主键
     * @return 结果
     */
    @Override
    public int deleteCommoditylnformationBrandByIds(String ids)
    {
        return commoditylnformationBrandMapper.deleteCommoditylnformationBrandByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除商品品牌信息
     *
     * @param id 商品品牌主键
     * @return 结果
     */
    @Override
    public int deleteCommoditylnformationBrandById(Long id)
    {
        return commoditylnformationBrandMapper.deleteCommoditylnformationBrandById(id);
    }
}