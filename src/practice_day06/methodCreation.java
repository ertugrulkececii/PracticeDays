package practice_day06;

import java.util.Scanner;

public class methodCreation {
    public static void main(String[] args) {
        /*
              Kullanicidan main method icinde ayri ayri isim ve soyismini alin
              sim ve soyismi ilk harfleri buyuk diger harfler kucuk olacak sekilde duzenleyip,
              sim bosluk soyisim seklinde bize donduren bir method olusturun
              */
        Scanner scanner= new Scanner(System.in);
        System.out.println("lutfen adinizi goronoz");
        String isim= scanner.nextLine(); // nexline yazmazsak bosluga kadar alir biz satiri kullanmak istiyoruz
        System.out.println("soyisim griniz");
        String soyIsim=scanner.nextLine();
        System.out.println(isimSoyisimYazdir( isim, soyIsim));
        
    }

    private static boolean isimSoyisimYazdir(String isim, String soyIsim) {
        isim=isim.toUpperCase().charAt(0)+isim.substring(1).toLowerCase();
        soyIsim=soyIsim.toUpperCase().charAt(0)+soyIsim.substring(1).toLowerCase();
        String duzenliIsim= isim+" "+ soyIsim;

        return false;
    }
}
