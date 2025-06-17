package com.ruoyi.Commoditylnformation.service;

import java.util.List;
import java.util.Map;
import com.ruoyi.Commoditylnformation.domain.CommoditylnformationManage;

public interface ICommoditylnformationManageService
{
    CommoditylnformationManage selectCommoditylnformationManageByProductNumber(String productNumber);
    List<CommoditylnformationManage> selectCommoditylnformationManageList(CommoditylnformationManage commoditylnformationManage);
    int insertCommoditylnformationManage(CommoditylnformationManage commoditylnformationManage);
    int updateCommoditylnformationManage(CommoditylnformationManage commoditylnformationManage);
    int updateStatus(CommoditylnformationManage commoditylnformationManage);
    int deleteCommoditylnformationManageByProductNumbers(String productNumbers);
    int deleteCommoditylnformationManageByProductNumber(String productNumber);

    // 添加新方法
    List<Map<String, Object>> selectAllCategories();
    List<Map<String, Object>> selectAllBrands();
    List<Map<String, Object>> selectAllUnits();
}