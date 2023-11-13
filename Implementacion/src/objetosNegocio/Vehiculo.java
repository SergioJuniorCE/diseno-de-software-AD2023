/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objetosNegocio;

/**
 *
 * @author fabricio01352
 */
public class Vehiculo {
    private int km;
    private String nomVehiculo;

    public Vehiculo(int km, String nomVehiculo) {
        this.km = km;
        this.nomVehiculo = nomVehiculo;
    }

    public int getKm() {
        return km;
    }

    public void setKm(int km) {
        this.km = km;
    }

    public String getNomVehiculo() {
        return nomVehiculo;
    }

    public void setNomVehiculo(String nomVehiculo) {
        this.nomVehiculo = nomVehiculo;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "km=" + km + ", nomVehiculo=" + nomVehiculo + '}';
    }
    
    
    
    
    
}
