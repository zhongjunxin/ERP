package com.ruoyi.InventoryManagement.mapper;

import java.util.List;
import com.ruoyi.InventoryManagement.domain.Outboundaudit;

/**
 * 出库审核Mapper接口
 * 
 * @author zjx
 * @date 2025-06-06
 */
public interface OutboundauditMapper 
{
    /**
     * 查询出库审核
     * 
     * @param auditId 出库审核主键
     * @return 出库审核
     */
    public Outboundaudit selectOutboundauditByAuditId(Long auditId);

    /**
     * 查询出库审核列表
     * 
     * @param outboundaudit 出库审核
     * @return 出库审核集合
     */
    public List<Outboundaudit> selectOutboundauditList(Outboundaudit outboundaudit);

    /**
     * 新增出库审核
     * 
     * @param outboundaudit 出库审核
     * @return 结果
     */
    public int insertOutboundaudit(Outboundaudit outboundaudit);

    /**
     * 修改出库审核
     * 
     * @param outboundaudit 出库审核
     * @return 结果
     */
    public int updateOutboundaudit(Outboundaudit outboundaudit);

    /**
     * 删除出库审核
     * 
     * @param auditId 出库审核主键
     * @return 结果
     */
    public int deleteOutboundauditByAuditId(Long auditId);

    /**
     * 批量删除出库审核
     * 
     * @param auditIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteOutboundauditByAuditIds(String[] auditIds);
}
