package practice_day06;

import java.util.Scanner;

public class stringManupulations {
    public static void main(String[] args) {
                    /*
                  Kullanicidan bir cumle alin
                - cumlede ev geciyorsa, "home home sweet home" yazdirin
                - cumlede is geciyorsa, "calismak guzeldir"
                - ikisini de iceriyorsa "Hem ev lazim hem is"
                - hicbirini icermiyorsa "cok calisman lazim" yazdirin.
             */
        Scanner scan=new Scanner(System.in);
        System.out.print("lutfen bir cumle giriniz:");
        String cumle=scan.next();
        String kCumle=cumle.toLowerCase();

        if (kCumle.contains("ev")&& kCumle.contains("is")){
            System.out.println("Hem ev hem is lazim");
        } else if (kCumle.contains("ev")) {
            System.out.println("home sweet home");

        } else if (kCumle.contains("is")) {
            System.out.println("calismak guzeldir");

        }else {
            System.out.println("calisman lazim");
        }
    }
}
