package com.ruoyi.SupplierInformation.service;

import java.util.List;
import com.ruoyi.SupplierInformation.domain.SupplierinformationSupplierprofile;

/**
 * 供应商档案管理Service接口
 * 
 * @author ruoyi
 * @date 2025-04-28
 */
public interface ISupplierinformationSupplierprofileService 
{
    /**
     * 查询供应商档案管理
     * 
     * @param supplierId 供应商档案管理主键
     * @return 供应商档案管理
     */
    public SupplierinformationSupplierprofile selectSupplierinformationSupplierprofileBySupplierId(String supplierId);

    /**
     * 查询供应商档案管理列表
     * 
     * @param supplierinformationSupplierprofile 供应商档案管理
     * @return 供应商档案管理集合
     */
    public List<SupplierinformationSupplierprofile> selectSupplierinformationSupplierprofileList(SupplierinformationSupplierprofile supplierinformationSupplierprofile);

    /**
     * 新增供应商档案管理
     * 
     * @param supplierinformationSupplierprofile 供应商档案管理
     * @return 结果
     */
    public int insertSupplierinformationSupplierprofile(SupplierinformationSupplierprofile supplierinformationSupplierprofile);

    /**
     * 修改供应商档案管理
     * 
     * @param supplierinformationSupplierprofile 供应商档案管理
     * @return 结果
     */
    public int updateSupplierinformationSupplierprofile(SupplierinformationSupplierprofile supplierinformationSupplierprofile);

    /**
     * 批量删除供应商档案管理
     * 
     * @param supplierIds 需要删除的供应商档案管理主键集合
     * @return 结果
     */
    public int deleteSupplierinformationSupplierprofileBySupplierIds(String supplierIds);

    /**
     * 删除供应商档案管理信息
     * 
     * @param supplierId 供应商档案管理主键
     * @return 结果
     */
    public int deleteSupplierinformationSupplierprofileBySupplierId(String supplierId);
}
