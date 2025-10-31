# 💰 Menghitung Bunga Tabungan

Program Java sederhana untuk menghitung bunga tabungan berdasarkan jumlah saldo awal, suku bunga tahunan, dan lama waktu menabung.

---

## 📘 Deskripsi

Proyek ini dibuat untuk membantu pengguna menghitung **bunga tabungan sederhana**.  
Program akan meminta input dari pengguna berupa:

- Jumlah dana tabungan awal
- Suku bunga tahunan (dalam persen)
- Lama waktu menabung (dalam tahun)

Setelah itu, program akan menampilkan hasil berupa jumlah bunga yang diperoleh dan total saldo akhir.

---

## ⚙️ Fitur

- Input jumlah tabungan awal
- Input suku bunga tahunan (%)
- Input lama waktu menabung (tahun)
- Perhitungan bunga sederhana
- Menampilkan hasil akhir dengan jelas di konsol

---

## 🛠️ Teknologi yang Digunakan

- **Bahasa:** Java
- **IDE yang disarankan:** IntelliJ IDEA / VS Code / NetBeans
- **Struktur folder proyek:**
- Menghitung-Bunga-Tabungan/ 
- ├── src/ 
- │ └── DataInvestasi.java 
- │ └── KalkulatorBunga.java
- │ └── Main.java
- ├── .gitignore 
- └── README.md

---

## 🚀 Cara Menjalankan Program

1. Clone repositori ini:
 ```bash
 git clone https://github.com/VoxXCode/Menghitung-Bunga-Tabungan.git
 ```
2. Masuk ke folder proyek:
```
cd Menghitung-Bunga-Tabungan
```
3. Compile program Java:
```
javac src/Main.java
```
4. Jalankan program:
```
java src.Main
```
5. Masukkan data sesuai instruksi di konsol, contoh:
```
Masukkan dana tabungan awal: 100000
Masukkan suku bunga tahunan (%): 5
Masukkan lama waktu (tahun): 3
```
6. Hasil yang ditampilkan:
```
Hasil:
Bunga yang diperoleh = 15000
Total saldo setelah 3 tahun = 115000
```

---

## 🧮 Rumus yang Digunakan

Rumus perhitungan bunga sederhana:
```
Bunga = (Saldo Awal × Suku Bunga × Lama Waktu) / 100
```
Total saldo akhir:
```
Saldo Akhir = Saldo Awal + Bunga
```