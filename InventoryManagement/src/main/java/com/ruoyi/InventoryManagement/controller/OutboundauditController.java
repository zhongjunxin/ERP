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
import com.ruoyi.InventoryManagement.domain.Outboundaudit;
import com.ruoyi.InventoryManagement.service.IOutboundauditService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 出库审核Controller
 * 
 * @author zjx
 * @date 2025-06-06
 */
@Controller
@RequestMapping("/InventoryManagement/outboundaudit")
public class OutboundauditController extends BaseController
{
    private String prefix = "InventoryManagement/outboundaudit";

    @Autowired
    private IOutboundauditService outboundauditService;

    @RequiresPermissions("InventoryManagement:outboundaudit:view")
    @GetMapping()
    public String outboundaudit()
    {
        return prefix + "/outboundaudit";
    }

    /**
     * 查询出库审核列表
     */
    @RequiresPermissions("InventoryManagement:outboundaudit:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(Outboundaudit outboundaudit)
    {
        startPage();
        List<Outboundaudit> list = outboundauditService.selectOutboundauditList(outboundaudit);
        return getDataTable(list);
    }

    /**
     * 导出出库审核列表
     */
    @RequiresPermissions("InventoryManagement:outboundaudit:export")
    @Log(title = "出库审核", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(Outboundaudit outboundaudit)
    {
        List<Outboundaudit> list = outboundauditService.selectOutboundauditList(outboundaudit);
        ExcelUtil<Outboundaudit> util = new ExcelUtil<Outboundaudit>(Outboundaudit.class);
        return util.exportExcel(list, "出库审核数据");
    }

    /**
     * 新增出库审核
     */
    @RequiresPermissions("InventoryManagement:outboundaudit:add")
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存出库审核
     */
    @RequiresPermissions("InventoryManagement:outboundaudit:add")
    @Log(title = "出库审核", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(Outboundaudit outboundaudit)
    {
        return toAjax(outboundauditService.insertOutboundaudit(outboundaudit));
    }

    /**
     * 修改出库审核
     */
    @RequiresPermissions("InventoryManagement:outboundaudit:edit")
    @GetMapping("/edit/{auditId}")
    public String edit(@PathVariable("auditId") Long auditId, ModelMap mmap)
    {
        Outboundaudit outboundaudit = outboundauditService.selectOutboundauditByAuditId(auditId);
        mmap.put("outboundaudit", outboundaudit);
        return prefix + "/edit";
    }

    /**
     * 修改保存出库审核
     */
    @RequiresPermissions("InventoryManagement:outboundaudit:edit")
    @Log(title = "出库审核", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(Outboundaudit outboundaudit)
    {
        return toAjax(outboundauditService.updateOutboundaudit(outboundaudit));
    }

    /**
     * 删除出库审核
     */
    @RequiresPermissions("InventoryManagement:outboundaudit:remove")
    @Log(title = "出库审核", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(outboundauditService.deleteOutboundauditByAuditIds(ids));
    }
}
