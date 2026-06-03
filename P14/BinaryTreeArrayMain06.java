public class BinaryTreeArrayMain06 {
    public static void main(String[] args) {

        BinaryTreeArray06 bta = new BinaryTreeArray06();

        Mahasiswa06 m1 = new Mahasiswa06("244160121", "Ali", "A", 3.57);
        Mahasiswa06 m2 = new Mahasiswa06("244160185", "Candra", "C", 3.41);
        Mahasiswa06 m3 = new Mahasiswa06("244160221", "Badar", "B", 3.75);
        Mahasiswa06 m4 = new Mahasiswa06("244160220", "Dewi", "B", 3.35);
        Mahasiswa06 m5 = new Mahasiswa06("244160131", "Devi", "A", 3.48);
        Mahasiswa06 m6 = new Mahasiswa06("244160205", "Ehsan", "D", 3.61);
        Mahasiswa06 m7 = new Mahasiswa06("244160170", "Fizi", "B", 3.86);

        Mahasiswa06[] dataMahasiswa = {m1, m2, m3, m4, m5, m6, m7};

        int idxLast = 6;

        bta.populateData(dataMahasiswa, idxLast);

        System.out.println("\nInOrder Traversal Mahasiswa:");
        bta.traverseInOrder(0);
        System.out.println();

        System.out.println("\nPreOrder Traversal Mahasiswa:");
        bta.traversePreOrder(0);
        System.out.println();
    }
}