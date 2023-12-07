/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objetosNegocio;

import java.util.Date;

/**
 * Clase que representa un translado de residuos
 *
 * @author fabricio01352
 */
public class Translado {
    private int idTranslado;
    private Date fechaEnviado;
    private Date fechaRecibido;
    private String origen;
    private String destino;
    private EmpresaTransporte et;
    private Residuo residuo;
    private EmpresaProductora ep;

    /**
     * Constructor de la clase Translado
     *
     * @param idTranslado   ID del translado
     * @param fechaEnviado  Fecha en la que se envio el translado
     * @param fechaRecibido Fecha en la que se recibio el translado
     * @param origen        Origen del translado
     * @param destino       Destino del translado
     * @param residuo       Residuo del translado
     * @param et            Empresa de transporte del translado
     * @param ep            Empresa productora del translado
     */
    public Translado(int idTranslado, Date fechaEnviado, Date fechaRecibido, String origen, String destino, Residuo residuo, EmpresaTransporte et, EmpresaProductora ep) {
        this.idTranslado = idTranslado;
        this.fechaEnviado = fechaEnviado;
        this.fechaRecibido = fechaRecibido;
        this.origen = origen;
        this.destino = destino;
        this.et = et;
        this.residuo = residuo;
        this.ep = ep;
    }

    /**
     * Obtiene el ID del translado
     *
     * @return ID del translado
     */
    public int getIdTranslado() {
        return idTranslado;
    }

    /**
     * Establece el ID del translado
     *
     * @param idTranslado ID del translado
     */
    public void setIdTranslado(int idTranslado) {
        this.idTranslado = idTranslado;
    }

    /**
     * Obtiene la fecha en la que se envio el translado
     *
     * @return Fecha en la que se envio el translado
     */
    public Date getFechaEnviado() {
        return fechaEnviado;
    }

    /**
     * Establece la fecha en la que se envio el translado
     *
     * @param fechaEnviado Fecha en la que se envio el translado
     */
    public void setFechaEnviado(Date fechaEnviado) {
        this.fechaEnviado = fechaEnviado;
    }

    /**
     * Obtiene la fecha en la que se recibio el translado
     *
     * @return Fecha en la que se recibio el translado
     */
    public Date getFechaRecibido() {
        return fechaRecibido;
    }

    /**
     * Establece la fecha en la que se recibio el translado
     *
     * @param fechaRecibido Fecha en la que se recibio el translado
     */
    public void setFechaRecibido(Date fechaRecibido) {
        this.fechaRecibido = fechaRecibido;
    }

    /**
     * Obtiene el origen del translado
     *
     * @return Origen del translado
     */
    public String getOrigen() {
        return origen;
    }

    /**
     * Establece el origen del translado
     *
     * @param origen Origen del translado
     */
    public void setOrigen(String origen) {
        this.origen = origen;
    }

    /**
     * Obtiene el destino del translado
     *
     * @return Destino del translado
     */
    public String getDestino() {
        return destino;
    }

    /**
     * Establece el destino del translado
     *
     * @param destino Destino del translado
     */
    public void setDestino(String destino) {
        this.destino = destino;
    }

    /**
     * Obtiene la empresa de transporte del translado
     *
     * @return Empresa de transporte del translado
     */
    public EmpresaTransporte getEt() {
        return et;
    }

    /**
     * Establece la empresa de transporte del translado
     *
     * @param et Empresa de transporte del translado
     */
    public void setEt(EmpresaTransporte et) {
        this.et = et;
    }

    /**
     * Obtiene el residuo del translado
     *
     * @return Residuo del translado
     */
    public Residuo getResiduo() {
        return residuo;
    }

    /**
     * Establece el residuo del translado
     *
     * @param residuo Residuo del translado
     */
    public void setResiduo(Residuo residuo) {
        this.residuo = residuo;
    }

    /**
     * Obtiene la empresa productora del translado
     *
     * @return Empresa productora del translado
     */
    public EmpresaProductora getEp() {
        return ep;
    }

    /**
     * Establece la empresa productora del translado
     *
     * @param ep Empresa productora del translado
     */
    public void setEp(EmpresaProductora ep) {
        this.ep = ep;
    }

    /**
     * Obtiene el ID de la empresa productora del translado
     *
     * @return ID de la empresa productora del translado
     */
    @Override
    public String toString() {
        return "idTranslado = " + idTranslado + "\nfechaEnviado=" + fechaEnviado + "\nfechaRecibido = " + fechaRecibido + "\norigen = " + origen + "\ndestino = " + destino + "\nEmpresa transporte = " + et + "\nId Residuo = " + residuo.getIdResiduo() + "\nId Empresa Productora = " + ep.getIdEmpresa();
    }
}
