package com.ruoyi.Commoditylnformation.service;

import java.util.List;
import com.ruoyi.Commoditylnformation.domain.CommoditylnformationUnit;

/**
 * 商品单位服务接口
 * 定义商品单位相关的业务操作
 *
 * @author ruoyi
 * @date 2025-04-26
 */
public interface ICommoditylnformationUnitService {
    /**
     * 根据ID查询商品单位
     * @param id 单位ID
     * @return 商品单位对象
     */
    CommoditylnformationUnit selectCommoditylnformationUnitById(Long id);

    /**
     * 查询商品单位列表
     * @param commoditylnformationUnit 查询条件
     * @return 商品单位列表
     */
    List<CommoditylnformationUnit> selectCommoditylnformationUnitList(CommoditylnformationUnit commoditylnformationUnit);

    /**
     * 新增商品单位
     * @param commoditylnformationUnit 商品单位对象
     * @return 插入结果
     */
    int insertCommoditylnformationUnit(CommoditylnformationUnit commoditylnformationUnit);

    /**
     * 修改商品单位
     * @param commoditylnformationUnit 商品单位对象
     * @return 更新结果
     */
    int updateCommoditylnformationUnit(CommoditylnformationUnit commoditylnformationUnit);

    /**
     * 批量删除商品单位
     * @param ids 单位ID字符串（逗号分隔）
     * @return 删除结果
     */
    int deleteCommoditylnformationUnitByIds(String ids);

    /**
     * 删除商品单位
     * @param id 单位ID
     * @return 删除结果
     */
    int deleteCommoditylnformationUnitById(Long id);

    /**
     * 更新商品单位状态
     * @param id 单位ID
     * @param status 新状态：0-禁用，1-启用
     * @return 更新结果
     */
    int updateStatus(Long id, Long status);
}