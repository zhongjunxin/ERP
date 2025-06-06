package com.ruoyi.WarehouseInformation.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.WarehouseInformation.mapper.WarehouseinformationInventorymonitoringMapper;
import com.ruoyi.WarehouseInformation.domain.WarehouseinformationInventorymonitoring;
import com.ruoyi.WarehouseInformation.service.IWarehouseinformationInventorymonitoringService;
import com.ruoyi.common.core.text.Convert;

/**
 * 库存监控Service业务层处理
 * 
 * @author ruoyi
 * @date 2025-04-26
 */
@Service
public class WarehouseinformationInventorymonitoringServiceImpl implements IWarehouseinformationInventorymonitoringService 
{
    @Autowired
    private WarehouseinformationInventorymonitoringMapper warehouseinformationInventorymonitoringMapper;

    /**
     * 查询库存监控
     * 
     * @param productNumber 库存监控主键
     * @return 库存监控
     */
    @Override
    public WarehouseinformationInventorymonitoring selectWarehouseinformationInventorymonitoringByProductNumber(String productNumber)
    {
        return warehouseinformationInventorymonitoringMapper.selectWarehouseinformationInventorymonitoringByProductNumber(productNumber);
    }

    /**
     * 查询库存监控列表
     * 
     * @param warehouseinformationInventorymonitoring 库存监控
     * @return 库存监控
     */
    @Override
    public List<WarehouseinformationInventorymonitoring> selectWarehouseinformationInventorymonitoringList(WarehouseinformationInventorymonitoring warehouseinformationInventorymonitoring)
    {
        return warehouseinformationInventorymonitoringMapper.selectWarehouseinformationInventorymonitoringList(warehouseinformationInventorymonitoring);
    }

    /**
     * 新增库存监控
     * 
     * @param warehouseinformationInventorymonitoring 库存监控
     * @return 结果
     */
    @Override
    public int insertWarehouseinformationInventorymonitoring(WarehouseinformationInventorymonitoring warehouseinformationInventorymonitoring)
    {
        return warehouseinformationInventorymonitoringMapper.insertWarehouseinformationInventorymonitoring(warehouseinformationInventorymonitoring);
    }

    /**
     * 修改库存监控
     * 
     * @param warehouseinformationInventorymonitoring 库存监控
     * @return 结果
     */
    @Override
    public int updateWarehouseinformationInventorymonitoring(WarehouseinformationInventorymonitoring warehouseinformationInventorymonitoring)
    {
        return warehouseinformationInventorymonitoringMapper.updateWarehouseinformationInventorymonitoring(warehouseinformationInventorymonitoring);
    }

    /**
     * 批量删除库存监控
     * 
     * @param productNumbers 需要删除的库存监控主键
     * @return 结果
     */
    @Override
    public int deleteWarehouseinformationInventorymonitoringByProductNumbers(String productNumbers)
    {
        return warehouseinformationInventorymonitoringMapper.deleteWarehouseinformationInventorymonitoringByProductNumbers(Convert.toStrArray(productNumbers));
    }

    /**
     * 删除库存监控信息
     * 
     * @param productNumber 库存监控主键
     * @return 结果
     */
    @Override
    public int deleteWarehouseinformationInventorymonitoringByProductNumber(String productNumber)
    {
        return warehouseinformationInventorymonitoringMapper.deleteWarehouseinformationInventorymonitoringByProductNumber(productNumber);
    }
}
