package com.mycompany.defendthefort;


import com.mycompany.defendthefort.GameScreen;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author em000
 */
public class ThreadGame extends Thread {
    GameScreen game;
    boolean winner = false;
   
    
    ThreadGame(GameScreen game){
        this.game = game;
        
    }
    
    @Override
    public void run(){
        Entity treeOfLife = game.getCurrentLevel().getTreeOfLife().personaje;
        while(treeOfLife.getLife()>0){
            

                
            game.getLblConsulta().setText(game.getCurrentLevel().getConsult());
            if(game.getCurrentLevel().getZombies().size() == 0){
                treeOfLife.setLife(0);
                System.out.println(game.getCurrentLevel().getZombies().size());
                game.getCurrentLevel().lockFinalLife();
                winner = !winner;
            }
        } 
        game.getCurrentLevel().endGame();
        Object[] options = {"Continuar", "Cancelar"};
        String txt = "VICTORIA";
        if(!winner){
            txt = "DERROTA";
        }
        int choice = JOptionPane.showOptionDialog(null, txt, "Continuar al siguiente nivel",JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, "Metric");
        if(choice == 0 ){
            game.setLevel(game.getLevel()+1);
            if(game.getLevel() >=10){
                game.getLevelGrid().add(new Grid(game.getLevel()));
            }
            game.placeButtons(game.getCurrentLevel().getMatrix());
            game.levelUpEntities();
            game.getPnlDefenses().removeAll();
            game.addPosibleDefensesScreen();
            System.out.println("la capacidad actual es: " + game.getCurrentLevel().zombieCapacity);
            System.out.println("nivel: " + game.getCurrentLevel().nivel);
        }else{
           game.getTpnlContent().setSelectedIndex(3);    
        }
      game.getGameThread().start();
        System.out.println("Finished");
        
    }
    
    
    
}
