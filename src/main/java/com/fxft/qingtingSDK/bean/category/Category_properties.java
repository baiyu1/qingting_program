package com.fxft.qingtingSDK.bean.category;



import com.fxft.qingtingSDK.bean.BaseResult;

import java.util.List;

/**
 * 分类属性
 */
public class Category_properties extends BaseResult {
    private List<Data> data;

    public List<Data> getData() {
        return data;
    }

    public void setData(List<Data> data) {
        this.data = data;
    }

    /**
     * 属性
     */
    static class Values {
        private int id;
        private String name;
        // 属性序号
        private String sequence;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getSequence() {
            return sequence;
        }

        public void setSequence(String sequence) {
            this.sequence = sequence;
        }
    }

    /**
     * 属性种类
     */
    static class Data {
        private int id;
        private String name;
        private List<Values> values;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public List<Values> getValues() {
            return values;
        }

        public void setValues(List<Values> values) {
            this.values = values;
        }
    }
}
