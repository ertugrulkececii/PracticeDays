package Practice_day05;

import java.util.Scanner;

public class EbobEkok {

    // Kullanıcıdan 2 tamsayı alın ve EBOB (En Büyük Ortak Bölen) ve EKOK(En Küçük Ortak Kat) değerlerini bulun
   /* public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen pozitif iki tamsayı giriniz");

        int num1 = scan.nextInt();
        int num2 = scan.nextInt();

        int flag = 0;
        System.out.println("Girdiğiniz sayılar sırasıyla: " + num1 + "-" + num2);
        //Önce EBOB hesaplaması yapalım
        //ilk olarak küçük sayıyı ebob değişkenine atıyorum
        //30 ve 40 için ebob'u ilk oalrak 30 atadaık.
        int limitEbob = 0;
        if (num1 < num2) {
            limitEbob = num1;
        } else {
            limitEbob = num2;
        }
        //Atanan limitEbob değerini birer azaltarak en büyük ortak böleni buluyoruz
        //30 değerinden başlayıp 1'er azaltarak ikisini de bölebilecek en büyük sayıyı arıyoruz
        for (int i = limitEbob; i >= 2; i--) {
            if (num1 % i == 0 && num2 % i == 0) {
                System.out.println("Bu sayıların EBOB değeri: " + i);
                flag++;
                break;
            }
        }
        //flag değerinin hiç artmaması ortak bölen bulamadığı anlamına gelir
        if (flag == 0) {
            System.out.println("Bu iki sayının ortak böleni yoktur");
        }


        //Girilen sayıların Ekok değerini bulalım
        flag = 0;
        //for loop yazarken 1'den başlayıp bir limit koyarak i değerini 1'er arttırarak ilerleyeceğiz.
        //System.out.println("Lütfen Ekok değeri olabilecek maksimum limiti giriniz");
        //int limit= scan.nextInt();
        for (int i = 1; i < (num1 * num2); i++) {
            if (i % num1 == 0 && i % num2 == 0) {
                System.out.println("Girdiğiniz sayıların Ekok değeri: " + i);
                flag++;
                break;
            }
        }
        if (flag == 0) {
            System.out.println("Girdiğiniz sayıların belirttiğiniz limit değerinden'den küçük bir Ekok değeri yoktur");

        }
    }

    */

    public static void main(String[] args) {

        /*Soru 22-)
        Kullanıcıdan 2 tamsayı girmesini isteyin, ardından GCD (En Büyük Ortak Bölen) ve LCM'yi bulun (En Küçük Ortak Kat)
        Giriş :
        30 ve 40

        Beklenen Çıktı:
        30 ve 40 için EBOB= 10
        30 ve 40 için EKOK= 120
        ipucu:
        Loopları kullanarak çözebiliriz. İki sayının EKOK'u sayıların çarpımının sayıların EBOB'una bölünerek bulunabilir.

         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen 2 pozitif tam sayi girin: ");

        int sayi1 = scanner.nextInt();
        int sayi2 = scanner.nextInt();

        int ebob = 0;
        int ekok = 0;

        int sayac = 0;

        int refEbob = 0;
        if (sayi1 < sayi2) {
            refEbob = sayi1;
        } else {
            refEbob = sayi2;
        }
        for (int i = refEbob; i >= 2; i--) {

            if (sayi1 % i == 0 && sayi2 % i == 0) {

                System.out.println("girilen sayilarin Ebob'u " + i);
                sayac++;
                break;
            }

        }
        if (sayac == 0) {
            System.out.println("Girilen sayilarin ortak boleni yoktur");
        }
        sayac = 0;
        for (int i = 1; i < 100000; i++) {

            if (i % sayi1 == 0 && i % sayi2 == 0) {
                System.out.println("girilen sayilarin Ekok degeri: " + i);
                sayac++;
                break;
            }

        }
        if (sayac==0){
            System.out.println("Girdiginiz sayilarin 100000'den kucuk bir Ekok degeri yoktur");
        }
    }
}

