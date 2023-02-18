import java.util.Scanner;

public class BKI {
    public static void main(String[] args) {
        /*
        Beden Kitle İndeksi

        BKİ = kilo / boy * boy

        Boy metre cinsinden olmalı
         */

        Scanner scan = new Scanner(System.in);

        System.out.println("Kilonuzu  giriniz: ");
        double kilo = scan.nextDouble();

        System.out.println("Boyunuzu giriniz: ");
        double boy = scan.nextDouble();

        double bki = kilo / (boy * boy);

        System.out.println("Beden Kitle İndeksiniz: " + bki );

        if(bki > 35) {
            System.out.println("AŞIRI OBEZ: Sağlık açısından çok riskli!");
        }

        else if (bki >= 30 && bki < 35) {
            System.out.println("OBEZ: Sağlık açısından riskli");
        }

        else if (bki >= 25 && bki < 30){
            System.out.println("TOPLU: Hafif şişman");
        }

        else if (bki >= 19 && bki < 25){
            System.out.println("NORMAL");
        }

        else{
            System.out.println("ZAYIF");
        }
    }
}
