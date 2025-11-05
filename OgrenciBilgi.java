 /*
 * Ad Soyad: [Gürkan Özkan]
 * Ogrenci No: [250542023]
 * Tarih: [05.05.2025]
 * Aciklama: [Görev-1 Öğrenci Bilgi Sistemi]
 */

import java.util.Scanner;

public class OgrenciBilgiSistemi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== OGRENCI BILGI SISTEMI ===");

        System.out.print("Adınız ve Soyadınızı Girin: ");
        String adSoyad = input.nextLine();

        System.out.print("Öğrenci Numaranızı girin: ");
        int ogrenciNo = input.nextInt();

        System.out.print("Yaşınızı girin: ");
        int yas = input.nextInt();

        System.out.print("GPA'nızı girin(00,00-04,00): ");
        double gpa = input.nextDouble();

        input.nextLine();
        System.out.print("Durum: ");
        String durum = input.nextLine();

        System.out.println("\n=== OGRENCI BILGI SISTEMI ===");
        System.out.println("Ad Soyad: " + adSoyad);
        System.out.println("Ogrenci No: " + ogrenciNo);
        System.out.println("Yas: " + yas);
        System.out.printf("GPA: %.2f\n", gpa);
        System.out.println("Durum: " + durum);

        input.close();
    }
}
