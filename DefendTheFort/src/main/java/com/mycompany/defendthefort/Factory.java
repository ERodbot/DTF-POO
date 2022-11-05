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

public static EntityDummy entityToDummy(Entity entity, Types type){
        
    EntityDummy dummy;

        switch(type){
            case ZOMBIEAEREO:
                 dummy = new EntityDummy(Types.ZOMBIEAEREO, entity.getNombre(), entity.getRange(), entity.getVida(), entity.getCampos(), entity.getCantidadGolpes(), entity.getNivel(), entity.getNivelAparicion(), entity.getPosx(), entity.getPosy(), entity.getRegister(),entity.getMovingFilepath(),entity.getAttackingFilepath());
                 break;
            case ZOMBIECHOQUE:
                 dummy = new EntityDummy(Types.ZOMBIECHOQUE, entity.getNombre(), entity.getRange(), entity.getVida(), entity.getCampos(), entity.getCantidadGolpes(), entity.getNivel(), entity.getNivelAparicion(), entity.getPosx(), entity.getPosy(), entity.getRegister(),entity.getMovingFilepath(),entity.getAttackingFilepath());
                 break;
            case ZOMBIECONTACTO:
                 dummy = new EntityDummy(Types.ZOMBIECONTACTO, entity.getNombre(), entity.getRange(), entity.getVida(), entity.getCampos(), entity.getCantidadGolpes(), entity.getNivel(), entity.getNivelAparicion(), entity.getPosx(), entity.getPosy(), entity.getRegister(),entity.getMovingFilepath(),entity.getAttackingFilepath());
                 break;
            case ZOMBIEMEDIO:
                dummy = new EntityDummy(Types.ZOMBIEMEDIO, entity.getNombre(), entity.getRange(), entity.getVida(), entity.getCampos(), entity.getCantidadGolpes(), entity.getNivel(), entity.getNivelAparicion(), entity.getPosx(), entity.getPosy(), entity.getRegister(),entity.getMovingFilepath(),entity.getAttackingFilepath());
                 break;
            case DEFENSAAEREO:
                 dummy = new EntityDummy(Types.DEFENSAAEREO, entity.getNombre(), entity.getRange(), entity.getVida(), entity.getCampos(), entity.getCantidadGolpes(), entity.getNivel(), entity.getNivelAparicion(), entity.getPosx(), entity.getPosy(), entity.getRegister(),entity.getMovingFilepath(),entity.getAttackingFilepath());
                 break;
            case DEFENSABLOQUE:
                 dummy = new EntityDummy(Types.DEFENSABLOQUE, entity.getNombre(), entity.getRange(), entity.getVida(), entity.getCampos(), entity.getCantidadGolpes(), entity.getNivel(), entity.getNivelAparicion(), entity.getPosx(), entity.getPosy(), entity.getRegister(),entity.getMovingFilepath(),entity.getAttackingFilepath());
                 break;
            case DEFENSACONTACTO:
                 dummy = new EntityDummy(Types.DEFENSACONTACTO, entity.getNombre(), entity.getRange(), entity.getVida(), entity.getCampos(), entity.getCantidadGolpes(), entity.getNivel(), entity.getNivelAparicion(), entity.getPosx(), entity.getPosy(), entity.getRegister(),entity.getMovingFilepath(),entity.getAttackingFilepath());
                 break;
            case DEFENSAIMPACTO:
                 dummy = new EntityDummy(Types.DEFENSAIMPACTO, entity.getNombre(), entity.getRange(), entity.getVida(), entity.getCampos(), entity.getCantidadGolpes(), entity.getNivel(), entity.getNivelAparicion(), entity.getPosx(), entity.getPosy(), entity.getRegister(),entity.getMovingFilepath(),entity.getAttackingFilepath());
                 break;
            case DEFENSAMEDIO:
                dummy = new EntityDummy(Types.DEFENSAMEDIO, entity.getNombre(), entity.getRange(), entity.getVida(), entity.getCampos(), entity.getCantidadGolpes(), entity.getNivel(), entity.getNivelAparicion(), entity.getPosx(), entity.getPosy(), entity.getRegister(),entity.getMovingFilepath(),entity.getAttackingFilepath());
                 break;
            case DEFENSAMULTIPLE:
                 dummy = new EntityDummy(Types.DEFENSAMULTIPLE, entity.getNombre(), entity.getRange(), entity.getVida(), entity.getCampos(), entity.getCantidadGolpes(), entity.getNivel(), entity.getNivelAparicion(), entity.getPosx(), entity.getPosy(), entity.getRegister(),entity.getMovingFilepath(),entity.getAttackingFilepath()); 
                 break;          
            case default:
                return null;
        }
    return dummy;
    }
}  