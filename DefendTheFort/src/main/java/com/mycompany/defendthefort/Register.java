/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.defendthefort;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author em000
 */
public class Register implements Serializable{
    String ID;
    private  ArrayList<String> attackers = new ArrayList();  //arrays de entidades que atacaron/fueron atacadas por la entidad
    private ArrayList damageReceived = new ArrayList();      //con el ataque que les corresponde
    private  ArrayList<String> attacked = new ArrayList();
    private ArrayList damageDone = new ArrayList();
    private final int startingLife;                          //registros de la vida inicial y final de la entidad en una partida
    private int finalLife;
    private boolean isRunning = true;

    public boolean isIsRunning() {
        return isRunning;
    }

    public void setIsRunning(boolean isRunning) {
        this.isRunning = isRunning;
    }
    
    
    Register(String nombre, int life){
        this.ID = new Random().nextInt(999999999)/new Random().nextInt(1, 999)+"";
        startingLife = life;  
    }

    @Override
    public String toString(){
        String attackedStr = "";
        for(int i = 0; i<attacked.size(); i++){

            attackedStr += "entidad: " + attacked.get(i) + "con un daño hecho: " + damageDone.get(i) + "<br>";
        }
       String receivedStr = "";    
       for(int i = 0; i<attackers.size(); i++){
            receivedStr += "entidad: " + attackers.get(i) + "con un daño hecho: " + damageDone.get(i) + "<br>";
        }  
       return("<html>La entidad:  " + ID + "<br> que empezó con vida: " + startingLife + " <br> ha registrad los siguientes ataques: <br>" + attackedStr + " <br> ha registrad los siguientes daños: <br>" + receivedStr + "<br>" + " y termino con vida: " + finalLife + "</html>");
    }
    
    
    public String getID() {
        return ID;
    }

    public ArrayList<String> getAttackers() {
        return attackers;
    }

    public ArrayList getDamageReceived() {
        return damageReceived;
    }

    public ArrayList<String> getAttacked() {
        return attacked;
    }

    public ArrayList getDamageDone() {
        return damageDone;
    }
    
    public int getStartingLife() {
        return startingLife;
    }

    public int getFinalLife() {
        return finalLife;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public void setAttackers(ArrayList<String> attackers) {
        this.attackers = attackers;
    }

    public void setDamageReceived(ArrayList damageReceived) {
        this.damageReceived = damageReceived;
    }

    public void setAttacked(ArrayList<String> attacked) {
        this.attacked = attacked;
    }

    public void setDamageDone(ArrayList damageDone) {
        this.damageDone = damageDone;
    }

    public void setFinalLife(int finalLife) {
        if(isRunning)
            this.finalLife = finalLife;
    }
    
    
    
    
    
}
