/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin6_2;

import java.util.Scanner;

/**
 *
 * @author xdeantabelisario
 */
public class Boletin6_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Comparacion cp;
        Scanner sc;
        sc=new Scanner(System.in);
        System.out.println("Introduzca 2 numeros:");
        cp=new Comparacion(sc.nextShort(),sc.nextShort());
        if(cp.mayor()){
            System.out.println("La resta es: " + cp.resta());
        }else{
            System.out.println("La suma es: " + cp.suma());
        }
    }
    
}
