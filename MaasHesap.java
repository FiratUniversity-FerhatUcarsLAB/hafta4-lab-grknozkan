 /*
 * Ad Soyad: [Gürkan Özkan]
 * Ogrenci No: [250542023]
 * Tarih: [05.05.2025]
 * Aciklama: [Görev-3 Maaş Hesaplama]
 */

import java.util.Scanner;

public class MaasHesap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== MAAŞ BORDROSU HESAPLAMA PROGRAMI ===");

        System.out.print("Çalışan Adı Soyadı: ");
        String adSoyad = input.nextLine();

        System.out.print("Aylık Brüt Maaş (TL): ");
        double brutMaas = input.nextDouble();

        System.out.print("Haftalık Çalışma Saati: ");
        int haftalikSaat = input.nextInt();

        System.out.print("Mesai Saati Sayısı: ");
        int mesaiSaat = input.nextInt();

        double mesaiUcreti = (brutMaas / 160) * mesaiSaat * 1.5;
        double toplamGelir = brutMaas + mesaiUcreti;

        final double SGK_ORANI = 0.14;
        final double GELIR_VERGISI_ORANI = 0.15;
        final double DAMGA_VERGISI_ORANI = 0.00759;
        double toplamKesinti = SGK_ORANI+GELIR_VERGISI_ORANI+DAMGA_VERGISI_ORANI;

        double netMaas = toplamGelir - toplamKesinti;

        double kesintiOrani = (toplamKesinti / toplamGelir) * 100;
        double saatlikNetKazanc = netMaas / 176;
        double gunlukNetKazanc = netMaas / 22;

        System.out.println("====================================");
        System.out.println("           MAAŞ BORDROSU            ");
        System.out.println("====================================");
        System.out.println("Çalışan: " + adSoyad);
        System.out.println("GELİRLER:");
        System.out.printf("   Brüt Maaş: %.2f TL\n", brutMaas);
        System.out.printf("   Mesai Ücreti: %.2f TL\n", mesaiUcreti);
        System.out.println("------------------------");
        System.out.printf("   Toplam Gelir: %.2f TL\n", toplamGelir);

        System.out.println("KESİNTİLER:");
        System.out.printf("   SGK (%%14): %.2f TL\n", SGK_ORANI);
        System.out.printf("   Gelir Vergisi (%%15): %.2f TL\n", GELIR_VERGISI_ORANI);
        System.out.printf("   Damga Vergisi (%%0.759): %.2f TL\n", DAMGA_VERGISI_ORANI);
        System.out.println("------------------------");
        System.out.printf("   Toplam Kesinti: %.2f TL\n", toplamKesinti);
        System.out.printf("Net Maaş: %.2f TL\n", netMaas);

        input.close();
    }
}
