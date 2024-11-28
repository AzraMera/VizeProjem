// Salon.java
import java.util.ArrayList;
import java.util.List;

public class Salon extends BaseEntity {
    private List<Film> filmler;
    private List<Musteri> musteriler;

    public Salon(int id, String ad) {
        super(id, ad);
        this.filmler = new ArrayList<>();
        this.musteriler = new ArrayList<>();
    }

    public void filmEkle(Film film) {
        filmler.add(film);
    }

    public void musteriKaydet(Musteri musteri) {
        musteriler.add(musteri);
    }

    public void salonBilgisiGoster() {
        super.bilgiGoster();
        System.out.println("Gösterilen Filmler:");
        for (Film film : filmler) {
            film.filmBilgisiGoster();
        }
        System.out.println("Kayıtlı Müşteriler:");
        for (Musteri musteri : musteriler) {
            musteri.musteriBilgisiGoster();
        }
    }
}
