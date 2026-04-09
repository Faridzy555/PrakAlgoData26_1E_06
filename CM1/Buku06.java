package CM1;

class Buku06 {

    String kodeBuku, judul;
    int tahunTerbit;

    Buku06(String kodeBuku, String judul, int tahunTerbit) {
        this.kodeBuku = kodeBuku;
        this.judul = judul;
        this.tahunTerbit = tahunTerbit;
    }

    void tampilBuku() {
        System.out.println("Kode buku: " + kodeBuku + " | Judul: " + judul + " | Tahun terbit: " + tahunTerbit);
    }
}