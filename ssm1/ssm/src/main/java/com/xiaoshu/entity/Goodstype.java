package com.xiaoshu.entity;

import java.io.Serializable;
import javax.persistence.*;

public class Goodstype implements Serializable {
    @Id
    private Integer typeid;

    private String typename;

    private static final long serialVersionUID = 1L;

    /**
     * @return typeid
     */
    public Integer getTypeid() {
        return typeid;
    }

    /**
     * @param typeid
     */
    public void setTypeid(Integer typeid) {
        this.typeid = typeid;
    }

    /**
     * @return typename
     */
    public String getTypename() {
        return typename;
    }

    /**
     * @param typename
     */
    public void setTypename(String typename) {
        this.typename = typename == null ? null : typename.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", typeid=").append(typeid);
        sb.append(", typename=").append(typename);
        sb.append("]");
        return sb.toString();
    }
}