package Practice_Day04;

import java.util.Scanner;

public class P05_SwitchStatements {
    public static void main(String[] args) {

        // Kullanicidan o gunun hangi gin oldugunu girmasini isteyip haftanin kacinci gunu oldugunu yazdirin


        System.out.println("bugun gunlerden hangi gun");
        Scanner scanner= new Scanner(System.in);
        String gun= scanner.next();

        switch (gun){
            case "pazartesi": // switch case de eger case sayi ise direk yazilir metin ise "" icinde yazlir.
                System.out.println(gun + " haftanin 1. gunudur");
                break;
            case "sali": // switch case de eger case sayi ise direk yazilir metin ise "" icinde yazlir.
                System.out.println(gun + " haftanin 2. gunudur");
                break;
            case "carsamba": // switch case de eger case sayi ise direk yazilir metin ise "" icinde yazlir.
                System.out.println(gun + " haftanin 3. gunudur");
                break;
                case "persembe": // switch case de eger case sayi ise direk yazilir metin ise "" icinde yazlir.
                System.out.println(gun + " haftanin 4. gunudur");
                break;
            case "cuma": // switch case de eger case sayi ise direk yazilir metin ise "" icinde yazlir.
                System.out.println(gun + " haftanin 5. gunudur");
                break;
            case "cumartesi": // switch case de eger case sayi ise direk yazilir metin ise "" icinde yazlir.
                System.out.println(gun + " haftanin 6. gunudur");
                break;
            case "pazar": // switch case de eger case sayi ise direk yazilir metin ise "" icinde yazlir.
                System.out.println(gun + " haftanin 7. gunudur");
                break;

            default:
                System.out.println("yanlis gun girdiniz");

        }
    }
}
