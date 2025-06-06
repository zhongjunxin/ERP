package com.ruoyi.InventoryManagement.service;

import java.util.List;
import com.ruoyi.InventoryManagement.domain.Warehouseentryaudit;

/**
 * 入库审核Service接口
 * 
 * @author zjx
 * @date 2025-06-06
 */
public interface IWarehouseentryauditService 
{
    /**
     * 查询入库审核
     * 
     * @param auditId 入库审核主键
     * @return 入库审核
     */
    public Warehouseentryaudit selectWarehouseentryauditByAuditId(Long auditId);

    /**
     * 查询入库审核列表
     * 
     * @param warehouseentryaudit 入库审核
     * @return 入库审核集合
     */
    public List<Warehouseentryaudit> selectWarehouseentryauditList(Warehouseentryaudit warehouseentryaudit);

    /**
     * 新增入库审核
     * 
     * @param warehouseentryaudit 入库审核
     * @return 结果
     */
    public int insertWarehouseentryaudit(Warehouseentryaudit warehouseentryaudit);

    /**
     * 修改入库审核
     * 
     * @param warehouseentryaudit 入库审核
     * @return 结果
     */
    public int updateWarehouseentryaudit(Warehouseentryaudit warehouseentryaudit);

    /**
     * 批量删除入库审核
     * 
     * @param auditIds 需要删除的入库审核主键集合
     * @return 结果
     */
    public int deleteWarehouseentryauditByAuditIds(String auditIds);

    /**
     * 删除入库审核信息
     * 
     * @param auditId 入库审核主键
     * @return 结果
     */
    public int deleteWarehouseentryauditByAuditId(Long auditId);
}
