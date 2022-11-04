package com.mycompany.defendthefort;

import java.io.FileWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Serializable;
import javax.swing.ImageIcon;
import org.json.simple.JSONArray; 
import org.json.simple.JSONObject; 
import org.json.simple.parser.JSONParser; 
import org.json.simple.parser.ParseException; 

public class ComponentsManager implements Serializable{
   
    public ComManGUI GUI;
    
    static JSONArray enemigos = new JSONArray();
        
    static JSONArray defensas = new JSONArray();
    
    ComponentsManager(){
        
    }
    
    public static void writeEntity(String nombre, String tipo, String path, int vida, int nivel, int golpes, int espacios,int opcion){
        
        //Tomando en cuenta los parámetros conseguidos del GUI, se escribirá el objeto JSON en el JSONArray en enemigos.json/defensas.json
        
        JSONObject entity = new JSONObject(); //Entidad a escribir
        
        //Poner key,value en el JSONObject
        entity.put("nombre", nombre);
        entity.put("tipo", tipo);
        entity.put("path", path);
        entity.put("vida", vida);
        entity.put("nivel", nivel);
        entity.put("golpes", golpes);
        entity.put("espacios", espacios);
        
        if (opcion == 0){ //Entidad es un enemigo
            enemigos.add(entity);  //se añade el nuevo JSONObject en el atributo enemigos (JSONArray)       
        
            try(FileWriter file = new FileWriter("enemigos.json")){
                file.write(enemigos.toJSONString()); //se escribe el JSONArray actualizado
                file.flush(); //se cierra el archivo
            }catch(IOException e ){
                e.toString();
            }
            return;
        }
        //Entidad es una defensa
        defensas.add(entity);  //se añade el nuevo JSONObject en el atributo defensas (JSONArray)     
        
        try(FileWriter file = new FileWriter("defensas.json")){
            file.write(defensas.toJSONString()); //se escribe el JSONArray actualizado
            file.flush(); //se cierra el archivo
        }catch(IOException e ){
            e.toString();
        }
    }
    
    public static void readToAdd(BDUsuarios BD){
         for (User user : BD.users) {
             for (Partida partida : user.getPartidas()){

            //Se leen los enemigos/defensas/flying entities para agregarlos a los ArrayList correspondientes

            String path;
            String tipo;
            String nombre;
            int vida;
            int golpes;
            int nivel;
            int espacios;

                JSONParser jsonParser = new JSONParser();

                try (FileReader reader = new FileReader("enemigos.json")){
                    JButton base new JButton();
                    base.setSize(35,35);
                    Object obj1 = jsonParser.parse(reader);

                    JSONArray enemigosObj = (JSONArray) obj1;

                    for (Object enemigo : enemigosObj) {
                        JSONObject enemigoAux = (JSONObject)enemigo;
                        path   = (String) enemigoAux.get("path");
                        tipo   = (String) enemigoAux.get("tipo");
                        nombre = (String) enemigoAux.get("nombre");
                        vida      = Math.toIntExact((long)enemigoAux.get("vida"));
                        golpes    = Math.toIntExact((long)enemigoAux.get("golpes"));
                        nivel     = Math.toIntExact((long)enemigoAux.get("nivel"));
                        espacios  = Math.toIntExact((long)enemigoAux.get("espacios"));
                        ImageIcon image = ImageManager.resize(base, path);
                        if ("ZombieContacto".equals(tipo))
                            partida.getZombies().add(new ZombieContacto(nombre,vida,golpes,nivel,espacios,nivel, new Grid(0),image,image));
                        else if ("ZombieMedio".equals(tipo))
                            partida.getZombies().add(new ZombieMedio(nombre,vida,golpes,nivel,espacios,nivel,partida.getCurrentLevel(),image,image));
                        else if ("ZombieAereo".equals(tipo)){
                            ZombieAereo aerial = new ZombieAereo(nombre,vida,golpes,nivel,espacios,nivel,partida.getCurrentLevel(),image,new ImageIcon(path));
                            partida.getZombies().add(aerial);

                        }
                        else if ("ZombieChoque".equals(tipo))
                            partida.getZombies().add(new ZombieChoque(nombre,vida,golpes,nivel,espacios,nivel,partida.getCurrentLevel(),image,image));

                    }

                }
                catch(FileNotFoundException e){
                    e.printStackTrace();
                }
                catch(IOException e){
                    e.printStackTrace();
                }
                catch(ParseException e ){
                    e.printStackTrace();
                }

                try (FileReader reader = new FileReader("defensas.json")){
                    Object obj2 = jsonParser.parse(reader);

                    JSONArray defensasObj = (JSONArray) obj2;

                    for (Object defensa : defensasObj) {
                        JSONObject defensaAux = (JSONObject)defensa;
                        path = (String) defensaAux.get("path");
                        tipo = (String) defensaAux.get("tipo");
                        nombre = (String) defensaAux.get("nombre");
                        vida      = Math.toIntExact( (long)defensaAux.get("vida"));
                        golpes    = Math.toIntExact( (long)defensaAux.get("golpes"));
                        nivel     = Math.toIntExact( (long)defensaAux.get("nivel"));
                        espacios  = Math.toIntExact( (long)defensaAux.get("espacios"));
                        ImageIcon image = ImageManager.resize(partida.getCurrentLevel().matrix[12][12].button, path);
                        if ("DefensaContacto".equals(tipo))
                            partida.getDefenses().add(new DefensaContacto(nombre,vida,golpes,nivel,espacios,nivel,partida.getCurrentLevel(),image,image));
                        else if ("DefensaChoque".equals(tipo))
                            partida.getDefenses().add(new DefensaImpacto(nombre,vida,golpes,nivel,espacios,nivel,partida.getCurrentLevel(),image,image));
                        else if ("DefensaAereo".equals(tipo)){
                            DefensaAereo aerial = new DefensaAereo(nombre,vida,golpes,nivel,espacios,nivel,partida.getCurrentLevel(),image,image);
                            partida.getZombies().add(aerial);

                        }        
                        else if ("DefensaMultiple".equals(tipo))
                            partida.getDefenses().add(new DefensaMultiple(nombre,vida,golpes,nivel,espacios,nivel,partida.getCurrentLevel(),image,image));
                        else if ("DefensaBloque".equals(tipo))
                            partida.getDefenses().add(new DefensaBloque(nombre,vida,nivel,espacios,nivel,partida.getCurrentLevel(),image,image));
                        else if ("DefensaMedio".equals(tipo))
                            partida.getDefenses().add(new DefensaMedio(nombre,vida,golpes,nivel,espacios,nivel,partida.getCurrentLevel(),image,image));

                        System.out.println("Zombies, defensas y entidades aéreas en los archivos JSON agregadas exitosamente");

                    }

                }
                catch(FileNotFoundException e){
                    e.printStackTrace();
                }
                catch(IOException e){
                    e.printStackTrace();
                }
                catch(ParseException e ){
                    e.printStackTrace();
                }            
        }
         }
    }
}
