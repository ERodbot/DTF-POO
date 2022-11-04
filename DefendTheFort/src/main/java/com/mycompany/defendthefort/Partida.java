/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.defendthefort;

import java.io.Serializable;
import java.util.ArrayList;
import javax.swing.ImageIcon;

/**
 *
 * @author sebas
 */
public class Partida implements Serializable {
    User user;   //sistema de manejo de la creacion de los personajes;
    int level = 0;
    int numberOfGame; 
    public  ArrayList<EntityDummy> defenses = new ArrayList<EntityDummy>(); //array de las posibles defensas para cada partidoa;
    public  ArrayList<EntityDummy> zombies = new ArrayList<EntityDummy>(); //array de los posibles zombies para cada partida
    public  ArrayList<EntityDummy> defensesActive = new ArrayList<EntityDummy>(); //array de las posibles defensas para cada partidoa;
    public  ArrayList<EntityDummy> zombiesActive = new ArrayList<EntityDummy>(); //array de los posibles zombies para cada partida
    public  ArrayList<EntityDummy> flyingEntities = new ArrayList<EntityDummy>();
   
    Partida(User user, int numberOfGame){
        this.numberOfGame = numberOfGame;
        this.user = user;
    }
    
    
    
    
    

    public int getLevel() {
        return level;
    }
    public void setLevel(int level) {
        this.level = level;
    }


    public int getNumberOfGame() {
        return numberOfGame;
    }

    public void setNumberOfGame(int numberOfGame) {
        this.numberOfGame = numberOfGame;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
   
}
