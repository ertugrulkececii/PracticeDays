package Practice_Day07;

import java.util.ArrayList;
import java.util.Arrays;

public class forEachLoop01 {
    public static void main(String[] args) {

        // Bir ArrayList oluşturun ve içine 3 adet meyve ekleyin.
        // Daha sonra bu meyveleri büyük harflerle ekrana yazdırın.

       // Örnek çıktı:
       // Meyveler: ELMA ARMUT ÇİLEK

        ArrayList<String> meyveler=new ArrayList<>();
        meyveler.add("elma");
        meyveler.add("aRmut");
        meyveler.add("CilEk");

        for (String meyve:meyveler) {

            System.out.println(meyve.toUpperCase());

        }


        }
    }

