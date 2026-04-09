package CM1;

class Peminjaman06 {

    Mahasiswa06 mhs;
    Buku06 buku;

    int lamaPinjam, terlambat, denda;
    int batasPinjam = 5;

    Peminjaman06(Mahasiswa06 mhs, Buku06 buku, int lamaPinjam) {
        this.mhs = mhs;
        this.buku = buku;
        this.lamaPinjam = lamaPinjam;
        this.hitungDenda();
    }
    
    void hitungDenda() {
        if (lamaPinjam > batasPinjam) {
            terlambat = lamaPinjam - batasPinjam;
            denda = terlambat * 2000;
        } else {
            terlambat = 0;
            denda = 0;
        }
    }

    void tampilPeminjaman() {
        System.out.printf("%-4s | %-11s | Lama pinjam: %d | Terlambat: %d | Denda: %d\n",
        mhs.nama, buku.judul, lamaPinjam, terlambat, denda);
    }
}