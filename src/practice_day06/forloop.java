package practice_day06;

import java.util.Scanner;

public class forloop {
    public static void main(String[] args) {
          /*
         Kullanicidan baslangic ve bitis degeri olarak pozitif sayilar alin, sinirlar
         dahil olarak aralarindaki tum sayilarin toplamini yazdirin. Bitis degeri
         baslangic degerinden kucukse, uyari yazdirip islemi sonlandirin
          */
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen baslangic degeri giriniz: ");
        int baslangicDegeri=scan.nextInt();
        System.out.println("Lutfen bitis degerini giriniz");
        int bitisDegeri=scan.nextInt();
        int toplam=0;
        if (baslangicDegeri>bitisDegeri){
            System.out.println("bitis degeri baslangic degerinden kucuk olamaz");
        }
        for (int i = baslangicDegeri; i <=bitisDegeri ; i++) {
            toplam+=i;

        }
        System.out.println("Toplam sayi = "+toplam);
    }
}
