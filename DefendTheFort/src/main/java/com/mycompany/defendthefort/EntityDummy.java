/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.defendthefort;

import java.io.Serializable;
import java.util.ArrayList;
import javax.swing.ImageIcon;

/**
 *
 * @author em000
 */




public class EntityDummy implements Serializable{
    public Types type;
    public String nombre;
    public int range;
    public int vida;
    public int cantidadGolpes, nivel, campos, nivelAparicion, posx, posy;   
    public Register register = new Register(this.nombre, vida); //una clase registro para guardar los ataques recbidos/propiciados;
    String movingFilePath; //imagen de la entidad en movimiento
    String attackingFilePath;  
    
    EntityDummy(Types type, String bombre, int range, int vida, int cantidadGolpes, int nivel, int nivelAparicion, int posx, int posy, Register register, String movingFilePath, String attackingFilePath){
        this.type = type;
        this.nombre = nombre;
        this.range = range;
        this.vida = vida; 
        this.cantidadGolpes = cantidadGolpes;
        this.nivel = nivel;
        this.campos = campos;
        this.nivelAparicion = nivelAparicion;
        this.posx = posx;
        this.posy = posy;
        this.register = register;//una clase registro para guardar los ataques recbidos/propiciados;
        this.movingFilePath = movingFilePath; //imagen de la entidad en movimiento
        this.attackingFilePath = attackingFilePath;  
        
    }
    
    
    
}
