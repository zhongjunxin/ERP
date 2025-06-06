package com.ruoyi.SalesManagement.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.SalesManagement.mapper.OutofstockMapper;
import com.ruoyi.SalesManagement.domain.Outofstock;
import com.ruoyi.SalesManagement.service.IOutofstockService;
import com.ruoyi.common.core.text.Convert;

/**
 * 销售出库Service业务层处理
 * 
 * @author zjx
 * @date 2025-06-06
 */
@Service
public class OutofstockServiceImpl implements IOutofstockService 
{
    @Autowired
    private OutofstockMapper outofstockMapper;

    /**
     * 查询销售出库
     * 
     * @param outboundId 销售出库主键
     * @return 销售出库
     */
    @Override
    public Outofstock selectOutofstockByOutboundId(Long outboundId)
    {
        return outofstockMapper.selectOutofstockByOutboundId(outboundId);
    }

    /**
     * 查询销售出库列表
     * 
     * @param outofstock 销售出库
     * @return 销售出库
     */
    @Override
    public List<Outofstock> selectOutofstockList(Outofstock outofstock)
    {
        return outofstockMapper.selectOutofstockList(outofstock);
    }

    /**
     * 新增销售出库
     * 
     * @param outofstock 销售出库
     * @return 结果
     */
    @Override
    public int insertOutofstock(Outofstock outofstock)
    {
        return outofstockMapper.insertOutofstock(outofstock);
    }

    /**
     * 修改销售出库
     * 
     * @param outofstock 销售出库
     * @return 结果
     */
    @Override
    public int updateOutofstock(Outofstock outofstock)
    {
        return outofstockMapper.updateOutofstock(outofstock);
    }

    /**
     * 批量删除销售出库
     * 
     * @param outboundIds 需要删除的销售出库主键
     * @return 结果
     */
    @Override
    public int deleteOutofstockByOutboundIds(String outboundIds)
    {
        return outofstockMapper.deleteOutofstockByOutboundIds(Convert.toStrArray(outboundIds));
    }

    /**
     * 删除销售出库信息
     * 
     * @param outboundId 销售出库主键
     * @return 结果
     */
    @Override
    public int deleteOutofstockByOutboundId(Long outboundId)
    {
        return outofstockMapper.deleteOutofstockByOutboundId(outboundId);
    }
}
