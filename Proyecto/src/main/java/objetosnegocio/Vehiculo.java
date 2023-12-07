/**
 * Vehiculo.java
 * 
 * 
 * 
 */
package objetosNegocio;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 * Clase que representa un vehiculo
 *
 * @author Equipo 5
 */
@Entity
public class Vehiculo implements Serializable {
    
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idVehiculo;
    private int km;
    private String nomVehiculo;
    @ManyToOne
    private EmpresaTransporte empresaTransporte;

    public Vehiculo() {
    }

    public Vehiculo(int idVehiculo, int km, String nomVehiculo, EmpresaTransporte empresaTransporte) {
        this.idVehiculo = idVehiculo;
        this.km = km;
        this.nomVehiculo = nomVehiculo;
        this.empresaTransporte = empresaTransporte;
    }

    public int getIdVehiculo() {
        return idVehiculo;
    }

    public void setIdVehiculo(int idVehiculo) {
        this.idVehiculo = idVehiculo;
    }

    public EmpresaTransporte getEmpresaTransporte() {
        return empresaTransporte;
    }

    public void setEmpresaTransporte(EmpresaTransporte empresaTransporte) {
        this.empresaTransporte = empresaTransporte;
    }
    
    

    /**
     * Constructor de la clase Vehiculo
     *
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
     *
     * @param km Kilometraje del vehiculo
     */
    public void setKm(int km) {
        this.km = km;
    }

    /**
     * Obtiene el nombre del vehiculo
     *
     * @return nomVehiculo
     */
    public String getNomVehiculo() {
        return nomVehiculo;
    }

    /**
     * Establece el nombre del vehiculo
     *
     * @param nomVehiculo Nombre del vehiculo
     */
    public void setNomVehiculo(String nomVehiculo) {
        this.nomVehiculo = nomVehiculo;
    }
   /**
     * Muestra los datos del vehiculo
     *
     * @return Datos del vehiculo en formato String
     */
    @Override
    public String toString() {
        return "Vehiculo{" + "idVehiculo=" + idVehiculo + ", km=" + km + ", nomVehiculo=" + nomVehiculo + ", empresaTransporte=" + empresaTransporte + '}';
    }

 

}
