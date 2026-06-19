package P16;

public class Mahasiswa {

    String nim;
    String nama;
    String prodi;

    public Mahasiswa(String nim, String nama, String prodi) {
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
    }

    @Override
    public String toString() {
        return nim + " - " + nama + " - " + prodi;
    }
}