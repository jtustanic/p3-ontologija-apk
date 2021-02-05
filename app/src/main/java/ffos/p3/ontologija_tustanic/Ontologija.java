package ffos.p3.ontologija_tustanic;

import java.io.Serializable;

public class Ontologija implements Serializable {

    public Ontologija() {
        this.sifra = sifra;
        this.ime_nakladnika = ime_nakladnika;
        this.mjesto_izdanja = mjesto_izdanja;
        this.jePreveo = jePreveo;
        this.jePrevedeno = jePrevedeno;
        this.zaradioJe = zaradioJe;
    }

    private int sifra;
    private String ime_nakladnika;
    private String mjesto_izdanja;
    private String jePreveo;
    private String jePrevedeno;
    private int zaradioJe;

    public int getSifra() {
        return sifra;
    }

    public void setSifra(int sifra) {
        this.sifra = sifra;
    }

    public String getIme_nakladnika() {
        return ime_nakladnika;
    }

    public void setIme_nakladnika(String ime_nakladnika) {
        this.ime_nakladnika = ime_nakladnika;
    }

    public String getMjesto_izdanja() {
        return mjesto_izdanja;
    }

    public void setMjesto_izdanja(String mjesto_izdanja) {
        this.mjesto_izdanja = mjesto_izdanja;
    }

    public String getJePreveo() {
        return jePreveo;
    }

    public void setJePreveo(String jePreveo) {
        this.jePreveo = jePreveo;
    }

    public String getJePrevedeno() {
        return jePrevedeno;
    }

    public void setJePrevedeno(String jePrevedeno) {
        this.jePrevedeno = jePrevedeno;
    }

    public int getZaradioJe() {
        return zaradioJe;
    }

    public void setZaradioJe(int zaradioJe) {
        this.zaradioJe = zaradioJe;
    }
}
