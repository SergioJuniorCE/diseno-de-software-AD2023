/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objetosNegocio;


/**
 * Clase EmpresaTransporte
 *
 * @author fabricio01352
 */
public class EmpresaTransporte {
    private int idEmpresa;
    private String nomEmpresa;
    private Vehiculo vehiculo;

    /**
     * Constructor de la clase EmpresaTransporte
     *
     * @param idEmpresa  ID de la empresa
     * @param nomEmpresa Nombre de la empresa
     * @param vehiculo   Vehiculo de la empresa
     */
    public EmpresaTransporte(int idEmpresa, String nomEmpresa, Vehiculo vehiculo) {
        this.idEmpresa = idEmpresa;
        this.nomEmpresa = nomEmpresa;
        this.vehiculo = vehiculo;
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
     * @return vehiculo
     */
    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    /**
     * Establece el vehiculo de la empresa
     *
     * @param vehiculo Vehiculo de la empresa
     */
    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    /**
     * Muestra la informacion de la empresa
     */
    @Override
    public String toString() {
        return "EmpresaTransporte{" + "idEmpresa=" + idEmpresa + ", nomEmpresa=" + nomEmpresa + ", vehiculo=" + vehiculo + '}';
    }
}
