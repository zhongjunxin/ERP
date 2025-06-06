package com.ruoyi.ProcurementManagement.mapper;

import java.util.List;
import com.ruoyi.ProcurementManagement.domain.Putintostorage;

/**
 * 采购入库Mapper接口
 * 
 * @author zjx
 * @date 2025-06-06
 */
public interface PutintostorageMapper 
{
    /**
     * 查询采购入库
     * 
     * @param incomingId 采购入库主键
     * @return 采购入库
     */
    public Putintostorage selectPutintostorageByIncomingId(Long incomingId);

    /**
     * 查询采购入库列表
     * 
     * @param putintostorage 采购入库
     * @return 采购入库集合
     */
    public List<Putintostorage> selectPutintostorageList(Putintostorage putintostorage);

    /**
     * 新增采购入库
     * 
     * @param putintostorage 采购入库
     * @return 结果
     */
    public int insertPutintostorage(Putintostorage putintostorage);

    /**
     * 修改采购入库
     * 
     * @param putintostorage 采购入库
     * @return 结果
     */
    public int updatePutintostorage(Putintostorage putintostorage);

    /**
     * 删除采购入库
     * 
     * @param incomingId 采购入库主键
     * @return 结果
     */
    public int deletePutintostorageByIncomingId(Long incomingId);

    /**
     * 批量删除采购入库
     * 
     * @param incomingIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deletePutintostorageByIncomingIds(String[] incomingIds);
}
