package com.ruoyi.SupplierInformation.controller;

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
import com.ruoyi.SupplierInformation.domain.SupplierinformationSupplyrecords;
import com.ruoyi.SupplierInformation.service.ISupplierinformationSupplyrecordsService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 供应记录管理Controller
 * 
 * @author ruoyi
 * @date 2025-04-28
 */
@Controller
@RequestMapping("/SupplierInformation/supplyrecords")
public class SupplierinformationSupplyrecordsController extends BaseController
{
    private String prefix = "SupplierInformation/supplyrecords";

    @Autowired
    private ISupplierinformationSupplyrecordsService supplierinformationSupplyrecordsService;

    @RequiresPermissions("SupplierInformation:supplyrecords:view")
    @GetMapping()
    public String supplyrecords()
    {
        return prefix + "/supplyrecords";
    }

    /**
     * 查询供应记录管理列表
     */
    @RequiresPermissions("SupplierInformation:supplyrecords:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(SupplierinformationSupplyrecords supplierinformationSupplyrecords)
    {
        startPage();
        List<SupplierinformationSupplyrecords> list = supplierinformationSupplyrecordsService.selectSupplierinformationSupplyrecordsList(supplierinformationSupplyrecords);
        return getDataTable(list);
    }

    /**
     * 导出供应记录管理列表
     */
    @RequiresPermissions("SupplierInformation:supplyrecords:export")
    @Log(title = "供应记录管理", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(SupplierinformationSupplyrecords supplierinformationSupplyrecords)
    {
        List<SupplierinformationSupplyrecords> list = supplierinformationSupplyrecordsService.selectSupplierinformationSupplyrecordsList(supplierinformationSupplyrecords);
        ExcelUtil<SupplierinformationSupplyrecords> util = new ExcelUtil<SupplierinformationSupplyrecords>(SupplierinformationSupplyrecords.class);
        return util.exportExcel(list, "供应记录管理数据");
    }

    /**
     * 新增供应记录管理
     */
    @RequiresPermissions("SupplierInformation:supplyrecords:add")
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存供应记录管理
     */
    @RequiresPermissions("SupplierInformation:supplyrecords:add")
    @Log(title = "供应记录管理", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(SupplierinformationSupplyrecords supplierinformationSupplyrecords)
    {
        return toAjax(supplierinformationSupplyrecordsService.insertSupplierinformationSupplyrecords(supplierinformationSupplyrecords));
    }

    /**
     * 修改供应记录管理
     */
    @RequiresPermissions("SupplierInformation:supplyrecords:edit")
    @GetMapping("/edit/{recordId}")
    public String edit(@PathVariable("recordId") Long recordId, ModelMap mmap)
    {
        SupplierinformationSupplyrecords supplierinformationSupplyrecords = supplierinformationSupplyrecordsService.selectSupplierinformationSupplyrecordsByRecordId(recordId);
        mmap.put("supplierinformationSupplyrecords", supplierinformationSupplyrecords);
        return prefix + "/edit";
    }

    /**
     * 修改保存供应记录管理
     */
    @RequiresPermissions("SupplierInformation:supplyrecords:edit")
    @Log(title = "供应记录管理", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(SupplierinformationSupplyrecords supplierinformationSupplyrecords)
    {
        return toAjax(supplierinformationSupplyrecordsService.updateSupplierinformationSupplyrecords(supplierinformationSupplyrecords));
    }

    /**
     * 删除供应记录管理
     */
    @RequiresPermissions("SupplierInformation:supplyrecords:remove")
    @Log(title = "供应记录管理", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(supplierinformationSupplyrecordsService.deleteSupplierinformationSupplyrecordsByRecordIds(ids));
    }
}
