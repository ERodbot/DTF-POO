/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.defendthefort;

import static com.sun.java.accessibility.util.AWTEventMonitor.addMouseListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.Serializable;
import java.util.ArrayList;
import javax.swing.JButton;
import static javax.swing.SwingConstants.LEFT;

/**
 *
 * @author em000
 */
public class Tile implements Serializable {
    JButton button;
    Entity personaje;
    private final int ancho = 35;
    private final int alto = 35;
    private int posx,posy;
    private Grid grid;
    
    Tile(Grid grid){
        JButton button = new JButton();
        button.setSize(ancho, alto);
        this.button = button;
        button.addMouseListener(new MouseAdapter() {
            @Override
            //si se encuentra en una posicon posible de colocar, y quedan espacios, coloca la entidad en la posicion clickeada
            public void mouseClicked(MouseEvent e) {   
                if(personaje == null)
                    putInGrid();
                else{
                    grid.setConsult(personaje.getRegister().toString());
                    System.out.println(personaje.getRegister().toString());
                    
                }
            }
                    
        });
        this.grid = grid;
    }
    
   
    public void putInGrid(){
        if(!(posx == 0 || posx == 24 || posy == 0 || posy == 24) && grid.getEntityLoaded()!=null){
            if((grid.getDefenseCapacity() - grid.getEntityLoaded().campos) > 0){
                 personaje = grid.getEntityLoaded().clone();
                try{
                    DefensaAereo aereo = (DefensaAereo)personaje;
                    grid.getFlyingEntities().add(personaje);
                    }catch(ClassCastException ex){
                       System.out.println("");
                    }
                    grid.getThreadArray().add(new ThreadEntity(personaje, grid));
                    grid.getDefenses().add(personaje);
                    grid.setDefenseCapacity(grid.getDefenseCapacity()-personaje.campos);
                    button.setIcon(personaje.moving);
                    grid.setEntityLoaded(null);
                    personaje.setLocation(posy,posx);
            }
        }
    }
    
    
                
                
                
     public void setLocation(int y, int x){
        this.posx = x;
        this.posy = y;
    }
     
     
     public Entity buttonActionPerformed(java.awt.event.ActionEvent evt) {
        return personaje;        
    }

    public int getPosx() {
        return posx;
    }

    public int getPosy() {
        return posy;
    }
}
