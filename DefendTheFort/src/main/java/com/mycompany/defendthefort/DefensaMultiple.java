/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.defendthefort;
import com.mycompany.defendthefort.Entity;
import com.mycompany.defendthefort.Grid;
import com.mycompany.defendthefort.Tile;
import java.io.Serializable;
import java.util.ArrayList;
import javax.swing.ImageIcon;

/**
 *
 * @author sebas
 */
public class DefensaMultiple extends Entity implements Serializable{
    
    
    
    
    DefensaMultiple(String nombre, int vida, int cantidadGolpes, int nivel, int campos, int nivelAparicion, Grid grid,  ImageIcon movementfilePath, ImageIcon attackfilePath){
        super(nombre,vida,cantidadGolpes,nivel,campos,nivelAparicion, grid, movementfilePath, movementfilePath); 
        setRange(3);
    }

    
    public ArrayList<Entity> determineObjectives(int range){
        ArrayList<Entity> objectives = new  ArrayList<Entity>();
        for(int i = getLocationY()-getRange(); i<getLocationY()+getRange()+1; i++){
            for(int j = getLocationX()-getRange(); j<this.getLocationX()+getRange()+1; j++){
                Tile[][] matrix = this.getGrid().getMatrix();
                if(i<matrix.length && i>=0 && j<matrix[0].length && j>=0 && matrix[i][j].personaje!=null){  
                    if(this.getZombies().contains(matrix[i][j].personaje) && matrix[i][j].personaje.getLife() >= 0){                     
                        objectives.add(matrix[i][j].personaje);
                    }
                }         
            }
        }
        return objectives;
    }
    
    @Override
    public void atacar() { 
        ArrayList<Entity> objectives = determineObjectives(getRange());
        if(objectives.size()<0)
            return;
        for(Entity objective: objectives){
            if(objective==null)
                continue;
            objective.substractLife(cantidadGolpes);
            objective.getRegister().getAttackers().add(this.nombre);
            objective.getRegister().getDamageReceived().add(this.cantidadGolpes);
            this.getRegister().getAttacked().add(objective.nombre);
            this.getRegister().getDamageDone().add(this.cantidadGolpes);
            System.out.println(nombre + " ataco con" + cantidadGolpes + "dejando al objetivo con vida: " + objective.getLife() + "teniendo el vida: " + vida);
            if(objective.getLife() <= 0){
                objective.morir();
                objective = null;
            }
        }
    }

     

  

    
    @Override
    public Entity clone(){
        DefensaMultiple clonedEntity =  new DefensaMultiple(nombre, vida, cantidadGolpes, nivel, campos, nivelAparicion, grid,  moving, attacking);
        return clonedEntity;
    }

  

        
   
}