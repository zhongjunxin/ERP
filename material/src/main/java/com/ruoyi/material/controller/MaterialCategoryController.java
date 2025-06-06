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
import com.ruoyi.material.domain.MaterialCategory;
import com.ruoyi.material.service.IMaterialCategoryService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 物料分类Controller
 * 
 * @author ruoyi
 * @date 2025-05-06
 */
@Controller
@RequestMapping("/material/category")
public class MaterialCategoryController extends BaseController
{
    private String prefix = "material/category";

    @Autowired
    private IMaterialCategoryService materialCategoryService;

    @RequiresPermissions("material:category:view")
    @GetMapping()
    public String category()
    {
        return prefix + "/category";
    }

    /**
     * 查询物料分类列表
     */
    @RequiresPermissions("material:category:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(MaterialCategory materialCategory)
    {
        startPage();
        List<MaterialCategory> list = materialCategoryService.selectMaterialCategoryList(materialCategory);
        return getDataTable(list);
    }

    /**
     * 导出物料分类列表
     */
    @RequiresPermissions("material:category:export")
    @Log(title = "物料分类", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(MaterialCategory materialCategory)
    {
        List<MaterialCategory> list = materialCategoryService.selectMaterialCategoryList(materialCategory);
        ExcelUtil<MaterialCategory> util = new ExcelUtil<MaterialCategory>(MaterialCategory.class);
        return util.exportExcel(list, "物料分类数据");
    }

    /**
     * 新增物料分类
     */
    @RequiresPermissions("material:category:add")
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存物料分类
     */
    @RequiresPermissions("material:category:add")
    @Log(title = "物料分类", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(MaterialCategory materialCategory)
    {
        return toAjax(materialCategoryService.insertMaterialCategory(materialCategory));
    }

    /**
     * 修改物料分类
     */
    @RequiresPermissions("material:category:edit")
    @GetMapping("/edit/{categoryCode}")
    public String edit(@PathVariable("categoryCode") String categoryCode, ModelMap mmap)
    {
        MaterialCategory materialCategory = materialCategoryService.selectMaterialCategoryByCategoryCode(categoryCode);
        mmap.put("materialCategory", materialCategory);
        return prefix + "/edit";
    }

    /**
     * 修改保存物料分类
     */
    @RequiresPermissions("material:category:edit")
    @Log(title = "物料分类", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(MaterialCategory materialCategory)
    {
        return toAjax(materialCategoryService.updateMaterialCategory(materialCategory));
    }

    /**
     * 删除物料分类
     */
    @RequiresPermissions("material:category:remove")
    @Log(title = "物料分类", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(materialCategoryService.deleteMaterialCategoryByCategoryCodes(ids));
    }
}
