/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objetosNegocio;

/**
 * Clase que representa un vehiculo
 * @author fabricio01352
 */
public class Vehiculo {
    private int km;
    private String nomVehiculo;

    /**
     * Constructor de la clase Vehiculo
     * @param km Kilometraje del vehiculo
     * @param nomVehiculo Nombre del vehiculo
     */
    public Vehiculo(int km, String nomVehiculo) {
        this.km = km;
        this.nomVehiculo = nomVehiculo;
    }

    /**
     * Constructor vacio de la clase Vehiculo
     */
    public int getKm() {
        return km;
    }

    /**
     * Obtiene el kilometraje del vehiculo
     * @param km Kilometraje del vehiculo
     */
    public void setKm(int km) {
        this.km = km;
    }

    /**
     * Obtiene el nombre del vehiculo
     * @return nomVehiculo
     */
    public String getNomVehiculo() {
        return nomVehiculo;
    }

    /**
     * Establece el nombre del vehiculo
     * @param nomVehiculo Nombre del vehiculo
     */
    public void setNomVehiculo(String nomVehiculo) {
        this.nomVehiculo = nomVehiculo;
    }

    /**
     * Muestra los datos del vehiculo
     * @return Datos del vehiculo en formato String
     */
    @Override
    public String toString() {
        return "Vehiculo{" + "km=" + km + ", nomVehiculo=" + nomVehiculo + '}';
    }
    
    
    
    
    
}
