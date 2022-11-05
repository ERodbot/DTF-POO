/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.defendthefort;
import com.mycompany.defendthefort.Entity;
import com.mycompany.defendthefort.Grid;
import com.mycompany.defendthefort.Tile;
import java.awt.Color;
import java.io.Serializable;
import javax.swing.ImageIcon;

/**
 *
 * @author sebas
 */
public class ZombieAereo extends Entity implements Serializable{
    
    
    
    
    ZombieAereo(String nombre, int vida, int cantidadGolpes, int nivel, int campos, int nivelAparicion, Grid grid,  ImageIcon movementfilePath, ImageIcon attackfilePath){
        super(Types.ZOMBIEAEREO, nombre,vida,cantidadGolpes,nivel,campos,nivelAparicion, grid, movementfilePath, movementfilePath); 
    }




    @Override
    public void atacar() {
        Entity objective = determineObjective(getRange());
        grid.matrix[posy][posx].button.setIcon(attacking);
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

   
   public Entity determineObjective(int range) {
        for(int i = getLocationY()-range; i<getLocationY()+range+1; i++){
            for(int j = getLocationX()-range; j<this.getLocationX()+range+1; j++){
                Tile[][] matrix = this.getGrid().getMatrix();
                if(i<matrix.length && i>=0 && j<matrix[0].length && j>=0 && matrix[i][j].personaje!=null){  
                    if(matrix[i][j].personaje!=null && this.getDefenses().contains(matrix[i][j].personaje) && matrix[i][j].personaje.getLife() > 0){
                        return matrix[i][j].personaje;
                    }
                }         
            }
        }
        return null;
    }
    
    @Override
    public Entity clone(){
        ZombieAereo clonedEntity =  new ZombieAereo(nombre, vida, cantidadGolpes, nivel, campos, nivelAparicion, grid,  moving, attacking);
        return clonedEntity;
    }
}
    
