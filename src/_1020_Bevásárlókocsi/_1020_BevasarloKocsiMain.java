package _1020_Bevásárlókocsi;
import java.math.BigDecimal;
import java.util.List;

public class _1020_BevasarloKocsiMain {

    public static void main(String[] args) {
//Bevásárlókosár
//Írjuk meg egy webshop bevásárlókosarát. A bevásárlókosárban termékek vannak. Minden terméknek van neve, ára, és darabszáma.
// A bevásárlókosárhoz hozzáadhatunk termékeket, megkérdezhetjük, hogy milyen termékek vannak a kosárban (ilyenkor egy String listát kapunk vissza,
// a lista egyes elemeit: termék név, darabszám, ár), és hogy mennyi a kosárban lévő termékek összesített ára. Írjunk a fenti műveletekhez Java metódusokat!
//Használjuk a Java ArrayList osztályát a bevásárlókosár megvalósításához!
        _1020_BevasarloKocsiBasketClass basket = new _1020_BevasarloKocsiBasketClass();
        _1020_BevasarloKocsiProduct fender = new _1020_BevasarloKocsiProduct("Fender Stratocaster - gitár",new BigDecimal(125_000),1);
        _1020_BevasarloKocsiProduct ibanez = new _1020_BevasarloKocsiProduct("Ibanez Blue Burst - gitár",new BigDecimal(251_000),1);
        _1020_BevasarloKocsiProduct hohner = new _1020_BevasarloKocsiProduct("Hohner Pro - szájharmónika",new BigDecimal(12_000),3);
        basket.addProduct(fender);
        basket.addProduct(ibanez);
        basket.addProduct(hohner);
        List<String> productList = basket.getProductList();
        for (String prodDescr : productList) {
            System.out.println(prodDescr);
        }
        /*
        int[] numbers = {1, 3, 5, 7, 9};
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
        for (int num: numbers) { // for each
            System.out.println(num);
        }
        */
    }

}
