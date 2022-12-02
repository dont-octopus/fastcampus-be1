package me.day21.collection.use.gift;

import java.util.Objects;

public abstract class Item {

    protected String productNo;
    protected String companyName;
    public Item() {
    }

    public Item(String productNo, String companyName) {
        this.productNo = productNo;
        this.companyName = companyName;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Item item = (Item) o;
        return Objects.equals(productNo, item.productNo) && Objects.equals(companyName, item.companyName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productNo, companyName);
    }

    @Override
    public String toString() {
        return "Item{" +
                "productNo='" + productNo + '\'' +
                ", companyName='" + companyName + '\'' +
                '}';
    }
}
