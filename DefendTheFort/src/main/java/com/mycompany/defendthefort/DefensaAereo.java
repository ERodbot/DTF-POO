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
 * @author em000
 */
public class DefensaAereo extends Entity implements Serializable{
    
    
    
    
    DefensaAereo(String nombre, int vida, int cantidadGolpes, int nivel, int campos, int nivelAparicion, Grid grid,  ImageIcon movementfilePath, ImageIcon attackfilePath){
        super(Types.DEFENSAAEREO, nombre,vida,cantidadGolpes,nivel,campos,nivelAparicion, grid, movementfilePath, movementfilePath);
        setRange(1);
    }

    
    //busca el objetivo, cuando lo encuentra se mueve hacia el hasta entrar en rango y lo ataca;
    @Override
    public void atacar() {
        Entity objectivePos = determineObjective(15);
        mover(objectivePos.posy, objectivePos.posx);
        Entity objective = determineObjective(getRange());
        if(objective!=null && objective==objectivePos){
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
    
    
    
  //cuando la entidad queda con menos de 0 de vida, pone una tumba y quita su casilla; 

  
  
    
    
    
    //clona la entidad con sus atributos;
    @Override
    public Entity clone(){
        DefensaAereo clonedEntity =  new DefensaAereo(nombre, vida, cantidadGolpes, nivel, campos, nivelAparicion, grid,  moving, attacking);
        clonedEntity.setAttackingFilepath(getAttackingFilepath()); clonedEntity.setMovingFilepath(getMovingFilepath());
        return clonedEntity;
    }

 }


    
    


