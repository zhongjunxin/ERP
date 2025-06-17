package com.ruoyi.Commoditylnformation.mapper;

import java.util.List;
import java.util.Map;
import com.ruoyi.Commoditylnformation.domain.CommoditylnformationManage;

public interface CommoditylnformationManageMapper
{
    CommoditylnformationManage selectCommoditylnformationManageByProductNumber(String productNumber);
    List<CommoditylnformationManage> selectCommoditylnformationManageList(CommoditylnformationManage commoditylnformationManage);
    int insertCommoditylnformationManage(CommoditylnformationManage commoditylnformationManage);
    int updateCommoditylnformationManage(CommoditylnformationManage commoditylnformationManage);
    int updateStatus(CommoditylnformationManage commoditylnformationManage);
    int deleteCommoditylnformationManageByProductNumber(String productNumber);
    int deleteCommoditylnformationManageByProductNumbers(String[] productNumbers);

    // 添加新方法
    List<Map<String, Object>> selectAllCategories();
    List<Map<String, Object>> selectAllBrands();
    List<Map<String, Object>> selectAllUnits();
}