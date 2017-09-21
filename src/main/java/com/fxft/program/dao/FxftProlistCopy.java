package com.fxft.program.dao;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "fxft_prolist_copy", schema = "gd_test")
public class FxftProlistCopy {
//    节目id
    private int id;
//    节目名称
    private String programname;
//    主持人
    private String host;
//    备用节目主持人
    private String rphost;
//    备注
    private String comment;
//    电台名称
    private String channelName;
//    开始时间
    private Timestamp intime;
//    结束时间
    private Timestamp outtime;
//    创建时间
    private Timestamp creattime;
    private String channelId;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "programname")
    public String getProgramname() {
        return programname;
    }

    public void setProgramname(String programname) {
        this.programname = programname;
    }

    @Basic
    @Column(name = "host")
    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    @Basic
    @Column(name = "rphost")
    public String getRphost() {
        return rphost;
    }

    public void setRphost(String rphost) {
        this.rphost = rphost;
    }

    @Basic
    @Column(name = "comment")
    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    @Basic
    @Column(name = "channel_name")
    public String getChannelName() {
        return channelName;
    }

    public void setChannelName(String channelName) {
        this.channelName = channelName;
    }

    @Basic
    @Column(name = "intime")
    public Timestamp getIntime() {
        return intime;
    }

    public void setIntime(Timestamp intime) {
        this.intime = intime;
    }

    @Basic
    @Column(name = "outtime")
    public Timestamp getOuttime() {
        return outtime;
    }

    public void setOuttime(Timestamp outtime) {
        this.outtime = outtime;
    }

    @Basic
    @Column(name = "creattime")
    public Timestamp getCreattime() {
        return creattime;
    }

    public void setCreattime(Timestamp creattime) {
        this.creattime = creattime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        FxftProlistCopy that = (FxftProlistCopy) o;

        if (id != that.id) return false;
        if (programname != null ? !programname.equals(that.programname) : that.programname != null) return false;
        if (host != null ? !host.equals(that.host) : that.host != null) return false;
        if (rphost != null ? !rphost.equals(that.rphost) : that.rphost != null) return false;
        if (comment != null ? !comment.equals(that.comment) : that.comment != null) return false;
        if (channelName != null ? !channelName.equals(that.channelName) : that.channelName != null) return false;
        if (intime != null ? !intime.equals(that.intime) : that.intime != null) return false;
        if (outtime != null ? !outtime.equals(that.outtime) : that.outtime != null) return false;
        if (creattime != null ? !creattime.equals(that.creattime) : that.creattime != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (programname != null ? programname.hashCode() : 0);
        result = 31 * result + (host != null ? host.hashCode() : 0);
        result = 31 * result + (rphost != null ? rphost.hashCode() : 0);
        result = 31 * result + (comment != null ? comment.hashCode() : 0);
        result = 31 * result + (channelName != null ? channelName.hashCode() : 0);
        result = 31 * result + (intime != null ? intime.hashCode() : 0);
        result = 31 * result + (outtime != null ? outtime.hashCode() : 0);
        result = 31 * result + (creattime != null ? creattime.hashCode() : 0);
        return result;
    }

    @Basic
    @Column(name = "channel_id")
    public String getChannelId() {
        return channelId;
    }

    public void setChannelId(String channelId) {
        this.channelId = channelId;
    }
}
