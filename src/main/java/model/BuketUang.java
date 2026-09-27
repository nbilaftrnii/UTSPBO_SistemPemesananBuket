/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author ASUS
 */
public class BuketUang extends Buket {
    private int nominalUang;
    public BuketUang(String nama, double harga, int stok,
                     int nominalUang) {
        super(nama, harga, stok);
        this.nominalUang = nominalUang;
    }

    @Override
    public void tampilkanInfo() {
        System.out.println("Jenis Buket : Uang");
        System.out.println("Nama Buket  : " + getNama());
        System.out.println("Nominal     : Rp" + nominalUang);
        System.out.println("Harga       : Rp" + getHarga());
        System.out.println("Stok        : " + getStok());
    }

    @Override
    public double hitungHarga(int jumlah) {
        return super.hitungHarga(jumlah);
    }
}
