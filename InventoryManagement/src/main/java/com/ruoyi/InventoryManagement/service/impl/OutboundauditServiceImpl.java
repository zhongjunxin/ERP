package com.ruoyi.InventoryManagement.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.InventoryManagement.mapper.OutboundauditMapper;
import com.ruoyi.InventoryManagement.domain.Outboundaudit;
import com.ruoyi.InventoryManagement.service.IOutboundauditService;
import com.ruoyi.common.core.text.Convert;

/**
 * 出库审核Service业务层处理
 * 
 * @author zjx
 * @date 2025-06-06
 */
@Service
public class OutboundauditServiceImpl implements IOutboundauditService 
{
    @Autowired
    private OutboundauditMapper outboundauditMapper;

    /**
     * 查询出库审核
     * 
     * @param auditId 出库审核主键
     * @return 出库审核
     */
    @Override
    public Outboundaudit selectOutboundauditByAuditId(Long auditId)
    {
        return outboundauditMapper.selectOutboundauditByAuditId(auditId);
    }

    /**
     * 查询出库审核列表
     * 
     * @param outboundaudit 出库审核
     * @return 出库审核
     */
    @Override
    public List<Outboundaudit> selectOutboundauditList(Outboundaudit outboundaudit)
    {
        return outboundauditMapper.selectOutboundauditList(outboundaudit);
    }

    /**
     * 新增出库审核
     * 
     * @param outboundaudit 出库审核
     * @return 结果
     */
    @Override
    public int insertOutboundaudit(Outboundaudit outboundaudit)
    {
        return outboundauditMapper.insertOutboundaudit(outboundaudit);
    }

    /**
     * 修改出库审核
     * 
     * @param outboundaudit 出库审核
     * @return 结果
     */
    @Override
    public int updateOutboundaudit(Outboundaudit outboundaudit)
    {
        return outboundauditMapper.updateOutboundaudit(outboundaudit);
    }

    /**
     * 批量删除出库审核
     * 
     * @param auditIds 需要删除的出库审核主键
     * @return 结果
     */
    @Override
    public int deleteOutboundauditByAuditIds(String auditIds)
    {
        return outboundauditMapper.deleteOutboundauditByAuditIds(Convert.toStrArray(auditIds));
    }

    /**
     * 删除出库审核信息
     * 
     * @param auditId 出库审核主键
     * @return 结果
     */
    @Override
    public int deleteOutboundauditByAuditId(Long auditId)
    {
        return outboundauditMapper.deleteOutboundauditByAuditId(auditId);
    }
}
