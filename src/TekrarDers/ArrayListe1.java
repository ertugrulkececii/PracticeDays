package TekrarDers;

import java.util.ArrayList;
import java.util.List;

public class ArrayListe1 {
    public static void main(String[] args) {
        int[] arr={3,1,2,4,1,2,3,5,4,5,10,2,7};

        System.out.println("Tekrarsiz array: "+ tekrarlariSil(arr));
    }

    private static List<Integer> tekrarlariSil(int[] arr) {
        List<Integer> duzenliarr= new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (!(duzenliarr.contains(arr[i]))){
                duzenliarr.add(arr[i]);

            }

        }return duzenliarr;
    }
}
