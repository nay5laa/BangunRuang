package com.mycompany.bangunruang;

import java.util.Scanner;

class Tabung extends BangunRuang {
    Scanner wiu = new Scanner(System.in);
    
    double r;
    double t;
    double phi = 3.14;
    double V;
    double LuasP;
    
    @Override
    void Vol() {
        System.out.println("Menghitung Volume Tabung");
        System.out.print("Jari-Jari: ");
        r = wiu.nextDouble();
        System.out.print("Tinggi: ");
        t = wiu.nextDouble();
        
        V = phi*r*r*t;
        System.out.println("Volume Tabung: " + V);
        System.out.println("----------------");
    }
    
    @Override
    void LP() {
        System.out.println("Menghitung Luas Permukaan Tabung");
        System.out.print("Jari-Jari: ");
        r = wiu.nextDouble();
        System.out.print("Tinggi: ");
        t = wiu.nextDouble();
        
        LuasP = (2*phi*r*t) + (2*phi*r*r);
        System.out.println("Luas Permukaan Tabung: " + LuasP);
        System.out.println("----------------");
    }
}
