package com.anadadake.crud.common.entity;

import javax.persistence.*;

@Entity
@Table(name = "t_user_info")
public class UserInfoEntity {
//    private int id;
    private String userNo;
    private String userNameCn;
    private String userNameEn;
    private String gender;

/*    @Id
    @Column(name = "ID", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }*/

    @Id
    @Column(name = "USER_NO", nullable = false, length = 15)
    public String getUserNo() {
        return userNo;
    }

    public void setUserNo(String userNo) {
        this.userNo = userNo;
    }

    @Basic
    @Column(name = "USER_NAME_CN", nullable = true, length = 45)
    public String getUserNameCn() {
        return userNameCn;
    }

    public void setUserNameCn(String userNameCn) {
        this.userNameCn = userNameCn;
    }

    @Basic
    @Column(name = "USER_NAME_EN", nullable = true, length = 45)
    public String getUserNameEn() {
        return userNameEn;
    }

    public void setUserNameEn(String userNameEn) {
        this.userNameEn = userNameEn;
    }

    @Basic
    @Column(name = "GENDER", nullable = true, length = 15)
    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UserInfoEntity that = (UserInfoEntity) o;

        if (!userNo.equals(that.userNo)) return false;
        if (userNo != null ? !userNo.equals(that.userNo) : that.userNo != null) return false;
        if (userNameCn != null ? !userNameCn.equals(that.userNameCn) : that.userNameCn != null) return false;
        if (userNameEn != null ? !userNameEn.equals(that.userNameEn) : that.userNameEn != null) return false;
        if (gender != null ? !gender.equals(that.gender) : that.gender != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (userNo != null ? userNo.hashCode() : 0);
        result = 31 * result + (userNameCn != null ? userNameCn.hashCode() : 0);
        result = 31 * result + (userNameEn != null ? userNameEn.hashCode() : 0);
        result = 31 * result + (gender != null ? gender.hashCode() : 0);
        return result;
    }
}
