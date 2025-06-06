package com.ruoyi.SalesManagement.controller;

import java.util.List;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.SalesManagement.domain.Outofstock;
import com.ruoyi.SalesManagement.service.IOutofstockService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 销售出库Controller
 * 
 * @author zjx
 * @date 2025-06-06
 */
@Controller
@RequestMapping("/SalesManagement/outofstock")
public class OutofstockController extends BaseController
{
    private String prefix = "SalesManagement/outofstock";

    @Autowired
    private IOutofstockService outofstockService;

    @RequiresPermissions("SalesManagement:outofstock:view")
    @GetMapping()
    public String outofstock()
    {
        return prefix + "/outofstock";
    }

    /**
     * 查询销售出库列表
     */
    @RequiresPermissions("SalesManagement:outofstock:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(Outofstock outofstock)
    {
        startPage();
        List<Outofstock> list = outofstockService.selectOutofstockList(outofstock);
        return getDataTable(list);
    }

    /**
     * 导出销售出库列表
     */
    @RequiresPermissions("SalesManagement:outofstock:export")
    @Log(title = "销售出库", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(Outofstock outofstock)
    {
        List<Outofstock> list = outofstockService.selectOutofstockList(outofstock);
        ExcelUtil<Outofstock> util = new ExcelUtil<Outofstock>(Outofstock.class);
        return util.exportExcel(list, "销售出库数据");
    }

    /**
     * 新增销售出库
     */
    @RequiresPermissions("SalesManagement:outofstock:add")
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存销售出库
     */
    @RequiresPermissions("SalesManagement:outofstock:add")
    @Log(title = "销售出库", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(Outofstock outofstock)
    {
        return toAjax(outofstockService.insertOutofstock(outofstock));
    }

    /**
     * 修改销售出库
     */
    @RequiresPermissions("SalesManagement:outofstock:edit")
    @GetMapping("/edit/{outboundId}")
    public String edit(@PathVariable("outboundId") Long outboundId, ModelMap mmap)
    {
        Outofstock outofstock = outofstockService.selectOutofstockByOutboundId(outboundId);
        mmap.put("outofstock", outofstock);
        return prefix + "/edit";
    }

    /**
     * 修改保存销售出库
     */
    @RequiresPermissions("SalesManagement:outofstock:edit")
    @Log(title = "销售出库", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(Outofstock outofstock)
    {
        return toAjax(outofstockService.updateOutofstock(outofstock));
    }

    /**
     * 删除销售出库
     */
    @RequiresPermissions("SalesManagement:outofstock:remove")
    @Log(title = "销售出库", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(outofstockService.deleteOutofstockByOutboundIds(ids));
    }
}
