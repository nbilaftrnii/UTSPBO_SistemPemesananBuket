/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author ASUS
 */
public class BuketBoneka extends Buket {
    private String ukuran;
    public BuketBoneka(String nama, double harga, int stok,
                       String ukuran) {
        super(nama, harga, stok);
        this.ukuran = ukuran;
    }

    @Override
    public void tampilkanInfo() {
        System.out.println("Jenis Buket : Boneka");
        System.out.println("Nama Buket  : " + getNama());
        System.out.println("Ukuran      : " + ukuran);
        System.out.println("Harga       : Rp" + getHarga());
        System.out.println("Stok        : " + getStok());
    }

    @Override
    public double hitungHarga(int jumlah) {
        return super.hitungHarga(jumlah);
    }
}
