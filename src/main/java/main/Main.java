/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package main;

import model.*;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Main {

    static Scanner input = new Scanner(System.in);
    static ArrayList<Buket> daftarBuket = new ArrayList<>();
    static ArrayList<Pesanan> daftarPesanan = new ArrayList<>();

    public static void main(String[] args) {

        inisialisasiBuket();

        int pilihan;

        do {
            System.out.println("================================");
            System.out.println();
            System.out.println("|==========================================|");
            System.out.println("|                                          |");
            System.out.println("|              💐 Bloom mam ୧⍤⃝💐            |");
            System.out.println("|           SISTEM PEMESANAN BUKET         |");
            System.out.println("|                                          |");
            System.out.println("|==========================================|");
            System.out.println("---------------- MENU UTAMA ----------------");
            System.out.println("|                                          |");
            System.out.println("|   [1]  Lihat Daftar Buket                |");
            System.out.println("|   [2]  Pesan Buket                       |");
            System.out.println("|   [3]  Pesan Buket Custom                |");
            System.out.println("|   [4]  Riwayat Pesanan                   |");
            System.out.println("|   [5]  Keluar                            |");
            System.out.println("|                                          |");
            System.out.println("--------------------------------------------");    

            pilihan = inputAngka("Pilih menu: ");

            if (pilihan == 1) {
                tampilkanDaftarBuket();

            } else if (pilihan == 2) {
                pesanBuket();

            } else if (pilihan == 3) {
                pesanBuketCustom();

            } else if (pilihan == 4) {
                tampilkanPesanan();

            } else if (pilihan == 5) {
                System.out.println("Terima kasih telah menggunakan layanan kami!");

            } else {
                System.out.println("Pilihan tidak valid!");
            }

        } while (pilihan != 5);

        input.close();
    }

    static void inisialisasiBuket() {

        daftarBuket.add(new BuketBunga(
                "Lily Bouquet",
                100000,
                10,
                "Lily"
        ));

        daftarBuket.add(new BuketSnack(
                "Sweet Bouquet",
                75000,
                15,
                "Cokelat dan Snack"
        ));

        daftarBuket.add(new BuketUang(
                "Money Bouquet",
                150000,
                8,
                50000
        ));

        daftarBuket.add(new BuketBoneka(
                "Cute Bouquet",
                120000,
                10,
                "Sedang"
        ));
    }

    static void tampilkanDaftarBuket() {

        System.out.println("\n========== DAFTAR BUKET ==========");

        for (int i = 0; i < daftarBuket.size(); i++) {

            System.out.println("\nBuket " + (i + 1));

            daftarBuket.get(i).tampilkanInfo();
        }
    }

    static void pesanBuket() {

        tampilkanDaftarBuket();

        int pilihan = inputAngka("\nPilih nomor buket: ");

        if (pilihan < 1 || pilihan > daftarBuket.size()) {
            System.out.println("Nomor buket tidak tersedia!");
            return;
        }

        Buket buket = daftarBuket.get(pilihan - 1);

        int jumlah = inputAngka("Masukkan jumlah buket: ");

        if (jumlah <= 0) {
            System.out.println("Jumlah harus lebih dari 0!");
            return;
        }

        if (jumlah > buket.getStok()) {
            System.out.println("Stok buket tidak mencukupi!");
            return;
        }

        Pesanan pesanan = new Pesanan(buket, jumlah);

        prosesPembayaran(pesanan);

        buket.setStok(buket.getStok() - jumlah);

        daftarPesanan.add(pesanan);

        System.out.println("\nPembayaran berhasil!");

        pesanan.tampilkanInvoice();
    }

    static void pesanBuketCustom() {

        System.out.println("\n========== PESAN BUKET CUSTOM ==========");

        System.out.print("Nama Buket: ");
        String nama = input.nextLine();

        if (nama.trim().isEmpty()) {
            System.out.println("Nama buket tidak boleh kosong!");
            return;
        }

        System.out.print("Jenis Isi (Bunga/Snack/Uang/Boneka): ");
        String jenisIsi = input.nextLine();

        if (jenisIsi.trim().isEmpty()) {
            System.out.println("Jenis isi tidak boleh kosong!");
            return;
        }

        System.out.print("Permintaan Khusus: ");
        String permintaan = input.nextLine();

        if (permintaan.trim().isEmpty()) {
            System.out.println("Permintaan tidak boleh kosong!");
            return;
        }

        double harga = inputAngkaDouble("Masukkan harga buket: Rp");

        if (harga <= 0) {
            System.out.println("Harga harus lebih dari 0!");
            return;
        }

        int jumlah = inputAngka("Masukkan jumlah buket: ");

        if (jumlah <= 0) {
            System.out.println("Jumlah harus lebih dari 0!");
            return;
        }

        BuketCustom buket = new BuketCustom(
                nama,
                harga,
                jumlah,
                jenisIsi,
                permintaan
        );

        Pesanan pesanan = new Pesanan(buket, jumlah);

        System.out.println("\n========== DETAIL PESANAN ==========");

        buket.tampilkanInfo();

        System.out.println("Jumlah : " + jumlah);
        System.out.println("Total Harga : Rp" + pesanan.getTotalHarga());

        prosesPembayaran(pesanan);

        daftarPesanan.add(pesanan);

        System.out.println("\nPembayaran berhasil!");

        pesanan.tampilkanInvoice();
    }

    static boolean prosesPembayaran(Pesanan pesanan) {
    while (true) {

        double pembayaran = inputAngkaDouble("Masukkan pembayaran: Rp");
        if (pembayaran >= pesanan.getTotalHarga()) {
            pesanan.setPembayaran(pembayaran);
            System.out.println("\n==========================================");
            System.out.println("         PEMBAYARAN BERHASIL");
            System.out.println("==========================================");
            System.out.println("Total Harga : Rp" + pesanan.getTotalHarga());
            System.out.println("Pembayaran  : Rp" + pembayaran);
            System.out.println(
                    "Kembalian   : Rp"
                    + (pembayaran - pesanan.getTotalHarga())
            );
            System.out.println("==========================================");

            return true;
        }
        
        double kekurangan = pesanan.getTotalHarga() - pembayaran;
        System.out.println("\n==========================================");
        System.out.println("           PEMBAYARAN KURANG!!");
        System.out.println("==========================================");
        System.out.println("Total Harga : Rp" + pesanan.getTotalHarga());
        System.out.println("Pembayaran  : Rp" + pembayaran);
        System.out.println("Kekurangan  : Rp" + kekurangan);
        System.out.println("==========================================");
        System.out.print("Mau melakukan pembayaran lagi? (y/n): ");
        String pilihan = input.nextLine();
        if (pilihan.equalsIgnoreCase("n")) {
            System.out.println("\nPembayaran dibatalkan.");
            return false;
        }
        if (!pilihan.equalsIgnoreCase("y")) {

            System.out.println("Pilihan tidak valid.");
            System.out.println("Silakan pilih y untuk bayar lagi atau n untuk batal.");
        }
    }
}
        
    static void tampilkanPesanan() {

        System.out.println("\n========== RIWAYAT PESANAN ==========");

        if (daftarPesanan.isEmpty()) {

            System.out.println("Belum ada pesanan.");

        } else {

            for (Pesanan pesanan : daftarPesanan) {

                System.out.println("-----------------------------");

                System.out.println(
                        "Nama Buket : "
                        + pesanan.getBuket().getNama()
                );

                System.out.println(
                        "Jumlah : "
                        + pesanan.getJumlah()
                );

                System.out.println(
                        "Total : Rp"
                        + pesanan.getTotalHarga()
                );
            }
        }
    }

    static int inputAngka(String pesan) {

        while (true) {

            System.out.print(pesan);

            try {

                return Integer.parseInt(input.nextLine());

            } catch (NumberFormatException e) {

                System.out.println("Input harus berupa angka!");
            }
        }
    }

    static double inputAngkaDouble(String pesan) {

        while (true) {

            System.out.print(pesan);

            try {

                return Double.parseDouble(input.nextLine());

            } catch (NumberFormatException e) {

                System.out.println("Input harus berupa angka!");
            }
        }
    }
}