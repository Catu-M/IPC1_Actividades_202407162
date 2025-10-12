/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controladores;

import javax.swing.JOptionPane;
import modelo.acciones;
import modelo.usuario;
import vista.Calculadora;

/**
 *
 * @author aleja
 */
public class Ccalculadora {
    private usuario ModeloUsuario;
    private acciones ModeloAcciones;
    private Calculadora VistaCalculadora;

    public Ccalculadora(usuario ModeloUsuario, acciones ModeloAcciones, Calculadora VistaCalculadora) {
        this.ModeloUsuario = ModeloUsuario;
        this.ModeloAcciones = ModeloAcciones;
        this.VistaCalculadora = VistaCalculadora;
        IniciarEventos();
    }
    
    public void mostrarCalculadora(){
        VistaCalculadora.getVerNombre().setText(ModeloUsuario.getNombre());
        VistaCalculadora.setVisible(true);
        VistaCalculadora.setLocationRelativeTo(null);   
    }
    
    private void IniciarEventos() {
        VistaCalculadora.getsumar().addActionListener(e -> calcularSuma());
        VistaCalculadora.getrestar().addActionListener(e -> calcularResta());
        VistaCalculadora.getmulti().addActionListener(e -> calcularMultiplicacion());
        VistaCalculadora.getdividir().addActionListener(e -> calcularDivision());
        VistaCalculadora.getpotenciar().addActionListener(e -> calcularPotencia());
        VistaCalculadora.getraiz().addActionListener(e -> calcularRaiz());
        VistaCalculadora.getSalir().addActionListener(e -> System.exit(0));     
    }

    private double obtenerNumeroA() throws NumberFormatException {
        return Double.parseDouble(VistaCalculadora.getNum1().getText());
    }

    private double obtenerNumeroB() throws NumberFormatException {
        return Double.parseDouble(VistaCalculadora.getNum2().getText());
    }

    private void calcularSuma() {
        try {
            double resultado = ModeloAcciones.sumar(obtenerNumeroA(), obtenerNumeroB());
            VistaCalculadora.getVerResultado().setText(String.valueOf(resultado));
        } catch (Exception e) {
            mostrarError("Ingrese números válidos.");
        }
    }

    private void calcularResta() {
        try {
            double resultado = ModeloAcciones.restar(obtenerNumeroA(), obtenerNumeroB());
            VistaCalculadora.getVerResultado().setText(String.valueOf(resultado));
        } catch (Exception e) {
            mostrarError("Ingrese números válidos.");
        }
    }

    private void calcularMultiplicacion() {
        try {
            double resultado = ModeloAcciones.multiplicar(obtenerNumeroA(), obtenerNumeroB());
            VistaCalculadora.getVerResultado().setText(String.valueOf(resultado));
        } catch (Exception e) {
            mostrarError("Ingrese números válidos.");
        }
    }

    private void calcularDivision() {
        try {
            double resultado = ModeloAcciones.dividir(obtenerNumeroA(), obtenerNumeroB());
            VistaCalculadora.getVerResultado().setText(String.valueOf(resultado));
        } catch (ArithmeticException e) {
            mostrarError(e.getMessage());
        } catch (Exception e) {
            mostrarError("Ingrese números válidos.");
        }
    }

    private void calcularPotencia() {
        try {
            double resultado = ModeloAcciones.potencia(obtenerNumeroA(), obtenerNumeroB());
            VistaCalculadora.getVerResultado().setText(String.valueOf(resultado));
        } catch (Exception e) {
            mostrarError("Ingrese números válidos.");
        }
    }

    private void calcularRaiz() {
        try {
            double resultado = ModeloAcciones.raiz(obtenerNumeroA());
            VistaCalculadora.getVerResultado().setText(String.valueOf(resultado));
        } catch (ArithmeticException e) {
            mostrarError(e.getMessage());
        } catch (Exception e) {
            mostrarError("Ingrese un número válido.");
        }
    }

    private void mostrarError(String mensaje) {
        JOptionPane.showMessageDialog(VistaCalculadora, mensaje, "Error", JOptionPane.ERROR_MESSAGE);
    }
  
}
