package com.cs.pojo;

public class Groups {
    private Integer groupsno;

    private Integer comid;

    private String groupsname;

    private Integer teacherno;

    private Integer status;

    public Integer getGroupsno() {
        return groupsno;
    }

    public void setGroupsno(Integer groupsno) {
        this.groupsno = groupsno;
    }

    public Integer getComid() {
        return comid;
    }

    public void setComid(Integer comid) {
        this.comid = comid;
    }

    public String getGroupsname() {
        return groupsname;
    }

    public void setGroupsname(String groupsname) {
        this.groupsname = groupsname == null ? null : groupsname.trim();
    }

    public Integer getTeacherno() {
        return teacherno;
    }

    public void setTeacherno(Integer teacherno) {
        this.teacherno = teacherno;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}