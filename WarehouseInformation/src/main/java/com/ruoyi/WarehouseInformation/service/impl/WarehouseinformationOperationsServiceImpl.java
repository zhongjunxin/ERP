package com.ruoyi.WarehouseInformation.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.WarehouseInformation.mapper.WarehouseinformationOperationsMapper;
import com.ruoyi.WarehouseInformation.domain.WarehouseinformationOperations;
import com.ruoyi.WarehouseInformation.service.IWarehouseinformationOperationsService;
import com.ruoyi.common.core.text.Convert;

/**
 * 仓库操作管理Service业务层处理
 * 
 * @author ruoyi
 * @date 2025-04-26
 */
@Service
public class WarehouseinformationOperationsServiceImpl implements IWarehouseinformationOperationsService 
{
    @Autowired
    private WarehouseinformationOperationsMapper warehouseinformationOperationsMapper;

    /**
     * 查询仓库操作管理
     * 
     * @param operationId 仓库操作管理主键
     * @return 仓库操作管理
     */
    @Override
    public WarehouseinformationOperations selectWarehouseinformationOperationsByOperationId(Long operationId)
    {
        return warehouseinformationOperationsMapper.selectWarehouseinformationOperationsByOperationId(operationId);
    }

    /**
     * 查询仓库操作管理列表
     * 
     * @param warehouseinformationOperations 仓库操作管理
     * @return 仓库操作管理
     */
    @Override
    public List<WarehouseinformationOperations> selectWarehouseinformationOperationsList(WarehouseinformationOperations warehouseinformationOperations)
    {
        return warehouseinformationOperationsMapper.selectWarehouseinformationOperationsList(warehouseinformationOperations);
    }

    /**
     * 新增仓库操作管理
     * 
     * @param warehouseinformationOperations 仓库操作管理
     * @return 结果
     */
    @Override
    public int insertWarehouseinformationOperations(WarehouseinformationOperations warehouseinformationOperations)
    {
        return warehouseinformationOperationsMapper.insertWarehouseinformationOperations(warehouseinformationOperations);
    }

    /**
     * 修改仓库操作管理
     * 
     * @param warehouseinformationOperations 仓库操作管理
     * @return 结果
     */
    @Override
    public int updateWarehouseinformationOperations(WarehouseinformationOperations warehouseinformationOperations)
    {
        return warehouseinformationOperationsMapper.updateWarehouseinformationOperations(warehouseinformationOperations);
    }

    /**
     * 批量删除仓库操作管理
     * 
     * @param operationIds 需要删除的仓库操作管理主键
     * @return 结果
     */
    @Override
    public int deleteWarehouseinformationOperationsByOperationIds(String operationIds)
    {
        return warehouseinformationOperationsMapper.deleteWarehouseinformationOperationsByOperationIds(Convert.toStrArray(operationIds));
    }

    /**
     * 删除仓库操作管理信息
     * 
     * @param operationId 仓库操作管理主键
     * @return 结果
     */
    @Override
    public int deleteWarehouseinformationOperationsByOperationId(Long operationId)
    {
        return warehouseinformationOperationsMapper.deleteWarehouseinformationOperationsByOperationId(operationId);
    }
}
