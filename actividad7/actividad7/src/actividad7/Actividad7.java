/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package actividad7;

import controladores.Cusuario;
import vista.login;

/**
 *
 * @author aleja
 */
public class Actividad7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        login vistaLogin = new login();
        new Cusuario(vistaLogin);
        vistaLogin.setVisible(true); 
    }
    
}
