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
import com.ruoyi.SalesManagement.domain.Salesreturn;
import com.ruoyi.SalesManagement.service.ISalesreturnService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 销售退货Controller
 * 
 * @author zjx
 * @date 2025-06-06
 */
@Controller
@RequestMapping("/SalesManagement/salesreturn")
public class SalesreturnController extends BaseController
{
    private String prefix = "SalesManagement/salesreturn";

    @Autowired
    private ISalesreturnService salesreturnService;

    @RequiresPermissions("SalesManagement:salesreturn:view")
    @GetMapping()
    public String salesreturn()
    {
        return prefix + "/salesreturn";
    }

    /**
     * 查询销售退货列表
     */
    @RequiresPermissions("SalesManagement:salesreturn:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(Salesreturn salesreturn)
    {
        startPage();
        List<Salesreturn> list = salesreturnService.selectSalesreturnList(salesreturn);
        return getDataTable(list);
    }

    /**
     * 导出销售退货列表
     */
    @RequiresPermissions("SalesManagement:salesreturn:export")
    @Log(title = "销售退货", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(Salesreturn salesreturn)
    {
        List<Salesreturn> list = salesreturnService.selectSalesreturnList(salesreturn);
        ExcelUtil<Salesreturn> util = new ExcelUtil<Salesreturn>(Salesreturn.class);
        return util.exportExcel(list, "销售退货数据");
    }

    /**
     * 新增销售退货
     */
    @RequiresPermissions("SalesManagement:salesreturn:add")
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存销售退货
     */
    @RequiresPermissions("SalesManagement:salesreturn:add")
    @Log(title = "销售退货", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(Salesreturn salesreturn)
    {
        return toAjax(salesreturnService.insertSalesreturn(salesreturn));
    }

    /**
     * 修改销售退货
     */
    @RequiresPermissions("SalesManagement:salesreturn:edit")
    @GetMapping("/edit/{returnId}")
    public String edit(@PathVariable("returnId") Long returnId, ModelMap mmap)
    {
        Salesreturn salesreturn = salesreturnService.selectSalesreturnByReturnId(returnId);
        mmap.put("salesreturn", salesreturn);
        return prefix + "/edit";
    }

    /**
     * 修改保存销售退货
     */
    @RequiresPermissions("SalesManagement:salesreturn:edit")
    @Log(title = "销售退货", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(Salesreturn salesreturn)
    {
        return toAjax(salesreturnService.updateSalesreturn(salesreturn));
    }

    /**
     * 删除销售退货
     */
    @RequiresPermissions("SalesManagement:salesreturn:remove")
    @Log(title = "销售退货", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(salesreturnService.deleteSalesreturnByReturnIds(ids));
    }
}
