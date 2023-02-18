import java.util.Scanner;

public class ArmstrongSayısı {
    public static void main(String[] args) {
        /*
        Armstrong Sayısı: sayının her bir rakamının, sayının basamak sayısıyla üssünü alıp topladığımızda yine sayının kendisine
        ulaşabiliyorsak denir.

        Örnek: 371 = 3^3 + 7^3 + 1^3

        do while döngüsü kullanılacaktır.
         */

        Scanner scan = new Scanner(System.in);

        System.out.println("Sayı: ");
        int sayı = scan.nextInt();

        System.out.println("Basamak Sayısı: ");
        int basamsakSayısı = scan.nextInt();

        int gecici_sayi = sayı;
        int toplam = 0;

        do{
            int basamak_degeri = gecici_sayi % 10;
            gecici_sayi = gecici_sayi / 10;
            toplam += Math.pow(basamak_degeri, basamsakSayısı);
        }while(gecici_sayi > 0);

        if (sayı == toplam){
            System.out.println("Armstrong Sayısı");
        }
        else {
            System.out.println("Armstrong Sayısı değil");
        }
    }
}
