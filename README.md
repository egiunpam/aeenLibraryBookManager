# Aplikasi CRUD & Pencarian Buku

Aplikasi ini menyediakan fungsionalitas **Create, Read, Update, Delete (CRUD)** untuk data buku, dilengkapi dengan fitur pencarian yang memudahkan Anda menemukan buku yang diinginkan.

## Fitur Utama

* **Tambah Buku:** Masukkan data buku baru ke dalam sistem.
* **Lihat Daftar Buku:** Tampilkan semua buku yang tersedia.
* **Edit Buku:** Perbarui informasi buku yang sudah ada.
* **Hapus Buku:** Hapus data buku dari database.
* **Cari Buku:** Temukan buku berdasarkan kriteria tertentu (misalnya judul, penulis, ISBN).

---

## Persyaratan Sistem

Sebelum menjalankan aplikasi, pastikan Anda telah menginstal komponen berikut:

* **MSI File (https://github.com/egiunpam/aeenLibraryBookManager/releases/tag/v1.0):** Jika aplikasi Anda memerlukan installer `.msi` khusus (misalnya, untuk *runtime* atau dependensi tertentu), pastikan Anda telah menjalankannya. Jika tidak ada, Anda bisa menghapus bagian ini.
    * Unduh dan jalankan file `nama_file_installer.msi` (sesuaikan dengan nama file installer Anda).
    * Ikuti instruksi instalasi yang muncul di layar.
* **Database:** Aplikasi ini membutuhkan database. Petunjuk import ada di bagian selanjutnya.

---

## Instalasi dan Setup

Ikuti langkah-langkah di bawah ini untuk mengatur dan menjalankan aplikasi Anda:

### 1. Import Database

Aplikasi ini menggunakan database yang sudah disediakan. Anda perlu mengimpor file `buku.sql` ke sistem manajemen database Anda (misalnya MySQL, PostgreSQL, SQLite). https://github.com/egiunpam/aeenLibraryBookManager/releases/tag/v1.0

**Contoh untuk MySQL menggunakan phpMyAdmin:**

1.  Buka phpMyAdmin di browser Anda.
2.  Buat database baru (misalnya dengan nama `perpustakaan`).
3.  Pilih database yang baru saja Anda buat.
4.  Klik tab **"Import"**.
5.  Klik tombol **"Choose File"** dan pilih file `buku.sql`.
6.  Klik tombol **"Go"** di bagian bawah halaman untuk memulai proses import.

**Contoh untuk MySQL melalui Command Line:**

```bash
mysql -u [username] -p [nama_database_baru] < buku.sql
