public class Main {
    public static void main(String[] args) {

        int saat = 23;
        int dakika = 78;
        int saniye = 80;

        Zaman zaman = new Zaman(saat, dakika, saniye);
        zaman.zamanHesapla();
        zaman.goster();
    }
}
