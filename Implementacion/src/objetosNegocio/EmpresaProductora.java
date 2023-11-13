/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objetosNegocio;


/**
 *
 * @author fabricio01352
 */
public class EmpresaProductora {
    private String nomEmpresa;
    private int idEmpresa;
    private Residuo residuo;
    
    public EmpresaProductora(String nomEmpresa, int idEmpresa, Residuo residuo) {
        this.residuo=residuo;
        this.nomEmpresa=nomEmpresa;
        this.idEmpresa=idEmpresa;
    }

    public Residuo getResiduo() {
        return residuo;
    }

    public void setResiduo(Residuo residuo) {
        this.residuo = residuo;
    }



    public String getNomEmpresa() {
        return nomEmpresa;
    }

    public void setNomEmpresa(String nomEmpresa) {
        this.nomEmpresa = nomEmpresa;
    }

    public int getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(int idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    @Override
    public String toString() {
        return "EmpresaProductora{" + "nomEmpresa=" + nomEmpresa + ", idEmpresa=" + idEmpresa + ", Id residuo=" + residuo.getIdResiduo() + '}';
    }

    
    
    
    
    
    
    
}
