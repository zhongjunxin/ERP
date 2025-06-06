package com.ruoyi.SupplierInformation.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.SupplierInformation.mapper.SupplierinformationSupplyrecordsMapper;
import com.ruoyi.SupplierInformation.domain.SupplierinformationSupplyrecords;
import com.ruoyi.SupplierInformation.service.ISupplierinformationSupplyrecordsService;
import com.ruoyi.common.core.text.Convert;

/**
 * 供应记录管理Service业务层处理
 * 
 * @author ruoyi
 * @date 2025-04-28
 */
@Service
public class SupplierinformationSupplyrecordsServiceImpl implements ISupplierinformationSupplyrecordsService 
{
    @Autowired
    private SupplierinformationSupplyrecordsMapper supplierinformationSupplyrecordsMapper;

    /**
     * 查询供应记录管理
     * 
     * @param recordId 供应记录管理主键
     * @return 供应记录管理
     */
    @Override
    public SupplierinformationSupplyrecords selectSupplierinformationSupplyrecordsByRecordId(Long recordId)
    {
        return supplierinformationSupplyrecordsMapper.selectSupplierinformationSupplyrecordsByRecordId(recordId);
    }

    /**
     * 查询供应记录管理列表
     * 
     * @param supplierinformationSupplyrecords 供应记录管理
     * @return 供应记录管理
     */
    @Override
    public List<SupplierinformationSupplyrecords> selectSupplierinformationSupplyrecordsList(SupplierinformationSupplyrecords supplierinformationSupplyrecords)
    {
        return supplierinformationSupplyrecordsMapper.selectSupplierinformationSupplyrecordsList(supplierinformationSupplyrecords);
    }

    /**
     * 新增供应记录管理
     * 
     * @param supplierinformationSupplyrecords 供应记录管理
     * @return 结果
     */
    @Override
    public int insertSupplierinformationSupplyrecords(SupplierinformationSupplyrecords supplierinformationSupplyrecords)
    {
        return supplierinformationSupplyrecordsMapper.insertSupplierinformationSupplyrecords(supplierinformationSupplyrecords);
    }

    /**
     * 修改供应记录管理
     * 
     * @param supplierinformationSupplyrecords 供应记录管理
     * @return 结果
     */
    @Override
    public int updateSupplierinformationSupplyrecords(SupplierinformationSupplyrecords supplierinformationSupplyrecords)
    {
        return supplierinformationSupplyrecordsMapper.updateSupplierinformationSupplyrecords(supplierinformationSupplyrecords);
    }

    /**
     * 批量删除供应记录管理
     * 
     * @param recordIds 需要删除的供应记录管理主键
     * @return 结果
     */
    @Override
    public int deleteSupplierinformationSupplyrecordsByRecordIds(String recordIds)
    {
        return supplierinformationSupplyrecordsMapper.deleteSupplierinformationSupplyrecordsByRecordIds(Convert.toStrArray(recordIds));
    }

    /**
     * 删除供应记录管理信息
     * 
     * @param recordId 供应记录管理主键
     * @return 结果
     */
    @Override
    public int deleteSupplierinformationSupplyrecordsByRecordId(Long recordId)
    {
        return supplierinformationSupplyrecordsMapper.deleteSupplierinformationSupplyrecordsByRecordId(recordId);
    }
}
