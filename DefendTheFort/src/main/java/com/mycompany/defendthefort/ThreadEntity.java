/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.defendthefort;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;

/**
 *
 * @author sebas
 */
public class ThreadEntity extends Thread {
    
    public Entity entity;
    public Grid grid;
     boolean paused = false;
    
    ThreadEntity(Entity entity,Grid tablero){
        this.entity = entity;
        this.grid = tablero;
        entity.getGrid().getMatrix()[entity.posy][entity.posx].button.setIcon(entity.moving);
    }
    
    @Override
    public void run(){//si encuentra una entidad para de moverse hasta matarla/morir a manos de ella, sino, se mueve
        Tile TreeOfLifeTile = grid.getTreeOfLife();
        int x = TreeOfLifeTile.getPosx();
        int y = TreeOfLifeTile.getPosy();
        while(entity.getLife()>0){
            while(paused){
                try {
                    sleep(500);
                } catch (InterruptedException ex) {
                    Logger.getLogger(ThreadEntity.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if(entity.getLife() <= 0)
                System.out.println("Porque sigue desgraciado!!");
            try {
//                System.out.println(entity.vida + "---" + entity.nombre);
                if (entity.determineObjective(entity.getRange()) != null){
//                    entity.getGrid().getMatrix()[entity.posy][entity.posx].button.setIcon(entity.attacking);
                    while(entity.determineObjective(entity.getRange())!=null && entity.determineObjective(entity.getRange()).getLife()>=0){
                        if(entity.getLife()>0){
                            entity.atacar();
                            sleep(1000);
                        }
                        }
                    }
                
                if(grid.getZombies().contains(entity))
                    entity.mover(x,y);
                sleep(800);
            } catch (InterruptedException ex) {
                Logger.getLogger(ThreadEntity.class.getName()).log(Level.SEVERE, null, ex);
            }   
        }
        System.out.println("THREAD HA PARADO PARA : + " + entity.nombre);
    }
    
    
    public void pause(){
        this.paused = !paused;
    }
}

