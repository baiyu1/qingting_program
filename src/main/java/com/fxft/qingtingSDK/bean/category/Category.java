package com.fxft.qingtingSDK.bean.category;

/**
 * 分类信息
 */
public class Category {
    //    分类id
    private int id;
    //    分类名字
    private String name;
    //    分类优先级序号
    private int sequence;
    //    推荐内容的section id
    private int section_id;
    //    数据类型
    private String type;

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

    public int getSequence() {
        return sequence;
    }

    public void setSequence(int sequence) {
        this.sequence = sequence;
    }

    public int getSection_id() {
        return section_id;
    }

    public void setSection_id(int section_id) {
        this.section_id = section_id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
