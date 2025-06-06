package com.ruoyi.SupplierInformation.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.SupplierInformation.mapper.SupplierinformationKpiMapper;
import com.ruoyi.SupplierInformation.domain.SupplierinformationKpi;
import com.ruoyi.SupplierInformation.service.ISupplierinformationKpiService;
import com.ruoyi.common.core.text.Convert;

/**
 * 评估指标系统Service业务层处理
 * 
 * @author ruoyi
 * @date 2025-04-28
 */
@Service
public class SupplierinformationKpiServiceImpl implements ISupplierinformationKpiService 
{
    @Autowired
    private SupplierinformationKpiMapper supplierinformationKpiMapper;

    /**
     * 查询评估指标系统
     * 
     * @param evaluationId 评估指标系统主键
     * @return 评估指标系统
     */
    @Override
    public SupplierinformationKpi selectSupplierinformationKpiByEvaluationId(Long evaluationId)
    {
        return supplierinformationKpiMapper.selectSupplierinformationKpiByEvaluationId(evaluationId);
    }

    /**
     * 查询评估指标系统列表
     * 
     * @param supplierinformationKpi 评估指标系统
     * @return 评估指标系统
     */
    @Override
    public List<SupplierinformationKpi> selectSupplierinformationKpiList(SupplierinformationKpi supplierinformationKpi)
    {
        return supplierinformationKpiMapper.selectSupplierinformationKpiList(supplierinformationKpi);
    }

    /**
     * 新增评估指标系统
     * 
     * @param supplierinformationKpi 评估指标系统
     * @return 结果
     */
    @Override
    public int insertSupplierinformationKpi(SupplierinformationKpi supplierinformationKpi)
    {
        return supplierinformationKpiMapper.insertSupplierinformationKpi(supplierinformationKpi);
    }

    /**
     * 修改评估指标系统
     * 
     * @param supplierinformationKpi 评估指标系统
     * @return 结果
     */
    @Override
    public int updateSupplierinformationKpi(SupplierinformationKpi supplierinformationKpi)
    {
        return supplierinformationKpiMapper.updateSupplierinformationKpi(supplierinformationKpi);
    }

    /**
     * 批量删除评估指标系统
     * 
     * @param evaluationIds 需要删除的评估指标系统主键
     * @return 结果
     */
    @Override
    public int deleteSupplierinformationKpiByEvaluationIds(String evaluationIds)
    {
        return supplierinformationKpiMapper.deleteSupplierinformationKpiByEvaluationIds(Convert.toStrArray(evaluationIds));
    }

    /**
     * 删除评估指标系统信息
     * 
     * @param evaluationId 评估指标系统主键
     * @return 结果
     */
    @Override
    public int deleteSupplierinformationKpiByEvaluationId(Long evaluationId)
    {
        return supplierinformationKpiMapper.deleteSupplierinformationKpiByEvaluationId(evaluationId);
    }
}
