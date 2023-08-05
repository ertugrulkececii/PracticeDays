package practice_day01;

import java.util.Scanner;

public class P02_SezarSifrelemeYontemiSorusu {

    /* 2. SORU
    Kullanıcı tarafından girilen metni "Sezar Şifreleme Yöntemi" ne göre şifreleyiniz.
    Sezar Şifreleme: Sezar şifrelemesi, ilk kez Romalı lider Jül Sezar tarafından kullanılmış olan şifreleme tekniğidir.
    Bu şifreleme en basit ve en bilinen şifreleme tekniklerinden biridir.
    Düz metindeki her harfin, alfabeden belirli bir sayı ileride konumlu olan bir harfle değiştirildiği bir şifreleme türüdür.
            //hello ----> ıfmmp --->1 birim kaydırılmış hali

     */
    public static void main(String[] args) {

        System.out.println("Sifrelenecek metni girizniz: ");
        Scanner scan = new Scanner(System.in);
        String metin= scan.nextLine().toUpperCase();
        System.out.println("Kaydirma miktarini giriniz: ");
        int kaydirma = scan.nextInt();
        sifreleme(metin,kaydirma);

    }

    private static void sifreleme(String metin, int kaydirma) {
        String sifrelenmisMetin="";
        String alfabe= "ABCDEFGHIJKLMNOPQRSTUVWYZ";
        for (int i = 0; i < metin.length()-1; i++) {
            char karakter = metin.charAt(i);
            int karakterIndex=alfabe.indexOf(karakter);
            int yeniIndex=(karakterIndex+ kaydirma)%alfabe.length();

            sifrelenmisMetin+=alfabe.charAt(yeniIndex);
        }
        System.out.println("SifrelenmisMetin: " + sifrelenmisMetin);
    }


}
