package com.ruoyi.SupplierInformation.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.SupplierInformation.mapper.SupplierinformationSupplierprofileMapper;
import com.ruoyi.SupplierInformation.domain.SupplierinformationSupplierprofile;
import com.ruoyi.SupplierInformation.service.ISupplierinformationSupplierprofileService;
import com.ruoyi.common.core.text.Convert;

/**
 * 供应商档案管理Service业务层处理
 * 
 * @author ruoyi
 * @date 2025-04-28
 */
@Service
public class SupplierinformationSupplierprofileServiceImpl implements ISupplierinformationSupplierprofileService 
{
    @Autowired
    private SupplierinformationSupplierprofileMapper supplierinformationSupplierprofileMapper;

    /**
     * 查询供应商档案管理
     * 
     * @param supplierId 供应商档案管理主键
     * @return 供应商档案管理
     */
    @Override
    public SupplierinformationSupplierprofile selectSupplierinformationSupplierprofileBySupplierId(String supplierId)
    {
        return supplierinformationSupplierprofileMapper.selectSupplierinformationSupplierprofileBySupplierId(supplierId);
    }

    /**
     * 查询供应商档案管理列表
     * 
     * @param supplierinformationSupplierprofile 供应商档案管理
     * @return 供应商档案管理
     */
    @Override
    public List<SupplierinformationSupplierprofile> selectSupplierinformationSupplierprofileList(SupplierinformationSupplierprofile supplierinformationSupplierprofile)
    {
        return supplierinformationSupplierprofileMapper.selectSupplierinformationSupplierprofileList(supplierinformationSupplierprofile);
    }

    /**
     * 新增供应商档案管理
     * 
     * @param supplierinformationSupplierprofile 供应商档案管理
     * @return 结果
     */
    @Override
    public int insertSupplierinformationSupplierprofile(SupplierinformationSupplierprofile supplierinformationSupplierprofile)
    {
        return supplierinformationSupplierprofileMapper.insertSupplierinformationSupplierprofile(supplierinformationSupplierprofile);
    }

    /**
     * 修改供应商档案管理
     * 
     * @param supplierinformationSupplierprofile 供应商档案管理
     * @return 结果
     */
    @Override
    public int updateSupplierinformationSupplierprofile(SupplierinformationSupplierprofile supplierinformationSupplierprofile)
    {
        return supplierinformationSupplierprofileMapper.updateSupplierinformationSupplierprofile(supplierinformationSupplierprofile);
    }

    /**
     * 批量删除供应商档案管理
     * 
     * @param supplierIds 需要删除的供应商档案管理主键
     * @return 结果
     */
    @Override
    public int deleteSupplierinformationSupplierprofileBySupplierIds(String supplierIds)
    {
        return supplierinformationSupplierprofileMapper.deleteSupplierinformationSupplierprofileBySupplierIds(Convert.toStrArray(supplierIds));
    }

    /**
     * 删除供应商档案管理信息
     * 
     * @param supplierId 供应商档案管理主键
     * @return 结果
     */
    @Override
    public int deleteSupplierinformationSupplierprofileBySupplierId(String supplierId)
    {
        return supplierinformationSupplierprofileMapper.deleteSupplierinformationSupplierprofileBySupplierId(supplierId);
    }
}
