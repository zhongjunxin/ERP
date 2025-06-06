package com.ruoyi.SupplierInformation.service;

import java.util.List;
import com.ruoyi.SupplierInformation.domain.SupplierinformationKpi;

/**
 * 评估指标系统Service接口
 * 
 * @author ruoyi
 * @date 2025-04-28
 */
public interface ISupplierinformationKpiService 
{
    /**
     * 查询评估指标系统
     * 
     * @param evaluationId 评估指标系统主键
     * @return 评估指标系统
     */
    public SupplierinformationKpi selectSupplierinformationKpiByEvaluationId(Long evaluationId);

    /**
     * 查询评估指标系统列表
     * 
     * @param supplierinformationKpi 评估指标系统
     * @return 评估指标系统集合
     */
    public List<SupplierinformationKpi> selectSupplierinformationKpiList(SupplierinformationKpi supplierinformationKpi);

    /**
     * 新增评估指标系统
     * 
     * @param supplierinformationKpi 评估指标系统
     * @return 结果
     */
    public int insertSupplierinformationKpi(SupplierinformationKpi supplierinformationKpi);

    /**
     * 修改评估指标系统
     * 
     * @param supplierinformationKpi 评估指标系统
     * @return 结果
     */
    public int updateSupplierinformationKpi(SupplierinformationKpi supplierinformationKpi);

    /**
     * 批量删除评估指标系统
     * 
     * @param evaluationIds 需要删除的评估指标系统主键集合
     * @return 结果
     */
    public int deleteSupplierinformationKpiByEvaluationIds(String evaluationIds);

    /**
     * 删除评估指标系统信息
     * 
     * @param evaluationId 评估指标系统主键
     * @return 结果
     */
    public int deleteSupplierinformationKpiByEvaluationId(Long evaluationId);
}
