package P6;

class Dosen06 {
    String kode, nama;
    boolean jenisKelamin; // true: Pria, false: Wanita
    int usia;

    Dosen06(String kd, String name, boolean jk, int age) {
        kode = kd;
        nama = name;
        jenisKelamin = jk;
        usia = age;
    }

    void tampil() {
        String jk = jenisKelamin ? "Pria" : "Wanita";
        System.out.println("Kode: " + kode + " | Nama: " + nama + 
                           " | JK: " + jk + " | Usia: " + usia);
    }
}