package P9;

public class Mahasiswa06 {

    String nama, nim, kelas;

    Mahasiswa06(String nama, String nim, String kelas) {
        this.nama = nama;
        this.nim = nim;
        this.kelas = kelas;
        nilai = -1;
    }

    int nilai;

    void tugasDinilai(int nilai) {
        this.nilai = nilai;
    }
}