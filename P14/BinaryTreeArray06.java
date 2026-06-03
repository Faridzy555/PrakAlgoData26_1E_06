public class BinaryTreeArray06 {
    
    Mahasiswa06[] data;
    int idxLast;

    public BinaryTreeArray06() {
        data = new Mahasiswa06[10];
        idxLast = -1;
    }

    void populateData(Mahasiswa06[] data, int idxLast) {
        this.data = data;
        this.idxLast = idxLast;
    }

    void traverseInOrder(int idxStart) {
        if (idxStart <= idxLast) {
            if (data[idxStart] != null) {
                traverseInOrder(2 * idxStart + 1);
                data[idxStart].tampilInformasi();
                traverseInOrder(2 * idxStart + 2);
            }
        }
    }

    void add(Mahasiswa06 dataBaru) {
        if (idxLast < data.length -1) {
            this.data[++idxLast] = dataBaru;
        } else {
            System.out.println("Array penuh");
        }
    }

    void traversePreOrder(int idxStart) {
        if (idxStart <= idxLast) {
            if (data[idxStart] != null) {
                data[idxStart].tampilInformasi();
                traversePreOrder(2 * idxStart + 1);
                traversePreOrder(2 * idxStart + 2);
            }
        }
    }
}