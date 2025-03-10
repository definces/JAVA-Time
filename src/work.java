import java.time.LocalDate;

class Zaman {
    int saat, dakika, saniye;


    public Zaman(int saat, int dakika, int saniye) {
        this.saat = saat;
        this.dakika = dakika;
        this.saniye = saniye;
    }


    public void zamanHesapla() {

        if (this.saniye >= 60) {
            this.dakika += this.saniye / 60;
            this.saniye = this.saniye % 60;
        }


        if (this.dakika >= 60) {
            this.saat += this.dakika / 60;
            this.dakika %= 60;
        }


        if (this.saat >= 24) {
            this.saat = this.saat % 24;
        }
    }

    public void goster() {

        System.out.printf("Girilen Zaman: %02d:%02d:%02d\n", this.saat, this.dakika, this.saniye);

    }
}


