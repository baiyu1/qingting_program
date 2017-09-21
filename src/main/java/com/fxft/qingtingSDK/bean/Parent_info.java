package com.fxft.qingtingSDK.bean;

/**
 * 分类 父类信息
 */
public class Parent_info {
    private int parent_id;
    private String parent_name;
    private String parent_type;
    private Parent_extra parent_extra;

    public int getParent_id() {
        return parent_id;
    }

    public void setParent_id(int parent_id) {
        this.parent_id = parent_id;
    }

    public String getParent_name() {
        return parent_name;
    }

    public void setParent_name(String parent_name) {
        this.parent_name = parent_name;
    }

    public String getParent_type() {
        return parent_type;
    }

    public void setParent_type(String parent_type) {
        this.parent_type = parent_type;
    }

    public Parent_extra getParent_extra() {
        return parent_extra;
    }

    public void setParent_extra(Parent_extra parent_extra) {
        this.parent_extra = parent_extra;
    }

    static class Parent_extra {
        private int category_id;
        private String tag;

        public int getCategory_id() {
            return category_id;
        }

        public void setCategory_id(int category_id) {
            this.category_id = category_id;
        }

        public String getTag() {
            return tag;
        }

        public void setTag(String tag) {
            this.tag = tag;
        }
    }
}
