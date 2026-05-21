package CM2;

public class DLLPembeli {

    NodePembeli head;
    NodePembeli tail;

    int nomorAntrian = 1;

    // tambah antrian di belakang
    public void tambahAntrian(Pembeli pembeli) {
        NodePembeli baru = new NodePembeli(null, pembeli, null);
        // jika list kosong
        if (head == null) {
            head = tail = baru;
        } else {
            // sambungkan node baru ke tail
            tail.next = baru;
            baru.prev = tail;
            // pindah tail
            tail = baru;
        }
        System.out.println("Antrian berhasil ditambahkan dengan nomor: " + nomorAntrian);
        nomorAntrian++;
    }

    // tampilkan seluruh antrian
    public void cetakAntrian() {
        if (head == null) {
            System.out.println("Antrian kosong");
            return;
        }
        NodePembeli temp = head;
        int no = 1;
        System.out.println("DAFTAR ANTRIAN PEMBELI:");
        System.out.printf("%-10s %-15s %-15s\n", "No", "Nama", "No HP");
        while (temp != null) {
            System.out.printf("%-10d %-15s %-15s\n",
            no,
            temp.data.namaPembeli,
            temp.data.noHp);
            temp = temp.next;
            no++;
        }
    }

    // hapus antrean paling depan
    public Pembeli hapusAntrian() {
        if (head == null) {
            return null;
        }
        // simpan data yang dihapus
        Pembeli dataHapus = head.data;
        // jika hanya 1 data
        if (head == tail) {
            head = tail = null;
        } else {
            // geser head
            head = head.next;
            head.prev = null;
        }
        return dataHapus;
    }
}