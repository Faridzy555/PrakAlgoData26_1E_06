package P12;

import java.util.Scanner;

public class DoubleLinkedListMain06 {
    public static void main(String[] args) {
        System.out.println();

        Scanner scan = new Scanner(System.in);

        DoubleLinkedList06 list = new DoubleLinkedList06();

        int pilihan;

        do {
            System.out.println("MENU DOUBLE LINKED LIST:");
            System.out.println("1. Tambah data di awal");
            System.out.println("2. Tambah data di akhir");
            System.out.println("3. Sisipkan data di tengah (setelah NIM)");
            System.out.println("4. Hapus data awal");
            System.out.println("5. Hapus data akhir");
            System.out.println("6. Tampilkan data");
            System.out.println("0. Keluar");
            System.out.println();
            System.out.print("Pilih menu: ");
            pilihan = scan.nextInt();
            scan.nextLine();
            
            switch (pilihan) {
                case 1:
                    Mahasiswa06 mhsAwal = inputMahasiswa06(scan);
                    list.addFirst(mhsAwal);
                    System.out.println();
                    break;
                case 2:
                    Mahasiswa06 mhsAkhir = inputMahasiswa06(scan);
                    list.addLast(mhsAkhir);
                    System.out.println();
                    break;
                case 3:
                    System.out.print("Input NIM yang dicari: ");
                    String keyNIM = scan.nextLine();
                    System.out.println("Input data baru: ");
                    Mahasiswa06 dataBaru = inputMahasiswa06(scan);
                    list.insertAfter(keyNIM, dataBaru);
                    System.out.println();
                    break;
                case 4:
                    list.removeFirst();
                    System.out.println();
                    break;
                case 5:
                    list.removeLast();
                    System.out.println();
                    break;
                case 6:
                    list.print();
                    System.out.println();
                    break;
                case 0:
                    System.out.println("Program selesai.");
                    System.out.println();
                    break;
                default:
                    System.out.println("Menu tidak valid.");
                    System.out.println();
            }
        } while (pilihan != 0);
    }

    public static Mahasiswa06 inputMahasiswa06(Scanner scan) {
        System.out.print("Input NIM  :");
        String nim = scan.nextLine();
        System.out.print("input Nama :");
        String nama = scan.nextLine();
        System.out.print("Input Kelas:");
        String kelas = scan.nextLine();
        System.out.print("Input IPK  :");
        double ipk = scan.nextDouble();
        scan.nextLine();
        return new Mahasiswa06(nim, nama, kelas, ipk);
    }
}