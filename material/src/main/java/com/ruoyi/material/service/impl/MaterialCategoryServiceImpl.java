package com.ruoyi.material.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.material.mapper.MaterialCategoryMapper;
import com.ruoyi.material.domain.MaterialCategory;
import com.ruoyi.material.service.IMaterialCategoryService;
import com.ruoyi.common.core.text.Convert;

/**
 * 物料分类Service业务层处理
 * 
 * @author ruoyi
 * @date 2025-05-06
 */
@Service
public class MaterialCategoryServiceImpl implements IMaterialCategoryService 
{
    @Autowired
    private MaterialCategoryMapper materialCategoryMapper;

    /**
     * 查询物料分类
     * 
     * @param categoryCode 物料分类主键
     * @return 物料分类
     */
    @Override
    public MaterialCategory selectMaterialCategoryByCategoryCode(String categoryCode)
    {
        return materialCategoryMapper.selectMaterialCategoryByCategoryCode(categoryCode);
    }

    /**
     * 查询物料分类列表
     * 
     * @param materialCategory 物料分类
     * @return 物料分类
     */
    @Override
    public List<MaterialCategory> selectMaterialCategoryList(MaterialCategory materialCategory)
    {
        return materialCategoryMapper.selectMaterialCategoryList(materialCategory);
    }

    /**
     * 新增物料分类
     * 
     * @param materialCategory 物料分类
     * @return 结果
     */
    @Override
    public int insertMaterialCategory(MaterialCategory materialCategory)
    {
        return materialCategoryMapper.insertMaterialCategory(materialCategory);
    }

    /**
     * 修改物料分类
     * 
     * @param materialCategory 物料分类
     * @return 结果
     */
    @Override
    public int updateMaterialCategory(MaterialCategory materialCategory)
    {
        return materialCategoryMapper.updateMaterialCategory(materialCategory);
    }

    /**
     * 批量删除物料分类
     * 
     * @param categoryCodes 需要删除的物料分类主键
     * @return 结果
     */
    @Override
    public int deleteMaterialCategoryByCategoryCodes(String categoryCodes)
    {
        return materialCategoryMapper.deleteMaterialCategoryByCategoryCodes(Convert.toStrArray(categoryCodes));
    }

    /**
     * 删除物料分类信息
     * 
     * @param categoryCode 物料分类主键
     * @return 结果
     */
    @Override
    public int deleteMaterialCategoryByCategoryCode(String categoryCode)
    {
        return materialCategoryMapper.deleteMaterialCategoryByCategoryCode(categoryCode);
    }
}
