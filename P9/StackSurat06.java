package P9;

public class StackSurat06 {

    Surat06[] data;
    int top;

    public StackSurat06(int size) {
        data = new Surat06[size];
        top = -1;
    }

    public boolean isFull() {
        return top == data.length -1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    // 1. Terima surat (push)
    public void push(Surat06 s) {
        if (!isFull()) {
            data[++top] = s;
            System.out.println("Surat berhasil ditambahkan.");
        } else {
            System.out.println("Stack penuh!");
        }
    }

    // 2. Proses surat (pop)
    public Surat06 pop() {
        if (!isEmpty()) {
            return data[top--];
        } else {
            System.out.println("Stack kosong!");
            return null;
        }
    }

    // 3. Lihat surat teratas (peek)
    public void peek() {
        if (!isEmpty()) {
            data[top].tampil();
        } else {
            System.out.println("Tidak ada surat.");
        }
    }

    // 4. Cari surat berdasarkan nama
    public void cari(String nama) {
        boolean ditemukan = false;
        for (int i = 0; i <= top; i++) {
            if (data[i].namaMahasiswa.equalsIgnoreCase(nama)) {
                data[i].tampil();
                ditemukan = true;
            }
        }
        if (!ditemukan) {
            System.out.println("Surat tidak ditemukan.");
        }
    }
}