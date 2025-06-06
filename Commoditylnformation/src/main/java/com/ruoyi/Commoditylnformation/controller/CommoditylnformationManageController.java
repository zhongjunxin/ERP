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
import com.ruoyi.Commoditylnformation.domain.CommoditylnformationManage;
import com.ruoyi.Commoditylnformation.service.ICommoditylnformationManageService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 商品管理Controller
 * 
 * @author ruoyi
 * @date 2025-04-26
 */
@Controller
@RequestMapping("/Commoditylnformation/manage")
public class CommoditylnformationManageController extends BaseController
{
    private String prefix = "Commoditylnformation/manage";

    @Autowired
    private ICommoditylnformationManageService commoditylnformationManageService;

    @RequiresPermissions("Commoditylnformation:manage:view")
    @GetMapping()
    public String manage()
    {
        return prefix + "/manage";
    }

    /**
     * 查询商品管理列表
     */
    @RequiresPermissions("Commoditylnformation:manage:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(CommoditylnformationManage commoditylnformationManage)
    {
        startPage();
        List<CommoditylnformationManage> list = commoditylnformationManageService.selectCommoditylnformationManageList(commoditylnformationManage);
        return getDataTable(list);
    }

    /**
     * 导出商品管理列表
     */
    @RequiresPermissions("Commoditylnformation:manage:export")
    @Log(title = "商品管理", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(CommoditylnformationManage commoditylnformationManage)
    {
        List<CommoditylnformationManage> list = commoditylnformationManageService.selectCommoditylnformationManageList(commoditylnformationManage);
        ExcelUtil<CommoditylnformationManage> util = new ExcelUtil<CommoditylnformationManage>(CommoditylnformationManage.class);
        return util.exportExcel(list, "商品管理数据");
    }

    /**
     * 新增商品管理
     */
    @RequiresPermissions("Commoditylnformation:manage:add")
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存商品管理
     */
    @RequiresPermissions("Commoditylnformation:manage:add")
    @Log(title = "商品管理", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(CommoditylnformationManage commoditylnformationManage)
    {
        return toAjax(commoditylnformationManageService.insertCommoditylnformationManage(commoditylnformationManage));
    }

    /**
     * 修改商品管理
     */
    @RequiresPermissions("Commoditylnformation:manage:edit")
    @GetMapping("/edit/{productNumber}")
    public String edit(@PathVariable("productNumber") String productNumber, ModelMap mmap)
    {
        CommoditylnformationManage commoditylnformationManage = commoditylnformationManageService.selectCommoditylnformationManageByProductNumber(productNumber);
        mmap.put("commoditylnformationManage", commoditylnformationManage);
        return prefix + "/edit";
    }

    /**
     * 修改保存商品管理
     */
    @RequiresPermissions("Commoditylnformation:manage:edit")
    @Log(title = "商品管理", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(CommoditylnformationManage commoditylnformationManage)
    {
        return toAjax(commoditylnformationManageService.updateCommoditylnformationManage(commoditylnformationManage));
    }

    /**
     * 删除商品管理
     */
    @RequiresPermissions("Commoditylnformation:manage:remove")
    @Log(title = "商品管理", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(commoditylnformationManageService.deleteCommoditylnformationManageByProductNumbers(ids));
    }
}
