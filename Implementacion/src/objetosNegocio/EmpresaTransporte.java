/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objetosNegocio;


/**
 *
 * @author fabricio01352
 */
public class EmpresaTransporte  {
    private int idEmpresa;
    private String nomEmpresa;
    private Vehiculo vehiculo;

    public EmpresaTransporte(int idEmpresa, String nomEmpresa, Vehiculo vehiculo) {
        this.idEmpresa = idEmpresa;
        this.nomEmpresa = nomEmpresa;
        this.vehiculo = vehiculo;
    }
    public EmpresaTransporte(){
        
    }

    public int getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(int idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    public String getNomEmpresa() {
        return nomEmpresa;
    }

    public void setNomEmpresa(String nomEmpresa) {
        this.nomEmpresa = nomEmpresa;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    /*
    @Override
    public String toString() {
        return "idEmpresa = " + idEmpresa + "\nnomEmpresa = " + nomEmpresa + "\nvehiculo = " + vehiculo;
    }*/

    @Override
    public String toString() {
        return "EmpresaTransporte{" + "idEmpresa=" + idEmpresa + ", nomEmpresa=" + nomEmpresa + ", vehiculo=" + vehiculo + '}';
    }
    
    


    
    
    
    
    
    
    
    
    
}
