// Film.java
public class Film {
    private String ad;
    private int sure;  // dakika cinsinden
    private String tur;

    public Film(String ad, int sure, String tur) {
        this.ad = ad;
        this.sure = sure;
        this.tur = tur;
    }

    public String getAd() {
        return ad;
    }

    public int getSure() {
        return sure;
    }

    public String getTur() {
        return tur;
    }

    public void filmBilgisiGoster() {
        System.out.println("Film Adı: " + ad + ", Süre: " + sure + " dakika, Tür: " + tur);
    }
}