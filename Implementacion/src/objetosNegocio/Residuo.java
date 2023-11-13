/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objetosNegocio;

import java.util.Arrays;


/**
 *
 * @author fabricio01352
 */
public class Residuo {
    private int idResiduo;
    private String[] compuestos;
    private Translado[] translados;

    public Residuo(int idResiduo, String[] compuestos) {
        this.idResiduo = idResiduo;
        this.compuestos = compuestos;
    }

    
    
    
    
    public Residuo(int idResiduo, String[] compuestos, Translado[] translados) {
        this.idResiduo = idResiduo;
        this.compuestos = compuestos;
        this.translados=translados;
    }

    public String[] getCompuestos() {
        return compuestos;
    }

    
  
    public int getIdResiduo() {
        return idResiduo;
    }



    public void setIdResiduo(int idResiduo) {
        this.idResiduo = idResiduo;
    }

    public void setCompuestos(String[] compuestos) {
        this.compuestos = compuestos;
    }

    public Translado[] getTranslados() {
        return translados;
    }

    public void setTranslados(Translado[] translados) {
        this.translados = translados;
    }

    
    public void mostrar() {
        System.out.println("--------------------\n");
        System.out.println("""
                           Informaci\u00f3n del residuo: 
                           idResiduo = """ + idResiduo + "\ncompuestos = " + Arrays.toString(compuestos) );
        for (Translado translado : translados) {
            System.out.println(translado);
        }   
         System.out.println("--------------------\n");

    }
    
    

 
    
    

    

  
    
    
    
    
    
    
    
}
