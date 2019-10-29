/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin6_3;

/**
 *
 * @author xdeantabelisario
 */
public class Signo {
    private int numero;
    public Signo(){
        
    }
    public Signo(int num){
        numero=num;
    }
    public void setNumero(int num){
        numero=num;
    }
    public int getNumero(int num){
        return num;
    }
    public char signo(){
        if(numero>0){
            return '+';
        }else{
            if(numero<0){
                return '-';
            }else{
                return '0';
            }
        }
    }
}
