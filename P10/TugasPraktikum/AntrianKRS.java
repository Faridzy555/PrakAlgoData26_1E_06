package P10.TugasPraktikum;

import P10.P2Jobsheet10.Mahasiswa06;

public class AntrianKRS {
    Mahasiswa06[] data;
    int front, rear, size, max;
    int sudahDilayani = 0;

    public AntrianKRS(int max) {
        this.max = max;
        data = new Mahasiswa06[max];
        front = rear = -1;
        size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == max;
    }

    public void enqueue(Mahasiswa06 mhs) {
        if (isFull()) {
            System.out.println("Antrian penuh!");
            return;
        }
        if (isEmpty()) {
            front = rear = 0;
        } else {
            rear = (rear + 1) % max;
        }
        data[rear] = mhs;
        size++;
        System.out.println(mhs.nama + " masuk antrian");
    }

    // Memanggil 2 mahasiswa
    public void prosesKRS() {
        if (size < 2) {
            System.out.println("Antrian kurang dari 2!");
            return;
        }

        System.out.println("Memproses 2 mahasiswa:");

        for (int i = 0; i < 2; i++) {
            Mahasiswa06 mhs = data[front];
            mhs.tampilkanData();
            front = (front + 1) % max;
            size--;
            sudahDilayani++;
        }
    }

    public void tampilSemua() {
        if (isEmpty()) {
            System.out.println("Kosong");
            return;
        }
        int i = front;
        for (int j = 0; j < size; j++) {
            data[i].tampilkanData();
            i = (i + 1) % max;
        }
    }

    public void lihat2Terdepan() {
        if (size < 2) {
            System.out.println("Kurang dari 2");
            return;
        }
        System.out.println("2 terdepan:");
        data[front].tampilkanData();
        data[(front + 1) % max].tampilkanData();
    }

    public void lihatAkhir() {
        if (isEmpty()) {
            System.out.println("Kosong");
        } else {
            data[rear].tampilkanData();
        }
    }

    public void jumlahAntrian() {
        System.out.println("Jumlah antrian: " + size);
    }

    public void jumlahDilayani() {
        System.out.println("Sudah dilayani: " + sudahDilayani);
    }

    public void sisaBelumDilayani() {
        int total = size + sudahDilayani;
        System.out.println("Belum KRS: " + (total - sudahDilayani));
    }
}