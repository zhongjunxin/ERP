package com.ruoyi.SupplierInformation.controller;

import java.util.List;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.SupplierInformation.domain.SupplierinformationKpi;
import com.ruoyi.SupplierInformation.service.ISupplierinformationKpiService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 评估指标系统Controller
 * 
 * @author ruoyi
 * @date 2025-04-28
 */
@Controller
@RequestMapping("/SupplierInformation/kpi")
public class SupplierinformationKpiController extends BaseController
{
    private String prefix = "SupplierInformation/kpi";

    @Autowired
    private ISupplierinformationKpiService supplierinformationKpiService;

    @RequiresPermissions("SupplierInformation:kpi:view")
    @GetMapping()
    public String kpi()
    {
        return prefix + "/kpi";
    }

    /**
     * 查询评估指标系统列表
     */
    @RequiresPermissions("SupplierInformation:kpi:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(SupplierinformationKpi supplierinformationKpi)
    {
        startPage();
        List<SupplierinformationKpi> list = supplierinformationKpiService.selectSupplierinformationKpiList(supplierinformationKpi);
        return getDataTable(list);
    }

    /**
     * 导出评估指标系统列表
     */
    @RequiresPermissions("SupplierInformation:kpi:export")
    @Log(title = "评估指标系统", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(SupplierinformationKpi supplierinformationKpi)
    {
        List<SupplierinformationKpi> list = supplierinformationKpiService.selectSupplierinformationKpiList(supplierinformationKpi);
        ExcelUtil<SupplierinformationKpi> util = new ExcelUtil<SupplierinformationKpi>(SupplierinformationKpi.class);
        return util.exportExcel(list, "评估指标系统数据");
    }

    /**
     * 新增评估指标系统
     */
    @RequiresPermissions("SupplierInformation:kpi:add")
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存评估指标系统
     */
    @RequiresPermissions("SupplierInformation:kpi:add")
    @Log(title = "评估指标系统", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(@Validated SupplierinformationKpi supplierinformationKpi, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            String errorMsg = bindingResult.getFieldError().getDefaultMessage();
            return AjaxResult.error(errorMsg);  // 返回自定义错误
        }
        return toAjax(supplierinformationKpiService.insertSupplierinformationKpi(supplierinformationKpi));
    }

    /**
     * 修改评估指标系统
     */
    @RequiresPermissions("SupplierInformation:kpi:edit")
    @GetMapping("/edit/{evaluationId}")
    public String edit(@PathVariable("evaluationId") Long evaluationId, ModelMap mmap)
    {
        SupplierinformationKpi supplierinformationKpi = supplierinformationKpiService.selectSupplierinformationKpiByEvaluationId(evaluationId);
        mmap.put("supplierinformationKpi", supplierinformationKpi);
        return prefix + "/edit";
    }

    /**
     * 修改保存评估指标系统
     */
    @RequiresPermissions("SupplierInformation:kpi:edit")
    @Log(title = "评估指标系统", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(@Validated SupplierinformationKpi supplierinformationKpi, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            String errorMsg = bindingResult.getFieldError().getDefaultMessage();
            return AjaxResult.error(errorMsg);  // 返回自定义错误
        }
        return toAjax(supplierinformationKpiService.updateSupplierinformationKpi(supplierinformationKpi));
    }

    /**
     * 删除评估指标系统
     */
    @RequiresPermissions("SupplierInformation:kpi:remove")
    @Log(title = "评估指标系统", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(supplierinformationKpiService.deleteSupplierinformationKpiByEvaluationIds(ids));
    }
}
