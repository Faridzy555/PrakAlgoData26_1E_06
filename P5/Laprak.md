# Laporan Praktikum Algoritma Struktur Data Jobsheet 5

<h4>Nama: Farid Febrianto</h4>
<h4>NIM: 254107020232</h4>
<h4>Kelas: 1E</h4>
<h4>Absen: 06</h4>

## Percobaan 1
<img width="1064" height="146" alt="Screenshot 2026-03-12 083646" src="https://github.com/user-attachments/assets/8bbeaa6a-1e2e-4bef-816d-bd96721bcf34" />

### Pertanyaan:
<img width="772" height="199" alt="Screenshot 2026-03-12 083455" src="https://github.com/user-attachments/assets/99de3494-fbb6-4638-a9ad-982b83371eb3" />

### Jawaban:
1. if: digunakan sebagai base case (kondisi berhenti rekursi).
   
   else: digunakan untuk rekursi, yaitu memecah masalah menjadi lebih kecil.
   
2. bisa, yaitu menggunakan while
   
   contoh:
<img width="256" height="247" alt="Screenshot 2026-03-12 084717" src="https://github.com/user-attachments/assets/8f1826c7-230e-4318-9d6b-9fd72add8270" />

3.
fakto *= i;

- Digunakan pada perulangan (iteratif).

- Nilai faktorial dihitung satu per satu dalam loop.

int fakto = n * faktorialDC(n-1);

- Digunakan pada rekursi Divide and Conquer.

- Nilai dihitung dengan memanggil fungsi dirinya sendiri.

4.
Brute Force:
- Menggunakan perulangan.
- Menghitung dari 1 sampai n.
- Lebih sederhana.

Divide and Conquer:
- Menggunakan rekursi.
- Memecah masalah menjadi submasalah.
- lebih efisien secara konsep algoritma.

## Percobaan 2
<img width="1061" height="361" alt="Screenshot 2026-03-12 092958" src="https://github.com/user-attachments/assets/7019f070-98dc-43b4-9496-8c8df696034c" />

### Pertanyaan:
<img width="769" height="267" alt="Screenshot 2026-03-12 093210" src="https://github.com/user-attachments/assets/5c8e7319-a920-4e37-bd9e-48530f2be911" />

### Jawaban:
1. Perbedaan pangkatBF() dan pangkatDC()

pangkatBF():
- Menggunakan perulangan.
- Mengalikan angka secara berulang.

pangkatDC():
- Menggunakan rekursi.
- Memecah pangkat menjadi setengah.

2. Ya, Bukti:
<img width="536" height="122" alt="Screenshot 2026-03-12 095236" src="https://github.com/user-attachments/assets/b3910baa-1955-4a11-bf85-927ce4976b50" />

3. Sebenarnya tidak wajib, karena nilai sudah ada di atribut class.
  
Method bisa dibuat tanpa parameter, contohnya:

int pangkatBF();

int hasil = 1;

for(int i=0; i<pangkat; i++);

hasil *= nilai;

return hasil;

4. Kesimpulan cara kerja method pangkatBF() dan pangkatDC()
   
pangkatBF():
- Mengalikan angka berulang sebanyak pangkat.
- Iteratif.

pangkatDC():
- Memecah masalah pangkat menjadi lebih kecil.
- Menggunakan rekursi.
- Lebih efisien untuk pangkat besar.

## Percobaan 3
<img width="1059" height="213" alt="Screenshot 2026-03-12 105955" src="https://github.com/user-attachments/assets/70b47e6b-197b-4e7e-ae0a-c88a395d74d9" />

### Pertanyaan:
<img width="587" height="255" alt="Screenshot 2026-03-12 110320" src="https://github.com/user-attachments/assets/0cc9aa8e-2917-498f-b525-ac9186c2c37d" />

### Jawaban:
1. mid digunakan untuk membagi array menjadi dua bagian, tujuannya untuk proses divide dalam algoritma Divide and Conquer.

2.
- menghitung jumlah bagian kiri.
- menghitung jumlah bagian kanan.

3. Karena hasil akhir adalah gabungan dari dua bagian array.

4. Base case pada method TotalDC() terjadi ketika indeks kiri (left) sama dengan indeks kanan (right).

5. Kesimpulan cara kerja totalDC()

Divide:
- Array dibagi dua menggunakan mid.

Conquer:
- Hitung jumlah bagian kiri dan kanan secara rekursif.

Combine:
- Hasil kiri dan kanan dijumlahkan.

## Latihan Praktikum

### Pertanyaan:
<img width="738" height="467" alt="Screenshot 2026-03-12 130023" src="https://github.com/user-attachments/assets/16640c82-51f4-4f64-bfc0-de015d3b9736" />

### Jawaban:
<img width="1061" height="413" alt="Screenshot 2026-03-12 125910" src="https://github.com/user-attachments/assets/f8d3c2f0-924f-4e11-a81a-f3af92a1d5db" />