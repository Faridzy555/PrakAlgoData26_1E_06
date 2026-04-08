package P6;

class Mahasiswa06 {

    String nim;
    String nama;
    String kelas;
    double ipk;

    // Konstruktor default
    Mahasiswa06() {}

    // Konstruktor parameter
    Mahasiswa06(String nm, String name, String kls, double ip) {
        nim = nm;
        nama = name;
        ipk = ip;
        kelas = kls;
    }

    void tampilInformasi() {
        System.out.println();
        System.out.println("Nama : " + nama);
        System.out.println("NIM  : " + nim);
        System.out.println("Kelas: " + kelas);
        System.out.println("IPK  : " + ipk);
    }
}