package com.mycompany.defendthefort;

import java.util.ArrayList;
import javax.swing.ImageIcon;

enum Types {
        ZOMBIEAEREO,
        ZOMBIECHOQUE,
        ZOMBIECONTACTO,
        ZOMBIEMEDIO,
        DEFENSAAEREO,
        DEFENSABLOQUE,
        DEFENSACONTACTO,
        DEFENSAIMPACTO,
        DEFENSAMEDIO, 
        DEFENSAMULTIPLE;
    }

public abstract class Entity {
    public Types tipe;
    public String nombre;
    private int range;
    public int vida;
    public int cantidadGolpes, nivel, campos, nivelAparicion, posx, posy;   
    public Grid grid;  //una referencia al tablero donde debe ponerse la entidad
    private  ArrayList<Entity> zombies = new ArrayList();  //un array de los zombies en el tablero
    private  ArrayList<Entity> defenses = new ArrayList(); //un array de las defensas en el tablero
    private  ArrayList<Entity> flyingEntities = new ArrayList(); //un array de las entidades voladoras en el tablero
    private Register register = new Register(this.nombre, vida); //una clase registro para guardar los ataques recbidos/propiciados;
    ImageIcon moving; //imagen de la entidad en movimiento
    ImageIcon attacking; //imagen de la entidad atacando
    private String movingFilepath;
    private String attackingFilepath;
            
    

   
   
    
    public Entity(String nombre, int vida, int cantidadGolpes, int nivel, int campos, int nivelAparicion, Grid grid, ImageIcon movementfilePath, ImageIcon attackfilePath){
        this.nombre = nombre;
        this.vida = vida;
        this.cantidadGolpes = cantidadGolpes;
        this.nivel = nivel;
        this.campos = campos;
        this.nivelAparicion = nivelAparicion;
        this.grid = grid;
        this.moving = movementfilePath;
        this.attacking = attackfilePath;
        
    }
    
    
     public void mover(int x, int y){
        int dify = posx - x; //13 POSICION DEL ARBOL DE LA VIDA (-1 por el index empezado en 0)
        int difx = posy - y; //13 POSICION DEL ARBOL DE LA VIDA (-1 por el index empezado en 0)
        ImageIcon grassIcon = ImageManager.resize(grid.matrix[1+posy][1+posx].button, "C:\\Images\\grass.png");
        ImageIcon zombieIcon = moving;
        
        
        if ( difx < 0 && dify < 0){ //diagonal izquierda abajo (movimiento hacia)
            if(grid.matrix[1+posy][1+posx].personaje !=null){
                return;
            }
            grid.matrix[posy][posx].personaje = null;
            grid.matrix[posy][posx].button.setIcon(grassIcon) ;
            grid.matrix[++posy][++posx].personaje = this;
            grid.matrix[posy][posx].button.setIcon(attacking) ; 
            return;
        }
        if ( difx < 0 && dify > 0){ //diagonal derecha abajo
            if(grid.matrix[1+posy][posx-1].personaje !=null){
                return;
            }
            grid.matrix[posy][posx].personaje = null;
            grid.matrix[posy][posx].button.setIcon(grassIcon) ;
            grid.matrix[++posy][--posx].personaje = this;
            grid.matrix[posy][posx].button.setIcon(zombieIcon) ;
            return;
        }
        if ( difx > 0 && dify < 0){ //diagonal izquierda arriba
            if(grid.matrix[posy-1][posx+1].personaje !=null){
                return;
            }
            grid.matrix[posy][posx].personaje = null;
            grid.matrix[posy][posx].button.setIcon(grassIcon) ;
            grid.matrix[--posy][++posx].personaje = this;
            grid.matrix[posy][posx].button.setIcon(zombieIcon) ;
            return;
        }
        if ( difx > 0 && dify > 0){ //diagonal derecha arriba
            if(grid.matrix[posy-1][posx-1].personaje !=null){
                return;
            }
            grid.matrix[posy][posx].personaje = null;
            grid.matrix[posy][posx].button.setIcon(grassIcon) ;
            grid.matrix[--posy][--posx].personaje = this;
            grid.matrix[posy][posx].button.setIcon(zombieIcon) ; 
            return;
        }
        if ( difx == 0 && dify < 0){ //abajo
            if(grid.matrix[posy][posx+1].personaje !=null){
                return;
            }
            grid.matrix[posy][posx].personaje = null;
            grid.matrix[posy][posx].button.setIcon(grassIcon) ; 
            grid.matrix[posy][++posx].personaje = this;
            grid.matrix[posy][posx].button.setIcon(zombieIcon) ;
            return;
        }
        if ( difx == 0 && dify > 0){ //arriba
            if(grid.matrix[posy][posx-1].personaje !=null){
                return;
            }
            grid.matrix[posy][posx].personaje = null;
            grid.matrix[posy][posx].button.setIcon(grassIcon) ;
            grid.matrix[posy][--posx].personaje = this;
            grid.matrix[posy][posx].button.setIcon(zombieIcon) ;
            return;
        }
        if ( difx < 0 && dify == 0){ //izquierda
            if(grid.matrix[posy+1][posx].personaje !=null){
                return;
            }
            grid.matrix[posy][posx].personaje = null;
            grid.matrix[posy][posx].button.setIcon(grassIcon) ;
            grid.matrix[++posy][posx].personaje = this;
            grid.matrix[posy][posx].button.setIcon(zombieIcon) ;
            return;
        }
        if ( difx > 0 && dify == 0){ //derecha
            if(grid.matrix[posy-1][posx].personaje !=null){
                return;
            }
            grid.matrix[posy][posx].personaje = null;
            grid.matrix[posy][posx].button.setIcon(grassIcon) ;
            grid.matrix[--posy][posx].personaje = this;
            grid.matrix[posy][posx].button.setIcon(zombieIcon) ;
            return;
        }   
    }

    public  Entity determineObjective(int range) {
        for(int i = getLocationY()-range; i<getLocationY()+range+1; i++){
            for(int j = getLocationX()-range; j<this.getLocationX()+range+1; j++){
                Tile[][] matrix = this.getGrid().getMatrix();
                if(i<matrix.length && i>=0 && j<matrix[0].length && j>=0 && matrix[i][j].personaje!=null){  
                    if(this.getZombies().contains(matrix[i][j].personaje) && matrix[i][j].personaje.getLife() > 0){
                       
                        return matrix[i][j].personaje;
                    }
                }         
            }
        }
        return null;
    }
    
     public void morir() {
       ImageIcon grave;
       grave = ImageManager.resize(grid.matrix[posy][posx].button, "C:\\Images\\grave.png");
       grid.matrix[posy][posx].button.setIcon(grave);
       System.out.println("me mori xC soy defensa: "+ nombre);
       setLife(0);
       this.getRegister().setFinalLife(0);
       if(grid.getZombies().contains(this))
           grid.getZombies().remove(this);
       else{
           grid.getDefenses().remove(this);
       }
       grid.matrix[posy][posx].personaje = null;
    }
    
    
    public abstract Entity clone();
    
    
    public abstract void atacar();
   
    
    //establece la posicion de la entididad en el tablero;
    public void setLocation(int y, int x){
        this.posx = x;
        this.posy = y;
    }
    public int getLocationX(){
        return posx; 
    }
    public int getLocationY(){
         return posy;
    }
    
    public Grid getGrid(){
        return grid;
    }
    
    public int getLife(){
      return vida;  
    }

    public void setLife(int life){
      this.vida = life;  
    } 
    
    public void substractLife(int life){
      this.vida -= life;  
    }      

     public void setZombies(ArrayList<Entity> zombies) {
        this.zombies = zombies;
    }

    public void setRegister(Register register) {
        this.register = register;
    }

    public void setDefenses(ArrayList<Entity> defenses) {
        this.defenses = defenses;
    }

    public void setFlyingEntities(ArrayList<Entity> flyingEntities) {
        this.flyingEntities = flyingEntities;
    }

    public ArrayList<Entity> getZombies() {
        return zombies;
    }

    public ArrayList<Entity> getDefenses() {
        return defenses;
    }

    public ArrayList<Entity> getFlyingEntities() {
        return flyingEntities;
    }
    
    public Register getRegister(){
        return register;
    }
    
    public int getRange() {
        return range;
    }
    
    public void setRange(int num) {
        this.range = num;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public void setCantidadGolpes(int cantidadGolpes) {
        this.cantidadGolpes = cantidadGolpes;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public void setCampos(int campos) {
        this.campos = campos;
    }

    public void setNivelAparicion(int nivelAparicion) {
        this.nivelAparicion = nivelAparicion;
    }

    public void setPosx(int posx) {
        this.posx = posx;
    }

    public void setPosy(int posy) {
        this.posy = posy;
    }

    public void setGrid(Grid grid) {
        this.grid = grid;
    }

    public void setMoving(ImageIcon moving) {
        this.moving = moving;
    }

    public void setAttacking(ImageIcon attacking) {
        this.attacking = attacking;
    }

    public String getNombre() {
        return nombre;
    }

    public int getVida() {
        return vida;
    }

    public int getCantidadGolpes() {
        return cantidadGolpes;
    }

    public int getNivel() {
        return nivel;
    }

    public int getCampos() {
        return campos;
    }

    public int getNivelAparicion() {
        return nivelAparicion;
    }

    public int getPosx() {
        return posx;
    }

    public int getPosy() {
        return posy;
    }

    public ImageIcon getMoving() {
        return moving;
    }

    public ImageIcon getAttacking() {
        return attacking;
    }

    public Types getTipe() {
        return tipe;
    }

    public void setTipe(Types tipe) {
        this.tipe = tipe;
    }

    public String getMovingFilepath() {
        return movingFilepath;
    }

    public void setMovingFilepath(String movingFilepath) {
        this.movingFilepath = movingFilepath;
    }

    public String getAttackingFilepath() {
        return attackingFilepath;
    }

    public void setAttackingFilepath(String attackingFilepath) {
        this.attackingFilepath = attackingFilepath;
    }
    
    
    
        
        
}

