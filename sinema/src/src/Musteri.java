package src;

// Musteri.java
public class Musteri extends BaseEntity implements IKayıt {
    private String email;

    public Musteri(int id, String ad, String email) {
        super(id, ad);  // BaseEntity'den id ve ad'ı alır
        this.email = email;
    }

    @Override
    public void kayitOl(String isim) {
        System.out.println(isim + " kaydınız başarıyla alındı.");
    }

    public void musteriBilgisiGoster() {
        super.bilgiGoster();  // BaseEntity'den gelen bilgi gösterimi
        System.out.println("Email: " + email);
    }
}
