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
import com.ruoyi.WarehouseInformation.domain.WarehouseinformationWarehouseprofile;
import com.ruoyi.WarehouseInformation.service.IWarehouseinformationWarehouseprofileService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 仓库档案管理Controller
 * 
 * @author ruoyi
 * @date 2025-04-26
 */
@Controller
@RequestMapping("/WarehouseInformation/warehouseprofile")
public class WarehouseinformationWarehouseprofileController extends BaseController
{
    private String prefix = "WarehouseInformation/warehouseprofile";

    @Autowired
    private IWarehouseinformationWarehouseprofileService warehouseinformationWarehouseprofileService;

    @RequiresPermissions("WarehouseInformation:warehouseprofile:view")
    @GetMapping()
    public String warehouseprofile()
    {
        return prefix + "/warehouseprofile";
    }

    /**
     * 查询仓库档案管理列表
     */
    @RequiresPermissions("WarehouseInformation:warehouseprofile:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(WarehouseinformationWarehouseprofile warehouseinformationWarehouseprofile)
    {
        startPage();
        List<WarehouseinformationWarehouseprofile> list = warehouseinformationWarehouseprofileService.selectWarehouseinformationWarehouseprofileList(warehouseinformationWarehouseprofile);
        return getDataTable(list);
    }

    /**
     * 导出仓库档案管理列表
     */
    @RequiresPermissions("WarehouseInformation:warehouseprofile:export")
    @Log(title = "仓库档案管理", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(WarehouseinformationWarehouseprofile warehouseinformationWarehouseprofile)
    {
        List<WarehouseinformationWarehouseprofile> list = warehouseinformationWarehouseprofileService.selectWarehouseinformationWarehouseprofileList(warehouseinformationWarehouseprofile);
        ExcelUtil<WarehouseinformationWarehouseprofile> util = new ExcelUtil<WarehouseinformationWarehouseprofile>(WarehouseinformationWarehouseprofile.class);
        return util.exportExcel(list, "仓库档案管理数据");
    }

    /**
     * 新增仓库档案管理
     */
    @RequiresPermissions("WarehouseInformation:warehouseprofile:add")
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存仓库档案管理
     */
    @RequiresPermissions("WarehouseInformation:warehouseprofile:add")
    @Log(title = "仓库档案管理", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(WarehouseinformationWarehouseprofile warehouseinformationWarehouseprofile)
    {
        return toAjax(warehouseinformationWarehouseprofileService.insertWarehouseinformationWarehouseprofile(warehouseinformationWarehouseprofile));
    }

    /**
     * 修改仓库档案管理
     */
    @RequiresPermissions("WarehouseInformation:warehouseprofile:edit")
    @GetMapping("/edit/{warehouseId}")
    public String edit(@PathVariable("warehouseId") String warehouseId, ModelMap mmap)
    {
        WarehouseinformationWarehouseprofile warehouseinformationWarehouseprofile = warehouseinformationWarehouseprofileService.selectWarehouseinformationWarehouseprofileByWarehouseId(warehouseId);
        mmap.put("warehouseinformationWarehouseprofile", warehouseinformationWarehouseprofile);
        return prefix + "/edit";
    }

    /**
     * 修改保存仓库档案管理
     */
    @RequiresPermissions("WarehouseInformation:warehouseprofile:edit")
    @Log(title = "仓库档案管理", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(WarehouseinformationWarehouseprofile warehouseinformationWarehouseprofile)
    {
        return toAjax(warehouseinformationWarehouseprofileService.updateWarehouseinformationWarehouseprofile(warehouseinformationWarehouseprofile));
    }

    /**
     * 删除仓库档案管理
     */
    @RequiresPermissions("WarehouseInformation:warehouseprofile:remove")
    @Log(title = "仓库档案管理", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(warehouseinformationWarehouseprofileService.deleteWarehouseinformationWarehouseprofileByWarehouseIds(ids));
    }
}
