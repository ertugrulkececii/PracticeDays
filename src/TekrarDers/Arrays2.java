package TekrarDers;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays2 {
    public static void main(String[] args) {


        System.out.println(Arrays.toString(arrayOlustur()));
    }

    public static int[] arrayOlustur() {

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen olusturulucak array'in boyutunu giriniz: ");
        int length=scan.nextInt();
        int[] array=new int[length];
        for (int i = 0; i < length; i++) {
            System.out.println("Array icin tam sayi olan bir eleman giriniz: ");
            array[i]=scan.nextInt();


        }return array;
    }
}
