package boletin6_1;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author xdeantabelisario
 */
public class Positivo {
    private double numero;
    
    public Positivo(){
        numero=0;
    }
    
    public Positivo(double num){
        numero=num;
    }
    
    public void setNumero(double num){
        numero=num;
    }
    
    public double getNumero(){
        return numero;
    }
    
    public boolean esPositivo(){
        return numero>0;
    }
}
