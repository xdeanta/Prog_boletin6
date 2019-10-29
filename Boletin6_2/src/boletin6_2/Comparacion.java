/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin6_2;

/**
 *
 * @author xdeantabelisario
 */
public class Comparacion {
    private short primer;
    private short segundo;
    
    public Comparacion(){
        
    }
    public Comparacion(short p, short s){
        primer=p;
        segundo=s;
    }
    public int getPrimer(){
        return primer;
    }
    public int getSegundo(){
        return segundo;
    }
    public void setPrimer(short p){
        primer=p;
    }
    public void setSegundo(short s){
        segundo=s;
    }
    public boolean mayor(){
        return primer>segundo;
    }
    public short resta(){
        return (short)(primer-segundo);
    }
    public short suma(){
        return (short)(primer+segundo);
    }
}
