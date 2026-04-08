# Laporan Praktikum Algoritma Struktur Data Jobsheet 5

<h4>Nama: Farid Febrianto</h4>
<h4>NIM: 254107020232</h4>
<h4>Kelas: 1E</h4>
<h4>Absen: 06</h4>

## Hasil Praktikum 1:
<img width="899" height="805" alt="Screenshot 2026-04-07 123954" src="https://github.com/user-attachments/assets/badcfefa-a33c-4f80-9854-35df359f2b02" />

## Pertanyaan:
<img width="724" height="679" alt="Screenshot 2026-04-07 124157" src="https://github.com/user-attachments/assets/eb657980-1746-4965-b402-ed992fd48adb" />

## Jawaban:
1.
Fungsi kode program tersebut:
Kode tersebut berfungsi untuk melakukan penukaran posisi (swapping) antara dua elemen array jika elemen sebelumnya (data[j-1]) lebih besar daripada elemen sesudahnya (data[j]). Variabel temp digunakan sebagai penampung sementara agar nilai data[j] tidak hilang saat ditimpa oleh data[j-1].

2.
<img width="393" height="150" alt="Screenshot 2026-04-07 201448" src="https://github.com/user-attachments/assets/ec838835-22f7-4d59-b946-02e052c64099" />

3.
Indeks j belum mencapai batas awal array (masih ada elemen untuk dibandingkan), dan nilai elemen pada indeks j (data[j]) lebih besar daripada nilai yang sedang diurutkan (temp). Ini bertujuan untuk mencari posisi yang tepat untuk menyisipkan temp.

4.
Tujuannya adalah untuk menggeser elemen yang nilainya lebih besar ke arah kanan (satu posisi ke depan) guna memberikan ruang kosong bagi nilai temp yang akan disisipkan nantinya.

## Hasil Praktikum 2:
<img width="675" height="836" alt="Screenshot 2026-04-08 075151" src="https://github.com/user-attachments/assets/29fcc947-1dbd-494c-9ede-fd36910ac60a" />

## Pertanyaan:
<img width="696" height="292" alt="Screenshot 2026-04-08 075329" src="https://github.com/user-attachments/assets/9de1ca13-5f0a-43c5-91f2-9e86012b87a1" />

## Jawaban:
1.
A: Syarat i < listMhs.length - 1, karena pada setiap tahap Bubble Sort satu elemen terbesar atau terkecil akan mengapung ke posisi akhirnya. Jika ada N data, kita hanya butuh melakukan N-1 tahap untuk memastikan seluruh data terurut.

B: Syarat j < listMhs.length - i, karena setelah setiap tahap i, elemen di posisi paling belakang sudah pasti terurut, sehingga kita tidak perlu membandingkannya lagi pada tahap berikutnya.

C: Jika data berjumlah 50 maka perulangan i akan berlangsung sebanyak 49 kali (0 sampai 48), tahap bubble sort yang ditempuh adalah 49 tahap.

2.
<img width="583" height="507" alt="Screenshot 2026-04-08 162040" src="https://github.com/user-attachments/assets/38e6c516-2b47-4f67-bb87-c7e5433cdc2c" />

## Hasil Mengurutkan Data Mahasiswa Berdasarkan IPK (Selection Sort):
<img width="689" height="750" alt="Screenshot 2026-04-08 191754" src="https://github.com/user-attachments/assets/3818433e-29db-4bb8-9756-c4439bffec6f" />

## Pertanyaan:
<img width="584" height="256" alt="Screenshot 2026-04-08 192844" src="https://github.com/user-attachments/assets/77d48aa5-e46c-428e-be58-74ff04fb2aa7" />

## Jawaban:
Fungsi proses tersebut:
Proses tersebut bertujuan untuk mencari indeks dari mahasiswa yang memiliki nilai IPK terkecil (minimum) dalam rentang array yang belum terurut (dari indeks i+1 sampai akhir). Setelah ditemukan, indeks tersebut disimpan dalam variabel idxMin untuk ditukarkan dengan elemen pada posisi i.

## Hasil Mengurutkan Data Mahasiswa Berdasarkan IPK Menggunakan Insertion Sort:
<img width="688" height="931" alt="Screenshot 2026-04-08 194307" src="https://github.com/user-attachments/assets/a823e1ba-127a-4653-b61b-18221d324aa7" />

## Pertanyaan:
<img width="706" height="68" alt="Screenshot 2026-04-08 194418" src="https://github.com/user-attachments/assets/293043eb-ee4a-4f14-b148-f1023b2386e0" />

## Jawaban:
<img width="535" height="266" alt="Screenshot 2026-04-08 195209" src="https://github.com/user-attachments/assets/500af1f2-ed87-4f90-b233-0e2535f33812" />

## Hasil Latihan Praktikum:
<img width="433" height="853" alt="Screenshot 2026-04-08 201714" src="https://github.com/user-attachments/assets/2e61598f-5730-4a74-acba-ae636138c6c8" />
<img width="465" height="782" alt="Screenshot 2026-04-08 201740" src="https://github.com/user-attachments/assets/94934835-a509-483f-a7fb-9606c0fe84af" />