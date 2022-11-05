package com.mycompany.defendthefort;

import java.io.Serializable;
import java.util.ArrayList;

public class User implements Serializable{
    private String ID;
    private String password;
    private ArrayList<Partida> partidas =  new ArrayList<>();
    
 
    
    
    public User(String ID, String password){
        partidas.add(new Partida(this,1));
        this.ID = ID;
        this.password = password; 
         
    }  

    public ArrayList<Partida> getPartidas() {
        return partidas;
    }

    public void setPartidas(ArrayList<Partida> partidas) {
        this.partidas = partidas;
    }

    @Override
    public String toString() {
        return "";
    }
    
    @Override
    public User clone(){
        User usuario = new User(this.ID, this.password);
        return usuario;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public void setContraseña(String password) {
        this.password = password;
    }

    public String getID() {
        return ID;
    }


    public String getPassword() {
        return password;
    }

}
