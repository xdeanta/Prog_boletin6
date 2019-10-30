/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin6_6;

import java.util.Scanner;

/**
 *
 * @author xdeantabelisario
 */
public class Boletin6_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Articulo ar;
        Scanner sc;
        sc=new Scanner(System.in);
        System.out.println("Introduzca nombre del articulo y numero de ventas anuales:");
        ar=new Articulo(sc.next(),sc.nextInt());
        System.out.println("Articulo:");
        System.out.println(ar.getNombre());
        System.out.println("Clasificacion por ventas anuales:");
        System.out.println(ar.Clasificacion());
    }
    
}
