package me.day21.collection.map.treemap.value;

import java.util.Objects;

public class Pen {
    protected String productNo;
    protected String companyName;
    protected String inkColor;

    public Pen() {
    }

    public Pen(String productNo) {
        this.productNo = productNo;
    }

    public Pen(String productNo, String companyName, String inkColor) {
        this.productNo = productNo;
        this.companyName = companyName;
        this.inkColor = inkColor;
    }

    public String getProductNo() {
        return productNo;
    }

    public void setProductNo(String productNo) {
        this.productNo = productNo;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getInkColor() {
        return inkColor;
    }

    public void setInkColor(String inkColor) {
        this.inkColor = inkColor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pen pen = (Pen) o;
        return Objects.equals(productNo, pen.productNo) && Objects.equals(companyName, pen.companyName) && Objects.equals(inkColor, pen.inkColor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productNo, companyName, inkColor);
    }

    @Override
    public String toString() {
        return "Pen{" +
                "productNo='" + productNo + '\'' +
                ", companyName='" + companyName + '\'' +
                ", inkColor='" + inkColor + '\'' +
                '}';
    }
}
