/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.defendthefort;
import com.mycompany.defendthefort.Entity;
import com.mycompany.defendthefort.Grid;
import com.mycompany.defendthefort.Tile;
import java.io.Serializable;
import javax.swing.ImageIcon;

/**
 *
 * @author sebas
 */
public class DefensaMedio extends Entity implements Serializable{
    
    
    private final int range = 3;
    
    DefensaMedio(String nombre, int vida, int cantidadGolpes, int nivel, int campos, int nivelAparicion, Grid grid,  ImageIcon movementfilePath, ImageIcon attackfilePath){
        super(nombre,vida,cantidadGolpes,nivel,campos,nivelAparicion, grid, movementfilePath, movementfilePath); 
    }

    @Override
    public void atacar() {
        Entity objective = determineObjective(getRange());
        if(objective!=null && !this.getFlyingEntities().contains(objective)){
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
        DefensaMedio clonedEntity =  new DefensaMedio(nombre, vida, cantidadGolpes, nivel, campos, nivelAparicion, grid,  moving, attacking);
        return clonedEntity;
    }
    
    public int getRange() {
        return range;
    }
        
    
}