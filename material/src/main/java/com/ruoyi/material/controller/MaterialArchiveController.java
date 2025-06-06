package com.ruoyi.material.controller;

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
import com.ruoyi.material.domain.MaterialArchive;
import com.ruoyi.material.service.IMaterialArchiveService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 物料档案Controller
 * 
 * @author ruoyi
 * @date 2025-05-06
 */
@Controller
@RequestMapping("/material/archive")
public class MaterialArchiveController extends BaseController
{
    private String prefix = "material/archive";

    @Autowired
    private IMaterialArchiveService materialArchiveService;

    @RequiresPermissions("material:archive:view")
    @GetMapping()
    public String archive()
    {
        return prefix + "/archive";
    }

    /**
     * 查询物料档案列表
     */
    @RequiresPermissions("material:archive:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(MaterialArchive materialArchive)
    {
        startPage();
        List<MaterialArchive> list = materialArchiveService.selectMaterialArchiveList(materialArchive);
        return getDataTable(list);
    }

    /**
     * 导出物料档案列表
     */
    @RequiresPermissions("material:archive:export")
    @Log(title = "物料档案", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(MaterialArchive materialArchive)
    {
        List<MaterialArchive> list = materialArchiveService.selectMaterialArchiveList(materialArchive);
        ExcelUtil<MaterialArchive> util = new ExcelUtil<MaterialArchive>(MaterialArchive.class);
        return util.exportExcel(list, "物料档案数据");
    }

    /**
     * 新增物料档案
     */
    @RequiresPermissions("material:archive:add")
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存物料档案
     */
    @RequiresPermissions("material:archive:add")
    @Log(title = "物料档案", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(MaterialArchive materialArchive)
    {
        return toAjax(materialArchiveService.insertMaterialArchive(materialArchive));
    }

    /**
     * 修改物料档案
     */
    @RequiresPermissions("material:archive:edit")
    @GetMapping("/edit/{materialCode}")
    public String edit(@PathVariable("materialCode") String materialCode, ModelMap mmap)
    {
        MaterialArchive materialArchive = materialArchiveService.selectMaterialArchiveByMaterialCode(materialCode);
        mmap.put("materialArchive", materialArchive);
        return prefix + "/edit";
    }

    /**
     * 修改保存物料档案
     */
    @RequiresPermissions("material:archive:edit")
    @Log(title = "物料档案", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(MaterialArchive materialArchive)
    {
        return toAjax(materialArchiveService.updateMaterialArchive(materialArchive));
    }

    /**
     * 删除物料档案
     */
    @RequiresPermissions("material:archive:remove")
    @Log(title = "物料档案", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(materialArchiveService.deleteMaterialArchiveByMaterialCodes(ids));
    }
}
