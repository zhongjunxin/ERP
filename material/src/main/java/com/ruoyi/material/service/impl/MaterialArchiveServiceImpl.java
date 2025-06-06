package com.ruoyi.material.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.material.mapper.MaterialArchiveMapper;
import com.ruoyi.material.domain.MaterialArchive;
import com.ruoyi.material.service.IMaterialArchiveService;
import com.ruoyi.common.core.text.Convert;

/**
 * 物料档案Service业务层处理
 * 
 * @author ruoyi
 * @date 2025-05-06
 */
@Service
public class MaterialArchiveServiceImpl implements IMaterialArchiveService 
{
    @Autowired
    private MaterialArchiveMapper materialArchiveMapper;

    /**
     * 查询物料档案
     * 
     * @param materialCode 物料档案主键
     * @return 物料档案
     */
    @Override
    public MaterialArchive selectMaterialArchiveByMaterialCode(String materialCode)
    {
        return materialArchiveMapper.selectMaterialArchiveByMaterialCode(materialCode);
    }

    /**
     * 查询物料档案列表
     * 
     * @param materialArchive 物料档案
     * @return 物料档案
     */
    @Override
    public List<MaterialArchive> selectMaterialArchiveList(MaterialArchive materialArchive)
    {
        return materialArchiveMapper.selectMaterialArchiveList(materialArchive);
    }

    /**
     * 新增物料档案
     * 
     * @param materialArchive 物料档案
     * @return 结果
     */
    @Override
    public int insertMaterialArchive(MaterialArchive materialArchive)
    {
        return materialArchiveMapper.insertMaterialArchive(materialArchive);
    }

    /**
     * 修改物料档案
     * 
     * @param materialArchive 物料档案
     * @return 结果
     */
    @Override
    public int updateMaterialArchive(MaterialArchive materialArchive)
    {
        return materialArchiveMapper.updateMaterialArchive(materialArchive);
    }

    /**
     * 批量删除物料档案
     * 
     * @param materialCodes 需要删除的物料档案主键
     * @return 结果
     */
    @Override
    public int deleteMaterialArchiveByMaterialCodes(String materialCodes)
    {
        return materialArchiveMapper.deleteMaterialArchiveByMaterialCodes(Convert.toStrArray(materialCodes));
    }

    /**
     * 删除物料档案信息
     * 
     * @param materialCode 物料档案主键
     * @return 结果
     */
    @Override
    public int deleteMaterialArchiveByMaterialCode(String materialCode)
    {
        return materialArchiveMapper.deleteMaterialArchiveByMaterialCode(materialCode);
    }
}
