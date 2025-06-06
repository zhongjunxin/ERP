package com.ruoyi.CustomerInformation.controller;

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
import com.ruoyi.CustomerInformation.domain.CustomerinformationTagging;
import com.ruoyi.CustomerInformation.service.ICustomerinformationTaggingService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 客户分类标签Controller
 * 
 * @author ruoyi
 * @date 2025-04-28
 */
@Controller
@RequestMapping("/CustomerInformation/tagging")
public class CustomerinformationTaggingController extends BaseController
{
    private String prefix = "CustomerInformation/tagging";

    @Autowired
    private ICustomerinformationTaggingService customerinformationTaggingService;

    @RequiresPermissions("CustomerInformation:tagging:view")
    @GetMapping()
    public String tagging()
    {
        return prefix + "/tagging";
    }

    /**
     * 查询客户分类标签列表
     */
    @RequiresPermissions("CustomerInformation:tagging:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(CustomerinformationTagging customerinformationTagging)
    {
        startPage();
        List<CustomerinformationTagging> list = customerinformationTaggingService.selectCustomerinformationTaggingList(customerinformationTagging);
        return getDataTable(list);
    }

    /**
     * 导出客户分类标签列表
     */
    @RequiresPermissions("CustomerInformation:tagging:export")
    @Log(title = "客户分类标签", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(CustomerinformationTagging customerinformationTagging)
    {
        List<CustomerinformationTagging> list = customerinformationTaggingService.selectCustomerinformationTaggingList(customerinformationTagging);
        ExcelUtil<CustomerinformationTagging> util = new ExcelUtil<CustomerinformationTagging>(CustomerinformationTagging.class);
        return util.exportExcel(list, "客户分类标签数据");
    }

    /**
     * 新增客户分类标签
     */
    @RequiresPermissions("CustomerInformation:tagging:add")
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存客户分类标签
     */
    @RequiresPermissions("CustomerInformation:tagging:add")
    @Log(title = "客户分类标签", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(CustomerinformationTagging customerinformationTagging)
    {
        return toAjax(customerinformationTaggingService.insertCustomerinformationTagging(customerinformationTagging));
    }

    /**
     * 修改客户分类标签
     */
    @RequiresPermissions("CustomerInformation:tagging:edit")
    @GetMapping("/edit/{tagId}")
    public String edit(@PathVariable("tagId") Long tagId, ModelMap mmap)
    {
        CustomerinformationTagging customerinformationTagging = customerinformationTaggingService.selectCustomerinformationTaggingByTagId(tagId);
        mmap.put("customerinformationTagging", customerinformationTagging);
        return prefix + "/edit";
    }

    /**
     * 修改保存客户分类标签
     */
    @RequiresPermissions("CustomerInformation:tagging:edit")
    @Log(title = "客户分类标签", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(CustomerinformationTagging customerinformationTagging)
    {
        return toAjax(customerinformationTaggingService.updateCustomerinformationTagging(customerinformationTagging));
    }

    /**
     * 删除客户分类标签
     */
    @RequiresPermissions("CustomerInformation:tagging:remove")
    @Log(title = "客户分类标签", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(customerinformationTaggingService.deleteCustomerinformationTaggingByTagIds(ids));
    }
}
