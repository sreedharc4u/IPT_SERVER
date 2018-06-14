
package com.fuso.enterprise.ipt.srv.server.model.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

@Embeddable
public class ShikeishoPartEmbedded implements Serializable {

    private static final long serialVersionUID = 6240921362647414653L;

    @Fetch(FetchMode.SELECT)
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "shikeisho_no")
    private Shikeisho shikeisho;

    @Column(name = "part_no")
    private String partNo;

    public Shikeisho getShikeisho() {
        return shikeisho;
    }

    public void setShikeisho(Shikeisho shikeisho) {
        this.shikeisho = shikeisho;
    }

    public String getPartNo() {
        return partNo;
    }

    public void setPartNo(String partNo) {
        this.partNo = partNo;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((partNo == null) ? 0 : partNo.hashCode());
        result = prime * result + ((shikeisho == null) ? 0 : shikeisho.getShikeishoNo().hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        ShikeishoPartEmbedded other = (ShikeishoPartEmbedded) obj;
        if (partNo == null) {
            if (other.partNo != null)
                return false;
        } else if (!partNo.equals(other.partNo))
            return false;
        if (shikeisho == null) {
            if (other.shikeisho != null)
                return false;
        } else if (!shikeisho.getShikeishoNo().equals(other.shikeisho.getShikeishoNo()))
            return false;
        return true;
    }

}
