package day55_lambda;

public class C06_University {
    private  String universite;
    private  String bolum;
    private  int ogrSayisi;
    private  double notOrt;

    public C06_University(String universite, String bolum, int ogrSayisi, double notOrt) {
        this.universite = universite;
        this.bolum = bolum;
        this.ogrSayisi = ogrSayisi;
        this.notOrt = notOrt;
    }

    public String getUniversite() {
        return universite;
    }

    public void setUniversite(String universite) {
        this.universite = universite;
    }

    public String getBolum() {
        return bolum;
    }

    public void setBolum(String bolum) {
        this.bolum = bolum;
    }

    public int getOgrSayisi() {
        return ogrSayisi;
    }

    public void setOgrSayisi(int ogrSayisi) {
        this.ogrSayisi = ogrSayisi;
    }

    public double getNotOrt() {
        return notOrt;
    }

    public void setNotOrt(double notOrt) {
        this.notOrt = notOrt;
    }

    @Override
    public String toString() {
        return
                "universite='" + getUniversite() + '\'' +
                ", bolum='" + getBolum() + '\'' +
                ", ogrSayisi=" + getOgrSayisi() +
                ", notOrt=" + getNotOrt();

    }
}
