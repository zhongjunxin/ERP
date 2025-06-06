package com.ruoyi.SalesManagement.service;

import java.util.List;
import com.ruoyi.SalesManagement.domain.Salesreturn;

/**
 * 销售退货Service接口
 * 
 * @author zjx
 * @date 2025-06-06
 */
public interface ISalesreturnService 
{
    /**
     * 查询销售退货
     * 
     * @param returnId 销售退货主键
     * @return 销售退货
     */
    public Salesreturn selectSalesreturnByReturnId(Long returnId);

    /**
     * 查询销售退货列表
     * 
     * @param salesreturn 销售退货
     * @return 销售退货集合
     */
    public List<Salesreturn> selectSalesreturnList(Salesreturn salesreturn);

    /**
     * 新增销售退货
     * 
     * @param salesreturn 销售退货
     * @return 结果
     */
    public int insertSalesreturn(Salesreturn salesreturn);

    /**
     * 修改销售退货
     * 
     * @param salesreturn 销售退货
     * @return 结果
     */
    public int updateSalesreturn(Salesreturn salesreturn);

    /**
     * 批量删除销售退货
     * 
     * @param returnIds 需要删除的销售退货主键集合
     * @return 结果
     */
    public int deleteSalesreturnByReturnIds(String returnIds);

    /**
     * 删除销售退货信息
     * 
     * @param returnId 销售退货主键
     * @return 结果
     */
    public int deleteSalesreturnByReturnId(Long returnId);
}
