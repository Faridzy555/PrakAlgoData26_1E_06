package CM1;

import java.util.Scanner;

public class PerpustakaanMain06 {
    public static void main(String[] args) {
        System.out.println();

        Scanner Farid = new Scanner(System.in);

        // Data mahasiswa
        Mahasiswa06 daftarMhs[] = {
            new Mahasiswa06("22001", "Andi", "Teknik Informatika"),
            new Mahasiswa06("22002", "Budi", "Teknik Informatika"),
            new Mahasiswa06("22003", "Bela", "Sistem Informasi Bisnis")
        };

        // Data buku
        Buku06 daftarBuku[] = {
            new Buku06("B001", "Algoritma", 2020),
            new Buku06("B002", "Basis Data", 2019),
            new Buku06("B003", "Pemrograman", 2021),
            new Buku06("B004", "Fisika", 2024)
        };

        // Data peminjaman
        Peminjaman06 daftarPeminjaman[] = {
            new Peminjaman06(daftarMhs[0], daftarBuku[0], 7),
            new Peminjaman06(daftarMhs[1], daftarBuku[1], 3),
            new Peminjaman06(daftarMhs[2], daftarBuku[2], 10),
            new Peminjaman06(daftarMhs[2], daftarBuku[3], 6),
            new Peminjaman06(daftarMhs[0], daftarBuku[1], 4)
        };

        int pilih;

        do {
            System.out.println("SISTEM PEMINJAMAN RUANG BACA JTI:");
            System.out.println("1. Tampilkan mahasiswa");
            System.out.println("2. Tampilkan buku");
            System.out.println("3. Tampilkan peminjaman");
            System.out.println("4. Urutkan berdasarkan denda");
            System.out.println("5. Cari berdasarkan NIM");
            System.out.println("0. Keluar");
            System.out.println();
            
            System.out.print("Pilih: ");
            pilih = Farid.nextInt();
            Farid.nextLine();

            switch (pilih) {
                case 1:
                    System.out.println("Daftar mahasiswa:");
                    for (Mahasiswa06 m : daftarMhs) m.tampilMahasiswa();
                    break;

                case 2:
                    System.out.println("Daftar buku:");
                    for (Buku06 b : daftarBuku) b.tampilBuku();
                    break;

                case 3:
                    System.out.println("Daftar peminjaman:");
                    for (Peminjaman06 p : daftarPeminjaman) p.tampilPeminjaman();
                    break;

                case 4:
                    // Insertion Sort
                    for (int i = 1; i < daftarPeminjaman.length; i++) {
                        Peminjaman06 temp = daftarPeminjaman[i];
                        int j = i - 1;

                        while (j >= 0 && daftarPeminjaman[j].denda < temp.denda) {
                            daftarPeminjaman[j + 1] = daftarPeminjaman[j];
                            j--;
                        }
                        daftarPeminjaman[j + 1] = temp;
                    }

                    System.out.println("Mengurutkan denda dari terbesar ke terkecil (Descending):");
                    for (Peminjaman06 p : daftarPeminjaman) p.tampilPeminjaman();
                    break;

                case 5:
                    System.out.print("Masukkan NIM: ");
                    String cari = Farid.nextLine();

                    boolean cekNIM = false;
                    for (Peminjaman06 p : daftarPeminjaman) {
                        if (p.mhs.nim.equalsIgnoreCase(cari)) {
                            p.tampilPeminjaman();
                            cekNIM = true;
                        }
                    }

                    if (!cekNIM) System.out.println("NIM tidak ditemukan");
                    break;
            }
            System.out.println();

        } while (pilih != 0);
    }
}