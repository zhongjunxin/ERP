package com.ruoyi.Commoditylnformation.service.impl;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Random;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import com.ruoyi.Commoditylnformation.mapper.CommoditylnformationManageMapper;
import com.ruoyi.Commoditylnformation.domain.CommoditylnformationManage;
import com.ruoyi.Commoditylnformation.service.ICommoditylnformationManageService;
import com.ruoyi.common.core.text.Convert;

@Service
public class CommoditylnformationManageServiceImpl implements ICommoditylnformationManageService
{
    @Autowired
    private CommoditylnformationManageMapper commoditylnformationManageMapper;

    @Override
    public CommoditylnformationManage selectCommoditylnformationManageByProductNumber(String productNumber)
    {
        return commoditylnformationManageMapper.selectCommoditylnformationManageByProductNumber(productNumber);
    }

    @Override
    public List<CommoditylnformationManage> selectCommoditylnformationManageList(CommoditylnformationManage commoditylnformationManage)
    {
        return commoditylnformationManageMapper.selectCommoditylnformationManageList(commoditylnformationManage);
    }

    // CommoditylnformationManageServiceImpl.java
    @Override
    public int insertCommoditylnformationManage(CommoditylnformationManage commoditylnformationManage) {
        try {
            // 生成商品编号
            String productNumber = "P" + System.currentTimeMillis() + new Random().nextInt(1000);
            commoditylnformationManage.setProductNumber(productNumber);
            commoditylnformationManage.setStatus("0");

            // 验证图片路径长度
            if(commoditylnformationManage.getProductImage() != null &&
                    commoditylnformationManage.getProductImage().length() > 255) {
                throw new RuntimeException("图片路径过长");
            }

            // 设置操作信息
            String username = getCurrentUsername();
            Date now = new Date();
            commoditylnformationManage.setCreateBy(username);
            commoditylnformationManage.setCreateTime(now);
            commoditylnformationManage.setUpdateBy(username);
            commoditylnformationManage.setUpdateTime(now);

            return commoditylnformationManageMapper.insertCommoditylnformationManage(commoditylnformationManage);
        } catch (DataIntegrityViolationException e) {
            // 数据库约束异常
            throw new RuntimeException("数据保存失败: " + e.getMostSpecificCause().getMessage());
        }
    }

    @Override
    public int updateCommoditylnformationManage(CommoditylnformationManage commoditylnformationManage)
    {
        // 设置更新人和更新时间
        commoditylnformationManage.setUpdateBy(getCurrentUsername());
        commoditylnformationManage.setUpdateTime(new Date());

        return commoditylnformationManageMapper.updateCommoditylnformationManage(commoditylnformationManage);
    }

    @Override
    public int updateStatus(CommoditylnformationManage commoditylnformationManage)
    {
        // 设置更新人和更新时间
        commoditylnformationManage.setUpdateBy(getCurrentUsername());
        commoditylnformationManage.setUpdateTime(new Date());

        return commoditylnformationManageMapper.updateStatus(commoditylnformationManage);
    }

    @Override
    public int deleteCommoditylnformationManageByProductNumbers(String productNumbers)
    {
        return commoditylnformationManageMapper.deleteCommoditylnformationManageByProductNumbers(Convert.toStrArray(productNumbers));
    }

    @Override
    public int deleteCommoditylnformationManageByProductNumber(String productNumber)
    {
        return commoditylnformationManageMapper.deleteCommoditylnformationManageByProductNumber(productNumber);
    }

    @Override
    public List<Map<String, Object>> selectAllCategories() {
        return commoditylnformationManageMapper.selectAllCategories();
    }

    @Override
    public List<Map<String, Object>> selectAllBrands() {
        return commoditylnformationManageMapper.selectAllBrands();
    }

    @Override
    public List<Map<String, Object>> selectAllUnits() {
        return commoditylnformationManageMapper.selectAllUnits();
    }

    private String getCurrentUsername() {
        try {
            HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
            Object user = request.getSession().getAttribute("user");
            if (user != null) {
                return user.toString(); // 根据实际情况获取用户名
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "system";
    }
}