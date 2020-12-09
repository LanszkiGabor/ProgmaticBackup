package _1020_Bevásárlókocsi;

import java.math.BigDecimal;
import java.util.ArrayList;

public class _1020_BevasarloKocsiBasketClass {

    ArrayList<_1020_BevasarloKocsiProduct> products = new ArrayList<_1020_BevasarloKocsiProduct>();
    public void addProduct(_1020_BevasarloKocsiProduct prod1) {
        products.add(prod1);
    }
    public BigDecimal sumPrice() {
        BigDecimal sum = new BigDecimal(0);
        for (int i = 0; i < products.size(); i++) {
            BigDecimal price = products.get(i).getPrice();
            BigDecimal subTotal = price.multiply(new BigDecimal(products.get(i).getPcs()));
            sum = sum.add(subTotal);
        }
        return sum;
    }
    public ArrayList<String> getProductList() {
        ArrayList<String> list = new ArrayList<>();
        for (_1020_BevasarloKocsiProduct p : products) {
            list.add(p.getProductName() + " - " + p.getPcs() + " - " + p.getPrice());
        }
        return list;
    }
}

