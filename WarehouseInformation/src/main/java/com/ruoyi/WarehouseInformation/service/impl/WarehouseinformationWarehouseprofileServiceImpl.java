package com.ruoyi.WarehouseInformation.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.WarehouseInformation.mapper.WarehouseinformationWarehouseprofileMapper;
import com.ruoyi.WarehouseInformation.domain.WarehouseinformationWarehouseprofile;
import com.ruoyi.WarehouseInformation.service.IWarehouseinformationWarehouseprofileService;
import com.ruoyi.common.core.text.Convert;

/**
 * 仓库档案管理Service业务层处理
 * 
 * @author ruoyi
 * @date 2025-04-26
 */
@Service
public class WarehouseinformationWarehouseprofileServiceImpl implements IWarehouseinformationWarehouseprofileService 
{
    @Autowired
    private WarehouseinformationWarehouseprofileMapper warehouseinformationWarehouseprofileMapper;

    /**
     * 查询仓库档案管理
     * 
     * @param warehouseId 仓库档案管理主键
     * @return 仓库档案管理
     */
    @Override
    public WarehouseinformationWarehouseprofile selectWarehouseinformationWarehouseprofileByWarehouseId(String warehouseId)
    {
        return warehouseinformationWarehouseprofileMapper.selectWarehouseinformationWarehouseprofileByWarehouseId(warehouseId);
    }

    /**
     * 查询仓库档案管理列表
     * 
     * @param warehouseinformationWarehouseprofile 仓库档案管理
     * @return 仓库档案管理
     */
    @Override
    public List<WarehouseinformationWarehouseprofile> selectWarehouseinformationWarehouseprofileList(WarehouseinformationWarehouseprofile warehouseinformationWarehouseprofile)
    {
        return warehouseinformationWarehouseprofileMapper.selectWarehouseinformationWarehouseprofileList(warehouseinformationWarehouseprofile);
    }

    /**
     * 新增仓库档案管理
     * 
     * @param warehouseinformationWarehouseprofile 仓库档案管理
     * @return 结果
     */
    @Override
    public int insertWarehouseinformationWarehouseprofile(WarehouseinformationWarehouseprofile warehouseinformationWarehouseprofile)
    {
        return warehouseinformationWarehouseprofileMapper.insertWarehouseinformationWarehouseprofile(warehouseinformationWarehouseprofile);
    }

    /**
     * 修改仓库档案管理
     * 
     * @param warehouseinformationWarehouseprofile 仓库档案管理
     * @return 结果
     */
    @Override
    public int updateWarehouseinformationWarehouseprofile(WarehouseinformationWarehouseprofile warehouseinformationWarehouseprofile)
    {
        return warehouseinformationWarehouseprofileMapper.updateWarehouseinformationWarehouseprofile(warehouseinformationWarehouseprofile);
    }

    /**
     * 批量删除仓库档案管理
     * 
     * @param warehouseIds 需要删除的仓库档案管理主键
     * @return 结果
     */
    @Override
    public int deleteWarehouseinformationWarehouseprofileByWarehouseIds(String warehouseIds)
    {
        return warehouseinformationWarehouseprofileMapper.deleteWarehouseinformationWarehouseprofileByWarehouseIds(Convert.toStrArray(warehouseIds));
    }

    /**
     * 删除仓库档案管理信息
     * 
     * @param warehouseId 仓库档案管理主键
     * @return 结果
     */
    @Override
    public int deleteWarehouseinformationWarehouseprofileByWarehouseId(String warehouseId)
    {
        return warehouseinformationWarehouseprofileMapper.deleteWarehouseinformationWarehouseprofileByWarehouseId(warehouseId);
    }
}
