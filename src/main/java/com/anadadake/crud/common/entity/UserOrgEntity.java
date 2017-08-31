package com.anadadake.crud.common.entity;

import javax.persistence.*;

@Entity
@Table(name = "t_user_org")
public class UserOrgEntity {
    private int id;
    private String userNo;
    private String orgCode;

    @Id
    @Column(name = "ID", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "USER_NO", nullable = false, length = 15)
    public String getUserNo() {
        return userNo;
    }

    public void setUserNo(String userNo) {
        this.userNo = userNo;
    }

    @Basic
    @Column(name = "ORG_CODE", nullable = false, length = 15)
    public String getOrgCode() {
        return orgCode;
    }

    public void setOrgCode(String orgCode) {
        this.orgCode = orgCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UserOrgEntity that = (UserOrgEntity) o;

        if (id != that.id) return false;
        if (userNo != null ? !userNo.equals(that.userNo) : that.userNo != null) return false;
        if (orgCode != null ? !orgCode.equals(that.orgCode) : that.orgCode != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (userNo != null ? userNo.hashCode() : 0);
        result = 31 * result + (orgCode != null ? orgCode.hashCode() : 0);
        return result;
    }
}
