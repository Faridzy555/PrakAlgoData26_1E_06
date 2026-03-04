package P2;

public class Dosen06 {

    String nama;
    String idDosen;
    boolean statusAktif;
    int tahunBergabung;
    String bidangKeahlian;

    Dosen06() {}

    Dosen06(String nama, String idDosen, boolean statusAktif, int tahunBergabung, String bidangKeahlian) {
        this.idDosen = idDosen;
        this.nama = nama;
        this.statusAktif = statusAktif;
        this.tahunBergabung = tahunBergabung;
        this.bidangKeahlian = bidangKeahlian;
    }
    
    void menampilkanInformasi() {
        System.out.println("Nama: " + nama);
        System.out.println("Id Dosen: " + idDosen);
        System.out.println("Status aktif: " + statusAktif);
        System.out.println("Tahun bergabung: " + tahunBergabung);
        System.out.println("Bidang keahlian: " + bidangKeahlian);
    }

    void setStatusAktif(boolean status) {
        statusAktif = status;
    }

    int hitungMasaKerja(int tahunSekarang) {
        return tahunSekarang - tahunBergabung;
    }

    void ubahkeahlian(String bidang) {
        bidangKeahlian = bidang;
        System.out.println("Pindah keahlian: " + bidangKeahlian);
    }
}