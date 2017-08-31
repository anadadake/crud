package com.anadadake.crud.common.entity;

import javax.persistence.*;

@Entity
@Table(name = "t_role_func")
public class RoleFuncEntity {
    private int id;
    private String roleCode;
    private String funcCode;

    @Id
    @Column(name = "ID", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "ROLE_CODE", nullable = false, length = 15)
    public String getRoleCode() {
        return roleCode;
    }

    public void setRoleCode(String roleCode) {
        this.roleCode = roleCode;
    }

    @Basic
    @Column(name = "FUNC_CODE", nullable = false, length = 15)
    public String getFuncCode() {
        return funcCode;
    }

    public void setFuncCode(String funcCode) {
        this.funcCode = funcCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RoleFuncEntity that = (RoleFuncEntity) o;

        if (id != that.id) return false;
        if (roleCode != null ? !roleCode.equals(that.roleCode) : that.roleCode != null) return false;
        if (funcCode != null ? !funcCode.equals(that.funcCode) : that.funcCode != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (roleCode != null ? roleCode.hashCode() : 0);
        result = 31 * result + (funcCode != null ? funcCode.hashCode() : 0);
        return result;
    }
}
