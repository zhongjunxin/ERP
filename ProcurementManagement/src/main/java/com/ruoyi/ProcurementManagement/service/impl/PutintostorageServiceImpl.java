package com.ruoyi.ProcurementManagement.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.ProcurementManagement.mapper.PutintostorageMapper;
import com.ruoyi.ProcurementManagement.domain.Putintostorage;
import com.ruoyi.ProcurementManagement.service.IPutintostorageService;
import com.ruoyi.common.core.text.Convert;

/**
 * 采购入库Service业务层处理
 * 
 * @author zjx
 * @date 2025-06-06
 */
@Service
public class PutintostorageServiceImpl implements IPutintostorageService 
{
    @Autowired
    private PutintostorageMapper putintostorageMapper;

    /**
     * 查询采购入库
     * 
     * @param incomingId 采购入库主键
     * @return 采购入库
     */
    @Override
    public Putintostorage selectPutintostorageByIncomingId(Long incomingId)
    {
        return putintostorageMapper.selectPutintostorageByIncomingId(incomingId);
    }

    /**
     * 查询采购入库列表
     * 
     * @param putintostorage 采购入库
     * @return 采购入库
     */
    @Override
    public List<Putintostorage> selectPutintostorageList(Putintostorage putintostorage)
    {
        return putintostorageMapper.selectPutintostorageList(putintostorage);
    }

    /**
     * 新增采购入库
     * 
     * @param putintostorage 采购入库
     * @return 结果
     */
    @Override
    public int insertPutintostorage(Putintostorage putintostorage)
    {
        return putintostorageMapper.insertPutintostorage(putintostorage);
    }

    /**
     * 修改采购入库
     * 
     * @param putintostorage 采购入库
     * @return 结果
     */
    @Override
    public int updatePutintostorage(Putintostorage putintostorage)
    {
        return putintostorageMapper.updatePutintostorage(putintostorage);
    }

    /**
     * 批量删除采购入库
     * 
     * @param incomingIds 需要删除的采购入库主键
     * @return 结果
     */
    @Override
    public int deletePutintostorageByIncomingIds(String incomingIds)
    {
        return putintostorageMapper.deletePutintostorageByIncomingIds(Convert.toStrArray(incomingIds));
    }

    /**
     * 删除采购入库信息
     * 
     * @param incomingId 采购入库主键
     * @return 结果
     */
    @Override
    public int deletePutintostorageByIncomingId(Long incomingId)
    {
        return putintostorageMapper.deletePutintostorageByIncomingId(incomingId);
    }
}
