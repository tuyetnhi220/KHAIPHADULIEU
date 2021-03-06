/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lthdt.chuong2.logiclayer;

/**
 *
 * @author Administrator
 */










public class PhuongTrinhBac2 implements GiaiPTInterface {
    
     private double a;
    private double b;
    private double c;
    private double nghiem_x1;
    private double nghiem_x2;
    private String Ketqua;

    @Override
    public void giaiPhuongTrinh() {
       if (a==0){
           //giai pt bac 1
           PhuongTrinhBac1 ptb1 = new PhuongTrinhBac1(b,c);
           ptb1.giaiPhuongTrinh();
           Ketqua = ptb1.getKetqua();
       }else{
           double delta = b*b - 4*a*c;
           if(delta < 0){
               Ketqua = "Phuong trinh bac 2 vo nghiem ";
        }else{
               if(delta == 0){
                   nghiem_x1 = -b/(2*a);
                   Ketqua = "Phuong trinh bac 2 co nghiem kep la " + nghiem_x1;
               }else{
                   nghiem_x1 = -b + Math.sqrt(delta)/(2*a);
                   nghiem_x2 = -b - Math.sqrt(delta)/(2*a);
                   Ketqua = "phuong trinh co 2 nghiem phan biet: "+ nghiem_x1 + "; va x2 " + nghiem_x2;
               }
           }
                   
       }
    }

    public PhuongTrinhBac2() {
    }

    public PhuongTrinhBac2(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public String toString() {
        if(Ketqua==null || Ketqua.isEmpty()) {
           giaiPhuongTrinh();
       }
       return Ketqua;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getNghiem_x1() {
        return nghiem_x1;
    }

    public void setNghiem_x1(double nghiem_x1) {
        this.nghiem_x1 = nghiem_x1;
    }

    public double getNghiem_x2() {
        return nghiem_x2;
    }

    public void setNghiem_x2(double nghiem_x2) {
        this.nghiem_x2 = nghiem_x2;
    }

    public String getKetqua() {
        return Ketqua;
    }

    public void setKetqua(String Ketqua) {
        this.Ketqua = Ketqua;
    }
    
    
}
