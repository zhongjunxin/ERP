package com.ruoyi.SalesManagement.service;

import java.util.List;
import com.ruoyi.SalesManagement.domain.Outofstock;

/**
 * 销售出库Service接口
 * 
 * @author zjx
 * @date 2025-06-06
 */
public interface IOutofstockService 
{
    /**
     * 查询销售出库
     * 
     * @param outboundId 销售出库主键
     * @return 销售出库
     */
    public Outofstock selectOutofstockByOutboundId(Long outboundId);

    /**
     * 查询销售出库列表
     * 
     * @param outofstock 销售出库
     * @return 销售出库集合
     */
    public List<Outofstock> selectOutofstockList(Outofstock outofstock);

    /**
     * 新增销售出库
     * 
     * @param outofstock 销售出库
     * @return 结果
     */
    public int insertOutofstock(Outofstock outofstock);

    /**
     * 修改销售出库
     * 
     * @param outofstock 销售出库
     * @return 结果
     */
    public int updateOutofstock(Outofstock outofstock);

    /**
     * 批量删除销售出库
     * 
     * @param outboundIds 需要删除的销售出库主键集合
     * @return 结果
     */
    public int deleteOutofstockByOutboundIds(String outboundIds);

    /**
     * 删除销售出库信息
     * 
     * @param outboundId 销售出库主键
     * @return 结果
     */
    public int deleteOutofstockByOutboundId(Long outboundId);
}
