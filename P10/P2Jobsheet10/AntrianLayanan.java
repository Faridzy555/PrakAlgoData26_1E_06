package P10.P2Jobsheet10;

public class AntrianLayanan {
    
    Mahasiswa06[] data;
    int front, rear, size, max;

    public AntrianLayanan(int max) {
        this.max = max;
        this.data = new Mahasiswa06[max];
        this.front = this.rear = -1;
        this.size = 0;
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
        System.out.println(mhs.nama + " berhasil masuk antrian");
    }

    public Mahasiswa06 dequeue() {
        if (isEmpty()) {
            System.out.println("Antrian kosong!");
            return null;
        }
        Mahasiswa06 mhs = data[front];
        front = (front + 1) % max;
        size--;
        return mhs;
    }

    public void lihatTerdepan() {
        if (isEmpty()) {
            System.out.println("Antrian kosong");
        } else {
            System.out.println("Mahasiswa terdepan:");
            data[front].tampilkanData();
        }
    }

    public void tampilkanSemua() {
        if (isEmpty()) {
            System.out.println("Antrian kosong");
            return;
        }
        System.out.println("Daftar Mahasiswa:");
        int i = front;
        for (int j = 0; j < size; j++) {
            data[i].tampilkanData();
            i = (i + 1) % max;
        }
    }

    public int getJumlahAntrian() {
        return size;
    }

    public void lihatAkhir() {
    if (isEmpty()) {
        System.out.println("Antrian kosong");
    } else {
        System.out.println("Mahasiswa paling belakang:");
        data[rear].tampilkanData();
    }
    }
}