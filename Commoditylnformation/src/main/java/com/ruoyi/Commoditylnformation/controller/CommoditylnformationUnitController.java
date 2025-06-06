package com.ruoyi.Commoditylnformation.controller;

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
import com.ruoyi.Commoditylnformation.domain.CommoditylnformationUnit;
import com.ruoyi.Commoditylnformation.service.ICommoditylnformationUnitService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 商品单位Controller
 * 
 * @author ruoyi
 * @date 2025-04-26
 */
@Controller
@RequestMapping("/Commoditylnformation/unit")
public class CommoditylnformationUnitController extends BaseController
{
    private String prefix = "Commoditylnformation/unit";

    @Autowired
    private ICommoditylnformationUnitService commoditylnformationUnitService;

    @RequiresPermissions("Commoditylnformation:unit:view")
    @GetMapping()
    public String unit()
    {
        return prefix + "/unit";
    }

    /**
     * 查询商品单位列表
     */
    @RequiresPermissions("Commoditylnformation:unit:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(CommoditylnformationUnit commoditylnformationUnit)
    {
        startPage();
        List<CommoditylnformationUnit> list = commoditylnformationUnitService.selectCommoditylnformationUnitList(commoditylnformationUnit);
        return getDataTable(list);
    }

    /**
     * 导出商品单位列表
     */
    @RequiresPermissions("Commoditylnformation:unit:export")
    @Log(title = "商品单位", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(CommoditylnformationUnit commoditylnformationUnit)
    {
        List<CommoditylnformationUnit> list = commoditylnformationUnitService.selectCommoditylnformationUnitList(commoditylnformationUnit);
        ExcelUtil<CommoditylnformationUnit> util = new ExcelUtil<CommoditylnformationUnit>(CommoditylnformationUnit.class);
        return util.exportExcel(list, "商品单位数据");
    }

    /**
     * 新增商品单位
     */
    @RequiresPermissions("Commoditylnformation:unit:add")
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存商品单位
     */
    @RequiresPermissions("Commoditylnformation:unit:add")
    @Log(title = "商品单位", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(CommoditylnformationUnit commoditylnformationUnit)
    {
        return toAjax(commoditylnformationUnitService.insertCommoditylnformationUnit(commoditylnformationUnit));
    }

    /**
     * 修改商品单位
     */
    @RequiresPermissions("Commoditylnformation:unit:edit")
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        CommoditylnformationUnit commoditylnformationUnit = commoditylnformationUnitService.selectCommoditylnformationUnitById(id);
        mmap.put("commoditylnformationUnit", commoditylnformationUnit);
        return prefix + "/edit";
    }

    /**
     * 修改保存商品单位
     */
    @RequiresPermissions("Commoditylnformation:unit:edit")
    @Log(title = "商品单位", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(CommoditylnformationUnit commoditylnformationUnit)
    {
        return toAjax(commoditylnformationUnitService.updateCommoditylnformationUnit(commoditylnformationUnit));
    }

    /**
     * 删除商品单位
     */
    @RequiresPermissions("Commoditylnformation:unit:remove")
    @Log(title = "商品单位", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(commoditylnformationUnitService.deleteCommoditylnformationUnitByIds(ids));
    }
}
