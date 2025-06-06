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
import com.ruoyi.WarehouseInformation.domain.WarehouseinformationOperations;
import com.ruoyi.WarehouseInformation.service.IWarehouseinformationOperationsService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 仓库操作管理Controller
 * 
 * @author ruoyi
 * @date 2025-04-26
 */
@Controller
@RequestMapping("/WarehouseInformation/operations")
public class WarehouseinformationOperationsController extends BaseController
{
    private String prefix = "WarehouseInformation/operations";

    @Autowired
    private IWarehouseinformationOperationsService warehouseinformationOperationsService;

    @RequiresPermissions("WarehouseInformation:operations:view")
    @GetMapping()
    public String operations()
    {
        return prefix + "/operations";
    }

    /**
     * 查询仓库操作管理列表
     */
    @RequiresPermissions("WarehouseInformation:operations:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(WarehouseinformationOperations warehouseinformationOperations)
    {
        startPage();
        List<WarehouseinformationOperations> list = warehouseinformationOperationsService.selectWarehouseinformationOperationsList(warehouseinformationOperations);
        return getDataTable(list);
    }

    /**
     * 导出仓库操作管理列表
     */
    @RequiresPermissions("WarehouseInformation:operations:export")
    @Log(title = "仓库操作管理", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(WarehouseinformationOperations warehouseinformationOperations)
    {
        List<WarehouseinformationOperations> list = warehouseinformationOperationsService.selectWarehouseinformationOperationsList(warehouseinformationOperations);
        ExcelUtil<WarehouseinformationOperations> util = new ExcelUtil<WarehouseinformationOperations>(WarehouseinformationOperations.class);
        return util.exportExcel(list, "仓库操作管理数据");
    }

    /**
     * 新增仓库操作管理
     */
    @RequiresPermissions("WarehouseInformation:operations:add")
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存仓库操作管理
     */
    @RequiresPermissions("WarehouseInformation:operations:add")
    @Log(title = "仓库操作管理", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(WarehouseinformationOperations warehouseinformationOperations)
    {
        return toAjax(warehouseinformationOperationsService.insertWarehouseinformationOperations(warehouseinformationOperations));
    }

    /**
     * 修改仓库操作管理
     */
    @RequiresPermissions("WarehouseInformation:operations:edit")
    @GetMapping("/edit/{operationId}")
    public String edit(@PathVariable("operationId") Long operationId, ModelMap mmap)
    {
        WarehouseinformationOperations warehouseinformationOperations = warehouseinformationOperationsService.selectWarehouseinformationOperationsByOperationId(operationId);
        mmap.put("warehouseinformationOperations", warehouseinformationOperations);
        return prefix + "/edit";
    }

    /**
     * 修改保存仓库操作管理
     */
    @RequiresPermissions("WarehouseInformation:operations:edit")
    @Log(title = "仓库操作管理", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(WarehouseinformationOperations warehouseinformationOperations)
    {
        return toAjax(warehouseinformationOperationsService.updateWarehouseinformationOperations(warehouseinformationOperations));
    }

    /**
     * 删除仓库操作管理
     */
    @RequiresPermissions("WarehouseInformation:operations:remove")
    @Log(title = "仓库操作管理", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(warehouseinformationOperationsService.deleteWarehouseinformationOperationsByOperationIds(ids));
    }
}
