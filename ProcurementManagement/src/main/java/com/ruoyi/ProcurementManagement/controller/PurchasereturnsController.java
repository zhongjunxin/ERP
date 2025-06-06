package com.ruoyi.ProcurementManagement.controller;

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
import com.ruoyi.ProcurementManagement.domain.Purchasereturns;
import com.ruoyi.ProcurementManagement.service.IPurchasereturnsService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 采购退货Controller
 * 
 * @author zjx
 * @date 2025-06-06
 */
@Controller
@RequestMapping("/ProcurementManagement/purchasereturns")
public class PurchasereturnsController extends BaseController
{
    private String prefix = "ProcurementManagement/purchasereturns";

    @Autowired
    private IPurchasereturnsService purchasereturnsService;

    @RequiresPermissions("ProcurementManagement:purchasereturns:view")
    @GetMapping()
    public String purchasereturns()
    {
        return prefix + "/purchasereturns";
    }

    /**
     * 查询采购退货列表
     */
    @RequiresPermissions("ProcurementManagement:purchasereturns:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(Purchasereturns purchasereturns)
    {
        startPage();
        List<Purchasereturns> list = purchasereturnsService.selectPurchasereturnsList(purchasereturns);
        return getDataTable(list);
    }

    /**
     * 导出采购退货列表
     */
    @RequiresPermissions("ProcurementManagement:purchasereturns:export")
    @Log(title = "采购退货", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(Purchasereturns purchasereturns)
    {
        List<Purchasereturns> list = purchasereturnsService.selectPurchasereturnsList(purchasereturns);
        ExcelUtil<Purchasereturns> util = new ExcelUtil<Purchasereturns>(Purchasereturns.class);
        return util.exportExcel(list, "采购退货数据");
    }

    /**
     * 新增采购退货
     */
    @RequiresPermissions("ProcurementManagement:purchasereturns:add")
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存采购退货
     */
    @RequiresPermissions("ProcurementManagement:purchasereturns:add")
    @Log(title = "采购退货", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(Purchasereturns purchasereturns)
    {
        return toAjax(purchasereturnsService.insertPurchasereturns(purchasereturns));
    }

    /**
     * 修改采购退货
     */
    @RequiresPermissions("ProcurementManagement:purchasereturns:edit")
    @GetMapping("/edit/{returnId}")
    public String edit(@PathVariable("returnId") Long returnId, ModelMap mmap)
    {
        Purchasereturns purchasereturns = purchasereturnsService.selectPurchasereturnsByReturnId(returnId);
        mmap.put("purchasereturns", purchasereturns);
        return prefix + "/edit";
    }

    /**
     * 修改保存采购退货
     */
    @RequiresPermissions("ProcurementManagement:purchasereturns:edit")
    @Log(title = "采购退货", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(Purchasereturns purchasereturns)
    {
        return toAjax(purchasereturnsService.updatePurchasereturns(purchasereturns));
    }

    /**
     * 删除采购退货
     */
    @RequiresPermissions("ProcurementManagement:purchasereturns:remove")
    @Log(title = "采购退货", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(purchasereturnsService.deletePurchasereturnsByReturnIds(ids));
    }
}
