/**
 * EmpresaProductora.java
 * 
 * 
 */
package objetosNegocio;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 * Clase que representa una empresa productora
 *
 * @author Equipo 5
 */
@Entity
public class EmpresaProductora implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idEmpresa;
    private String nomEmpresa;

    @OneToMany(mappedBy = "empresaProductora")
    private List<Residuo> residuos;

    public EmpresaProductora() {
    }

    /**
     * Constructor de la clase EmpresaProductora
     *
     * @param nomEmpresa Nombre de la empresa productora
     * @param idEmpresa Id de la empresa productora
     * @param residuo Residuo de la empresa productora
     */
    public EmpresaProductora(String nomEmpresa, int idEmpresa, List<Residuo> residuo) {
        this.residuos = residuo;
        this.nomEmpresa = nomEmpresa;
        this.idEmpresa = idEmpresa;
    }
    /**
     * Obtiene los residuo de la empresa productora
     *
     * @return Residuo de la empresa productora
     */
    public List<Residuo> getResiduos() {
        return residuos;
    }


    /**
     * Establece los residuos que la empresa maneja
     * @param residuos  residuos de la empresa
     */
    public void setResiduos(List<Residuo> residuos) {
        this.residuos = residuos;
    }


    /**
     * Obtiene el nombre de la empresa productora
     *
     * @return nomEmpresa
     */
    public String getNomEmpresa() {
        return nomEmpresa;
    }

    /**
     * Establece el nombre de la empresa productora
     *
     * @param nomEmpresa Nombre de la empresa productora
     */
    public void setNomEmpresa(String nomEmpresa) {
        this.nomEmpresa = nomEmpresa;
    }

    /**
     * Obtiene el id de la empresa productora
     *
     * @return idEmpresa
     */
    public int getIdEmpresa() {
        return idEmpresa;
    }

    /**
     * Establece el id de la empresa productora
     *
     * @param idEmpresa Id de la empresa productora
     */
    public void setIdEmpresa(int idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    
    
    /**
     * Muestra la informacion de la empresa productora
     */
    @Override
    public String toString() {
        return "EmpresaProductora{" + "idEmpresa=" + idEmpresa + ", nomEmpresa=" + nomEmpresa + ", residuos=" + residuos + '}';
    }

}
