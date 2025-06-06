package com.ruoyi.InventoryManagement.controller;

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
import com.ruoyi.InventoryManagement.domain.Warehouseentryaudit;
import com.ruoyi.InventoryManagement.service.IWarehouseentryauditService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 入库审核Controller
 * 
 * @author zjx
 * @date 2025-06-06
 */
@Controller
@RequestMapping("/InventoryManagement/warehouseentryaudit")
public class WarehouseentryauditController extends BaseController
{
    private String prefix = "InventoryManagement/warehouseentryaudit";

    @Autowired
    private IWarehouseentryauditService warehouseentryauditService;

    @RequiresPermissions("InventoryManagement:warehouseentryaudit:view")
    @GetMapping()
    public String warehouseentryaudit()
    {
        return prefix + "/warehouseentryaudit";
    }

    /**
     * 查询入库审核列表
     */
    @RequiresPermissions("InventoryManagement:warehouseentryaudit:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(Warehouseentryaudit warehouseentryaudit)
    {
        startPage();
        List<Warehouseentryaudit> list = warehouseentryauditService.selectWarehouseentryauditList(warehouseentryaudit);
        return getDataTable(list);
    }

    /**
     * 导出入库审核列表
     */
    @RequiresPermissions("InventoryManagement:warehouseentryaudit:export")
    @Log(title = "入库审核", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(Warehouseentryaudit warehouseentryaudit)
    {
        List<Warehouseentryaudit> list = warehouseentryauditService.selectWarehouseentryauditList(warehouseentryaudit);
        ExcelUtil<Warehouseentryaudit> util = new ExcelUtil<Warehouseentryaudit>(Warehouseentryaudit.class);
        return util.exportExcel(list, "入库审核数据");
    }

    /**
     * 新增入库审核
     */
    @RequiresPermissions("InventoryManagement:warehouseentryaudit:add")
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存入库审核
     */
    @RequiresPermissions("InventoryManagement:warehouseentryaudit:add")
    @Log(title = "入库审核", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(Warehouseentryaudit warehouseentryaudit)
    {
        return toAjax(warehouseentryauditService.insertWarehouseentryaudit(warehouseentryaudit));
    }

    /**
     * 修改入库审核
     */
    @RequiresPermissions("InventoryManagement:warehouseentryaudit:edit")
    @GetMapping("/edit/{auditId}")
    public String edit(@PathVariable("auditId") Long auditId, ModelMap mmap)
    {
        Warehouseentryaudit warehouseentryaudit = warehouseentryauditService.selectWarehouseentryauditByAuditId(auditId);
        mmap.put("warehouseentryaudit", warehouseentryaudit);
        return prefix + "/edit";
    }

    /**
     * 修改保存入库审核
     */
    @RequiresPermissions("InventoryManagement:warehouseentryaudit:edit")
    @Log(title = "入库审核", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(Warehouseentryaudit warehouseentryaudit)
    {
        return toAjax(warehouseentryauditService.updateWarehouseentryaudit(warehouseentryaudit));
    }

    /**
     * 删除入库审核
     */
    @RequiresPermissions("InventoryManagement:warehouseentryaudit:remove")
    @Log(title = "入库审核", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(warehouseentryauditService.deleteWarehouseentryauditByAuditIds(ids));
    }
}
