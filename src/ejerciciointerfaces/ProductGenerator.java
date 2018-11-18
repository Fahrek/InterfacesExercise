package ejerciciointerfaces;

import java.util.ArrayList;
import java.util.Random;

public class ProductGenerator {

    public static ArrayList<Product> madeProducts(int n) {
        Random r = new Random();
        ArrayList<Product> lprod = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            Product p = new Product();
            p.setId(Integer.toString((int) (Math.random() * 1000000)));
            p.setValue(r.nextDouble() * 1000);
            lprod.add(p);
        }
        return lprod;
    }
}
