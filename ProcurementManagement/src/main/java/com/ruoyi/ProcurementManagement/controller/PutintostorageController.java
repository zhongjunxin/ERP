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
import com.ruoyi.ProcurementManagement.domain.Putintostorage;
import com.ruoyi.ProcurementManagement.service.IPutintostorageService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 采购入库Controller
 * 
 * @author zjx
 * @date 2025-06-06
 */
@Controller
@RequestMapping("/ProcurementManagement/putintostorage")
public class PutintostorageController extends BaseController
{
    private String prefix = "ProcurementManagement/putintostorage";

    @Autowired
    private IPutintostorageService putintostorageService;

    @RequiresPermissions("ProcurementManagement:putintostorage:view")
    @GetMapping()
    public String putintostorage()
    {
        return prefix + "/putintostorage";
    }

    /**
     * 查询采购入库列表
     */
    @RequiresPermissions("ProcurementManagement:putintostorage:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(Putintostorage putintostorage)
    {
        startPage();
        List<Putintostorage> list = putintostorageService.selectPutintostorageList(putintostorage);
        return getDataTable(list);
    }

    /**
     * 导出采购入库列表
     */
    @RequiresPermissions("ProcurementManagement:putintostorage:export")
    @Log(title = "采购入库", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(Putintostorage putintostorage)
    {
        List<Putintostorage> list = putintostorageService.selectPutintostorageList(putintostorage);
        ExcelUtil<Putintostorage> util = new ExcelUtil<Putintostorage>(Putintostorage.class);
        return util.exportExcel(list, "采购入库数据");
    }

    /**
     * 新增采购入库
     */
    @RequiresPermissions("ProcurementManagement:putintostorage:add")
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存采购入库
     */
    @RequiresPermissions("ProcurementManagement:putintostorage:add")
    @Log(title = "采购入库", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(Putintostorage putintostorage)
    {
        return toAjax(putintostorageService.insertPutintostorage(putintostorage));
    }

    /**
     * 修改采购入库
     */
    @RequiresPermissions("ProcurementManagement:putintostorage:edit")
    @GetMapping("/edit/{incomingId}")
    public String edit(@PathVariable("incomingId") Long incomingId, ModelMap mmap)
    {
        Putintostorage putintostorage = putintostorageService.selectPutintostorageByIncomingId(incomingId);
        mmap.put("putintostorage", putintostorage);
        return prefix + "/edit";
    }

    /**
     * 修改保存采购入库
     */
    @RequiresPermissions("ProcurementManagement:putintostorage:edit")
    @Log(title = "采购入库", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(Putintostorage putintostorage)
    {
        return toAjax(putintostorageService.updatePutintostorage(putintostorage));
    }

    /**
     * 删除采购入库
     */
    @RequiresPermissions("ProcurementManagement:putintostorage:remove")
    @Log(title = "采购入库", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(putintostorageService.deletePutintostorageByIncomingIds(ids));
    }
}
