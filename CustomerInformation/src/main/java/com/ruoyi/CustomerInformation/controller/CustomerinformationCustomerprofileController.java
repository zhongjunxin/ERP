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
import com.ruoyi.CustomerInformation.domain.CustomerinformationCustomerprofile;
import com.ruoyi.CustomerInformation.service.ICustomerinformationCustomerprofileService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 客户档案管理Controller
 * 
 * @author ruoyi
 * @date 2025-04-28
 */
@Controller
@RequestMapping("/CustomerInformation/customerprofile")
public class CustomerinformationCustomerprofileController extends BaseController
{
    private String prefix = "CustomerInformation/customerprofile";

    @Autowired
    private ICustomerinformationCustomerprofileService customerinformationCustomerprofileService;

    @RequiresPermissions("CustomerInformation:customerprofile:view")
    @GetMapping()
    public String customerprofile()
    {
        return prefix + "/customerprofile";
    }

    /**
     * 查询客户档案管理列表
     */
    @RequiresPermissions("CustomerInformation:customerprofile:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(CustomerinformationCustomerprofile customerinformationCustomerprofile)
    {
        startPage();
        List<CustomerinformationCustomerprofile> list = customerinformationCustomerprofileService.selectCustomerinformationCustomerprofileList(customerinformationCustomerprofile);
        return getDataTable(list);
    }

    /**
     * 导出客户档案管理列表
     */
    @RequiresPermissions("CustomerInformation:customerprofile:export")
    @Log(title = "客户档案管理", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(CustomerinformationCustomerprofile customerinformationCustomerprofile)
    {
        List<CustomerinformationCustomerprofile> list = customerinformationCustomerprofileService.selectCustomerinformationCustomerprofileList(customerinformationCustomerprofile);
        ExcelUtil<CustomerinformationCustomerprofile> util = new ExcelUtil<CustomerinformationCustomerprofile>(CustomerinformationCustomerprofile.class);
        return util.exportExcel(list, "客户档案管理数据");
    }

    /**
     * 新增客户档案管理
     */
    @RequiresPermissions("CustomerInformation:customerprofile:add")
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存客户档案管理
     */
    @RequiresPermissions("CustomerInformation:customerprofile:add")
    @Log(title = "客户档案管理", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(CustomerinformationCustomerprofile customerinformationCustomerprofile)
    {
        return toAjax(customerinformationCustomerprofileService.insertCustomerinformationCustomerprofile(customerinformationCustomerprofile));
    }

    /**
     * 修改客户档案管理
     */
    @RequiresPermissions("CustomerInformation:customerprofile:edit")
    @GetMapping("/edit/{customerId}")
    public String edit(@PathVariable("customerId") String customerId, ModelMap mmap)
    {
        CustomerinformationCustomerprofile customerinformationCustomerprofile = customerinformationCustomerprofileService.selectCustomerinformationCustomerprofileByCustomerId(customerId);
        mmap.put("customerinformationCustomerprofile", customerinformationCustomerprofile);
        return prefix + "/edit";
    }

    /**
     * 修改保存客户档案管理
     */
    @RequiresPermissions("CustomerInformation:customerprofile:edit")
    @Log(title = "客户档案管理", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(CustomerinformationCustomerprofile customerinformationCustomerprofile)
    {
        return toAjax(customerinformationCustomerprofileService.updateCustomerinformationCustomerprofile(customerinformationCustomerprofile));
    }

    /**
     * 删除客户档案管理
     */
    @RequiresPermissions("CustomerInformation:customerprofile:remove")
    @Log(title = "客户档案管理", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(customerinformationCustomerprofileService.deleteCustomerinformationCustomerprofileByCustomerIds(ids));
    }
}
