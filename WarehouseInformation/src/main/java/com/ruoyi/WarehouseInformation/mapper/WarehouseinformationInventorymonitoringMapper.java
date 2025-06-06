package com.ruoyi.WarehouseInformation.mapper;

import java.util.List;
import com.ruoyi.WarehouseInformation.domain.WarehouseinformationInventorymonitoring;

/**
 * 库存监控Mapper接口
 * 
 * @author ruoyi
 * @date 2025-04-26
 */
public interface WarehouseinformationInventorymonitoringMapper 
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
     * 删除库存监控
     * 
     * @param productNumber 库存监控主键
     * @return 结果
     */
    public int deleteWarehouseinformationInventorymonitoringByProductNumber(String productNumber);

    /**
     * 批量删除库存监控
     * 
     * @param productNumbers 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteWarehouseinformationInventorymonitoringByProductNumbers(String[] productNumbers);
}
