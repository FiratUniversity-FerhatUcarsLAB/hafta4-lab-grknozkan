 /*
 * Ad Soyad: [Gürkan Özkan]
 * Ogrenci No: [250542023]
 * Tarih: [05.11.2025]
 * Aciklama: [Geometrik Hesaplama]
 */

import java.util.Scanner;

public class GeometrikHesap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("=== Geometrik Hesaplayıcı ===");

        System.out.print("Dairenin yarıçapını girin (cm):");
        double r = input.nextDouble();

        System.out.println("---SONUÇLAR---");
        System.out.println("--------------");
        final double PI = 3.14159;
        double daireAlan = PI * r * r;
        double daireCevre = 2 * PI * r;
        double kureHacim = (4.0 / 3.0) * PI * Math.pow(r, 3);
        double dairecapi= 2 * r ;
        double kureyuzeyalani= 4 * PI * r * r;


        System.out.printf("Dairenin Alanı: %.2f cm^2\n ", daireAlan);
        System.out.printf("Dairenin Çevresi: %.2f cm\n", daireCevre);
        System.out.printf("Dairenin Çapı: %.2f cm\n", dairecapi);
        System.out.printf("Kürenin Hacmi: %.2f cm^3\n", kureHacim);
        System.out.printf("Küre Yüzey Alanı: %.2f cm^2\n", kureyuzeyalani);

        input.close();
    }
}
