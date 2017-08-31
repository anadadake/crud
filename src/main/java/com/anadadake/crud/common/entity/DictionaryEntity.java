package com.anadadake.crud.common.entity;

import javax.persistence.*;

@Entity
@Table(name = "t_dictionary")
public class DictionaryEntity {
    private int id;
    private String dictCode;
    private String dictName;
    private String parentCode;
    private byte dictSequence;

    @Id
    @Column(name = "ID", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "DICT_CODE", nullable = false, length = 15)
    public String getDictCode() {
        return dictCode;
    }

    public void setDictCode(String dictCode) {
        this.dictCode = dictCode;
    }

    @Basic
    @Column(name = "DICT_NAME", nullable = false, length = 45)
    public String getDictName() {
        return dictName;
    }

    public void setDictName(String dictName) {
        this.dictName = dictName;
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
    @Column(name = "DICT_SEQUENCE", nullable = false)
    public byte getDictSequence() {
        return dictSequence;
    }

    public void setDictSequence(byte dictSequence) {
        this.dictSequence = dictSequence;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DictionaryEntity that = (DictionaryEntity) o;

        if (id != that.id) return false;
        if (dictSequence != that.dictSequence) return false;
        if (dictCode != null ? !dictCode.equals(that.dictCode) : that.dictCode != null) return false;
        if (dictName != null ? !dictName.equals(that.dictName) : that.dictName != null) return false;
        if (parentCode != null ? !parentCode.equals(that.parentCode) : that.parentCode != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (dictCode != null ? dictCode.hashCode() : 0);
        result = 31 * result + (dictName != null ? dictName.hashCode() : 0);
        result = 31 * result + (parentCode != null ? parentCode.hashCode() : 0);
        result = 31 * result + (int) dictSequence;
        return result;
    }
}
