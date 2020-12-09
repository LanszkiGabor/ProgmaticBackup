package _1020_Bevásárlókocsi;

import java.math.BigDecimal;

public class _1020_BevasarloKocsiProduct {

    private String productName;
    private BigDecimal price;
    private Integer pcs;
    public _1020_BevasarloKocsiProduct(String productName, BigDecimal price, Integer pcs) {
        this.productName = productName;
        this.price = price;
        this.pcs = pcs;
    }
    public String getProductName() {
        return productName;
    }
    public BigDecimal getPrice() {
        return price;
    }
    public Integer getPcs() {
        return pcs;
    }

}
