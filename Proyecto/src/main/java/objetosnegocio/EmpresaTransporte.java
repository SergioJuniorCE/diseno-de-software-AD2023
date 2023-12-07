/**
 * EmpresaTransporte.java
 *
 *
 */
package objetosNegocio;

import java.io.Serializable;
import java.util.ArrayList;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 * Clase EmpresaTransporte
 *
 * @author Equipo 5
 */
@Entity
public class EmpresaTransporte implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idEmpresa;
    private String nomEmpresa;
    @OneToMany(mappedBy = "empresaTransporte")
    private ArrayList<Vehiculo> vehiculos;
    @ManyToOne
    private Translado translado;

    /**
     * Constructor de la clase EmpresaTransporte
     *
     * @param idEmpresa ID de la empresa
     * @param nomEmpresa Nombre de la empresa
     * @param vehiculos vehiculos usados
     * @param translado translado especifico en el que participo la empresa
     */
    public EmpresaTransporte(int idEmpresa, String nomEmpresa, ArrayList<Vehiculo> vehiculos, Translado translado) {
        this.idEmpresa = idEmpresa;
        this.nomEmpresa = nomEmpresa;
        this.vehiculos = vehiculos;
        this.translado = translado;
    }

    /**
     * Constructor vacio de la clase EmpresaTransporte
     */
    public EmpresaTransporte() {
    }

    /**
     * Obtiene el ID de la empresa
     *
     * @return idEmpresa
     */
    public int getIdEmpresa() {
        return idEmpresa;
    }

    /**
     * Establece el ID de la empresa
     *
     * @param idEmpresa ID de la empresa
     */
    public void setIdEmpresa(int idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    /**
     * Obtiene el nombre de la empresa
     *
     * @return nomEmpresa
     */
    public String getNomEmpresa() {
        return nomEmpresa;
    }

    /**
     * Establece el nombre de la empresa
     *
     * @param nomEmpresa Nombre de la empresa
     */
    public void setNomEmpresa(String nomEmpresa) {
        this.nomEmpresa = nomEmpresa;
    }

    /**
     * Obtiene el vehiculo de la empresa
     *
     *
     * @return vehiculso usados
     */
    public ArrayList<Vehiculo> getVehiculos() {
        return vehiculos;
    }

    /**
     * Establece el vehiculo de la empresa
     *
     * @param vehiculos Vehiculo de la empresa
     */
    public void setVehiculos(ArrayList<Vehiculo> vehiculos) {
        this.vehiculos = vehiculos;
    }

    /**
     * Metodo para obtener el translado especifico donde esta empresa participo
     *
     * @return datos del translado
     */
    public Translado getTranslado() {
        return translado;
    }

    /**
     * Metodo para obtener el translado especifico donde esta empresa participo
     *
     * @return datos del translado
     */
    public void setTranslado(Translado translado) {
        this.translado = translado;
    }

    @Override
    public String toString() {
        return "EmpresaTransporte{" + "idEmpresa=" + idEmpresa + ", nomEmpresa=" + nomEmpresa + ", vehiculos=" + vehiculos + ", translado=" + translado + '}';
    }

    /**
     * Muestra la informacion de la empresa
     */
}
