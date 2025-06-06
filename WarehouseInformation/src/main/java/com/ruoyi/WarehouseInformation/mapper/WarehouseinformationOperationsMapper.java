package com.ruoyi.WarehouseInformation.mapper;

import java.util.List;
import com.ruoyi.WarehouseInformation.domain.WarehouseinformationOperations;

/**
 * 仓库操作管理Mapper接口
 * 
 * @author ruoyi
 * @date 2025-04-26
 */
public interface WarehouseinformationOperationsMapper 
{
    /**
     * 查询仓库操作管理
     * 
     * @param operationId 仓库操作管理主键
     * @return 仓库操作管理
     */
    public WarehouseinformationOperations selectWarehouseinformationOperationsByOperationId(Long operationId);

    /**
     * 查询仓库操作管理列表
     * 
     * @param warehouseinformationOperations 仓库操作管理
     * @return 仓库操作管理集合
     */
    public List<WarehouseinformationOperations> selectWarehouseinformationOperationsList(WarehouseinformationOperations warehouseinformationOperations);

    /**
     * 新增仓库操作管理
     * 
     * @param warehouseinformationOperations 仓库操作管理
     * @return 结果
     */
    public int insertWarehouseinformationOperations(WarehouseinformationOperations warehouseinformationOperations);

    /**
     * 修改仓库操作管理
     * 
     * @param warehouseinformationOperations 仓库操作管理
     * @return 结果
     */
    public int updateWarehouseinformationOperations(WarehouseinformationOperations warehouseinformationOperations);

    /**
     * 删除仓库操作管理
     * 
     * @param operationId 仓库操作管理主键
     * @return 结果
     */
    public int deleteWarehouseinformationOperationsByOperationId(Long operationId);

    /**
     * 批量删除仓库操作管理
     * 
     * @param operationIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteWarehouseinformationOperationsByOperationIds(String[] operationIds);
}
