package com.xiaoshu.entity;

import java.io.Serializable;
import javax.persistence.*;

@Table(name = "s_school")
public class School implements Serializable {
    @Id
    @Column(name = "school_id")
    private Integer schoolId;

    @Column(name = "school_name")
    private String schoolName;

    private static final long serialVersionUID = 1L;

    /**
     * @return school_id
     */
    public Integer getSchoolId() {
        return schoolId;
    }

    /**
     * @param schoolId
     */
    public void setSchoolId(Integer schoolId) {
        this.schoolId = schoolId;
    }

    /**
     * @return school_name
     */
    public String getSchoolName() {
        return schoolName;
    }

    /**
     * @param schoolName
     */
    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName == null ? null : schoolName.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", schoolId=").append(schoolId);
        sb.append(", schoolName=").append(schoolName);
        sb.append("]");
        return sb.toString();
    }
}