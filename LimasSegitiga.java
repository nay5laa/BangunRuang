package com.mycompany.bangunruang;

import java.util.Scanner;

class LimasSegitiga extends BangunRuang {
    Scanner simp = new Scanner(System.in);
    
    double A;
    double t;
    double T;
    double V;
    double LuasP;
    
    @Override
    void Vol() {
        System.out.println("Menghitung Volume Limas Segitiga");
        System.out.print("Alas: ");
        A = simp.nextDouble();
        System.out.print("Tinggi: ");
        t = simp.nextDouble();
        System.out.print("Tinggi Sisi Tegak: ");
        T = simp.nextDouble();
        
        V = (A*t/2)*T/3;
        System.out.println("Volume Limas Segitiga: " + V);
        System.out.println("----------------");
    }
    
    @Override
    void LP() {
        System.out.println("Menghitung Luas Permukaan Limas Segitiga");
        System.out.println("Hitung Luas Alas Terlebih Dahulu");
        System.out.print("Alas: ");
        A = simp.nextDouble();
        System.out.print("Tinggi: ");
        t = simp.nextDouble();
        double LuasA = A*t/2;
        
        System.out.println("Hitung Luas Sisi-Sisi Tegak");
        System.out.print("Alas: ");
        double a = simp.nextDouble();
        System.out.print("Tinggi: ");
        T = simp.nextDouble();
        double LuasST = 3*(a*t/2);
        
        LuasP = LuasA + LuasST;
        System.out.println("Luas Permukaan Limas Segitiga: " + LuasP);
        System.out.println("----------------");
    }
}
