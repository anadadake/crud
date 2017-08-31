package com.anadadake.crud.common.entity;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "t_organization")
public class OrganizationEntity {
    private int id;
    private String orgCode;
    private byte isDeleted;
    private String orgName;
    private String orgDesc;
    private String parentOrgCode;
    private byte orgSequence;
    private String orgTypeCode;
    private String createUser;
    private Timestamp createTime;
    private String updateUser;
    private Timestamp updateTime;

    @Id
    @Column(name = "ID", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "ORG_CODE", nullable = false, length = 15)
    public String getOrgCode() {
        return orgCode;
    }

    public void setOrgCode(String orgCode) {
        this.orgCode = orgCode;
    }

    @Basic
    @Column(name = "IS_DELETED", nullable = false)
    public byte getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(byte isDeleted) {
        this.isDeleted = isDeleted;
    }

    @Basic
    @Column(name = "ORG_NAME", nullable = false, length = 75)
    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }

    @Basic
    @Column(name = "ORG_DESC", nullable = true, length = -1)
    public String getOrgDesc() {
        return orgDesc;
    }

    public void setOrgDesc(String orgDesc) {
        this.orgDesc = orgDesc;
    }

    @Basic
    @Column(name = "PARENT_ORG_CODE", nullable = true, length = 15)
    public String getParentOrgCode() {
        return parentOrgCode;
    }

    public void setParentOrgCode(String parentOrgCode) {
        this.parentOrgCode = parentOrgCode;
    }

    @Basic
    @Column(name = "ORG_SEQUENCE", nullable = false)
    public byte getOrgSequence() {
        return orgSequence;
    }

    public void setOrgSequence(byte orgSequence) {
        this.orgSequence = orgSequence;
    }

    @Basic
    @Column(name = "ORG_TYPE_CODE", nullable = true, length = 45)
    public String getOrgTypeCode() {
        return orgTypeCode;
    }

    public void setOrgTypeCode(String orgTypeCode) {
        this.orgTypeCode = orgTypeCode;
    }

    @Basic
    @Column(name = "CREATE_USER", nullable = false, length = 15)
    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    @Basic
    @Column(name = "CREATE_TIME", nullable = false)
    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    @Basic
    @Column(name = "UPDATE_USER", nullable = false, length = 15)
    public String getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser;
    }

    @Basic
    @Column(name = "UPDATE_TIME", nullable = false)
    public Timestamp getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        OrganizationEntity that = (OrganizationEntity) o;

        if (id != that.id) return false;
        if (isDeleted != that.isDeleted) return false;
        if (orgSequence != that.orgSequence) return false;
        if (orgCode != null ? !orgCode.equals(that.orgCode) : that.orgCode != null) return false;
        if (orgName != null ? !orgName.equals(that.orgName) : that.orgName != null) return false;
        if (orgDesc != null ? !orgDesc.equals(that.orgDesc) : that.orgDesc != null) return false;
        if (parentOrgCode != null ? !parentOrgCode.equals(that.parentOrgCode) : that.parentOrgCode != null)
            return false;
        if (orgTypeCode != null ? !orgTypeCode.equals(that.orgTypeCode) : that.orgTypeCode != null) return false;
        if (createUser != null ? !createUser.equals(that.createUser) : that.createUser != null) return false;
        if (createTime != null ? !createTime.equals(that.createTime) : that.createTime != null) return false;
        if (updateUser != null ? !updateUser.equals(that.updateUser) : that.updateUser != null) return false;
        if (updateTime != null ? !updateTime.equals(that.updateTime) : that.updateTime != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (orgCode != null ? orgCode.hashCode() : 0);
        result = 31 * result + (int) isDeleted;
        result = 31 * result + (orgName != null ? orgName.hashCode() : 0);
        result = 31 * result + (orgDesc != null ? orgDesc.hashCode() : 0);
        result = 31 * result + (parentOrgCode != null ? parentOrgCode.hashCode() : 0);
        result = 31 * result + (int) orgSequence;
        result = 31 * result + (orgTypeCode != null ? orgTypeCode.hashCode() : 0);
        result = 31 * result + (createUser != null ? createUser.hashCode() : 0);
        result = 31 * result + (createTime != null ? createTime.hashCode() : 0);
        result = 31 * result + (updateUser != null ? updateUser.hashCode() : 0);
        result = 31 * result + (updateTime != null ? updateTime.hashCode() : 0);
        return result;
    }
}
