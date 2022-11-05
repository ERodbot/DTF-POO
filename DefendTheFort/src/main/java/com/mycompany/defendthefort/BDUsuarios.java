/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.defendthefort;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author USUARIO
 */
public class BDUsuarios implements Serializable{
    String filepath = "users.dat";
    ArrayList<User> users;
    
    /**
     *
     */
    public BDUsuarios(){
        users = new ArrayList<User>();
//       
    }
    
    /**
     *
     */
    public void guardar(){
        FileManager.writeObject(this, filepath);
        
    }
    
    /**
     *
     */
    public void restaurar() {
        BDUsuarios dataBase = (BDUsuarios) FileManager.readObject(filepath);
        users = dataBase.users;
        for (User user : users) {
            System.out.println(user.toString());
        }
    }
       
    /**
     *
     * @param ID
     * @param password
     * @return
     */
    public boolean buscarUsuario(String ID, String password){
        for (User user : users) {
            if (user.getID().equals(ID) && user.getPassword().equals(password))
                return true;
        }
        return false;
    }
    
    /**
     *
     * @param ID
     * @return
     */
    public User obtenerUsuario(String ID){
        for (User user : users) {
            if (user.getID().equals(ID))
                return user; 
        }
        return null;
    }
    
    /**
     *
     * @param ID
     * @param name
     * @param password
     */
    public void darDeAlta(String ID, String name, String password){
        boolean buscado = buscarUsuario(ID, password);
        if(users == null){
            User toAdd = new User(ID, password);
            users.add(toAdd);
            this.guardar();
        }
            else if(buscado != true){
                 User toAdd = new User(ID, password);
                users.add(toAdd);
                this.guardar();
        }
    
    }
    
    
//    
//    
//    public int obtenerMayorPuntaje(ArrayList<User> usuarios){
//        int mayor = usuarios.get(0).getPuntajeTotal();
//        for(User user : users){
//            if (user.getPuntajeTotal() > mayor){
//                mayor = user.getPuntajeTotal();
//            }
//        }
//        return mayor;
//    }
//    
//    public ArrayList<User> clonar(ArrayList<User> usuarios){
//        ArrayList<User> clonado = new ArrayList<User>();
//        for (User user : usuarios) {
//            clonado.add(user.clone());
//        }
//        return clonado;
//    }
//    
//    public ArrayList<User> clasificarRanking(ArrayList<User> usuarios){
//        ArrayList<User> usuariosCopia = clonar(usuarios);
//        ArrayList<User> clasificadosRanking = new ArrayList<User>();
//        while(usuariosCopia.size() != 0){
//            int puntaje = obtenerMayorPuntaje(usuariosCopia);
//            User buscado = buscarPorPuntaje(usuariosCopia, puntaje);
//            System.out.println(buscado.getName());
//            
//            clasificadosRanking.add(buscado);
//            usuariosCopia.remove(buscado);   
//        }
//        return clasificadosRanking;
//        
//    }
//    
//    public User buscarPorPuntaje(ArrayList<User> usuarios, int puntaje){   
//        for(User user : usuarios){
//            if (user.getPuntajeTotal() == puntaje){
//                return user;
//            }
//        }
//        return null;
//    }
//    
//    public void imprimirRanking(){
//        for (User user : users) {
//           System.out.println(user.toString());  
//        }  
//    }
//    
//    @Override
//    public String toString(){
//        String str = "";
//        int contador = 1;
//        for (User user : users) {
//            if(!user.getID().contains("admin"))
//                str += contador++ + ".\t" + user.toString() + "\n\n\n";
//        }
//        return str;
//    }
//    
//    
//    
//    public void guardarPuntajesAux(String nombreDeUsuario, Mundial mundialUsuario, Mundial mundialAdmin){
//        if(!nombreDeUsuario.contains("admin")){
//        if(obtenerUsuario(nombreDeUsuario).getPuntajeTotal() == 0){
//            int[] resultado = mundialUsuario.compararAsignar(mundialAdmin);
//            obtenerUsuario(nombreDeUsuario).setPuntaje(resultado);
//            obtenerUsuario(nombreDeUsuario).setPuntajeTotal();
//            
//            guardar();
//        }
//        else if(obtenerUsuario(nombreDeUsuario).getPuntajeTotal() != 0){
//            obtenerUsuario(nombreDeUsuario).setPuntajeTotal(0);
//            int[] resultado = mundialUsuario.compararAsignar(mundialAdmin);
//            obtenerUsuario(nombreDeUsuario).setPuntaje(resultado);
//            obtenerUsuario(nombreDeUsuario).setPuntajeTotal();
//            
//            guardar();
//        }
//        }
//        
//    }
//    
//    public void guardarPuntajes( Mundial mundialAdmin, String _username){
//        
//        if(!_username.contains("admin"))
//        for(User usuario: users){
//             String nombreDeUsuario = usuario.getID();
//             Mundial mundialUsuario = usuario.getMundial();
//             User usuarioBuscado = obtenerUsuario(nombreDeUsuario);
//             guardarPuntajesAux (nombreDeUsuario, mundialUsuario, mundialAdmin);
//             ;
//        }
//        users = clasificarRanking(users);
//        
//    }
//    
    
}
