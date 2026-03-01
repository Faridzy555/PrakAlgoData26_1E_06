package P2;

public class Mahasiswa06 {

    String Nama;
    String NIM;
    String Kelas;
    double IPK;

    void TampilkanInformasi() {
        System.out.println("Nama: " + Nama);
        System.out.println("NIM: " + NIM);
        System.out.println("IPK: " + IPK);
        System.out.println("Kelas: " + Kelas);
    }

    void UbahKelas(String KelasBaru) {
        Kelas = KelasBaru;
    }

    void UpdateIPK (double IPKBaru) {
        IPK = IPKBaru;
    }

    String NilaiKinerja() {
        if (IPK >= 3.5) {
            return "Kinerja Sangat Baik";
        } else if (IPK >= 3.0) {
            return "Kinerja sangat baik";
        } else if (IPK >= 2.0) {
            return "Kinerja cukup";
        } else {
            return "Kinerja kurang";
        }
    }
}