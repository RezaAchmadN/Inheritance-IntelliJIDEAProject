package com.dicoding.inheritance;

public class Hewan {
    private String ras;
    private String makanan;

    public Hewan(String ras,String makanan) {
    this.ras = ras;
    this.makanan = makanan;
    }

    @Override
    public String toString() {
        return "Hewan ini berjenis "+ras+" dan memakan "+makanan;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Hewan){
            Hewan other = (Hewan) obj;
            return this.makanan.equals(other.makanan);
        } else if (obj instanceof Kendaraan){
            return true;
        } else{
            return false;
        }
    }
}
