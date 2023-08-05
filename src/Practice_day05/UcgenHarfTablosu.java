package Practice_day05;

public class UcgenHarfTablosu {
    public static void main(String[] args) {

int harf=97;

        for (int satir = 0; satir < 10; satir++) { //1,
            for (int sutun = 0; sutun <=satir ; sutun++) { //1

                System.out.print((char)(harf+sutun)+ " ");
            }
            System.out.println();
        }

    }
}
