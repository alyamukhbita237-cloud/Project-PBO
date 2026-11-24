
# Project PBO

Project aplikasi berbasis Java menggunakan PostgreSQL
(Supabase) sebagai database.

## Teknologi
- Java (OpenJDK 11)
- PostgreSQL
- Supabase
- JDBC PostgreSQL 42.7.14

## Struktur Folder
- src/config : Konfigurasi koneksi database
- src/model : Class model
- src/repository : Interface dan implementasi CRUD
- src/service : Logika bisnis aplikasi
- src/view : Tampilan aplikasi
- lib : JDBC PostgreSQL Driver

## Persiapan
1. Clone repository.
2. Pastikan Java 11 sudah terinstal.
3. Pastikan file JDBC tersedia di folder lib.
4. Buat file config.properties di folder utama.
5. Isi konfigurasi database Supabase.

## Konfigurasi Database

Buat file config.properties dengan format:

db.host=HOST_SUPABASE
db.port=PORT_SUPABASE
db.name=postgres
db.username=USERNAME_SUPABASE
db.password=PASSWORD_SUPABASE

## Menjalankan Aplikasi

Compile:

javac -cp "lib/*" -d out src/config/DatabaseConnection.java src/App.java

Run:

java -cp "out:lib/*" App
