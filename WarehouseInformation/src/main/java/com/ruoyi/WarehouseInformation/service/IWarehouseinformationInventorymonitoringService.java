package com.ruoyi.WarehouseInformation.service;

import java.util.List;
import com.ruoyi.WarehouseInformation.domain.WarehouseinformationInventorymonitoring;

/**
 * 库存监控Service接口
 * 
 * @author ruoyi
 * @date 2025-04-26
 */
public interface IWarehouseinformationInventorymonitoringService 
{
    /**
     * 查询库存监控
     * 
     * @param productNumber 库存监控主键
     * @return 库存监控
     */
    public WarehouseinformationInventorymonitoring selectWarehouseinformationInventorymonitoringByProductNumber(String productNumber);

    /**
     * 查询库存监控列表
     * 
     * @param warehouseinformationInventorymonitoring 库存监控
     * @return 库存监控集合
     */
    public List<WarehouseinformationInventorymonitoring> selectWarehouseinformationInventorymonitoringList(WarehouseinformationInventorymonitoring warehouseinformationInventorymonitoring);

    /**
     * 新增库存监控
     * 
     * @param warehouseinformationInventorymonitoring 库存监控
     * @return 结果
     */
    public int insertWarehouseinformationInventorymonitoring(WarehouseinformationInventorymonitoring warehouseinformationInventorymonitoring);

    /**
     * 修改库存监控
     * 
     * @param warehouseinformationInventorymonitoring 库存监控
     * @return 结果
     */
    public int updateWarehouseinformationInventorymonitoring(WarehouseinformationInventorymonitoring warehouseinformationInventorymonitoring);

    /**
     * 批量删除库存监控
     * 
     * @param productNumbers 需要删除的库存监控主键集合
     * @return 结果
     */
    public int deleteWarehouseinformationInventorymonitoringByProductNumbers(String productNumbers);

    /**
     * 删除库存监控信息
     * 
     * @param productNumber 库存监控主键
     * @return 结果
     */
    public int deleteWarehouseinformationInventorymonitoringByProductNumber(String productNumber);
}
