package TekrarDers;

import java.util.Scanner;

public class DataCasting2 {
    public static void main(String[] args) {


    /*
       Kullnıcıdan bir harf girmesini isteyip o harften sonra gelen ilk üç harfi yazdıralım
       */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir harf giriniz: ");
        char harf = scan.next().charAt(0);
        System.out.println("Girdiğiniz harten sonra gelen harfler sırasıyla " + ((char) (harf + 1)) + "," + ((char) (harf + 2)) + "," + ((char) (harf + 3)) + "'dir.");
    }
}
