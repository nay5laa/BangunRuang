package com.mycompany.bangunruang;

import java.util.Scanner;

class Balok extends BangunRuang {
    Scanner boo = new Scanner(System.in);
    
    double P;
    double L;
    double T;
    double V;
    double LuasP;
    
    @Override
    void Vol() {
        System.out.println("Menghitung Volume Balok");
        System.out.print("Panjang: ");
        P = boo.nextDouble();
        System.out.print("Lebar: ");
        L = boo.nextDouble();
        System.out.print("Tinggi: ");
        T = boo.nextDouble();
        
        V = P*L*T;
        System.out.println("Volume Balok = " + V);
        System.out.println("----------------");
    }
    
    @Override
    void LP() {
        System.out.println("Menghitung Luas Permukaan Balok");
        System.out.print("Panjang: ");
        P = boo.nextDouble();
        System.out.print("Lebar: ");
        L = boo.nextDouble();
        System.out.print("Tinggi: ");
        T = boo.nextDouble();
        
        LuasP = 2*((P*L) + (P*T) + (L*T));
        System.out.println("Luas Permukaan Balok: " + LuasP);
        System.out.println("----------------");
    }
}
