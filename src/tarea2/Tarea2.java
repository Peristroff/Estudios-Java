/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tarea2;

import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.*;

import tarea2.Conexion;

/**
 * 
 * @author pablo
 */
public class Tarea2 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Conexion con = new Conexion();
        con.conectar();

        // Desde aqui se invoca a JFrameForm para mostrar la ventana. Se utiliza la version mas reciente de nimbus
        try {
            UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
        } catch (Exception e) {
            e.printStackTrace();
        }

        javax.swing.SwingUtilities.invokeLater(() -> {
            JFrameForm ui = new JFrameForm();
            ui.setVisible(true);
        });
    }
}

