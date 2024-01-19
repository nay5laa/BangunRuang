package com.mycompany.bangunruang;

public class BangunRuang {
    
    void Vol() {
        System.out.println("Menghitung Volume Bangun Ruang");
    }
    
    void LP() {
        System.out.println("Menghitung Luas Permukaan Bangun Ruang");
    }
  
    
    public static void main(String[] args) {
        Bola ball = new Bola();
        
        ball.Vol();
        ball.LP();
        
        Balok block = new Balok();
        
        block.Vol();
        block.LP();
        
        LimasSegitiga tri = new LimasSegitiga();
        
        tri.Vol();
        tri.LP();
        
        Tabung pipa = new Tabung();
        
        pipa.Vol();
        pipa.LP();
        }
}
