package P6;

class SortingMain06 {
    public static void main(String[] args) {

        System.out.println();
        
        int a[] = {20, 10, 2, 7, 12};
        int b[] = {30, 20, 2, 8, 14};
        int c[] = {40, 10, 4, 9, 3};

        Sorting06 dataurut1 = new Sorting06(a, a.length);
        Sorting06 dataurut2 = new Sorting06(b, b.length);
        Sorting06 dataurut3 = new Sorting06(c, c.length);

        System.out.println("Data awal:");
        dataurut1.tampil();
        dataurut1.bubbleSort();
        System.out.println("Data sudah diurutkan dengan Bubble Sort:");
        dataurut1.tampil();

        System.out.println("Data awal:");
        dataurut2.tampil();
        dataurut2.selectionSort();
        System.out.println("Data sudah diurutkan dengan Selection Sort:");
        dataurut2.tampil();

        System.out.println("Data awal: ");
        dataurut3.tampil();
        dataurut3.insertionSort();
        System.out.println("Data sudah diurutkan dengan Insertion Sort:");
        dataurut3.tampil();
    }
}