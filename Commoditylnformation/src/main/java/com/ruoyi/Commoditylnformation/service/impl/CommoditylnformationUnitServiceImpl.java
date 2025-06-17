package com.ruoyi.Commoditylnformation.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.Commoditylnformation.mapper.CommoditylnformationUnitMapper;
import com.ruoyi.Commoditylnformation.domain.CommoditylnformationUnit;
import com.ruoyi.Commoditylnformation.service.ICommoditylnformationUnitService;
import com.ruoyi.common.core.text.Convert;
import com.ruoyi.common.exception.ServiceException;

/**
 * 商品单位服务实现类
 * 提供商品单位相关的业务逻辑实现
 *
 * @author ruoyi
 * @date 2025-04-26
 */
@Service
public class CommoditylnformationUnitServiceImpl implements ICommoditylnformationUnitService {
    @Autowired
    private CommoditylnformationUnitMapper commoditylnformationUnitMapper;

    /**
     * 根据ID查询商品单位
     * @param id 单位ID
     * @return 商品单位对象
     */
    @Override
    public CommoditylnformationUnit selectCommoditylnformationUnitById(Long id) {
        return commoditylnformationUnitMapper.selectCommoditylnformationUnitById(id);
    }

    /**
     * 查询商品单位列表
     * @param commoditylnformationUnit 查询条件
     * @return 商品单位列表
     */
    @Override
    public List<CommoditylnformationUnit> selectCommoditylnformationUnitList(CommoditylnformationUnit commoditylnformationUnit) {
        return commoditylnformationUnitMapper.selectCommoditylnformationUnitList(commoditylnformationUnit);
    }

    /**
     * 新增商品单位
     * @param commoditylnformationUnit 商品单位对象
     * @return 插入结果
     * @throws ServiceException 如果单位名称重复
     */
    @Override
    public int insertCommoditylnformationUnit(CommoditylnformationUnit commoditylnformationUnit) {
        // 校验单位名称唯一性
        CommoditylnformationUnit existingUnit = commoditylnformationUnitMapper.checkUnitNameUnique(commoditylnformationUnit.getUnitName());
        if (existingUnit != null) {
            throw new ServiceException("商品单位名称重复，请重新输入");
        }
        return commoditylnformationUnitMapper.insertCommoditylnformationUnit(commoditylnformationUnit);
    }

    /**
     * 修改商品单位
     * @param commoditylnformationUnit 商品单位对象
     * @return 更新结果
     * @throws ServiceException 如果单位名称重复
     */
    @Override
    public int updateCommoditylnformationUnit(CommoditylnformationUnit commoditylnformationUnit) {
        // 校验单位名称唯一性（排除自身）
        CommoditylnformationUnit existingUnit = commoditylnformationUnitMapper.checkUnitNameUnique(commoditylnformationUnit.getUnitName());
        if (existingUnit != null && !existingUnit.getId().equals(commoditylnformationUnit.getId())) {
            throw new ServiceException("商品单位名称重复，请重新输入");
        }
        return commoditylnformationUnitMapper.updateCommoditylnformationUnit(commoditylnformationUnit);
    }

    /**
     * 批量删除商品单位
     * @param ids 单位ID字符串（逗号分隔）
     * @return 删除结果
     */
    @Override
    public int deleteCommoditylnformationUnitByIds(String ids) {
        return commoditylnformationUnitMapper.deleteCommoditylnformationUnitByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除商品单位
     * @param id 单位ID
     * @return 删除结果
     */
    @Override
    public int deleteCommoditylnformationUnitById(Long id) {
        return commoditylnformationUnitMapper.deleteCommoditylnformationUnitById(id);
    }

    /**
     * 更新商品单位状态
     * @param id 单位ID
     * @param status 新状态：0-禁用，1-启用
     * @return 更新结果
     */
    @Override
    public int updateStatus(Long id, Long status) {
        return commoditylnformationUnitMapper.updateStatus(id, status);
    }
}