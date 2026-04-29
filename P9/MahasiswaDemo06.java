package P9;

import java.util.Scanner;

public class MahasiswaDemo06 {
    public static void main(String[] args) {

        Scanner Farid = new Scanner(System.in);

        StackTugasMahasiswa06 stack = new StackTugasMahasiswa06(5);
        
        int pilih;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Mengumpulkan tugas");
            System.out.println("2. Menilai tugas");
            System.out.println("3. Melihat tugas teratas");
            System.out.println("4. Melihat daftar tugas");
            System.out.print("Pilih: ");
            pilih = Farid.nextInt();
            Farid.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("Nama: ");
                    String nama = Farid.nextLine();
                    System.out.print("NIM: ");
                    String nim = Farid.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = Farid.nextLine();
                    Mahasiswa06 mhs = new Mahasiswa06(nama, nim, kelas);
                    stack.push(mhs);
                    System.out.printf("Tugas %s berhasil dikumpulkan\n", mhs.nama);
                    break;

                case 2:
                    Mahasiswa06 dinilai = stack.pop();
                    if (dinilai != null) {
                        System.out.println("Menilai tugas dari " + dinilai.nama);
                        System.out.print("Masukkan nilai (0-100): ");
                        int nilai = Farid.nextInt();
                        dinilai.tugasDinilai(nilai);
                        System.out.printf("Nilai tugas %s adalah %d\n", dinilai.nama, nilai);
                        String biner = stack.konversiDesimalKeBiner(nilai);
                        System.out.println("Nilai biner tugas: " + biner);
                    }
                    break;

                case 3:
                    Mahasiswa06 lihat = stack.peek();
                    if (lihat != null) {
                        System.out.println("Tugas terakhir dikumpulkan oleh " + lihat.nama);
                    }
                    break;

                case 4:
                    System.out.println("Daftar semua tugas:");
                    System.out.println("Nama\tNIM\tKelas");
                    stack.print();
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilih >= 1 && pilih <= 4);

        System.out.println();
    }
}