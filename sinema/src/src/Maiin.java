package src;// Main.java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Film ve salonlar oluşturuluyor
        Film film1 = new Film("Yüzüklerin Efendisi", 180, "Fantastik");
        Film film2 = new Film("Avatar", 162, "Bilim Kurgu");

        Salon salon1 = new Salon(1, "Salon A");
        Salon salon2 = new Salon(2, "Salon B");

        salon1.filmEkle(film1);
        salon2.filmEkle(film2);

        // Müşteri oluşturuluyor
        Musteri musteri1 = new Musteri(1, "Ahmet", "ahmet@example.com");
        Musteri musteri2 = new Musteri(2, "Mehmet", "mehmet@example.com");

        salon1.musteriKaydet(musteri1);
        salon2.musteriKaydet(musteri2);

        // Kullanıcı işlemleri
        while (true) {
            System.out.println("1. Film ve Salon Bilgisi Göster");
            System.out.println("2. Müşteri Bilgisi Göster");
            System.out.println("Çıkmak için 0'a basın");
            System.out.print("Seçiminizi yapın: ");
            int secim = scanner.nextInt();

            if (secim == 1) {
                salon1.salonBilgisiGoster();
                salon2.salonBilgisiGoster();
            } else if (secim == 2) {
                musteri1.musteriBilgisiGoster();
                musteri2.musteriBilgisiGoster();
            } else if (secim == 0) {
                break;
            } else {
                System.out.println("Geçersiz seçim. Tekrar deneyin.");
            }
        }

        scanner.close();
    }
}
