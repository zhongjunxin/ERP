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
import com.ruoyi.Commoditylnformation.domain.CommoditylnformationBrand;
import com.ruoyi.Commoditylnformation.service.ICommoditylnformationBrandService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 商品品牌Controller
 *
 * @author ruoyi
 * @date 2025-04-26
 */
@Controller
@RequestMapping("/Commoditylnformation/brand")
public class CommoditylnformationBrandController extends BaseController
{
    private String prefix = "Commoditylnformation/brand";

    @Autowired
    private ICommoditylnformationBrandService commoditylnformationBrandService;

    @RequiresPermissions("Commoditylnformation:brand:view")
    @GetMapping()
    public String brand()
    {
        return prefix + "/brand";
    }

    /**
     * 查询商品品牌列表
     */
    @RequiresPermissions("Commoditylnformation:brand:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(CommoditylnformationBrand commoditylnformationBrand)
    {
        startPage();
        List<CommoditylnformationBrand> list = commoditylnformationBrandService.selectCommoditylnformationBrandList(commoditylnformationBrand);
        return getDataTable(list);
    }

    /**
     * 导出商品品牌列表
     */
    @RequiresPermissions("Commoditylnformation:brand:export")
    @Log(title = "商品品牌", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(CommoditylnformationBrand commoditylnformationBrand)
    {
        List<CommoditylnformationBrand> list = commoditylnformationBrandService.selectCommoditylnformationBrandList(commoditylnformationBrand);
        ExcelUtil<CommoditylnformationBrand> util = new ExcelUtil<CommoditylnformationBrand>(CommoditylnformationBrand.class);
        return util.exportExcel(list, "商品品牌数据");
    }

    /**
     * 新增商品品牌
     */
    @RequiresPermissions("Commoditylnformation:brand:add")
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存商品品牌
     */
    @RequiresPermissions("Commoditylnformation:brand:add")
    @Log(title = "商品品牌", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(CommoditylnformationBrand commoditylnformationBrand)
    {
        // 设置默认状态为启用
        commoditylnformationBrand.setStatus(1L);
        return toAjax(commoditylnformationBrandService.insertCommoditylnformationBrand(commoditylnformationBrand));
    }

    /**
     * 修改商品品牌
     */
    @RequiresPermissions("Commoditylnformation:brand:edit")
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        CommoditylnformationBrand commoditylnformationBrand = commoditylnformationBrandService.selectCommoditylnformationBrandById(id);
        mmap.put("commoditylnformationBrand", commoditylnformationBrand);
        return prefix + "/edit";
    }

    /**
     * 修改保存商品品牌
     */
    @RequiresPermissions("Commoditylnformation:brand:edit")
    @Log(title = "商品品牌", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(CommoditylnformationBrand commoditylnformationBrand)
    {
        return toAjax(commoditylnformationBrandService.updateCommoditylnformationBrand(commoditylnformationBrand));
    }

    /**
     * 删除商品品牌
     */
    @RequiresPermissions("Commoditylnformation:brand:remove")
    @Log(title = "商品品牌", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(commoditylnformationBrandService.deleteCommoditylnformationBrandByIds(ids));
    }

    /**
     * 切换品牌状态
     */
    @RequiresPermissions("Commoditylnformation:brand:edit")
    @Log(title = "商品品牌", businessType = BusinessType.UPDATE)
    @PostMapping("/toggleStatus")
    @ResponseBody
    public AjaxResult toggleStatus(Long id)
    {
        CommoditylnformationBrand brand = commoditylnformationBrandService.selectCommoditylnformationBrandById(id);
        if (brand == null) {
            return error("品牌不存在");
        }
        // 切换状态
        brand.setStatus(brand.getStatus() == 1L ? 0L : 1L);
        return toAjax(commoditylnformationBrandService.updateCommoditylnformationBrand(brand));
    }
}