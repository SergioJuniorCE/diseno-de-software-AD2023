/**
 * Residuo.java
 * 
 * 
 * 
 */
package objetosNegocio;

import java.io.Serializable;
import java.util.Arrays;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

/**
 * Clase que representa un residuo peligroso
 *
 * @author Equipo 5
 */
@Entity
public class Residuo implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idResiduo;
    private String compuestos;
    @OneToOne
    private Translado translados;
    @ManyToOne 
    private EmpresaProductora empresaProductora;

    public Residuo() {
    }
    /**
     * Constructor de la clase Residuo
     *
     * @param idResiduo ID del residuo
     * @param compuestos Compuestos del residuo
     * @param translados Translados del residuo
     * @param empresaProductora
     */
    public Residuo(int idResiduo, String compuestos, Translado translados, EmpresaProductora empresaProductora) {
        this.idResiduo = idResiduo;
        this.compuestos = compuestos;
        this.translados = translados;
        this.empresaProductora = empresaProductora;
    }

    /**
     * Constructor de la clase Residuo
     *
     * @param idResiduo ID del residuo
     * @param compuestos Compuestos del residuo
     */
    public Residuo(int idResiduo, String compuestos) {
        this.idResiduo = idResiduo;
        this.compuestos = compuestos;
    }

    /**
     * Constructor de la clase Residuo
     *
     * @param idResiduo ID del residuo
     * @param compuestos Compuestos del residuo
     * @param translados Translados del residuo
     */
    public Residuo(int idResiduo, String compuestos, Translado translados) {
        this.idResiduo = idResiduo;
        this.compuestos = compuestos;
        this.translados = translados;
    }

    /**
     * Regresa los compuestos del residuo
     * @return 
     */
    public String getCompuestos() {
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
    public void setCompuestos(String compuestos) {
        this.compuestos = compuestos;
    }

    /**
     * Obtiene los translados del residuo
     *
     * @return translados
     */
    public Translado getTranslados() {
        return translados;
    }

    /**
     * Establece los translados del residuo
     *
     * @param translados Translados del residuo
     */
    public void setTranslados(Translado translados) {
        this.translados = translados;
    }

    /**
     * Muestra la informacion del residuo
     */
    @Override  
    public String toString() {
        return "Residuo{" + "idResiduo=" + idResiduo + ", compuestos=" + compuestos + ", translados=" + translados + ", empresaProductora=" + empresaProductora + '}';
    }

    /**
     * Metodo para obtener nombre de la empresa a la que pertenece el residuo
     * @return regresa la empresa que produjo el residuo
     */
    public EmpresaProductora getEmpresaProductora() {
        return empresaProductora;
    }

    
    
    /**
     * Metodo para establecer a la empresa productora 
     * @param empresaProductora 
     */
    public void setEmpresaProductora(EmpresaProductora empresaProductora) {
        this.empresaProductora = empresaProductora;
    }
    
    
    
    
    
    
    
}
