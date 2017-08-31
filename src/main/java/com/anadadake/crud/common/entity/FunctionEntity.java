package com.anadadake.crud.common.entity;

import javax.persistence.*;

@Entity
@Table(name = "t_function")
public class FunctionEntity {
    private int id;
    private String funcCode;
    private String funcName;
    private String parentCode;
    private byte funcLevel;
    private byte funcSequence;
    private String funcUrl;
    private byte isActive;
    private byte isShowInMenu;
    private String icon;
    private Byte isMobile;

    @Id
    @Column(name = "ID", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "FUNC_CODE", nullable = false, length = 15)
    public String getFuncCode() {
        return funcCode;
    }

    public void setFuncCode(String funcCode) {
        this.funcCode = funcCode;
    }

    @Basic
    @Column(name = "FUNC_NAME", nullable = false, length = 45)
    public String getFuncName() {
        return funcName;
    }

    public void setFuncName(String funcName) {
        this.funcName = funcName;
    }

    @Basic
    @Column(name = "PARENT_CODE", nullable = true, length = 15)
    public String getParentCode() {
        return parentCode;
    }

    public void setParentCode(String parentCode) {
        this.parentCode = parentCode;
    }

    @Basic
    @Column(name = "FUNC_LEVEL", nullable = false)
    public byte getFuncLevel() {
        return funcLevel;
    }

    public void setFuncLevel(byte funcLevel) {
        this.funcLevel = funcLevel;
    }

    @Basic
    @Column(name = "FUNC_SEQUENCE", nullable = false)
    public byte getFuncSequence() {
        return funcSequence;
    }

    public void setFuncSequence(byte funcSequence) {
        this.funcSequence = funcSequence;
    }

    @Basic
    @Column(name = "FUNC_URL", nullable = true, length = -1)
    public String getFuncUrl() {
        return funcUrl;
    }

    public void setFuncUrl(String funcUrl) {
        this.funcUrl = funcUrl;
    }

    @Basic
    @Column(name = "IS_ACTIVE", nullable = false)
    public byte getIsActive() {
        return isActive;
    }

    public void setIsActive(byte isActive) {
        this.isActive = isActive;
    }

    @Basic
    @Column(name = "IS_SHOW_IN_MENU", nullable = false)
    public byte getIsShowInMenu() {
        return isShowInMenu;
    }

    public void setIsShowInMenu(byte isShowInMenu) {
        this.isShowInMenu = isShowInMenu;
    }

    @Basic
    @Column(name = "ICON", nullable = true, length = -1)
    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    @Basic
    @Column(name = "IS_MOBILE", nullable = true)
    public Byte getIsMobile() {
        return isMobile;
    }

    public void setIsMobile(Byte isMobile) {
        this.isMobile = isMobile;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        FunctionEntity that = (FunctionEntity) o;

        if (id != that.id) return false;
        if (funcLevel != that.funcLevel) return false;
        if (funcSequence != that.funcSequence) return false;
        if (isActive != that.isActive) return false;
        if (isShowInMenu != that.isShowInMenu) return false;
        if (funcCode != null ? !funcCode.equals(that.funcCode) : that.funcCode != null) return false;
        if (funcName != null ? !funcName.equals(that.funcName) : that.funcName != null) return false;
        if (parentCode != null ? !parentCode.equals(that.parentCode) : that.parentCode != null) return false;
        if (funcUrl != null ? !funcUrl.equals(that.funcUrl) : that.funcUrl != null) return false;
        if (icon != null ? !icon.equals(that.icon) : that.icon != null) return false;
        if (isMobile != null ? !isMobile.equals(that.isMobile) : that.isMobile != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (funcCode != null ? funcCode.hashCode() : 0);
        result = 31 * result + (funcName != null ? funcName.hashCode() : 0);
        result = 31 * result + (parentCode != null ? parentCode.hashCode() : 0);
        result = 31 * result + (int) funcLevel;
        result = 31 * result + (int) funcSequence;
        result = 31 * result + (funcUrl != null ? funcUrl.hashCode() : 0);
        result = 31 * result + (int) isActive;
        result = 31 * result + (int) isShowInMenu;
        result = 31 * result + (icon != null ? icon.hashCode() : 0);
        result = 31 * result + (isMobile != null ? isMobile.hashCode() : 0);
        return result;
    }
}
