package com.ruoyi.InventoryManagement.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.InventoryManagement.mapper.WarehouseentryauditMapper;
import com.ruoyi.InventoryManagement.domain.Warehouseentryaudit;
import com.ruoyi.InventoryManagement.service.IWarehouseentryauditService;
import com.ruoyi.common.core.text.Convert;

/**
 * 入库审核Service业务层处理
 * 
 * @author zjx
 * @date 2025-06-06
 */
@Service
public class WarehouseentryauditServiceImpl implements IWarehouseentryauditService 
{
    @Autowired
    private WarehouseentryauditMapper warehouseentryauditMapper;

    /**
     * 查询入库审核
     * 
     * @param auditId 入库审核主键
     * @return 入库审核
     */
    @Override
    public Warehouseentryaudit selectWarehouseentryauditByAuditId(Long auditId)
    {
        return warehouseentryauditMapper.selectWarehouseentryauditByAuditId(auditId);
    }

    /**
     * 查询入库审核列表
     * 
     * @param warehouseentryaudit 入库审核
     * @return 入库审核
     */
    @Override
    public List<Warehouseentryaudit> selectWarehouseentryauditList(Warehouseentryaudit warehouseentryaudit)
    {
        return warehouseentryauditMapper.selectWarehouseentryauditList(warehouseentryaudit);
    }

    /**
     * 新增入库审核
     * 
     * @param warehouseentryaudit 入库审核
     * @return 结果
     */
    @Override
    public int insertWarehouseentryaudit(Warehouseentryaudit warehouseentryaudit)
    {
        return warehouseentryauditMapper.insertWarehouseentryaudit(warehouseentryaudit);
    }

    /**
     * 修改入库审核
     * 
     * @param warehouseentryaudit 入库审核
     * @return 结果
     */
    @Override
    public int updateWarehouseentryaudit(Warehouseentryaudit warehouseentryaudit)
    {
        return warehouseentryauditMapper.updateWarehouseentryaudit(warehouseentryaudit);
    }

    /**
     * 批量删除入库审核
     * 
     * @param auditIds 需要删除的入库审核主键
     * @return 结果
     */
    @Override
    public int deleteWarehouseentryauditByAuditIds(String auditIds)
    {
        return warehouseentryauditMapper.deleteWarehouseentryauditByAuditIds(Convert.toStrArray(auditIds));
    }

    /**
     * 删除入库审核信息
     * 
     * @param auditId 入库审核主键
     * @return 结果
     */
    @Override
    public int deleteWarehouseentryauditByAuditId(Long auditId)
    {
        return warehouseentryauditMapper.deleteWarehouseentryauditByAuditId(auditId);
    }
}
