/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin6_5;

/**
 *
 * @author xdeantabelisario
 */
public class Busq_mayor {
    private int num1;
    private int num2;
    private int num3;
    private int mayor;
    
    public Busq_mayor(){
        num1=num2=num3=0;
    }
    
    public Busq_mayor(int a, int b, int c){
        num1=a;
        num2=b;
        num3=c;
    }
    
    public int getNum1(){
        return num1;
    }
    public int getNum2(){
        return num2;
    }
    public int getNum3(){
        return num3;
    }
    public void setNum1(int num){
        num1=num;
    }
    public void setNum2(int num){
        num2=num;
    }
    public void setNum3(int num){
        num3=num;
    }
    public int getMayor(){
        return mayor;
    }
    public void buscarMayor(){
        if(num1 > num2){
            if(num1 > num3){
                mayor=num1;
            }else{
                if(num3 > num2){
                    mayor=num3;
                }
            }
        }else{
            if(num2 > num3){
                mayor=num2;
            }else{
                mayor=num3;
            }
        }
    }
}
