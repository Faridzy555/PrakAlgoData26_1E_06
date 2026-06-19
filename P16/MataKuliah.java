package P16;

public class MataKuliah {

    String kodeMK;
    String namaMK;
    int sks;

    public MataKuliah(String kodeMK, String namaMK, int sks) {
        this.kodeMK = kodeMK;
        this.namaMK = namaMK;
        this.sks = sks;
    }

    @Override
    public String toString() {
        return kodeMK + " - " + namaMK + " (" + sks + " SKS)";
    }
}