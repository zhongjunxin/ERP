package com.ruoyi.Commoditylnformation.controller;

import java.io.File;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import java.util.UUID;

import com.ruoyi.common.config.RuoYiConfig;
import com.ruoyi.common.utils.file.FileUploadUtils;
import org.apache.commons.io.FileUtils;
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
import org.springframework.web.multipart.MultipartFile;

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

    @RequiresPermissions("Commoditylnformation:manage:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(CommoditylnformationManage commoditylnformationManage)
    {
        startPage();
        List<CommoditylnformationManage> list = commoditylnformationManageService.selectCommoditylnformationManageList(commoditylnformationManage);
        return getDataTable(list);
    }

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

    @RequiresPermissions("Commoditylnformation:manage:add")
    @GetMapping("/add")
    public String add(ModelMap mmap)
    {
        // 获取分类、品牌、单位数据
        mmap.put("categories", commoditylnformationManageService.selectAllCategories());
        mmap.put("brands", commoditylnformationManageService.selectAllBrands());
        mmap.put("units", commoditylnformationManageService.selectAllUnits());
        return prefix + "/add";
    }

    // CommoditylnformationManageController.java
    @Log(title = "商品管理", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(CommoditylnformationManage commoditylnformationManage) {
        try {
            return toAjax(commoditylnformationManageService.insertCommoditylnformationManage(commoditylnformationManage));
        } catch (Exception e) {
//            log.error("添加商品失败: {}", e.getMessage());
            return AjaxResult.error("操作失败: " + e.getMessage());
        }
    }

    @RequiresPermissions("Commoditylnformation:manage:edit")
    @GetMapping("/edit/{productNumber}")
    public String edit(@PathVariable("productNumber") String productNumber, ModelMap mmap)
    {
        CommoditylnformationManage commoditylnformationManage = commoditylnformationManageService.selectCommoditylnformationManageByProductNumber(productNumber);
        mmap.put("commoditylnformationManage", commoditylnformationManage);

        // 获取分类、品牌、单位数据
        mmap.put("categories", commoditylnformationManageService.selectAllCategories());
        mmap.put("brands", commoditylnformationManageService.selectAllBrands());
        mmap.put("units", commoditylnformationManageService.selectAllUnits());

        return prefix + "/edit";
    }

    @RequiresPermissions("Commoditylnformation:manage:edit")
    @Log(title = "商品管理", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(CommoditylnformationManage commoditylnformationManage)
    {
        return toAjax(commoditylnformationManageService.updateCommoditylnformationManage(commoditylnformationManage));
    }

    @RequiresPermissions("Commoditylnformation:manage:remove")
    @Log(title = "商品管理", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(commoditylnformationManageService.deleteCommoditylnformationManageByProductNumbers(ids));
    }

    @RequiresPermissions("Commoditylnformation:manage:edit")
    @Log(title = "商品管理", businessType = BusinessType.UPDATE)
    @PostMapping("/changeStatus")
    @ResponseBody
    public AjaxResult changeStatus(CommoditylnformationManage commoditylnformationManage)
    {
        return toAjax(commoditylnformationManageService.updateStatus(commoditylnformationManage));
    }

    // 在CommonController.java中添加
    // 替换原有uploadFile方法
    @PostMapping("/common/upload")
    @ResponseBody
    public AjaxResult uploadFile(MultipartFile file) {
        try {
            if (file.isEmpty()) {
                return AjaxResult.error("上传文件不能为空");
            }

            // 文件类型验证
            String fileName = file.getOriginalFilename();
            String suffix = fileName.substring(fileName.lastIndexOf("."));
            if (!Arrays.asList(".jpg", ".png", ".jpeg").contains(suffix.toLowerCase())) {
                return AjaxResult.error("只支持JPG/PNG格式");
            }

            // 使用RuoYi统一上传工具
            String uploadDir = RuoYiConfig.getUploadPath() + "/commodity";
            String filePath = FileUploadUtils.upload(uploadDir, file);

            // 返回相对路径
            return AjaxResult.success("上传成功", filePath);
        } catch (Exception e) {
            return AjaxResult.error("上传失败：" + e.getMessage());
        }
    }
}