/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin6_1;

import java.util.Scanner;

/**
 *
 * @author xdeantabelisario
 */
public class Boletin6_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Positivo p;
        Scanner sc;
        sc=new Scanner(System.in);
        System.out.println("Introduzca numero:");
        p=new Positivo(sc.nextDouble());
        if(p.esPositivo()){
            System.out.println("El numero es: " + p.getNumero() + " y es positivo.");
        }
    }
    
}
