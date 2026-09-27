/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author ASUS
 */
public class Pesanan {
    private static int nomorPesanan = 1;

    private String idPesanan;
    private Buket buket;
    private int jumlah;
    private double totalHarga;
    private double pembayaran;

    public Pesanan(Buket buket, int jumlah) {
        this.idPesanan = String.format("PS%03d", nomorPesanan++);
        this.buket = buket;
        this.jumlah = jumlah;
        this.totalHarga = buket.hitungHarga(jumlah);
    }

    public Buket getBuket() {
        return buket;
    }

    public int getJumlah() {
        return jumlah;
    }
    
    public double getTotalHarga() {
        return totalHarga;
    }

    public void setPembayaran(double pembayaran) {
        this.pembayaran = pembayaran;
    }

    public void tampilkanInvoice() {
        DateTimeFormatter format =
                DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
    
        System.out.println("\n========== INVOICE 💐 ==========");
            System.out.println("ID Pesanan  : " + idPesanan);
            System.out.println("Tanggal     : "
                    + LocalDateTime.now().format(format));
            System.out.println("------------------------------");
            System.out.println("Nama Buket  : " + buket.getNama());
            System.out.println("Jumlah      : " + jumlah);
            System.out.println("Harga       : Rp" + buket.getHarga());
            System.out.println("------------------------------");
            System.out.println("Total Harga : Rp" + totalHarga);
            System.out.println("Pembayaran  : Rp" + pembayaran);
            System.out.println("Kembalian   : Rp" + (pembayaran - totalHarga));
            System.out.println("==============================");
            System.out.println("Terima kasih telah memesan!");
    }
}
