package com.ruoyi.SalesManagement.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.SalesManagement.mapper.SalesreturnMapper;
import com.ruoyi.SalesManagement.domain.Salesreturn;
import com.ruoyi.SalesManagement.service.ISalesreturnService;
import com.ruoyi.common.core.text.Convert;

/**
 * 销售退货Service业务层处理
 * 
 * @author zjx
 * @date 2025-06-06
 */
@Service
public class SalesreturnServiceImpl implements ISalesreturnService 
{
    @Autowired
    private SalesreturnMapper salesreturnMapper;

    /**
     * 查询销售退货
     * 
     * @param returnId 销售退货主键
     * @return 销售退货
     */
    @Override
    public Salesreturn selectSalesreturnByReturnId(Long returnId)
    {
        return salesreturnMapper.selectSalesreturnByReturnId(returnId);
    }

    /**
     * 查询销售退货列表
     * 
     * @param salesreturn 销售退货
     * @return 销售退货
     */
    @Override
    public List<Salesreturn> selectSalesreturnList(Salesreturn salesreturn)
    {
        return salesreturnMapper.selectSalesreturnList(salesreturn);
    }

    /**
     * 新增销售退货
     * 
     * @param salesreturn 销售退货
     * @return 结果
     */
    @Override
    public int insertSalesreturn(Salesreturn salesreturn)
    {
        return salesreturnMapper.insertSalesreturn(salesreturn);
    }

    /**
     * 修改销售退货
     * 
     * @param salesreturn 销售退货
     * @return 结果
     */
    @Override
    public int updateSalesreturn(Salesreturn salesreturn)
    {
        return salesreturnMapper.updateSalesreturn(salesreturn);
    }

    /**
     * 批量删除销售退货
     * 
     * @param returnIds 需要删除的销售退货主键
     * @return 结果
     */
    @Override
    public int deleteSalesreturnByReturnIds(String returnIds)
    {
        return salesreturnMapper.deleteSalesreturnByReturnIds(Convert.toStrArray(returnIds));
    }

    /**
     * 删除销售退货信息
     * 
     * @param returnId 销售退货主键
     * @return 结果
     */
    @Override
    public int deleteSalesreturnByReturnId(Long returnId)
    {
        return salesreturnMapper.deleteSalesreturnByReturnId(returnId);
    }
}
