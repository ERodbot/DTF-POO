/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.defendthefort;

import java.util.ArrayList;
import javax.swing.JButton;

/**
 *
 * @author em000
 */

public class Factory {
    
    
 

    static Entity build(Types entityType, EntityDummy base, Grid grid){
        
    JButton reference = new JButton();
    reference.setSize(35,35);
    Entity created;
        switch(entityType){
            case ZOMBIEAEREO:
                 created = new ZombieAereo(base.nombre, base.vida, base.cantidadGolpes, base.nivel, base.campos, base.nivelAparicion, grid, ImageManager.resize(reference,base.movingFilePath), ImageManager.resize(reference,base.attackingFilePath));
                 break;
            case ZOMBIECHOQUE:
                 created = new ZombieChoque(base.nombre, base.vida, base.cantidadGolpes, base.nivel, base.campos, base.nivelAparicion, grid, ImageManager.resize(reference,base.movingFilePath), ImageManager.resize(reference,base.attackingFilePath));
                 break;
            case ZOMBIECONTACTO:
                 created = new ZombieContacto(base.nombre, base.vida, base.cantidadGolpes, base.nivel, base.campos, base.nivelAparicion, grid, ImageManager.resize(reference,base.movingFilePath), ImageManager.resize(reference,base.attackingFilePath));
                 break;
            case ZOMBIEMEDIO:
                 created = new ZombieMedio(base.nombre, base.vida, base.cantidadGolpes, base.nivel, base.campos, base.nivelAparicion, grid, ImageManager.resize(reference,base.movingFilePath), ImageManager.resize(reference,base.attackingFilePath));
                 break;
            case DEFENSAAEREO:
                 created = new DefensaAereo(base.nombre, base.vida, base.cantidadGolpes, base.nivel, base.campos, base.nivelAparicion, grid, ImageManager.resize(reference,base.movingFilePath), ImageManager.resize(reference,base.attackingFilePath));
                 break;
            case DEFENSABLOQUE:
                 created = new DefensaBloque(base.nombre, base.vida, base.nivel, base.campos, base.nivelAparicion, grid, ImageManager.resize(reference,base.movingFilePath), ImageManager.resize(reference,base.attackingFilePath));
                 break;
            case DEFENSACONTACTO:
                 created = new DefensaContacto(base.nombre, base.vida, base.cantidadGolpes, base.nivel, base.campos, base.nivelAparicion, grid, ImageManager.resize(reference,base.movingFilePath), ImageManager.resize(reference,base.attackingFilePath));;
                 break;
            case DEFENSAIMPACTO:
                 created = new DefensaImpacto(base.nombre, base.vida, base.cantidadGolpes, base.nivel, base.campos, base.nivelAparicion, grid, ImageManager.resize(reference,base.movingFilePath), ImageManager.resize(reference,base.attackingFilePath));
                 break;
            case DEFENSAMEDIO:
                 created = new DefensaMedio(base.nombre, base.vida, base.cantidadGolpes, base.nivel, base.campos, base.nivelAparicion, grid, ImageManager.resize(reference,base.movingFilePath), ImageManager.resize(reference,base.attackingFilePath));
                 break;
            case DEFENSAMULTIPLE:
                 created = new DefensaMultiple(base.nombre, base.vida, base.cantidadGolpes, base.nivel, base.campos, base.nivelAparicion, grid, ImageManager.resize(reference,base.movingFilePath), ImageManager.resize(reference,base.attackingFilePath));
                 break;          
            case default:
                return null;
        }
    created.setRegister(base.register);
    created.setRange(base.range);
    created.setLocation(base.posx, base.posy);
    return created;
    }
    
    
    
    static ArrayList<Entity> convertToRealEntity(ArrayList<EntityDummy> array, Grid grid){
        ArrayList<Entity> res = new ArrayList<Entity>(); 
        for(EntityDummy dummy: array){ 
           res.add(Factory.build(dummy.type, dummy, grid));
       }
        return res;
    }
       
}