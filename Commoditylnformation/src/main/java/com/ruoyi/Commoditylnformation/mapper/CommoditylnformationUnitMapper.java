package com.ruoyi.Commoditylnformation.mapper;

import java.util.List;
import com.ruoyi.Commoditylnformation.domain.CommoditylnformationUnit;
import org.apache.ibatis.annotations.Param;

/**
 * 商品单位数据访问层接口
 * 提供对商品单位表的数据库操作
 *
 * @author ruoyi
 * @date 2025-04-26
 */
public interface CommoditylnformationUnitMapper {
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
     * 删除商品单位
     * @param id 单位ID
     * @return 删除结果
     */
    int deleteCommoditylnformationUnitById(Long id);

    /**
     * 批量删除商品单位
     * @param ids 单位ID数组
     * @return 删除结果
     */
    int deleteCommoditylnformationUnitByIds(String[] ids);

    /**
     * 检查单位名称是否唯一
     * @param unitName 单位名称
     * @return 商品单位对象（如果存在）
     */
    CommoditylnformationUnit checkUnitNameUnique(String unitName);

    /**
     * 更新商品单位状态
     * @param id 单位ID
     * @param status 新状态：0-禁用，1-启用
     * @return 更新结果
     */
    int updateStatus(@Param("id") Long id, @Param("status") Long status);
}