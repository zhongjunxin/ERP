package com.ruoyi.WarehouseInformation.controller;

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
import com.ruoyi.WarehouseInformation.domain.WarehouseinformationInventorymonitoring;
import com.ruoyi.WarehouseInformation.service.IWarehouseinformationInventorymonitoringService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 库存监控Controller
 * 
 * @author ruoyi
 * @date 2025-04-26
 */
@Controller
@RequestMapping("/WarehouseInformation/inventorymonitoring")
public class WarehouseinformationInventorymonitoringController extends BaseController
{
    private String prefix = "WarehouseInformation/inventorymonitoring";

    @Autowired
    private IWarehouseinformationInventorymonitoringService warehouseinformationInventorymonitoringService;

    @RequiresPermissions("WarehouseInformation:inventorymonitoring:view")
    @GetMapping()
    public String inventorymonitoring()
    {
        return prefix + "/inventorymonitoring";
    }

    /**
     * 查询库存监控列表
     */
    @RequiresPermissions("WarehouseInformation:inventorymonitoring:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(WarehouseinformationInventorymonitoring warehouseinformationInventorymonitoring)
    {
        startPage();
        List<WarehouseinformationInventorymonitoring> list = warehouseinformationInventorymonitoringService.selectWarehouseinformationInventorymonitoringList(warehouseinformationInventorymonitoring);
        return getDataTable(list);
    }

    /**
     * 导出库存监控列表
     */
    @RequiresPermissions("WarehouseInformation:inventorymonitoring:export")
    @Log(title = "库存监控", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(WarehouseinformationInventorymonitoring warehouseinformationInventorymonitoring)
    {
        List<WarehouseinformationInventorymonitoring> list = warehouseinformationInventorymonitoringService.selectWarehouseinformationInventorymonitoringList(warehouseinformationInventorymonitoring);
        ExcelUtil<WarehouseinformationInventorymonitoring> util = new ExcelUtil<WarehouseinformationInventorymonitoring>(WarehouseinformationInventorymonitoring.class);
        return util.exportExcel(list, "库存监控数据");
    }

    /**
     * 新增库存监控
     */
    @RequiresPermissions("WarehouseInformation:inventorymonitoring:add")
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存库存监控
     */
    @RequiresPermissions("WarehouseInformation:inventorymonitoring:add")
    @Log(title = "库存监控", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(WarehouseinformationInventorymonitoring warehouseinformationInventorymonitoring)
    {
        return toAjax(warehouseinformationInventorymonitoringService.insertWarehouseinformationInventorymonitoring(warehouseinformationInventorymonitoring));
    }

    /**
     * 修改库存监控
     */
    @RequiresPermissions("WarehouseInformation:inventorymonitoring:edit")
    @GetMapping("/edit/{productNumber}")
    public String edit(@PathVariable("productNumber") String productNumber, ModelMap mmap)
    {
        WarehouseinformationInventorymonitoring warehouseinformationInventorymonitoring = warehouseinformationInventorymonitoringService.selectWarehouseinformationInventorymonitoringByProductNumber(productNumber);
        mmap.put("warehouseinformationInventorymonitoring", warehouseinformationInventorymonitoring);
        return prefix + "/edit";
    }

    /**
     * 修改保存库存监控
     */
    @RequiresPermissions("WarehouseInformation:inventorymonitoring:edit")
    @Log(title = "库存监控", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(WarehouseinformationInventorymonitoring warehouseinformationInventorymonitoring)
    {
        return toAjax(warehouseinformationInventorymonitoringService.updateWarehouseinformationInventorymonitoring(warehouseinformationInventorymonitoring));
    }

    /**
     * 删除库存监控
     */
    @RequiresPermissions("WarehouseInformation:inventorymonitoring:remove")
    @Log(title = "库存监控", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(warehouseinformationInventorymonitoringService.deleteWarehouseinformationInventorymonitoringByProductNumbers(ids));
    }
}
