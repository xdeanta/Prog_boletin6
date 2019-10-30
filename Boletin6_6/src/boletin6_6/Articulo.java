/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin6_6;

/**
 *
 * @author xdeantabelisario
 */
public class Articulo {
    private String nombre;
    private int vAnual;
    public Articulo(){
        
    }
    public Articulo(String nomb, int vA){
        nombre=nomb;
        vAnual=vA;
    }
    
    public String getNombre(){
        return nombre;
    }
    public int getVanual(){
        return vAnual;
    }
    public void setNombre(String nomb){
        nombre=nomb;
    }
    public void setVanual(int anual){
        vAnual=anual;
    }
    
    public String Clasificacion(){
        if(vAnual <= 100){
            return "Bajo";
        }
        if(vAnual > 100 && vAnual <= 500){
            return "medio";
        }
        if(vAnual > 500 && vAnual <= 1000){
            return "alto";
        }
        if(vAnual > 1000){
            return "primera necesidad";
        }
        return null;
    }
}
