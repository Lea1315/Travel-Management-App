package ba.unsa.etf.rpr;

public class Drzava {
    private int id;
    private String naziv;
    private Grad glavniGrad;
    private boolean kraljevska;

    public Drzava(int id, String naziv, Grad glavniGrad) {
        this.id = id;
        this.naziv = naziv;
        this.glavniGrad = glavniGrad;
    }

    public Drzava() {
    }

    public Drzava(int id, String naziv, Grad glavniGrad, boolean kraljevska) {
        this.id = id;
        this.naziv = naziv;
        this.glavniGrad = glavniGrad;
        this.kraljevska = kraljevska;
    }

    public boolean isKraljevska() {
        return kraljevska;
    }

    public void setKraljevska(boolean kraljevska) {
        this.kraljevska = kraljevska;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public Grad getGlavniGrad() {
        return glavniGrad;
    }

    public void setGlavniGrad(Grad glavniGrad) {
        this.glavniGrad = glavniGrad;
    }

    @Override
    public String toString() { return naziv; }
}
