import java.util.Locale;
import java.util.Scanner;

public class P03_IfStatements {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
       /* System.out.println("Bugun gunlerden hangi gun: ");
        String gunAdi = scan.next().toLowerCase();

        if (gunAdi.equals("cumartesi") || gunAdi.equals("pazar")) {
            System.out.println("Bugun Hafta sonu");
        }
        if (gunAdi.equals("pazartesi") || gunAdi.equals("sali") || gunAdi.equals("carsamba") || gunAdi.equals("persembe") || gunAdi.equals("cuma"));{

            System.out.println("Bugun Hafta ici");
        }
        if (!(gunAdi.equals("pazartesi") || gunAdi.equals("sali") || gunAdi.equals("carsamba")
                || gunAdi.equals("persembe")
                || gunAdi.equals("cuma")|| gunAdi.equals("cumartesi") || gunAdi.equals("pazar")) ) {
            System.out.println("gecersiz giris");



     /*
   2- Kullanıcıdan İki adet vize notu ve bir adet final notu girmesini isteyin
    Yıl sonu notunu vizeler %40 final % 60 olacak şekilde hesaplayıp
    Ders durumuna bu not 50'den büyük ise Geçtiniz Tebrikler!
    50'den küçükse Maalesef Kaldınız olarak aşağıdaki formatta yazdırınız
    Ad:
    Soyad:
    1.Vize:
    2. Vize:
    Final :
    Yıl Sonu Notu:
    Ders Durumu :
     */

    System.out.print("Lütfen Adınızı Giriniz: ");
    String name= scan.nextLine();
        System.out.print("LÜtfen Soyadınızı Giriniz: ");
    String surname= scan.nextLine();
        System.out.println("Lütfen vize ve final notlarınızı sırasıyla giriniz");
        System.out.print("1.Vize: ");
    double vize1= scan.nextDouble();
        System.out.print("2. Vize: ");
    double vize2= scan.nextDouble();
        System.out.print("Final Notu: ");
    double finalNotu= scan.nextDouble();
    double yilSonuNotu=((((vize1+vize2)/2)*40/100)+(finalNotu*60/100));
        System.out.println("Adınız: "+name);
        System.out.println("Soyadınız: "+                                                surname);
        System.out.println("1. Vize Notu: "+vize1);
        System.out.println("2. Vize Notu:" + vize2);
        System.out.println("Final Notu: "+finalNotu);
        System.out.println("Yıl Sonu Notu = " + yilSonuNotu);
        if (yilSonuNotu>=50){
        System.out.println("Ders Durumu: Geçtiniz Tebrikler");
    }
        if (yilSonuNotu<50){
        System.out.println("Ders Durumu : Maalesef Kaldınız");
    }
}
    }












