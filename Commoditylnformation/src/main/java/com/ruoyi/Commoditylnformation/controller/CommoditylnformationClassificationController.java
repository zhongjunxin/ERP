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
import com.ruoyi.Commoditylnformation.domain.CommoditylnformationClassification;
import com.ruoyi.Commoditylnformation.service.ICommoditylnformationClassificationService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 商品分类Controller
 * 
 * @author ruoyi
 * @date 2025-04-26
 */
@Controller
@RequestMapping("/Commoditylnformation/classification")
public class CommoditylnformationClassificationController extends BaseController
{
    private String prefix = "Commoditylnformation/classification";

    @Autowired
    private ICommoditylnformationClassificationService commoditylnformationClassificationService;

    @RequiresPermissions("Commoditylnformation:classification:view")
    @GetMapping()
    public String classification()
    {
        return prefix + "/classification";
    }

    /**
     * 查询商品分类列表
     */
    @RequiresPermissions("Commoditylnformation:classification:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(CommoditylnformationClassification commoditylnformationClassification)
    {
        startPage();
        List<CommoditylnformationClassification> list = commoditylnformationClassificationService.selectCommoditylnformationClassificationList(commoditylnformationClassification);
        return getDataTable(list);
    }

    /**
     * 导出商品分类列表
     */
    @RequiresPermissions("Commoditylnformation:classification:export")
    @Log(title = "商品分类", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(CommoditylnformationClassification commoditylnformationClassification)
    {
        List<CommoditylnformationClassification> list = commoditylnformationClassificationService.selectCommoditylnformationClassificationList(commoditylnformationClassification);
        ExcelUtil<CommoditylnformationClassification> util = new ExcelUtil<CommoditylnformationClassification>(CommoditylnformationClassification.class);
        return util.exportExcel(list, "商品分类数据");
    }

    /**
     * 新增商品分类
     */
    @RequiresPermissions("Commoditylnformation:classification:add")
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存商品分类
     */
    @RequiresPermissions("Commoditylnformation:classification:add")
    @Log(title = "商品分类", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(CommoditylnformationClassification commoditylnformationClassification)
    {
        return toAjax(commoditylnformationClassificationService.insertCommoditylnformationClassification(commoditylnformationClassification));
    }

    /**
     * 修改商品分类
     */
    @RequiresPermissions("Commoditylnformation:classification:edit")
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        CommoditylnformationClassification commoditylnformationClassification = commoditylnformationClassificationService.selectCommoditylnformationClassificationById(id);
        mmap.put("commoditylnformationClassification", commoditylnformationClassification);
        return prefix + "/edit";
    }

    /**
     * 修改保存商品分类
     */
    @RequiresPermissions("Commoditylnformation:classification:edit")
    @Log(title = "商品分类", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(CommoditylnformationClassification commoditylnformationClassification)
    {
        return toAjax(commoditylnformationClassificationService.updateCommoditylnformationClassification(commoditylnformationClassification));
    }

    /**
     * 删除商品分类
     */
    @RequiresPermissions("Commoditylnformation:classification:remove")
    @Log(title = "商品分类", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(commoditylnformationClassificationService.deleteCommoditylnformationClassificationByIds(ids));
    }
}
