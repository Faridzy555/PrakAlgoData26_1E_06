package P11;

public class Mahasiswa06 {

    String nim, nama, kelas;
    double ipk;

    Mahasiswa06 () {}
    
    Mahasiswa06(String nim, String nama, String kelas, double ipk) {
        this.nim = nim;
        this.nama = nama;
        this.kelas = kelas;
        this.ipk =  ipk;
    }

    void tampilInformasi() {
        System.out.print(nama + "\t" + "\t");
        System.out.print(nim + "\t");
        System.out.print(kelas + "\t");
        System.out.println(ipk);
    }
}