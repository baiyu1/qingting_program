package com.fxft.qingtingSDK.bean.mediacenterlist;

import java.util.List;

public class Radiostations {
    private List<Mediacenters> mediacentersList;
    private String preference_change_cost;
    private String name;
    private String partition_by;

    public List<Mediacenters> getMediacentersList() {
        return mediacentersList;
    }

    public void setMediacentersList(List<Mediacenters> mediacentersList) {
        this.mediacentersList = mediacentersList;
    }

    public String getPreference_change_cost() {
        return preference_change_cost;
    }

    public void setPreference_change_cost(String preference_change_cost) {
        this.preference_change_cost = preference_change_cost;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPartition_by() {
        return partition_by;
    }

    public void setPartition_by(String partition_by) {
        this.partition_by = partition_by;
    }
}
