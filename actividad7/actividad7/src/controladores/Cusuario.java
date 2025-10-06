/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controladores;
import vista.Calculadora;
import modelo.acciones;
import controladores.Ccalculadora;


import modelo.usuario;
import vista.login;
import javax.swing.JOptionPane;

/**
 *
 * @author aleja
 */
public class Cusuario {
    private login vistaLogin;
    private usuario ModeloUsuario;

    public Cusuario(login vistaLogin) {
        this.vistaLogin = vistaLogin;
        IniciarEventos();
    }
    
    private void IniciarEventos(){
        vistaLogin.getIniciar().addActionListener(e -> Iniciar());
    }
    
    public void Iniciar(){
        String nombre = vistaLogin.getNombre().getText().trim();

        if (nombre.isEmpty()) {
            JOptionPane.showMessageDialog(vistaLogin,
                "Por favor, ingrese su nombre.",
                "Error de Login",
                JOptionPane.ERROR_MESSAGE);
            return;
        }
        ModeloUsuario = new usuario(nombre);
        vistaLogin.setVisible(false);
        
    acciones modeloAcciones = new acciones();
    Calculadora vistaCalculadora = new Calculadora();

    Ccalculadora controladorCalculadora = new Ccalculadora(ModeloUsuario, modeloAcciones, vistaCalculadora);
    controladorCalculadora.mostrarCalculadora();

    }    
}
