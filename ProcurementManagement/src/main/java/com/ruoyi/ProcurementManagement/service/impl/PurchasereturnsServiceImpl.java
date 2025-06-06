package com.ruoyi.ProcurementManagement.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.ProcurementManagement.mapper.PurchasereturnsMapper;
import com.ruoyi.ProcurementManagement.domain.Purchasereturns;
import com.ruoyi.ProcurementManagement.service.IPurchasereturnsService;
import com.ruoyi.common.core.text.Convert;

/**
 * 采购退货Service业务层处理
 * 
 * @author zjx
 * @date 2025-06-06
 */
@Service
public class PurchasereturnsServiceImpl implements IPurchasereturnsService 
{
    @Autowired
    private PurchasereturnsMapper purchasereturnsMapper;

    /**
     * 查询采购退货
     * 
     * @param returnId 采购退货主键
     * @return 采购退货
     */
    @Override
    public Purchasereturns selectPurchasereturnsByReturnId(Long returnId)
    {
        return purchasereturnsMapper.selectPurchasereturnsByReturnId(returnId);
    }

    /**
     * 查询采购退货列表
     * 
     * @param purchasereturns 采购退货
     * @return 采购退货
     */
    @Override
    public List<Purchasereturns> selectPurchasereturnsList(Purchasereturns purchasereturns)
    {
        return purchasereturnsMapper.selectPurchasereturnsList(purchasereturns);
    }

    /**
     * 新增采购退货
     * 
     * @param purchasereturns 采购退货
     * @return 结果
     */
    @Override
    public int insertPurchasereturns(Purchasereturns purchasereturns)
    {
        return purchasereturnsMapper.insertPurchasereturns(purchasereturns);
    }

    /**
     * 修改采购退货
     * 
     * @param purchasereturns 采购退货
     * @return 结果
     */
    @Override
    public int updatePurchasereturns(Purchasereturns purchasereturns)
    {
        return purchasereturnsMapper.updatePurchasereturns(purchasereturns);
    }

    /**
     * 批量删除采购退货
     * 
     * @param returnIds 需要删除的采购退货主键
     * @return 结果
     */
    @Override
    public int deletePurchasereturnsByReturnIds(String returnIds)
    {
        return purchasereturnsMapper.deletePurchasereturnsByReturnIds(Convert.toStrArray(returnIds));
    }

    /**
     * 删除采购退货信息
     * 
     * @param returnId 采购退货主键
     * @return 结果
     */
    @Override
    public int deletePurchasereturnsByReturnId(Long returnId)
    {
        return purchasereturnsMapper.deletePurchasereturnsByReturnId(returnId);
    }
}
