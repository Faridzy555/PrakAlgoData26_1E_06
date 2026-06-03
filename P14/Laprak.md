# Laporan Praktikum Algoritma Struktur Data Jobsheet 14

<h4>Nama: Farid Febrianto</h4>
<h4>NIM: 254107020232</h4>
<h4>Kelas: TI-1E</h4>
<h4>Absen: 06</h4>

## Praktikum 1: Implementasi Binary Search Tree menggunakan Linked List

## Hasil Praktikum 1:
<img width="898" height="897" alt="image" src="https://github.com/user-attachments/assets/35a04413-a7d4-472a-b76b-1a0ffccd9eb9" />

## Pertanyaan Praktikum 1:
<img width="769" height="477" alt="image" src="https://github.com/user-attachments/assets/e91b19f8-5e6a-4c86-aefa-690c8b83425f" />

## Jawaban Praktikum 1:
1. Saat mencari data, kita tidak perlu memeriksa semua node. Jika nilai yang dicari lebih kecil dari root maka langsung ke kiri, jika lebih besar langsung ke kanan. Hal ini membuat pencarian lebih cepat dibanding Binary Tree biasa yang mungkin harus memeriksa seluruh node.

2.
- left digunakan untuk menyimpan referensi ke anak kiri.
- right digunakan untuk menyimpan referensi ke anak kanan.
- Kedua atribut tersebut berfungsi untuk menghubungkan node-node sehingga membentuk struktur pohon (tree).

3.
- a. root digunakan untuk menyimpan alamat node akar (root node) yang merupakan titik awal seluruh operasi tree seperti pencarian, penambahan, traversal, dan penghapusan.

- b. iya, bernilai null karena belum memiliki node.

4. Ketika tree masih kosong, node baru yang ditambahkan akan langsung menjadi root dari Binary Tree.

5.
- Baris program tersebut digunakan untuk menentukan posisi node baru sesuai aturan BST.
- Jika IPK yang akan dimasukkan lebih kecil dari IPK node saat ini, pencarian posisi dilanjutkan ke subtree kiri.
- Jika lebih besar atau sama, pencarian posisi dilanjutkan ke subtree kanan.

6. Saat menghapus node yang memiliki dua anak, method delete() akan mencari successor (node pengganti) menggunakan getSuccessor(). Successor adalah node dengan nilai terkecil pada subtree kanan. Setelah ditemukan, successor menggantikan posisi node yang dihapus sehingga struktur Binary Search Tree tetap benar.

## Praktikum 2: Implementasi Binary Tree dengan Array

## Hasil praktikum 2:
<img width="1000" height="227" alt="image" src="https://github.com/user-attachments/assets/2e7ae5a7-0e84-4502-8422-17d0f318baaa" />

## Pertanyaan Praktikum 2:
<img width="711" height="186" alt="image" src="https://github.com/user-attachments/assets/f9ae5a9e-2597-4f44-87d1-98d4014a6e74" />

## Jawaban praktikum 2:
1.
- data digunakan untuk menyimpan node-node Binary Tree dalam bentuk array.
- idxLast digunakan untuk menyimpan indeks terakhir yang berisi data pada array.

2. Method populateData() digunakan untuk mengisi array Binary Tree dengan data yang akan digunakan serta menentukan nilai idxLast.

3. Method traverseInOrder() digunakan untuk menampilkan atau mengunjungi node-node pada Binary Tree dengan urutan Left lalu ke Root lalu ke Right.

4.
- Left Child berada pada indeks 5 (2 × 2 + 1)
- Right Child berada pada indeks 6 (2 × 2 + 2)

5. Statement tersebut menunjukkan bahwa indeks terakhir yang berisi data adalah indeks ke-6, sehingga traversal hanya memproses data dari indeks 0 sampai 6.

6. Indeks 2*idxStart+1 dan 2*idxStart+2 digunakan untuk menentukan posisi anak kiri dan anak kanan dari suatu node pada Binary Tree yang disimpan dalam array, sehingga proses traversal dapat mengikuti struktur pohon biner dengan benar.

## Tugas Praktikum
<img width="711" height="252" alt="image" src="https://github.com/user-attachments/assets/6bd6099b-f0ae-43e6-ad4a-7d030818f715" />

## Jawaban Tugas Praktikum:
1.
<img width="645" height="359" alt="image" src="https://github.com/user-attachments/assets/d5bdd133-5961-448a-bfa8-d48c56cd8e5b" />

2.
<img width="580" height="598" alt="image" src="https://github.com/user-attachments/assets/49b51381-5a7c-4931-b443-f03f6d8bd544" />

3.
<img width="666" height="314" alt="image" src="https://github.com/user-attachments/assets/44a6fac1-2f72-4e11-9cc0-87bbd6b243da" />

4.
<img width="460" height="408" alt="image" src="https://github.com/user-attachments/assets/8d2009bb-bba8-4b5b-b7b4-d6956a35bb2f" />

## Hasil Tugas Praktikum:
<img width="1005" height="450" alt="Screenshot 2026-06-03 064640" src="https://github.com/user-attachments/assets/b79c2991-c4ab-4b95-a514-35022e7495fd" />