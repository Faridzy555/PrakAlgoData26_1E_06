# Laporan Praktikum Algoritma Struktur Data Jobsheet 6

<h4>Nama: Farid Febrianto</h4>
<h4>NIM: 254107020232</h4>
<h4>Kelas: 1E</h4>
<h4>Absen: 06</h4>

## Hasil Searching Menggunakan Algoritma Sequential Search:
<img width="896" height="772" alt="Screenshot 2026-04-09 203112" src="https://github.com/user-attachments/assets/065bf7d7-f724-4d4d-a597-0c57fe8c68bf" />

## Pertanyaan:
<img width="717" height="388" alt="Screenshot 2026-04-09 203342" src="https://github.com/user-attachments/assets/cf33f513-4c43-4b58-8057-36eac25d11af" />

## Jawaban:
1.
- tampilPosisi: Berfungsi untuk menginformasikan status apakah data ditemukan atau tidak, serta menampilkan nomor indeks (posisi) data tersebut di dalam array.
- tampilDataSearch: Berfungsi untuk menampilkan rincian atribut lengkap dari objek mahasiswa yang ditemukan, seperti NIM, Nama, dan Kelas, berdasarkan indeks yang diberikan.

2.
Fungsi break digunakan untuk menghentikan paksa perulangan (for) segera setelah data yang dicari ditemukan. Hal ini dilakukan untuk efisiensi agar program tidak perlu memeriksa sisa elemen array lainnya jika target sudah didapat.

3.
Variabel ini berfungsi sebagai penanda (flag) sekaligus penyimpan lokasi data yang dicari. Jika pos tetap -1, berarti data tidak ditemukan. Jika bernilai lain, maka nilai tersebut digunakan sebagai acuan indeks untuk mengakses data spesifik pada array listMhs.

4.
Program akan menampilkan data yang pertama kali ditemukan (indeks terkecil). Hal ini dikarenakan adanya perintah break yang langsung menghentikan pencarian setelah kecocokan pertama terdeteksi.

5.
Program akan terus melakukan perulangan sampai akhir indeks array meskipun data sudah ditemukan. Jika ada beberapa data dengan nilai yang sama, variabel posisi akan menyimpan indeks dari data yang terakhir ditemukan (menimpa temuan sebelumnya).

## Hasil Searching Menggunakan Algoritma Binary Search:
<img width="913" height="752" alt="Screenshot 2026-04-09 220026" src="https://github.com/user-attachments/assets/a8615c60-e2d5-45f9-851e-b43a485479f1" />

## Pertanyaan:
<img width="726" height="377" alt="Screenshot 2026-04-09 220147" src="https://github.com/user-attachments/assets/3cce894e-5a08-4fdb-a1cc-fcbca4af5673" />

## Jawaban:
1.
Proses divide terjadi pada baris kode: mid = (left + right) / 2;. Di sini, rentang pencarian dibagi menjadi dua bagian dengan menentukan titik tengah.

2.
Proses qonquer Terjadi saat program melakukan perbandingan dan memperkecil jangkauan pencarian melalui rekursif:

- return findBinarySearch(cari, left, mid - 1); (mencari di bagian kiri).
- return findBinarySearch(cari, mid + 1, right); (mencari di bagian kanan).

3.
- left: Menandai batas awal (indeks terendah) dari rentang pencarian yang aktif.
- right: Menandai batas akhir (indeks tertinggi) dari rentang pencarian yang aktif.
- mid: Menandai titik tengah dari rentang antara left dan right untuk dibandingkan dengan data yang dicari.

4.
Jika data tidak urut maka program tidak akan berjalan dengan benar (hasilnya bisa tidak ditemukan atau salah). Algoritma Binary Search secara matematis mewajibkan data dalam keadaan terurut agar dapat menentukan apakah pencarian harus berlanjut ke arah kiri atau kanan dari mid.

5.
Hasilnya tidak akan sesuai karena logika default listMhs[mid].ipk > cari ditujukan untuk data menaik (ascending).

Kode Program:

else if (listMhs[mid].ipk < cari) {

return findBinarySearch(cari, left, mid - 1);

} else {

return findBinarySearch(cari, mid + 1, right);
}

6.
Binary search menyatakan data tidak ditemukan jika kondisi if (right >= left) sudah tidak terpenuhi (nilai right menjadi lebih kecil dari left). Pada titik ini, seluruh kemungkinan rentang telah diperiksa dan program akan mengembalikan nilai -1.

7.
Kode program:

System.out.print("Masukkan jumlah mahasiswa: ");

int jumMhs = input.nextInt();

sc.nextLine();

MahasiswaBerprestasi list = new MahasiswaBerprestasi(jumMhs);