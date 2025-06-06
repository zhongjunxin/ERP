package com.ruoyi.CustomerInformation.controller;

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
import com.ruoyi.CustomerInformation.domain.CustomerinformationSatisfaction;
import com.ruoyi.CustomerInformation.service.ICustomerinformationSatisfactionService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 满意度调查Controller
 * 
 * @author ruoyi
 * @date 2025-04-28
 */
@Controller
@RequestMapping("/CustomerInformation/satisfaction")
public class CustomerinformationSatisfactionController extends BaseController
{
    private String prefix = "CustomerInformation/satisfaction";

    @Autowired
    private ICustomerinformationSatisfactionService customerinformationSatisfactionService;

    @RequiresPermissions("CustomerInformation:satisfaction:view")
    @GetMapping()
    public String satisfaction()
    {
        return prefix + "/satisfaction";
    }

    /**
     * 查询满意度调查列表
     */
    @RequiresPermissions("CustomerInformation:satisfaction:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(CustomerinformationSatisfaction customerinformationSatisfaction)
    {
        startPage();
        List<CustomerinformationSatisfaction> list = customerinformationSatisfactionService.selectCustomerinformationSatisfactionList(customerinformationSatisfaction);
        return getDataTable(list);
    }

    /**
     * 导出满意度调查列表
     */
    @RequiresPermissions("CustomerInformation:satisfaction:export")
    @Log(title = "满意度调查", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(CustomerinformationSatisfaction customerinformationSatisfaction)
    {
        List<CustomerinformationSatisfaction> list = customerinformationSatisfactionService.selectCustomerinformationSatisfactionList(customerinformationSatisfaction);
        ExcelUtil<CustomerinformationSatisfaction> util = new ExcelUtil<CustomerinformationSatisfaction>(CustomerinformationSatisfaction.class);
        return util.exportExcel(list, "满意度调查数据");
    }

    /**
     * 新增满意度调查
     */
    @RequiresPermissions("CustomerInformation:satisfaction:add")
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存满意度调查
     */
    @RequiresPermissions("CustomerInformation:satisfaction:add")
    @Log(title = "满意度调查", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(@Validated CustomerinformationSatisfaction customerinformationSatisfaction, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            String errorMsg = bindingResult.getFieldError().getDefaultMessage();
            return AjaxResult.error(errorMsg);  // 返回自定义错误
        }
        return toAjax(customerinformationSatisfactionService.insertCustomerinformationSatisfaction(customerinformationSatisfaction));
    }
//    public AjaxResult addSave(CustomerinformationSatisfaction customerinformationSatisfaction)
//    {
//        return toAjax(customerinformationSatisfactionService.insertCustomerinformationSatisfaction(customerinformationSatisfaction));
//    }


    /**
     * 修改满意度调查
     */
    @RequiresPermissions("CustomerInformation:satisfaction:edit")
    @GetMapping("/edit/{surveyId}")
    public String edit(@PathVariable("surveyId") Long surveyId, ModelMap mmap)
    {
        CustomerinformationSatisfaction customerinformationSatisfaction = customerinformationSatisfactionService.selectCustomerinformationSatisfactionBySurveyId(surveyId);
        mmap.put("customerinformationSatisfaction", customerinformationSatisfaction);
        return prefix + "/edit";
    }

    /**
     * 修改保存满意度调查
     */
    @RequiresPermissions("CustomerInformation:satisfaction:edit")
    @Log(title = "满意度调查", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(@Validated CustomerinformationSatisfaction customerinformationSatisfaction, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            String errorMsg = bindingResult.getFieldError().getDefaultMessage();
            return AjaxResult.error(errorMsg);  // 返回自定义错误
        }
        return toAjax(customerinformationSatisfactionService.updateCustomerinformationSatisfaction(customerinformationSatisfaction));
    }
//    public AjaxResult editSave(CustomerinformationSatisfaction customerinformationSatisfaction)
//    {
//        return toAjax(customerinformationSatisfactionService.updateCustomerinformationSatisfaction(customerinformationSatisfaction));
//    }

    /**
     * 删除满意度调查
     */
    @RequiresPermissions("CustomerInformation:satisfaction:remove")
    @Log(title = "满意度调查", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(customerinformationSatisfactionService.deleteCustomerinformationSatisfactionBySurveyIds(ids));
    }
}
