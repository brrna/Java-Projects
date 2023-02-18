import java.util.Scanner;

public class BasitHesapMakinesi {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String islemler = "İşlemler: " +
                "1. Toplama" +
                "2. Çıkarma" +
                "3. Çarpma" +
                "4. Bölme";

        System.out.println(islemler);

        System.out.println("Yapmak istediğiniz işlemi seçiniz:");
        String islem = scanner.nextLine();

        System.out.println("İşlem yapacağınız sayıları seçiniz.");
        System.out.println("Birinci Sayı:");
        int sayı1 = scanner.nextInt();
        System.out.println("İkinci Sayı:");
        int sayı2 = scanner.nextInt();

        switch(islem){
            case "1":
                System.out.println("Toplama Sonucu:" + (sayı1 + sayı2));
                break;

            case "2":
                System.out.println("Çıkarma Sonucu: " + (sayı1 - sayı2));
                break;

            case "3":
                System.out.println("Çarpma Sonucu: " + (sayı1 * sayı2));
                break;

            case "4":
                System.out.println("Bölme Sonucu: " + (sayı1 / sayı2));
                break;


        }
    }
}
