package com.mycompany.bangunruang;

import java.util.Scanner;

class Bola extends BangunRuang {
    Scanner horray = new Scanner(System.in);
    
    double R;
    double phi = 3.14;
    double LuasP;
    double V;
    
    @Override
    void Vol() {
       System.out.println("Menghitung Volume Bola");
       System.out.print("Jari-Jari: ");
       R = horray.nextDouble();
    
       V = 4/3*phi*R*R*R;
       System.out.println("Volume Bola: " + V);
       System.out.println("-----------------");
    }
    
    @Override
    void LP() {
        System.out.println("Menghitung Luas Permukaan Bola");
        System.out.print("Jari-Jari: ");
        R = horray.nextDouble();
        
        LuasP = 4*phi*R*R;
        System.out.println("Luas Permukaan Bola: " + LuasP);
        System.out.println("----------------");
    }
}
