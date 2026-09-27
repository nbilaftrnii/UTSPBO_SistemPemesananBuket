/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author ASUS
 */
public class BuketCustom extends Buket {
    private String jenisIsi;
    private String permintaan;
    public BuketCustom(String nama, double harga, int stok,
                       String jenisIsi, String permintaan) {
        super(nama, harga, stok);
        this.jenisIsi = jenisIsi;
        this.permintaan = permintaan;
    }

    @Override
    public void tampilkanInfo() {
        System.out.println("Jenis Buket : Custom");
        System.out.println("Nama Buket  : " + getNama());
        System.out.println("Jenis Isi   : " + jenisIsi);
        System.out.println("Permintaan  : " + permintaan);
        System.out.println("Harga       : Rp" + getHarga());
        System.out.println("Stok        : " + getStok());
    }
    
    @Override 
    public double hitungHarga(int jumlah) { 
        return super.hitungHarga(jumlah); }
}
