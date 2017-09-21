package com.fxft.qingtingSDK.bean.category;


import com.fxft.qingtingSDK.bean.BaseResult;

import java.util.List;

/**
 * 分类属性集合
 */
public class CategoryData extends BaseResult {
    private List<Category> categories;

    public List<Category> getCategories() {
        return categories;
    }

    public void setCategories(List<Category> categories) {
        this.categories = categories;
    }
}
