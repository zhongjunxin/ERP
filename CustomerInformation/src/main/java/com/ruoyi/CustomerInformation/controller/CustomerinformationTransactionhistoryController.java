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
import com.ruoyi.CustomerInformation.domain.CustomerinformationTransactionhistory;
import com.ruoyi.CustomerInformation.service.ICustomerinformationTransactionhistoryService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 交易历史记录Controller
 * 
 * @author ruoyi
 * @date 2025-04-28
 */
@Controller
@RequestMapping("/CustomerInformation/transactionhistory")
public class CustomerinformationTransactionhistoryController extends BaseController
{
    private String prefix = "CustomerInformation/transactionhistory";

    @Autowired
    private ICustomerinformationTransactionhistoryService customerinformationTransactionhistoryService;

    @RequiresPermissions("CustomerInformation:transactionhistory:view")
    @GetMapping()
    public String transactionhistory()
    {
        return prefix + "/transactionhistory";
    }

    /**
     * 查询交易历史记录列表
     */
    @RequiresPermissions("CustomerInformation:transactionhistory:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(CustomerinformationTransactionhistory customerinformationTransactionhistory)
    {
        startPage();
        List<CustomerinformationTransactionhistory> list = customerinformationTransactionhistoryService.selectCustomerinformationTransactionhistoryList(customerinformationTransactionhistory);
        return getDataTable(list);
    }

    /**
     * 导出交易历史记录列表
     */
    @RequiresPermissions("CustomerInformation:transactionhistory:export")
    @Log(title = "交易历史记录", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(CustomerinformationTransactionhistory customerinformationTransactionhistory)
    {
        List<CustomerinformationTransactionhistory> list = customerinformationTransactionhistoryService.selectCustomerinformationTransactionhistoryList(customerinformationTransactionhistory);
        ExcelUtil<CustomerinformationTransactionhistory> util = new ExcelUtil<CustomerinformationTransactionhistory>(CustomerinformationTransactionhistory.class);
        return util.exportExcel(list, "交易历史记录数据");
    }

    /**
     * 新增交易历史记录
     */
    @RequiresPermissions("CustomerInformation:transactionhistory:add")
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存交易历史记录
     */
    @RequiresPermissions("CustomerInformation:transactionhistory:add")
    @Log(title = "交易历史记录", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(CustomerinformationTransactionhistory customerinformationTransactionhistory)
    {
        return toAjax(customerinformationTransactionhistoryService.insertCustomerinformationTransactionhistory(customerinformationTransactionhistory));
    }

    /**
     * 修改交易历史记录
     */
    @RequiresPermissions("CustomerInformation:transactionhistory:edit")
    @GetMapping("/edit/{transactionId}")
    public String edit(@PathVariable("transactionId") Long transactionId, ModelMap mmap)
    {
        CustomerinformationTransactionhistory customerinformationTransactionhistory = customerinformationTransactionhistoryService.selectCustomerinformationTransactionhistoryByTransactionId(transactionId);
        mmap.put("customerinformationTransactionhistory", customerinformationTransactionhistory);
        return prefix + "/edit";
    }

    /**
     * 修改保存交易历史记录
     */
    @RequiresPermissions("CustomerInformation:transactionhistory:edit")
    @Log(title = "交易历史记录", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(CustomerinformationTransactionhistory customerinformationTransactionhistory)
    {
        return toAjax(customerinformationTransactionhistoryService.updateCustomerinformationTransactionhistory(customerinformationTransactionhistory));
    }

    /**
     * 删除交易历史记录
     */
    @RequiresPermissions("CustomerInformation:transactionhistory:remove")
    @Log(title = "交易历史记录", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(customerinformationTransactionhistoryService.deleteCustomerinformationTransactionhistoryByTransactionIds(ids));
    }
}
