package com.ruoyi.WarehouseInformation.service;

import java.util.List;
import com.ruoyi.WarehouseInformation.domain.WarehouseinformationWarehouseprofile;

/**
 * 仓库档案管理Service接口
 * 
 * @author ruoyi
 * @date 2025-04-26
 */
public interface IWarehouseinformationWarehouseprofileService 
{
    /**
     * 查询仓库档案管理
     * 
     * @param warehouseId 仓库档案管理主键
     * @return 仓库档案管理
     */
    public WarehouseinformationWarehouseprofile selectWarehouseinformationWarehouseprofileByWarehouseId(String warehouseId);

    /**
     * 查询仓库档案管理列表
     * 
     * @param warehouseinformationWarehouseprofile 仓库档案管理
     * @return 仓库档案管理集合
     */
    public List<WarehouseinformationWarehouseprofile> selectWarehouseinformationWarehouseprofileList(WarehouseinformationWarehouseprofile warehouseinformationWarehouseprofile);

    /**
     * 新增仓库档案管理
     * 
     * @param warehouseinformationWarehouseprofile 仓库档案管理
     * @return 结果
     */
    public int insertWarehouseinformationWarehouseprofile(WarehouseinformationWarehouseprofile warehouseinformationWarehouseprofile);

    /**
     * 修改仓库档案管理
     * 
     * @param warehouseinformationWarehouseprofile 仓库档案管理
     * @return 结果
     */
    public int updateWarehouseinformationWarehouseprofile(WarehouseinformationWarehouseprofile warehouseinformationWarehouseprofile);

    /**
     * 批量删除仓库档案管理
     * 
     * @param warehouseIds 需要删除的仓库档案管理主键集合
     * @return 结果
     */
    public int deleteWarehouseinformationWarehouseprofileByWarehouseIds(String warehouseIds);

    /**
     * 删除仓库档案管理信息
     * 
     * @param warehouseId 仓库档案管理主键
     * @return 结果
     */
    public int deleteWarehouseinformationWarehouseprofileByWarehouseId(String warehouseId);
}
