/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objetosNegocio;

import java.util.Arrays;
import java.util.Date;

/**
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

    public Translado(int idTranslado, Date fechaEnviado, Date fechaRecibido, String origen, String destino, Residuo residuo,EmpresaTransporte et, EmpresaProductora ep) {
        this.idTranslado = idTranslado;
        this.fechaEnviado = fechaEnviado;
        this.fechaRecibido = fechaRecibido;
        this.origen = origen;
        this.destino = destino;
        this.et=et;
        this.residuo=residuo;
        this.ep=ep;
    }

    public int getIdTranslado() {
        return idTranslado;
    }

    public void setIdTranslado(int idTranslado) {
        this.idTranslado = idTranslado;
    }

    public Date getFechaEnviado() {
        return fechaEnviado;
    }

    public void setFechaEnviado(Date fechaEnviado) {
        this.fechaEnviado = fechaEnviado;
    }

    public Date getFechaRecibido() {
        return fechaRecibido;
    }

    public void setFechaRecibido(Date fechaRecibido) {
        this.fechaRecibido = fechaRecibido;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public EmpresaTransporte getEt() {
        return et;
    }

    public void setEt(EmpresaTransporte et) {
        this.et = et;
    }


    public Residuo getResiduo() {
        return residuo;
    }

    public void setResiduo(Residuo residuo) {
        this.residuo = residuo;
    }

    public EmpresaProductora getEp() {
        return ep;
    }

    public void setEp(EmpresaProductora ep) {
        this.ep = ep;
    }

    
    @Override
    public String toString() {
        return "idTranslado = " + idTranslado + "\nfechaEnviado=" + fechaEnviado + "\nfechaRecibido = " + fechaRecibido + "\norigen = " + origen + "\ndestino = " + destino + "\nEmpresa transporte = " + et + "\nId Residuo = " + residuo.getIdResiduo() + "\nId Empresa Productora = " + ep.getIdEmpresa();
    }


    

 

    
    
    
    

    
    
    
    
    
    
    
}
