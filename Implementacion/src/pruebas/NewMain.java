/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pruebas;

import java.util.Date;
import objetosNegocio.EmpresaProductora;
import objetosNegocio.EmpresaTransporte;
import objetosNegocio.Residuo;
import objetosNegocio.Translado;
import objetosNegocio.Vehiculo;

/**
 *
 * @author fabricio01352, sergio216581
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // una empresa productora genera un residuo
        String[] compuestos = { "Amoniaco", "Fentanilo", "Criptonita" };
        Residuo residuo = new Residuo(15, compuestos);
        EmpresaProductora ep = new EmpresaProductora("Producta Ciudad Obregon", 1, residuo);

        // la empresa quiere enviar ese residuo a otro lado
        // pero desea hacerlo partiendo el envio en dos, quiere que dos empresas
        // distintas lleven el residuo
        // Por lo que el residuo se mando en dos translados distintos
        EmpresaTransporte et = new EmpresaTransporte(21, "Mayitos", new Vehiculo(15000, "Mercedez camion"));
        EmpresaTransporte et2 = new EmpresaTransporte(25, "Envios MX", new Vehiculo(10000, "Chevrolet carga pesada"));

        Translado translado1 = new Translado(50, new Date(), new Date(), "Caborca", "Los cabos", residuo, et, ep);
        Translado translado2 = new Translado(51, new Date(), new Date(), "Los cabos", "San Diego", residuo, et2, ep);

        // y si queremos saber a que translados pertenecio cada residuo:
        Translado[] translados = { translado1, translado2 };
        residuo.setTranslados(translados);

        // vemos la informacion del residuo y quienes lo transladaron
        // podemos ver que empresas de transporte participaron, el residuo es el mismo
        // ya que solo se puede mandar 1 residuo por seguridad
        // y podemos ver informacion de cada translado. De la empresa productora solo
        // interesa saber su id porque para cada translado
        // solo participa la misma empresa productora
        residuo.mostrar();
    }
}
