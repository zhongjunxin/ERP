package com.ruoyi.ProcurementManagement.service;

import java.util.List;
import com.ruoyi.ProcurementManagement.domain.Purchasereturns;

/**
 * 采购退货Service接口
 * 
 * @author zjx
 * @date 2025-06-06
 */
public interface IPurchasereturnsService 
{
    /**
     * 查询采购退货
     * 
     * @param returnId 采购退货主键
     * @return 采购退货
     */
    public Purchasereturns selectPurchasereturnsByReturnId(Long returnId);

    /**
     * 查询采购退货列表
     * 
     * @param purchasereturns 采购退货
     * @return 采购退货集合
     */
    public List<Purchasereturns> selectPurchasereturnsList(Purchasereturns purchasereturns);

    /**
     * 新增采购退货
     * 
     * @param purchasereturns 采购退货
     * @return 结果
     */
    public int insertPurchasereturns(Purchasereturns purchasereturns);

    /**
     * 修改采购退货
     * 
     * @param purchasereturns 采购退货
     * @return 结果
     */
    public int updatePurchasereturns(Purchasereturns purchasereturns);

    /**
     * 批量删除采购退货
     * 
     * @param returnIds 需要删除的采购退货主键集合
     * @return 结果
     */
    public int deletePurchasereturnsByReturnIds(String returnIds);

    /**
     * 删除采购退货信息
     * 
     * @param returnId 采购退货主键
     * @return 结果
     */
    public int deletePurchasereturnsByReturnId(Long returnId);
}
