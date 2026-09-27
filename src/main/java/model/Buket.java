/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author ASUS
 */
public class Buket {
    private String nama;
    private double harga;
    private int stok;

    public Buket(String nama, double harga, int stok) {
        this.nama = nama;
        this.harga = harga;
        this.stok = stok;
    }

    public String getNama() {
        return nama;
    }

    public double getHarga() {
        return harga;
    }

    public int getStok() {
        return stok;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }
    
    public void tampilkanInfo() {
        System.out.println("Nama Buket : " + nama);
        System.out.println("Harga      : Rp" + harga);
        System.out.println("Stok       : " + stok);
    }

    public double hitungHarga(int jumlah) {
        return harga * jumlah;
    }

    public double hitungHarga(int jumlah, double diskon) {
        return (harga * jumlah) * (1 - diskon / 100);
    }
}
