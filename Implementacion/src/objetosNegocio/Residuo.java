/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objetosNegocio;

import java.util.Arrays;


/**
 * Clase que representa un residuo peligroso
 *
 * @author fabricio01352
 */
public class Residuo {
    private int idResiduo;
    private String[] compuestos;
    private Translado[] translados;

    /**
     * Constructor de la clase Residuo
     *
     * @param idResiduo  ID del residuo
     * @param compuestos Compuestos del residuo
     */
    public Residuo(int idResiduo, String[] compuestos) {
        this.idResiduo = idResiduo;
        this.compuestos = compuestos;
    }


    /**
     * Constructor de la clase Residuo
     *
     * @param idResiduo  ID del residuo
     * @param compuestos Compuestos del residuo
     * @param translados Translados del residuo
     */
    public Residuo(int idResiduo, String[] compuestos, Translado[] translados) {
        this.idResiduo = idResiduo;
        this.compuestos = compuestos;
        this.translados = translados;
    }

    /**
     * Regresa los compuestos del residuo
     */
    public String[] getCompuestos() {
        return compuestos;
    }


    /**
     * Obtiene el ID del residuo
     *
     * @return idResiduo
     */
    public int getIdResiduo() {
        return idResiduo;
    }


    /**
     * Establece el ID del residuo
     *
     * @param idResiduo ID del residuo
     */
    public void setIdResiduo(int idResiduo) {
        this.idResiduo = idResiduo;
    }

    /**
     * Establece los compuestos del residuo
     *
     * @param compuestos Compuestos del residuo
     */
    public void setCompuestos(String[] compuestos) {
        this.compuestos = compuestos;
    }

    /**
     * Obtiene los translados del residuo
     *
     * @return translados
     */
    public Translado[] getTranslados() {
        return translados;
    }

    /**
     * Establece los translados del residuo
     *
     * @param translados Translados del residuo
     */
    public void setTranslados(Translado[] translados) {
        this.translados = translados;
    }


    /**
     * Muestra la informacion del residuo
     */
    public void mostrar() {
        System.out.println("--------------------\n");
        System.out.println("Informaci\u00f3n del residuo:");
        System.out.println("idResiduo = " + idResiduo);
        System.out.println("compuestos = " + Arrays.toString(compuestos));
        for (Translado translado : translados) {
            System.out.println(translado);
        }
        System.out.println("--------------------\n");

    }
}