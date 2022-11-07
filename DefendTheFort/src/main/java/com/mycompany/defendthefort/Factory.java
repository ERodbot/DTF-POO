/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.defendthefort;

import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JButton;

/**
 *
 * @author em000
 */

public class Factory {
    
    
 

    static Entity dummyToEntity(Types entityType, EntityDummy base, Grid grid){
        
    JButton reference = new JButton();
    reference.setSize(35,35);
    Entity created;
        switch(entityType){
            case ZOMBIEAEREO:
                System.out.println("ZombieAereo");
                 created = new ZombieAereo(base.nombre, base.vida, base.cantidadGolpes, base.nivel, base.campos, base.nivelAparicion, grid, ImageManager.resize(reference,base.movingFilePath), ImageManager.resize(reference,base.attackingFilePath));
                 System.out.println("DummyToEntity a: " + created.nombre);
                 break;
            case ZOMBIECHOQUE:
                System.out.println("ZombieChoque");
                 created = new ZombieChoque(base.nombre, base.vida, base.cantidadGolpes, base.nivel, base.campos, base.nivelAparicion, grid, ImageManager.resize(reference,base.movingFilePath), ImageManager.resize(reference,base.attackingFilePath));
                 System.out.println("DummyToEntity a: " + created.nombre);
                 break;
            case ZOMBIECONTACTO:
                System.out.println("ZOMBIECONTACTO");
                 created = new ZombieContacto(base.nombre, base.vida, base.cantidadGolpes, base.nivel, base.campos, base.nivelAparicion, grid, ImageManager.resize(reference,base.movingFilePath), ImageManager.resize(reference,base.attackingFilePath));
                 System.out.println("DummyToEntity a: " + created.nombre);
                 break;
            case ZOMBIEMEDIO:
                System.out.println("ZOMBIEMEDIO");
                 created = new ZombieMedio(base.nombre, base.vida, base.cantidadGolpes, base.nivel, base.campos, base.nivelAparicion, grid, ImageManager.resize(reference,base.movingFilePath), ImageManager.resize(reference,base.attackingFilePath));
                 System.out.println("DummyToEntity a: " + created.nombre);
                 break;
            case DEFENSAAEREO:
                System.out.println("DEFENSAAEREO");
                 created = new DefensaAereo(base.nombre, base.vida, base.cantidadGolpes, base.nivel, base.campos, base.nivelAparicion, grid, ImageManager.resize(reference,base.movingFilePath), ImageManager.resize(reference,base.attackingFilePath));
                 System.out.println("DummyToEntity a: " + created.nombre);
                 break;
            case DEFENSABLOQUE:
                System.out.println("DEFENSABLOQUE");
                 created = new DefensaBloque(base.nombre, base.vida, base.nivel, base.campos, base.nivelAparicion, grid, ImageManager.resize(reference,base.movingFilePath), ImageManager.resize(reference,base.attackingFilePath));
                 System.out.println("DummyToEntity a: " + created.nombre);
                 break;
            case DEFENSACONTACTO:
                System.out.println("DEFENSACONTACTO");
                 created = new DefensaContacto(base.nombre, base.vida, base.cantidadGolpes, base.nivel, base.campos, base.nivelAparicion, grid, ImageManager.resize(reference,base.movingFilePath), ImageManager.resize(reference,base.attackingFilePath));;
                 System.out.println("DummyToEntity a: " + created.nombre);
                 break;
            case DEFENSAIMPACTO:
                System.out.println("DEFENSAIMPACTO");
                 created = new DefensaImpacto(base.nombre, base.vida, base.cantidadGolpes, base.nivel, base.campos, base.nivelAparicion, grid, ImageManager.resize(reference,base.movingFilePath), ImageManager.resize(reference,base.attackingFilePath));
                 System.out.println("DummyToEntity a: " + created.nombre);
                 break;
            case DEFENSAMEDIO:
                System.out.println("DEFENSAMEDIO");
                 created = new DefensaMedio(base.nombre, base.vida, base.cantidadGolpes, base.nivel, base.campos, base.nivelAparicion, grid, ImageManager.resize(reference,base.movingFilePath), ImageManager.resize(reference,base.attackingFilePath));
                 System.out.println("DummyToEntity a: " + created.nombre);
                 break;
            case DEFENSAMULTIPLE:
                System.out.println("DEFENSAMULTIPLE");
                System.out.println(base.nombre);
                System.out.println(base.campos);
                System.out.println(base.movingFilePath);
                System.out.println(base.attackingFilePath);
                 created = new DefensaMultiple(base.nombre, base.vida, base.cantidadGolpes, base.nivel, base.campos, base.nivelAparicion, grid, ImageManager.resize(reference,base.movingFilePath), ImageManager.resize(reference,base.attackingFilePath));
                 System.out.println("DummyToEntity a: " + created.nombre);
                 break;          
            case default:
                System.out.println("Default");
                return null;
        }
    if(created!=null){
        created.setRegister(base.register);
        created.setRange(base.range);
        created.setAttackingFilepath(base.attackingFilePath);
        created.setMovingFilepath(base.movingFilePath);
        created.setLocation(base.posy, base.posx);
        
    }
    return created;
    }
    
    
    
    static ArrayList<Entity> convertToRealEntity(ArrayList<EntityDummy> array, Grid grid){
        ArrayList<Entity> res = new ArrayList<Entity>(); 
        for(EntityDummy dummy: array){
              res.add(Factory.dummyToEntity(dummy.type, dummy, grid));
              System.out.println("converted to real");
       }
        System.out.println("completed process convertToRealEntity");
        return res;
        
    }
    
    static ArrayList<EntityDummy> convertEntitiesToDummies(ArrayList<Entity> array){
        ArrayList<EntityDummy> res = new ArrayList<EntityDummy>(); 
        for(Entity entity: array){ 
                res.add(Factory.entityToDummy(entity, entity.type));
                System.out.println("converted to dummy");
       }
        System.out.println("completed process convertEntitiesToDummies");
        return res;
    }

public static EntityDummy entityToDummy(Entity entity, Types type){
        
    EntityDummy dummy;
        switch(type){
            case ZOMBIEAEREO:
                 dummy = new EntityDummy(Types.ZOMBIEAEREO, entity.getNombre(), entity.getRange(), entity.getVida(), entity.getCampos(), entity.getCantidadGolpes(), entity.getNivel(), entity.getNivelAparicion(), entity.getPosx(), entity.getPosy(), entity.getRegister(),entity.getMovingFilepath(),entity.getAttackingFilepath());
                 System.out.println("EntityToDummy a: " + dummy.nombre + "-" + dummy.movingFilePath);
                 break;
            case ZOMBIECHOQUE:
                 dummy = new EntityDummy(Types.ZOMBIECHOQUE, entity.getNombre(), entity.getRange(), entity.getVida(), entity.getCampos(), entity.getCantidadGolpes(), entity.getNivel(), entity.getNivelAparicion(), entity.getPosx(), entity.getPosy(), entity.getRegister(),entity.getMovingFilepath(),entity.getAttackingFilepath());
                  System.out.println("EntityToDummy a: " + dummy.nombre + "-" + dummy.movingFilePath);
                 break;
            case ZOMBIECONTACTO:
                 dummy = new EntityDummy(Types.ZOMBIECONTACTO, entity.getNombre(), entity.getRange(), entity.getVida(), entity.getCampos(), entity.getCantidadGolpes(), entity.getNivel(), entity.getNivelAparicion(), entity.getPosx(), entity.getPosy(), entity.getRegister(),entity.getMovingFilepath(),entity.getAttackingFilepath());
                  System.out.println("EntityToDummy a: " + dummy.nombre + "-" + dummy.movingFilePath);
                 break;
            case ZOMBIEMEDIO:
                dummy = new EntityDummy(Types.ZOMBIEMEDIO, entity.getNombre(), entity.getRange(), entity.getVida(), entity.getCampos(), entity.getCantidadGolpes(), entity.getNivel(), entity.getNivelAparicion(), entity.getPosx(), entity.getPosy(), entity.getRegister(),entity.getMovingFilepath(),entity.getAttackingFilepath());
                 System.out.println("EntityToDummy a: " + dummy.nombre + "-" + dummy.movingFilePath);
                break;
            case DEFENSAAEREO:
                 dummy = new EntityDummy(Types.DEFENSAAEREO, entity.getNombre(), entity.getRange(), entity.getVida(), entity.getCampos(), entity.getCantidadGolpes(), entity.getNivel(), entity.getNivelAparicion(), entity.getPosx(), entity.getPosy(), entity.getRegister(),entity.getMovingFilepath(),entity.getAttackingFilepath());
                  System.out.println("EntityToDummy a: " + dummy.nombre + "-" + dummy.movingFilePath);
                 break;
            case DEFENSABLOQUE:
                 dummy = new EntityDummy(Types.DEFENSABLOQUE, entity.getNombre(), entity.getRange(), entity.getVida(), entity.getCampos(), entity.getCantidadGolpes(), entity.getNivel(), entity.getNivelAparicion(), entity.getPosx(), entity.getPosy(), entity.getRegister(),entity.getMovingFilepath(),entity.getAttackingFilepath());
                 System.out.println("EntityToDummy a: " + dummy.nombre + "-" + dummy.movingFilePath);
                 break;
            case DEFENSACONTACTO:
                 dummy = new EntityDummy(Types.DEFENSACONTACTO, entity.getNombre(), entity.getRange(), entity.getVida(), entity.getCampos(), entity.getCantidadGolpes(), entity.getNivel(), entity.getNivelAparicion(), entity.getPosx(), entity.getPosy(), entity.getRegister(),entity.getMovingFilepath(),entity.getAttackingFilepath());
                 System.out.println("EntityToDummy a: " + dummy.nombre + "-" + dummy.movingFilePath);
                 break;
            case DEFENSAIMPACTO:
                 dummy = new EntityDummy(Types.DEFENSAIMPACTO, entity.getNombre(), entity.getRange(), entity.getVida(), entity.getCampos(), entity.getCantidadGolpes(), entity.getNivel(), entity.getNivelAparicion(), entity.getPosx(), entity.getPosy(), entity.getRegister(),entity.getMovingFilepath(),entity.getAttackingFilepath());
                 System.out.println("EntityToDummy a: " + dummy.nombre + "-" + dummy.movingFilePath);
                 break;
            case DEFENSAMEDIO:
                dummy = new EntityDummy(Types.DEFENSAMEDIO, entity.getNombre(), entity.getRange(), entity.getVida(), entity.getCampos(), entity.getCantidadGolpes(), entity.getNivel(), entity.getNivelAparicion(), entity.getPosx(), entity.getPosy(), entity.getRegister(),entity.getMovingFilepath(),entity.getAttackingFilepath());
                System.out.println("EntityToDummy a: " + dummy.nombre + "-" + dummy.movingFilePath);
                break;
            case DEFENSAMULTIPLE:
                 dummy = new EntityDummy(Types.DEFENSAMULTIPLE, entity.getNombre(), entity.getRange(), entity.getVida(), entity.getCampos(), entity.getCantidadGolpes(), entity.getNivel(), entity.getNivelAparicion(), entity.getPosx(), entity.getPosy(), entity.getRegister(),entity.getMovingFilepath(),entity.getAttackingFilepath()); 
                 System.out.println("EntityToDummy a: " + dummy.nombre + "-" + dummy.movingFilePath);
                 break;          
            case default:
                System.out.println("Defaulr");
                return null;
        }
    return dummy;
    }
}  