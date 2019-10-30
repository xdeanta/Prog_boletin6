/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin6_5;

import java.util.Scanner;

/**
 *
 * @author xdeantabelisario
 */
public class Boletin6_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Busq_mayor bm;
        Scanner sc;
        sc=new Scanner(System.in);
        System.out.println("Introduzca 3 numeros:");
        bm=new Busq_mayor(sc.nextInt(),sc.nextInt(),sc.nextInt());
        bm.buscarMayor();
        System.out.println("Mayor:" + bm.getMayor());
    }
    
}
