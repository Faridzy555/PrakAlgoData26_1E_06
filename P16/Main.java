package P16;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    static ArrayList<Mahasiswa> daftarMahasiswa = new ArrayList<>();
    static ArrayList<MataKuliah> daftarMK = new ArrayList<>();
    static ArrayList<Nilai> daftarNilai = new ArrayList<>();
    static Queue<Mahasiswa> queueHapus = new LinkedList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int pilih;

        do {
            System.out.println("\n==============================");
            System.out.println("     SISTEM NILAI MAHASISWA");
            System.out.println("==============================");
            System.out.println("1. Input Mahasiswa");
            System.out.println("2. Input Mata Kuliah");
            System.out.println("3. Input Nilai");
            System.out.println("4. Tampil Nilai");
            System.out.println("5. Cari Mahasiswa");
            System.out.println("6. Urutkan Nilai");
            System.out.println("7. Hapus Mahasiswa");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu : ");

            pilih = sc.nextInt();
            sc.nextLine();

            switch (pilih) {
                case 1:
                    inputMahasiswa();
                    break;
                case 2:
                    inputMataKuliah();
                    break;
                case 3:
                    inputNilai();
                    break;
                case 4:
                    tampilNilai();
                    break;
                case 5:
                    cariMahasiswa();
                    break;
                case 6:
                    urutkanNilai();
                    break;
                case 7:
                    hapusMahasiswa();
                    break;
                case 0:
                    System.out.println("Program selesai.");
                    System.out.println();
                    break;
                default:
                    System.out.println("Menu tidak tersedia!");
            }

        } while (pilih != 0);
    }

    static void inputMahasiswa() {
        System.out.print("NIM   : ");
        String nim = sc.nextLine();
        System.out.print("Nama  : ");
        String nama = sc.nextLine();
        System.out.print("Prodi : ");
        String prodi = sc.nextLine();
        daftarMahasiswa.add(new Mahasiswa(nim, nama, prodi));
        System.out.println("Data mahasiswa berhasil ditambahkan.");
    }

    static void inputMataKuliah() {
        System.out.print("Kode MK : ");
        String kode = sc.nextLine();
        System.out.print("Nama MK : ");
        String nama = sc.nextLine();
        System.out.print("SKS : ");
        int sks = sc.nextInt();
        sc.nextLine();
        daftarMK.add(new MataKuliah(kode, nama, sks));
        System.out.println("Data mata kuliah berhasil ditambahkan.");
    }
    
    static void inputNilai() {
        if (daftarMahasiswa.isEmpty() || daftarMK.isEmpty()) {
            System.out.println("Data mahasiswa atau mata kuliah masih kosong!");
            return;
        }
        System.out.println("\n===== DAFTAR MAHASISWA =====");
        for (int i = 0; i < daftarMahasiswa.size(); i++) {
            System.out.println((i + 1) + ". " + daftarMahasiswa.get(i));
        }
        System.out.print("Pilih Mahasiswa : ");
        int mhs = sc.nextInt() - 1;
        if (mhs < 0 || mhs >= daftarMahasiswa.size()) {
            System.out.println("Pilihan mahasiswa tidak valid!");
            sc.nextLine();
            return;
        }
        System.out.println("\n===== DAFTAR MATA KULIAH =====");
        for (int i = 0; i < daftarMK.size(); i++) {
            System.out.println((i + 1) + ". " + daftarMK.get(i));
        }
        System.out.print("Pilih Mata Kuliah : ");
        int mk = sc.nextInt() - 1;
        if (mk < 0 || mk >= daftarMK.size()) {
            System.out.println("Pilihan mata kuliah tidak valid!");
            sc.nextLine();
            return;
        }
        System.out.print("Nilai : ");
        double nilai = sc.nextDouble();
        sc.nextLine();
        daftarNilai.add(new Nilai(
                daftarMahasiswa.get(mhs),
                daftarMK.get(mk),
                nilai));
        System.out.println("Nilai berhasil ditambahkan.");
    }
    
    static void tampilNilai() {
        if (daftarNilai.isEmpty()) {
            System.out.println("Belum ada data nilai.");
            return;
        }
        System.out.println("\n========== DATA NILAI ==========");
        for (Nilai n : daftarNilai) {
            System.out.println(n);
        }
    }

    static void cariMahasiswa() {
        if (daftarNilai.isEmpty()) {
            System.out.println("Belum ada data nilai.");
            return;
        }
        System.out.print("Masukkan NIM Mahasiswa : ");
        String nim = sc.nextLine();
        boolean ditemukan = false;
        for (Nilai n : daftarNilai) {
            if (n.mahasiswa.nim.equalsIgnoreCase(nim)) {
                System.out.println(n);
                ditemukan = true;
            }
        }
        if (!ditemukan) {
            System.out.println("Data mahasiswa tidak ditemukan.");
        }
    }

    static void urutkanNilai() {
        if (daftarNilai.isEmpty()) {
            System.out.println("Belum ada data nilai.");
            return;
        }
        Collections.sort(daftarNilai,
                Comparator.comparingDouble(n -> n.nilai));
        System.out.println("Data berhasil diurutkan berdasarkan nilai.");
        tampilNilai();
    }

    static void hapusMahasiswa() {
        if (daftarMahasiswa.isEmpty()) {
            System.out.println("Data mahasiswa masih kosong.");
            return;
        }
        System.out.print("Masukkan NIM yang akan dihapus : ");
        String nim = sc.nextLine();
        Mahasiswa ditemukan = null;
        for (Mahasiswa m : daftarMahasiswa) {
            if (m.nim.equalsIgnoreCase(nim)) {
                ditemukan = m;
                break;
            }
        }
        if (ditemukan != null) {
            queueHapus.offer(ditemukan);
            Mahasiswa hapus = queueHapus.poll();
            daftarMahasiswa.remove(hapus);
            System.out.println("Mahasiswa berhasil dihapus menggunakan Queue.");
        } else {
            System.out.println("Mahasiswa tidak ditemukan.");
        }
    }
}