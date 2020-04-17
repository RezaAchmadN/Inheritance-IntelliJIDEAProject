package com.dicoding.inheritance;

public class Main {
    public static void main(String[] args){
            String s1 = "geeksquiz";
            String s2 = "geeksquiz";
            System.out.println("geeks"+s1==s2);

    }


    public static void mai(String[] args){
        Hewan anjing = new Hewan("Serigala","daging");
        Hewan beo = new Hewan("Burung", "Biji");
        Hewan gecko = new Hewan("Kadal", "daging");
        Kendaraan mobil = new Kendaraan();

        System.out.println(anjing.toString());
        System.out.println(beo.toString());
        System.out.println(gecko.toString());

        System.out.println("anjing = beo? "+anjing.equals(beo));
        System.out.println("anjing = gecko? "+anjing.equals(mobil));
    }
}
