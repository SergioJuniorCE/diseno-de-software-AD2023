/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objetosNegocio;


/**
 * @author fabricio01352
 */
public class EmpresaProductora {
    private String nomEmpresa;
    private int idEmpresa;
    private Residuo residuo;

    /**
     * Constructor de la clase EmpresaProductora
     *
     * @param nomEmpresa
     * @param idEmpresa
     * @param residuo
     */
    public EmpresaProductora(String nomEmpresa, int idEmpresa, Residuo residuo) {
        this.residuo = residuo;
        this.nomEmpresa = nomEmpresa;
        this.idEmpresa = idEmpresa;
    }

    /**
     * Obtiene el residuo de la empresa productora
     *
     * @return residuo
     */
    public Residuo getResiduo() {
        return residuo;
    }

    /**
     * Establece el residuo de la empresa productora
     *
     * @param residuo Residuo a establecer
     */
    public void setResiduo(Residuo residuo) {
        this.residuo = residuo;
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
        return "EmpresaProductora{" + "nomEmpresa=" + nomEmpresa + ", idEmpresa=" + idEmpresa + ", Id residuo=" + residuo.getIdResiduo() + '}';
    }
}
