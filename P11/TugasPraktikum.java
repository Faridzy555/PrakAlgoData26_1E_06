package P11;

public class TugasPraktikum {

    static class Mahasiswa06 {
        String nim, nama, jurusan;

        Mahasiswa06(String nim, String nama, String jurusan) {
            this.nim = nim;
            this.nama = nama;
            this.jurusan = jurusan;
        }

        void tampilData() {
            System.out.println(nim + "\t" + nama + "\t" + jurusan);
        }
    }

    static class Node06 {
        Mahasiswa06 data;
        Node06 next;

        Node06(Mahasiswa06 data, Node06 next) {
            this.data = data;
            this.next = next;
        }
    }

    static class QueueLinkedList06 {

        Node06 front;
        Node06 rear;
        int size = 0;

        boolean isEmpty() {
            return front == null;
        }

        void enqueue(Mahasiswa06 data) {
            Node06 newNode = new Node06(data, null);

            if (isEmpty()) {
                front = rear = newNode;
            } else {
                rear.next = newNode;
                rear = newNode;
            }

            size++;
            System.out.println(data.nama + " masuk antrian");
        }

        void dequeue() {
            if (isEmpty()) {
                System.out.println("Antrian kosong");
            } else {
                System.out.print("Memanggil : ");
                front.data.tampilData();

                front = front.next;
                size--;

                if (front == null) {
                    rear = null;
                }
            }
        }

        void peekFront() {
            if (isEmpty()) {
                System.out.println("Antrian kosong");
            } else {
                System.out.print("Antrian terdepan : ");
                front.data.tampilData();
            }
        }

        void peekRear() {
            if (isEmpty()) {
                System.out.println("Antrian kosong");
            } else {
                System.out.print("Antrian terakhir : ");
                rear.data.tampilData();
            }
        }

        void clear() {
            front = rear = null;
            size = 0;
            System.out.println("Antrian dikosongkan");
        }

        void printQueue() {
            if (isEmpty()) {
                System.out.println("Antrian kosong");
            } else {
                System.out.println("Isi Antrian:");

                Node06 temp = front;

                while (temp != null) {
                    temp.data.tampilData();
                    temp = temp.next;
                }
            }
        }

        void jumlahAntrian() {
            System.out.println("Jumlah mahasiswa mengantri : " + size);
        }
    }

    public static void main(String[] args) {
        System.out.println();

        QueueLinkedList06 antrian = new QueueLinkedList06();

        Mahasiswa06 m1 = new Mahasiswa06("22201", "Budi", "TI");

        Mahasiswa06 m2 = new Mahasiswa06("22202", "Sinta", "TI");

        Mahasiswa06 m3 = new Mahasiswa06("22203", "Raka", "SI");

        antrian.enqueue(m1);
        antrian.enqueue(m2);
        antrian.enqueue(m3);

        System.out.println();

        antrian.printQueue();

        System.out.println();

        antrian.peekFront();
        antrian.peekRear();

        antrian.jumlahAntrian();

        System.out.println();

        antrian.dequeue();

        System.out.println();

        antrian.printQueue();

        antrian.jumlahAntrian();

        System.out.println();

        antrian.clear();

        antrian.printQueue();

        System.out.println();
    }
}