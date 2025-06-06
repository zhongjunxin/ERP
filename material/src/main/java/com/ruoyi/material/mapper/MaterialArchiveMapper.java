package com.ruoyi.material.mapper;

import java.util.List;
import com.ruoyi.material.domain.MaterialArchive;

/**
 * 物料档案Mapper接口
 * 
 * @author ruoyi
 * @date 2025-05-06
 */
public interface MaterialArchiveMapper 
{
    /**
     * 查询物料档案
     * 
     * @param materialCode 物料档案主键
     * @return 物料档案
     */
    public MaterialArchive selectMaterialArchiveByMaterialCode(String materialCode);

    /**
     * 查询物料档案列表
     * 
     * @param materialArchive 物料档案
     * @return 物料档案集合
     */
    public List<MaterialArchive> selectMaterialArchiveList(MaterialArchive materialArchive);

    /**
     * 新增物料档案
     * 
     * @param materialArchive 物料档案
     * @return 结果
     */
    public int insertMaterialArchive(MaterialArchive materialArchive);

    /**
     * 修改物料档案
     * 
     * @param materialArchive 物料档案
     * @return 结果
     */
    public int updateMaterialArchive(MaterialArchive materialArchive);

    /**
     * 删除物料档案
     * 
     * @param materialCode 物料档案主键
     * @return 结果
     */
    public int deleteMaterialArchiveByMaterialCode(String materialCode);

    /**
     * 批量删除物料档案
     * 
     * @param materialCodes 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteMaterialArchiveByMaterialCodes(String[] materialCodes);
}
