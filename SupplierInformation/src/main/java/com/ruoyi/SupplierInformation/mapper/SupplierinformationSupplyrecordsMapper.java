package com.ruoyi.SupplierInformation.mapper;

import java.util.List;
import com.ruoyi.SupplierInformation.domain.SupplierinformationSupplyrecords;

/**
 * 供应记录管理Mapper接口
 * 
 * @author ruoyi
 * @date 2025-04-28
 */
public interface SupplierinformationSupplyrecordsMapper 
{
    /**
     * 查询供应记录管理
     * 
     * @param recordId 供应记录管理主键
     * @return 供应记录管理
     */
    public SupplierinformationSupplyrecords selectSupplierinformationSupplyrecordsByRecordId(Long recordId);

    /**
     * 查询供应记录管理列表
     * 
     * @param supplierinformationSupplyrecords 供应记录管理
     * @return 供应记录管理集合
     */
    public List<SupplierinformationSupplyrecords> selectSupplierinformationSupplyrecordsList(SupplierinformationSupplyrecords supplierinformationSupplyrecords);

    /**
     * 新增供应记录管理
     * 
     * @param supplierinformationSupplyrecords 供应记录管理
     * @return 结果
     */
    public int insertSupplierinformationSupplyrecords(SupplierinformationSupplyrecords supplierinformationSupplyrecords);

    /**
     * 修改供应记录管理
     * 
     * @param supplierinformationSupplyrecords 供应记录管理
     * @return 结果
     */
    public int updateSupplierinformationSupplyrecords(SupplierinformationSupplyrecords supplierinformationSupplyrecords);

    /**
     * 删除供应记录管理
     * 
     * @param recordId 供应记录管理主键
     * @return 结果
     */
    public int deleteSupplierinformationSupplyrecordsByRecordId(Long recordId);

    /**
     * 批量删除供应记录管理
     * 
     * @param recordIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteSupplierinformationSupplyrecordsByRecordIds(String[] recordIds);
}
