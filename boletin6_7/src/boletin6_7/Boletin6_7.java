/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin6_7;

import java.util.Scanner;

/**
 *
 * @author xdeantabelisario
 */
public class Boletin6_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Area fig;
        Scanner sc;
        sc=new Scanner(System.in);
        fig=new Area();
        System.out.println("Seleccione una figura para calcular su area:");
        System.out.println("1. cuadrado");
        System.out.println("2. triangulo");
        System.out.println("3. circulo");
        switch(sc.nextInt()){
            case 1:
                System.out.println("Area del rectangulo:" + fig.area_rect(sc.nextDouble(), sc.nextDouble()));
                break;
            case 2:
                System.out.println("Area del triangulo:" + fig.area_trian(sc.nextDouble(), sc.nextDouble()));
                break;
            case 3:
                System.out.println("Area del circulo:" + fig.area_cir(sc.nextDouble()));
                break;
            default:
                System.out.println("Opcion incorrecta");
        }
    }
    
}
