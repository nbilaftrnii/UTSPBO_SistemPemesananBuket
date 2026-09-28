# 💐 Sistem Pemesanan Buket - Bloom mam - ୧⍤⃝💐

**Nama** : Nabila Fitriani 

**NIM**  : 2509116063  

**Kelas** : B  

**Mata Kuliah** : Pemograman Berorientasi Objek

---
## 📌 Deskripsi Proyek

**Bloom mam** merupakan program **Sistem Pemesanan Buket** berbasis Command Line Interface (CLI) yang dibuat menggunakan bahasa pemrograman **Java**. Program ini dirancang untuk membantu pengguna dalam melihat pilihan buket dan melakukan pemesanan sesuai kebutuhan.

Program menyediakan beberapa pilihan, mulai dari melihat daftar buket yang tersedia, memesan buket biasa, membuat buket custom, melakukan pembayaran, hingga melihat riwayat pesanan yang telah berhasil dilakukan.

Program menerapkan konsep Pemrograman Berorientasi Objek (OOP) seperti class, object, constructor, encapsulation, inheritance, polymorphism, dan ArrayList.

🔹 **Fitur Utama:**
- Melihat daftar buket yang tersedia beserta harga dan stok.
- Memesan buket berdasarkan pilihan dan jumlah yang diinginkan.
- Membuat buket custom dengan isi dan permintaan khusus.
- Melakukan pembayaran serta melakukan pembayaran kembali jika jumlah uang kurang.
- Membatalkan pembayaran apabila pengguna tidak ingin melanjutkan transaksi.
- Melihat riwayat pesanan yang telah berhasil.

---
## 🗃️ Hierarki Class

Struktur Package dari program ini terdiri dari beberapa package dan class yang memiliki fungsinya masing-masing dalam mengelola sistem buket.

<img width="201" height="199" alt="image" src="https://github.com/user-attachments/assets/844ff937-c742-4a77-8abf-601cda87542d" />

### 📊 Diagram Hierarki Class

Struktur hubungan inheritance pada program dapat digambarkan sebagai berikut:

                         Buket
                      (Superclass)
                           |
          +----------------+----------------+
          |        |       |       |         |
          v        v       v       v         v
     BuketBunga  BuketSnack  BuketUang  BuketBoneka  BuketCustom
      (Subclass)  (Subclass)  (Subclass)   (Subclass)    (Subclass)

### 📦 Penjelasan Package

Program Bloom mam terdiri dari beberapa package yang digunakan untuk mengelompokkan class berdasarkan fungsinya.

**1. Package main**
 
   Package main digunakan sebagai bagian utama untuk menjalankan program.

   Class yang terdapat di dalamnya adalah:

- Main >> digunakan untuk menjalankan program, menampilkan menu utama, mengatur proses pemesanan, pembayaran, dan riwayat pesanan.

**2. Package model**

   Package model digunakan untuk menyimpan class yang menjadi model atau objek utama dalam sistem pemesanan buket.

   Class yang terdapat di dalamnya adalah:

- Buket >> **superclass** yang menyimpan data umum buket seperti nama, harga, dan stok.
- BuketBunga >> **subclass** untuk jenis buket bunga.
- BuketSnack >> **subclass** untuk jenis buket snack.
- BuketUang >> **subclass** untuk jenis buket uang.
- BuketBoneka >> **subclass** untuk jenis buket boneka.
- BuketCustom >> **subclass** untuk buket yang dibuat sesuai isi dan permintaan pengguna.
- Pesanan >> menyimpan data buket yang dipesan, jumlah pesanan, dan pembayaran.

---
## Konsep Pemrograman Berorientasi Objek 🧑🏻‍💻

Program Sistem Pemesanan Buket menerapkan beberapa konsep Pemrograman Berorientasi Objek, yaitu:

- Inheritance
- Polymorphism
- Condition
- Looping

---
**1. Inheritance**

Konsep inheritance digunakan untuk membuat class baru yang mewarisi atribut dan method dari class yang sudah ada.

Pada program ini, class Buket menjadi superclass, sedangkan lima class lainnya menjadi subclass, yaitu:
- BuketBunga
- BuketSnack
- BuketUang
- BuketBoneka
- BuketCustom

Hierarki inheritance dapat digambarkan sebagai berikut:

                         Buket
                      (Superclass)
                           |
          +----------------+----------------+
          |        |       |       |         |
          v        v       v       v         v
     BuketBunga  BuketSnack  BuketUang  BuketBoneka  BuketCustom
      (Subclass)  (Subclass)  (Subclass)   (Subclass)    (Subclass)

Contoh penerapannya:

- Pada SuperClass Buket

<img width="208" height="76" alt="image" src="https://github.com/user-attachments/assets/5486213d-2bcf-46e3-b955-e9f4c9826d9c" />

- Pada SubClass BuketBunga
  
<img width="477" height="111" alt="image" src="https://github.com/user-attachments/assets/4aaa4619-57c4-4d0b-b547-1318467e96c8" />

Kata **extends** menunjukkan bahwa BuketBunga **mewarisi** class Buket.

Dengan inheritance, atribut umum seperti nama, harga, dan stok tidak perlu dibuat ulang pada setiap jenis buket.

---
**2. Polymorphism**

Konsep polymorphism diterapkan melalui method **overriding**.

Class Buket memiliki method:

<img width="413" height="95" alt="image" src="https://github.com/user-attachments/assets/ff2abe97-584a-45e0-be85-086a3dff8fee" />

Method tersebut kemudian dapat **di-_override_** oleh subclass untuk menampilkan informasi tambahan sesuai dengan jenis buket.

Contohnya pada BuketBunga:

<img width="461" height="154" alt="image" src="https://github.com/user-attachments/assets/b088eaeb-4481-47a9-aeca-98b29d4c9b0f" />

Subclass lainnya juga memiliki bentuk **tampilkanInfo()** masing-masing.
- BuketBunga  -> menampilkan jenis bunga
- BuketSnack  -> menampilkan jenis snack
- BuketUang   -> menampilkan nominal uang
- BuketBoneka -> menampilkan ukuran boneka
- BuketCustom -> menampilkan isi dan permintaan khusus

Walaupun menggunakan nama method yang sama, informasi yang ditampilkan dapat berbeda sesuai dengan **objek** yang digunakan.

---
**3. Condition**

Condition atau percabangan digunakan untuk menentukan tindakan program berdasarkan **kondisi tertentu**. Pada sistem ini, salah satu penerapannya terdapat pada **menu utama**, yaitu untuk menentukan fitur yang dijalankan berdasarkan pilihan pengguna.

<img width="655" height="464" alt="image" src="https://github.com/user-attachments/assets/ccf9b33e-9619-4d27-a8bb-61e639016a7b" />

Pada kode tersebut, program menggunakan **if-else** untuk mengecek pilihan menu yang dimasukkan pengguna. Setiap pilihan akan menjalankan fungsi yang berbeda, sedangkan pilihan selain 1 sampai 5 akan dianggap tidak valid.

---
**4. Looping**

Looping digunakan untuk menjalankan suatu proses secara **berulang** selama kondisi tertentu masih terpenuhi. Pada program ini, looping digunakan pada menu utama agar pengguna dapat memilih menu berkali-kali sampai memilih menu keluar.

Contohnya:

<img width="493" height="296" alt="image" src="https://github.com/user-attachments/assets/4df4147b-4514-43b1-b72f-8fb5d852cc7d" />

Looping juga digunakan ketika proses pembayaran perlu dilakukan kembali apabila pembayaran sebelumnya belum mencukupi.

---
## ⚙️ Penjelasan Alur Program

Alur penggunaan program Sistem Pemesanan Buket adalah sebagai berikut:

  1. Program dijalankan melalui class **Main**.
  2. Program menginisialisasi daftar buket yang tersedia.
  3. Program menampilkan **menu utama**.
  4. Pengguna memasukkan **pilihan** menu.
  5. Program menjalankan proses sesuai pilihan pengguna.
  6. Jika pengguna memilih menu **Lihat Daftar Buket**, sistem menampilkan seluruh buket yang tersedia.
  7. Jika pengguna memilih menu **Pesan Buket**, pengguna memilih buket dan jumlah yang ingin dipesan.
  8. Sistem melakukan pengecekan stok sebelum pesanan diproses.
  9. Jika pengguna memilih **Pesan Buket Custom**, pengguna dapat menentukan nama, isi buket, permintaan khusus, harga, dan jumlah.
  10. Setelah pesanan dibuat, sistem melanjutkan ke proses pembayaran.
  11. Jika **pembayaran mencukupi**, sistem menampilkan kembalian dan menyimpan pesanan ke dalam riwayat.
  12. Jika **pembayaran kurang**, sistem menampilkan jumlah kekurangan dan memberikan pilihan untuk melakukan pembayaran kembali atau membatalkan transaksi.
  13. Jika pengguna memilih menu **Riwayat Pesanan**, sistem menampilkan pesanan yang telah berhasil.
  14. Jika pengguna memilih menu **Keluar**, program dihentikan.

### 📊 Diagram Alur Program

```
Mulai
  |
  v
Inisialisasi Daftar Buket
  |
  v
Tampilkan Menu Utama
  |
  v
Masukkan Pilihan
  |
  +----> 1. Lihat Daftar Buket
  |              |
  |              v
  |        Tampilkan Buket
  |              |
  |              v
  |        Kembali ke Menu
  |
  +----> 2. Pesan Buket
  |              |
  |              v
  |        Pilih Buket & Jumlah
  |              |
  |              v
  |           Cek Stok
  |              |
  |              v
  |          Pembayaran
  |           /       \
  |       Berhasil    Kurang
  |          |           |
  |          v           v
  |      Simpan      Bayar Lagi
  |      Pesanan       / Batal
  |
  +----> 3. Pesan Buket Custom
  |              |
  |              v
  |        Buat Buket Custom
  |              |
  |              v
  |          Pembayaran
  |
  +----> 4. Riwayat Pesanan
  |              |
  |              v
  |        Tampilkan Riwayat
  |
  +----> 5. Keluar
                 |
                 v
              Selesai
```

---
## ▶️ Running Program

**1. Menu Utama**

Menu utama merupakan tampilan awal ketika program dijalankan. Pengguna dapat memilih fitur yang tersedia dengan memasukkan angka 1 sampai 5.

**Kode:**

<img width="613" height="441" alt="image" src="https://github.com/user-attachments/assets/ebbfab13-d060-4527-b1ea-e6a83a2a50a3" /><br>


<img width="656" height="464" alt="image" src="https://github.com/user-attachments/assets/07305046-00a5-496d-8153-fcedfdd5ad9b" />

Kode tersebut menggunakan **if, else** untuk mengecek pilihan pengguna. Setiap angka akan menjalankan method yang berbeda. Misalnya, pilihan 1 menjalankan tampilkanDaftarBuket(), sedangkan pilihan 5 digunakan untuk keluar dari program. Jika pengguna memasukkan angka selain pilihan yang tersedia, program akan menampilkan pesan bahwa pilihan tidak valid.

**Output:**

<img width="320" height="274" alt="image" src="https://github.com/user-attachments/assets/7bc3c12d-cadc-4f30-aee2-842105a7c3d4" />

Output menampilkan menu utama Sistem Pemesanan Buket yang berisi lima pilihan. Pengguna dapat memasukkan nomor menu untuk menjalankan fitur yang diinginkan.

**2. Menampilkan Daftar Buket**

Menu ini digunakan untuk melihat semua buket yang tersedia sebelum pengguna melakukan pemesanan.

**Kode:**

<img width="517" height="210" alt="image" src="https://github.com/user-attachments/assets/491ef09a-29dd-4319-8f99-835fbcfcf2a1" />

Method **tampilkanDaftarBuket()** digunakan untuk menampilkan seluruh data buket yang tersimpan dalam daftarBuket. Perulangan **for** digunakan agar setiap buket dapat ditampilkan satu per satu. Method **tampilkanInfo()** kemudian dipanggil untuk menampilkan informasi dari masing-masing buket.

**Output:**

<img width="257" height="543" alt="image" src="https://github.com/user-attachments/assets/abbe30ae-9fdb-4412-ac3d-e895fe1e1a69" />

Output menampilkan beberapa jenis buket yang tersedia, seperti Lily Bouquet, Sweet Bouquet, Money Bouquet, dan Cute Bouquet. Informasi yang ditampilkan menyesuaikan jenis buket, seperti nama, harga, stok, serta informasi tambahan lainnya.

**3. Pemesanan Buket**

Menu ini digunakan untuk melakukan pemesanan dari buket yang sudah tersedia pada daftar buket. Pengguna memilih buket, menentukan jumlah pesanan, kemudian melakukan pembayaran.

**Kode:**

<img width="493" height="442" alt="image" src="https://github.com/user-attachments/assets/f56f4fb5-6dc0-49f4-9a0b-df8dfb3f7e99" /><br>

<img width="411" height="220" alt="image" src="https://github.com/user-attachments/assets/7b9f272a-cf36-4bc3-8cbb-06b2b95e2ffa" />

Kode tersebut digunakan untuk menerima pilihan buket dan jumlah yang ingin dipesan. **Nilai pilihan** digunakan untuk mengambil data buket dari daftarBuket, sedangkan jumlah digunakan untuk menentukan banyaknya buket yang dipesan.

**Output:**

<img width="262" height="537" alt="image" src="https://github.com/user-attachments/assets/3feddec8-3895-47b7-8dbe-ede78c998432" /><br>

<img width="312" height="483" alt="image" src="https://github.com/user-attachments/assets/d3afd558-d8ef-4532-b4fd-6c195c75b630" />

Output menunjukkan pengguna memilih salah satu buket dan memasukkan jumlah yang ingin dipesan. Setelah data dimasukkan, sistem akan melanjutkan proses pesanan apabila stok masih mencukupi.

**4. Pemesanan Buket Custom**

Menu buket custom digunakan untuk pengguna yang ingin membuat buket dengan isi sesuai keinginan. Isi buket tidak harus mengikuti jenis buket yang sudah tersedia pada daftar.

**Kode:**

<img width="566" height="492" alt="image" src="https://github.com/user-attachments/assets/66d8fba8-87a6-4d06-8357-f9cd8e8274bd" /><br>

<img width="492" height="384" alt="image" src="https://github.com/user-attachments/assets/51e86b3c-ffd9-4fe2-b301-f22d411dc484" /><br>

<img width="570" height="315" alt="image" src="https://github.com/user-attachments/assets/c09043d8-8b37-4dde-b8e7-3a6db0865a01" />

Kode tersebut meminta pengguna memasukkan data buket custom, yaitu nama buket, isi buket, permintaan khusus, harga, dan jumlah pesanan. Data tersebut kemudian digunakan untuk membuat object BuketCustom.

**Output:**

<img width="305" height="366" alt="image" src="https://github.com/user-attachments/assets/97d8ca36-9e5f-40b8-8811-1fe1d3df4850" /><br>

<img width="313" height="407" alt="image" src="https://github.com/user-attachments/assets/b0a35436-3224-455a-bef8-9bffd0255de0" />

Output menunjukkan pengguna dapat menentukan sendiri isi buket dan informasi lainnya. Setelah seluruh data dimasukkan, sistem akan membuat pesanan berdasarkan data custom tersebut.

**5. Pembayaran Berhasil**

Setelah pesanan dibuat, pengguna harus melakukan pembayaran sesuai dengan total harga pesanan. Jika pembayaran mencukupi, sistem akan menyatakan pembayaran berhasil dan menghitung kembalian.

**Kode:**

<img width="610" height="342" alt="image" src="https://github.com/user-attachments/assets/2dd369ce-eff2-4fdc-b02e-72757f53c48d" />

Kondisi **if** digunakan untuk membandingkan jumlah pembayaran dengan total harga pesanan. Jika pembayaran lebih besar atau sama dengan total harga, pembayaran dianggap berhasil. Sistem kemudian menyimpan jumlah pembayaran dan menghitung **kembalian** dari selisih pembayaran dengan total harga.

**Output:**

<img width="308" height="121" alt="image" src="https://github.com/user-attachments/assets/5e9f679b-3b1b-4c46-a71a-fca43ebd3fe6" />

Output menampilkan informasi bahwa pembayaran berhasil, kemudian menunjukkan total harga, jumlah uang yang dibayarkan, dan kembalian yang diterima pengguna.

**6. Pembayaran Kurang**

Jika pembayaran yang diberikan belum mencukupi total harga, sistem tidak langsung menyelesaikan pesanan. Sistem akan menghitung dan menampilkan jumlah kekurangan pembayaran.

**Kode:**

<img width="641" height="346" alt="image" src="https://github.com/user-attachments/assets/599cd331-79b4-4f7f-8552-af107988048b" />

Variabel **kekurangan** digunakan untuk menghitung selisih antara total harga dengan jumlah pembayaran. Hasil perhitungan tersebut kemudian ditampilkan agar pengguna mengetahui jumlah uang yang masih harus dibayarkan.

Setelah itu, pengguna dapat memilih apakah ingin melakukan pembayaran kembali atau membatalkan pesanan.

**Output:**

<img width="308" height="412" alt="image" src="https://github.com/user-attachments/assets/6f45c1f9-ec86-4289-9217-d254d525fd48" />

Output menunjukkan bahwa pembayaran belum mencukupi. Sistem menampilkan total harga, jumlah pembayaran, dan nominal kekurangan yang harus dibayarkan.

**7. Riwayat Pesanan**

Menu riwayat pesanan digunakan untuk melihat kembali seluruh pesanan yang sudah berhasil diproses dan disimpan oleh sistem.

**Kode:**

<img width="546" height="559" alt="image" src="https://github.com/user-attachments/assets/85146fc5-4afd-4dcf-b0dd-5b84c32ab842" />

Program terlebih dahulu mengecek apakah **daftarPesanan** masih kosong. Jika kosong, sistem menampilkan pesan bahwa belum ada pesanan. Jika terdapat pesanan, perulangan **for** digunakan untuk menampilkan invoice dari setiap pesanan yang tersimpan.

**Output:**

<img width="275" height="258" alt="image" src="https://github.com/user-attachments/assets/6135cffe-f4bf-4811-a76f-7508a99d2ec1" />

Output menampilkan daftar pesanan yang sebelumnya telah berhasil diproses. Pengguna dapat melihat kembali detail pesanan melalui menu ini.

**8. Keluar dari Program**

Menu keluar digunakan untuk **mengakhiri** penggunaan sistem. Ketika pengguna memilih menu nomor 5, program akan menampilkan pesan terima kasih kemudian keluar dari sistem.

**Kode:**

<img width="647" height="211" alt="image" src="https://github.com/user-attachments/assets/fdad301a-b39d-477a-8090-006469cc0736" />

Kondisi else if (pilihan == 5) digunakan untuk mengecek apakah pengguna memilih menu **keluar**. Jika pilihan bernilai 5, program akan menjalankan System.out.println() untuk menampilkan pesan terima kasih kepada pengguna.

**Output:**

<img width="519" height="145" alt="image" src="https://github.com/user-attachments/assets/31bbb109-60ab-4979-bb45-e660cc33d985" />

Output menunjukkan bahwa pengguna telah memilih menu 5. Keluar. Sistem kemudian menampilkan pesan terima kasih sebagai tanda bahwa program selesai digunakan.
