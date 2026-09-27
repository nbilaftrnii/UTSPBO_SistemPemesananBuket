/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author ASUS
 */
public class BuketSnack extends Buket {
    private String jenisSnack;
    public BuketSnack(String nama, double harga, int stok,
                      String jenisSnack) {
        super(nama, harga, stok);
        this.jenisSnack = jenisSnack;
    }

    @Override
    public void tampilkanInfo() {
        System.out.println("Jenis Buket : Snack");
        System.out.println("Nama Buket  : " + getNama());
        System.out.println("Jenis Snack : " + jenisSnack);
        System.out.println("Harga       : Rp" + getHarga());
        System.out.println("Stok        : " + getStok());
    }

    @Override
    public double hitungHarga(int jumlah) {
        return super.hitungHarga(jumlah);
    }
}