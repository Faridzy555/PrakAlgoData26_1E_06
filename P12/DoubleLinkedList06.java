package P12;

public class DoubleLinkedList06 {

    // deklarasi atribut
    Node06 head;
    Node06 tail;
    int size;

    // konstruktor DoubleLinkedList
    public DoubleLinkedList06() {
        head = null;
        tail = null;
        size = 0;
    }

    // method isEmpty
    public boolean isEmpty() {
        return head == null;
    }

    // method addFirst
    public void addFirst(Mahasiswa06 data) {
        Node06 newNode = new Node06(data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    // method addLast
    public void addLast(Mahasiswa06 data) {
        Node06 newNode = new Node06(data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        size++;
    }

    // method insertAfter
    public void insertAfter(String keyNim, Mahasiswa06 data) {
        Node06 current = head;
        while (current != null && !current.data.nim.equals(keyNim)) {
            current = current.next;
        }
        if (current == null) {
            System.out.println("Data dengan NIM " + keyNim + "tidak ditemukan");
            return;
        }
        Node06 newNode = new Node06(data);
        // jika current adalah tail, node baru ditambahkan di akhir
        if (current == tail) {
            newNode.prev = current;
            current.next = newNode;
            tail = newNode;
        // node baru disisipkan di tengah
        } else {
            newNode.prev = current;
            newNode.next = current.next;
            current.next.prev = newNode;
            current.next = newNode;
        }
        size++;
        System.out.println("Data berhasil disisipkan setelah NIM " + keyNim);
    }

    // method print check Linked List
    public void print() {
        if (isEmpty()) {
            System.out.println("Linked List masih kosong");
            return;
        }
        Node06 current = head;
        while (current != null) {
            System.out.println();
            current.data.tampil();
            current = current.next;
        }
    }

    // method removeFirst
    public void removeFirst() {
        if (isEmpty()) {
            System.out.println("Linked List kosong");
            return;
        }
        Mahasiswa06 dataHapus = head.data;
        if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
        size--;
        System.out.println("Data berhasil dihapus");
        dataHapus.tampil();
    }

    // method removeLast
    public void removeLast() {
        if (isEmpty()) {
            System.out.println("Linked List kosong");
            return;
        }
        Mahasiswa06 dataHapus = tail.data;
        if (head == tail) {
            head = tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }
        size--;
        System.out.println("Data berhasil dihapus");
        dataHapus.tampil();
    }

    // method print reverse
    public void printReverse() {
        if (isEmpty()) {
            System.out.println("Linked List masih kosong");
            return;
        }
        Node06 current = tail;
        while (current != null) {
            System.out.println();
            current.data.tampil();
            current = current.prev;
        }
    }

    // method add (index, data)
    public void add(int index, Mahasiswa06 data) {
        if (index < 0 || index > size) {
            System.out.println("Index di luar batas");
            return;
        }
        if (index == 0) {
            addFirst(data);
            return;
        }
        if (index == size) {
            addLast(data);
            return;
        }
        Node06 current = head;
        for (int i = 0; i < index - 1; i++) {
            current = current.next;
        }
        Node06 newNode = new Node06(data);
        newNode.next = current.next;
        newNode.prev = current;
        current.next.prev = newNode;
        current.next = newNode;
        size++;
    }

    // method removeAfter
    public void removeAfter(String keyNim) {
        Node06 current = head;
        while (current != null && !current.data.nim.equals(keyNim)) {
        current = current.next;
        }
        if (current == null || current.next == null) {
        System.out.println("Data tidak ditemukan");
        return;
        }
        Node06 removed = current.next;
        if (removed == tail) {
            tail = current;
            current.next = null;
        } else {
            current.next = removed.next;
            removed.next.prev = current;
        }
        size--;
        System.out.println("Data berhasil dihapus");
        removed.data.tampil();
    }

    // method remove (index)
    public void remove(int index) {
        if (index < 0 || index >= size) {
        System.out.println("Index di luar batas");
        return;
        }
        if (index == 0) {
        removeFirst();
        return;
        }
        if (index == size - 1) {
        removeLast();
        return;
        }
        Node06 current = head;
        for (int i = 0; i < index; i++) {
        current = current.next;
        }
        current.prev.next = current.next;
        current.next.prev = current.prev;
        size--;
        System.out.println("Data berhasil dihapus");
        current.data.tampil();
    }

    // method getFirst:
    public void getFirst() {
        if (isEmpty()) {
        System.out.println("Linked List kosong");
        return;
        }
        head.data.tampil();
    }

    // method getLast:
    public void getLast() {
        if (isEmpty()) {
        System.out.println("Linked List kosong");
        return;
        }
        tail.data.tampil();
    }

    // method getIndex:
    public void getIndex(int index) {
        if (index < 0 || index >= size) {
        System.out.println("Index di luar batas");
        return;
        }
        Node06 current = head;
        for (int i = 0; i < index; i++) {
        current = current.next;
        }
        current.data.tampil();
    }

    // method size
    public int size() {
        return size;
    }
}