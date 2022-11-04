/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.defendthefort;

import java.io.File;
import javax.swing.JFrame;

public class DefendTheFort {

    public static void main(String[] args) {
//        Tablero t = new Tablero();
//        t.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        t.setResizable(false);
//        t.setTitle("Tablero de juego");
//        t.setLocationRelativeTo(null);
//        t.setVisible(true);
//        t.generarZombies();
    
        BDUsuarios bd = new BDUsuarios();
        File archivo = new File("users.dat");
        if(!archivo.exists())
            bd.darDeAlta("admin", "admin", "admin"); //consultar como hacerlo solo la primera vez
        bd.restaurar();
    //        

        PantallaInicio pi = new PantallaInicio();
        pi.setVisible(true);
    }
}
