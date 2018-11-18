package ejerciciointerfaces;

import java.util.ArrayList;
import java.util.Iterator;

public class InterfacesExercise {

    public static void main(String[] args) {
        Product p1 = new Product();
        ArrayList<Product> lprod = ProductGenerator.madeProducts(10);
        Iterator<Product> it = lprod.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (i == 5) {
                it.remove();
            } else {
                it.next().print();
                System.out.println("Posición: " + i + "\n");
            }
            i++;
        }

//        for (Product lprod1 : lprod) {
//            lprod1.print();
//        }
//        for (int i = 0; i < lprod.size(); i++) {
//            lprod.get(i).print();
//        }
    }

}
