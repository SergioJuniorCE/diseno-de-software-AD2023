/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

import dao.Fachada;
import gui.DlgEmpresaFabricante;
import gui.DlgEmpresaTransporte;
import gui.DlgResiduo;
import gui.DlgTranslado;
import gui.DlgVehiculo;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingWorker;
import objetosNegocio.EmpresaProductora;
import objetosNegocio.EmpresaTransporte;
import objetosNegocio.Residuo;
import objetosNegocio.Translado;
import objetosNegocio.Vehiculo;
import util.ModeloLista;

/**
 *
 * @author Equipo 5
 */
public class Control {

    private static Control instance;

    /**
     * Metodo para obtener una instancia de la clase
     *
     * @return regresa una instancia de la clase
     *
     */
    public static Control getInstance() {
        if (instance == null) {
            instance = new Control();
        }
        return instance;
    }

    private Control() {
        fachada = Fachada.getInstance();
    }
    private final ModeloLista modelo = new ModeloLista();
    private List<Residuo> residuos, vehiculos, empresastransportes;
    private DefaultComboBoxModel translados, residuo, empresaproductora, empresatransporte;
    private final Fachada fachada;

    public boolean registrarEmpresaProductora(JFrame frame) {
        residuos = fachada.obtenerTodos(Residuo.class);
        EmpresaProductora e = new EmpresaProductora();
        for (int i = 0; i < residuos.size();) {
            if (modelo.contains(residuos.get(i))) {
                i++;
            } else {
                modelo.agregar(residuos.get(i));
            }
        }
        try {
            fachada.crear(e);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(frame, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);

        }
        SwingWorker<Void, Void> worker = new SwingWorker<Void, Void>() {
            @Override
            protected Void doInBackground() throws Exception {
                new DlgEmpresaFabricante(frame, true, e, modelo).setVisible(true);

                return null;
            }
        };

        worker.execute();

        return true;

    }

    public boolean registrarEmpresaTransportadora(JFrame frame) {
        vehiculos = fachada.obtenerTodos(Vehiculo.class);
        translados = conversion(fachada.obtenerTodos(Translado.class));

        EmpresaTransporte e = new EmpresaTransporte();
        for (int i = 0; i < vehiculos.size();) {
            if (modelo.contains(vehiculos.get(i))) {
                i++;
            } else {
                modelo.agregar(vehiculos.get(i));
            }
        }
        try {
            fachada.crear(e);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(frame, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);

        }
        SwingWorker<Void, Void> worker = new SwingWorker<Void, Void>() {
            @Override
            protected Void doInBackground() throws Exception {
                new DlgEmpresaTransporte(frame, true, e, modelo, translados).setVisible(true);

                return null;
            }
        };

        worker.execute();

        return true;

    }

    public boolean registrarVehiculos(JFrame frame) {
        Vehiculo v = new Vehiculo();
        empresatransporte = conversion(fachada.obtenerTodos(Vehiculo.class));

        try {
            fachada.crear(v);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(frame, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);

        }
        SwingWorker<Void, Void> worker = new SwingWorker<Void, Void>() {
            @Override
            protected Void doInBackground() throws Exception {
                new DlgVehiculo(frame, true, v, empresatransporte).setVisible(true);

                return null;
            }
        };

        worker.execute();

        return true;
    }

    public boolean registrarTranslado(JFrame frame) {
        Translado t = new Translado();
        empresastransportes = fachada.obtenerTodos(EmpresaTransporte.class);
        residuo = conversion(fachada.obtenerTodos(Residuo.class));
        empresaproductora = conversion(fachada.obtenerTodos(EmpresaProductora.class));
        for (int i = 0; i < empresastransportes.size();) {
            if (modelo.contains(empresastransportes.get(i))) {
                i++;
            } else {
                modelo.agregar(empresastransportes.get(i));
            }
        }
        try {
            fachada.crear(t);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(frame, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);

        }
        SwingWorker<Void, Void> worker = new SwingWorker<Void, Void>() {
            @Override
            protected Void doInBackground() throws Exception {
                new DlgTranslado(frame, true, t, modelo, residuo, empresaproductora).setVisible(true);

                return null;
            }
        };

        worker.execute();

        return true;

    }

    /**
     * Metodo estatico de la clase para convertir una lista en un combo box
     *
     * @param <T> tipo de dato
     * @param lista lista a convertir
     * @return regresa un combo box model
     */
    public static <T> DefaultComboBoxModel<T> conversion(List<T> lista) {
        DefaultComboBoxModel<T> caja = new DefaultComboBoxModel<>();

        if (lista != null) {
            for (T dato : lista) {
                caja.addElement(dato);

            }
        }

        return caja;

    }

    /**
     * Metodo para hacer validaciones
     *
     * @param regex expresion regular
     * @param input texto ingresado a verificar
     * @param dialog dialogo parent
     * @return
     */
    public static boolean validar(String regex, String input, JDialog dialog) {

        Pattern pa = Pattern.compile(regex);
        Matcher m = pa.matcher(input);

        return m.matches();

    }

    public boolean registrarResiduo(JFrame frame) {
        Residuo r = new Residuo();
        empresaproductora = conversion(fachada.obtenerTodos(EmpresaProductora.class));
        translados = conversion(fachada.obtenerTodos(Translado.class));

        try {
            fachada.crear(r);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(frame, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);

        }
        SwingWorker<Void, Void> worker = new SwingWorker<Void, Void>() {
            @Override
            protected Void doInBackground() throws Exception {
                new DlgResiduo(frame, true, r, empresaproductora, translados).setVisible(true);

                return null;
            }
        };

        worker.execute();

        return true;

    }
}
