package boletin6_7;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author xdeantabelisario
 */
public class Area {
    private final double PI;
    public Area(){
        PI=Math.PI;
    }
    public double area_rect(double base, double alt){
        return base*alt;
    }
    public double area_trian(double base, double alt){
        return (base*alt)/2;
    }
    public double area_cir(double radio){
        return PI*Math.pow(radio,2d);
    }
}
