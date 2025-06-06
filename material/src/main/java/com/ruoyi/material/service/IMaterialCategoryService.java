package com.ruoyi.material.service;

import java.util.List;
import com.ruoyi.material.domain.MaterialCategory;

/**
 * 物料分类Service接口
 * 
 * @author ruoyi
 * @date 2025-05-06
 */
public interface IMaterialCategoryService 
{
    /**
     * 查询物料分类
     * 
     * @param categoryCode 物料分类主键
     * @return 物料分类
     */
    public MaterialCategory selectMaterialCategoryByCategoryCode(String categoryCode);

    /**
     * 查询物料分类列表
     * 
     * @param materialCategory 物料分类
     * @return 物料分类集合
     */
    public List<MaterialCategory> selectMaterialCategoryList(MaterialCategory materialCategory);

    /**
     * 新增物料分类
     * 
     * @param materialCategory 物料分类
     * @return 结果
     */
    public int insertMaterialCategory(MaterialCategory materialCategory);

    /**
     * 修改物料分类
     * 
     * @param materialCategory 物料分类
     * @return 结果
     */
    public int updateMaterialCategory(MaterialCategory materialCategory);

    /**
     * 批量删除物料分类
     * 
     * @param categoryCodes 需要删除的物料分类主键集合
     * @return 结果
     */
    public int deleteMaterialCategoryByCategoryCodes(String categoryCodes);

    /**
     * 删除物料分类信息
     * 
     * @param categoryCode 物料分类主键
     * @return 结果
     */
    public int deleteMaterialCategoryByCategoryCode(String categoryCode);
}
