/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author ASUS
 */
public class BuketBunga extends Buket {
    private String jenisBunga;
    public BuketBunga(String nama, double harga, int stok,
                      String jenisBunga) {
        super(nama, harga, stok);
        this.jenisBunga = jenisBunga;
    }

    @Override
    public void tampilkanInfo() {
        System.out.println("Jenis Buket : Bunga");
        System.out.println("Nama Buket  : " + getNama());
        System.out.println("Jenis Bunga : " + jenisBunga);
        System.out.println("Harga       : Rp" + getHarga());
        System.out.println("Stok        : " + getStok());
    }

    @Override
    public double hitungHarga(int jumlah) {
        return super.hitungHarga(jumlah);
    }
}
