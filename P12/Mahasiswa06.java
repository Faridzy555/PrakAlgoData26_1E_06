package P12;

public class Mahasiswa06 {

    // deklarasi Mahasiswa06
    String nim;
    String nama;
    String kelas;
    double ipk;

    // konstruktor Mahasiswa06
    public Mahasiswa06(String nim, String nama, String kelas, double ipk) {
        this.nim = nim;
        this.nama = nama;
        this.kelas = kelas;
        this.ipk = ipk;
    }

    // print mahasiswa
    public void tampil() {
        System.out.println(
                "NIM  : " + nim +
                "\nNama : " + nama +
                "\nKelas: " + kelas +
                "\nIPK  : " + ipk
        );
    }
}