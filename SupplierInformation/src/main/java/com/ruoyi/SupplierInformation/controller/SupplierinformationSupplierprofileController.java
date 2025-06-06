package com.ruoyi.SupplierInformation.controller;

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
import com.ruoyi.SupplierInformation.domain.SupplierinformationSupplierprofile;
import com.ruoyi.SupplierInformation.service.ISupplierinformationSupplierprofileService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 供应商档案管理Controller
 * 
 * @author ruoyi
 * @date 2025-04-28
 */
@Controller
@RequestMapping("/SupplierInformation/supplierprofile")
public class SupplierinformationSupplierprofileController extends BaseController
{
    private String prefix = "SupplierInformation/supplierprofile";

    @Autowired
    private ISupplierinformationSupplierprofileService supplierinformationSupplierprofileService;

    @RequiresPermissions("SupplierInformation:supplierprofile:view")
    @GetMapping()
    public String supplierprofile()
    {
        return prefix + "/supplierprofile";
    }

    /**
     * 查询供应商档案管理列表
     */
    @RequiresPermissions("SupplierInformation:supplierprofile:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(SupplierinformationSupplierprofile supplierinformationSupplierprofile)
    {
        startPage();
        List<SupplierinformationSupplierprofile> list = supplierinformationSupplierprofileService.selectSupplierinformationSupplierprofileList(supplierinformationSupplierprofile);
        return getDataTable(list);
    }

    /**
     * 导出供应商档案管理列表
     */
    @RequiresPermissions("SupplierInformation:supplierprofile:export")
    @Log(title = "供应商档案管理", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(SupplierinformationSupplierprofile supplierinformationSupplierprofile)
    {
        List<SupplierinformationSupplierprofile> list = supplierinformationSupplierprofileService.selectSupplierinformationSupplierprofileList(supplierinformationSupplierprofile);
        ExcelUtil<SupplierinformationSupplierprofile> util = new ExcelUtil<SupplierinformationSupplierprofile>(SupplierinformationSupplierprofile.class);
        return util.exportExcel(list, "供应商档案管理数据");
    }

    /**
     * 新增供应商档案管理
     */
    @RequiresPermissions("SupplierInformation:supplierprofile:add")
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存供应商档案管理
     */
    @RequiresPermissions("SupplierInformation:supplierprofile:add")
    @Log(title = "供应商档案管理", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(SupplierinformationSupplierprofile supplierinformationSupplierprofile)
    {
        return toAjax(supplierinformationSupplierprofileService.insertSupplierinformationSupplierprofile(supplierinformationSupplierprofile));
    }

    /**
     * 修改供应商档案管理
     */
    @RequiresPermissions("SupplierInformation:supplierprofile:edit")
    @GetMapping("/edit/{supplierId}")
    public String edit(@PathVariable("supplierId") String supplierId, ModelMap mmap)
    {
        SupplierinformationSupplierprofile supplierinformationSupplierprofile = supplierinformationSupplierprofileService.selectSupplierinformationSupplierprofileBySupplierId(supplierId);
        mmap.put("supplierinformationSupplierprofile", supplierinformationSupplierprofile);
        return prefix + "/edit";
    }

    /**
     * 修改保存供应商档案管理
     */
    @RequiresPermissions("SupplierInformation:supplierprofile:edit")
    @Log(title = "供应商档案管理", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(SupplierinformationSupplierprofile supplierinformationSupplierprofile)
    {
        return toAjax(supplierinformationSupplierprofileService.updateSupplierinformationSupplierprofile(supplierinformationSupplierprofile));
    }

    /**
     * 删除供应商档案管理
     */
    @RequiresPermissions("SupplierInformation:supplierprofile:remove")
    @Log(title = "供应商档案管理", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(supplierinformationSupplierprofileService.deleteSupplierinformationSupplierprofileBySupplierIds(ids));
    }
}
