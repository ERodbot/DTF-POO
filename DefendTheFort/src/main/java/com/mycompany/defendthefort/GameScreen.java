/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.defendthefort;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import static javax.swing.GroupLayout.Alignment.CENTER;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import static javax.swing.SwingConstants.LEFT;
import javax.swing.border.Border;
import com.mycompany.defendthefort.Partida;

/**
 *
 * @author em000
 */
public class GameScreen extends javax.swing.JFrame {

    public ComponentsManager CM;   //sistema de manejo de la creacion de los personajes;
    int level;
    private ArrayList<Grid> levelGrid = new ArrayList<Grid>(); //array de los tableros para cada partida;
    private  ArrayList<Entity> defenses = new ArrayList<Entity>(); //array de las posibles defensas para cada partidoa;
    private  ArrayList<Entity> zombies = new ArrayList<Entity>(); //array de los posibles zombies para cada partida
    final int ancho = 35, alto = 35;
    private ThreadGame gameThread;
    private Partida game; 
    
    
    
    /**
     * Creates new form GameScreen
     */
    public GameScreen(Partida game) {
        this.game = game;
        this.level = game.getLevel();
        initComponents();
        for(int i = 0; i<10; i++){
            levelGrid.add(new Grid(level));
        }
        initGUIComp();
        zombies = Factory.convertToRealEntity(game.zombiesActive, getCurrentLevel());
        defenses = Factory.convertToRealEntity(game.defensesActive, getCurrentLevel());
        loadEntities();
        initializaPossibleZombies();
        initializaPossibleDefenses();
        actualizeCurrentLevel();
        if(game.user.getID() != "admin")
            addNewEntitiesBtn.setVisible(false);   
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlContent = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        tpnlContent = new javax.swing.JTabbedPane();
        pnlInitialScreen = new javax.swing.JPanel();
        lblInitializeGame = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        pnlGame = new javax.swing.JPanel();
        scrollDefenses = new javax.swing.JScrollPane();
        pnlDefenses = new javax.swing.JPanel();
        btnStart = new javax.swing.JButton();
        btnOpciones = new javax.swing.JButton();
        lblGameGrid = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        pnlConsulta = new javax.swing.JPanel();
        lbltitleConsulta = new javax.swing.JLabel();
        lblConsulta = new javax.swing.JLabel();
        pnlYouLost = new javax.swing.JPanel();
        pnlOptions = new javax.swing.JPanel();
        exitBtn = new javax.swing.JButton();
        addNewEntitiesBtn = new javax.swing.JButton();
        optionslbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1000, 1200));

        pnlContent.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1200, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        pnlContent.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 30));

        pnlInitialScreen.setPreferredSize(new java.awt.Dimension(800, 1300));
        pnlInitialScreen.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblInitializeGame.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        lblInitializeGame.setForeground(new java.awt.Color(255, 255, 255));
        lblInitializeGame.setText("Iniciar Partida");
        pnlInitialScreen.add(lblInitializeGame, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 500, 210, 80));
        pnlInitialScreen.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1210, 760));

        tpnlContent.addTab("tab1", pnlInitialScreen);

        scrollDefenses.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        pnlDefenses.setPreferredSize(new java.awt.Dimension(293, 2000));

        javax.swing.GroupLayout pnlDefensesLayout = new javax.swing.GroupLayout(pnlDefenses);
        pnlDefenses.setLayout(pnlDefensesLayout);
        pnlDefensesLayout.setHorizontalGroup(
            pnlDefensesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 293, Short.MAX_VALUE)
        );
        pnlDefensesLayout.setVerticalGroup(
            pnlDefensesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2000, Short.MAX_VALUE)
        );

        scrollDefenses.setViewportView(pnlDefenses);

        btnStart.setText("EMPEZAR PARTIDA");
        btnStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStartActionPerformed(evt);
            }
        });

        btnOpciones.setText("OPCIONES");
        btnOpciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOpcionesActionPerformed(evt);
            }
        });

        lblGameGrid.setText("jLabel1");

        lbltitleConsulta.setText("Consultar Entidad");

        lblConsulta.setText("jLabel1");

        javax.swing.GroupLayout pnlConsultaLayout = new javax.swing.GroupLayout(pnlConsulta);
        pnlConsulta.setLayout(pnlConsultaLayout);
        pnlConsultaLayout.setHorizontalGroup(
            pnlConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlConsultaLayout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addComponent(lbltitleConsulta)
                .addContainerGap(162, Short.MAX_VALUE))
            .addComponent(lblConsulta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnlConsultaLayout.setVerticalGroup(
            pnlConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlConsultaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbltitleConsulta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblConsulta, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(pnlConsulta);

        javax.swing.GroupLayout pnlGameLayout = new javax.swing.GroupLayout(pnlGame);
        pnlGame.setLayout(pnlGameLayout);
        pnlGameLayout.setHorizontalGroup(
            pnlGameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlGameLayout.createSequentialGroup()
                .addGap(614, 614, 614)
                .addComponent(lblGameGrid)
                .addGap(651, 651, 651))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlGameLayout.createSequentialGroup()
                .addGap(156, 156, 156)
                .addGroup(pnlGameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(pnlGameLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 284, Short.MAX_VALUE))
                    .addComponent(btnOpciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnStart, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(scrollDefenses, javax.swing.GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE))
                .addGap(117, 117, 117))
        );
        pnlGameLayout.setVerticalGroup(
            pnlGameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlGameLayout.createSequentialGroup()
                .addComponent(scrollDefenses, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnStart, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnOpciones, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(324, 324, 324)
                .addComponent(lblGameGrid))
        );

        tpnlContent.addTab("tab2", pnlGame);

        javax.swing.GroupLayout pnlYouLostLayout = new javax.swing.GroupLayout(pnlYouLost);
        pnlYouLost.setLayout(pnlYouLostLayout);
        pnlYouLostLayout.setHorizontalGroup(
            pnlYouLostLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1302, Short.MAX_VALUE)
        );
        pnlYouLostLayout.setVerticalGroup(
            pnlYouLostLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1680, Short.MAX_VALUE)
        );

        tpnlContent.addTab("tab3", pnlYouLost);

        pnlOptions.setPreferredSize(new java.awt.Dimension(800, 800));
        pnlOptions.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        exitBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        exitBtn.setText("SALIR");
        exitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitBtnActionPerformed(evt);
            }
        });
        pnlOptions.add(exitBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 700, 280, 100));

        addNewEntitiesBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        addNewEntitiesBtn.setText("AÑADIR COMPONENTES");
        addNewEntitiesBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addNewEntitiesBtnActionPerformed(evt);
            }
        });
        pnlOptions.add(addNewEntitiesBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 830, 280, 100));

        optionslbl.setText("jLabel1");
        optionslbl.setPreferredSize(new java.awt.Dimension(800, 800));
        pnlOptions.add(optionslbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(-150, -110, 1300, 1680));

        tpnlContent.addTab("tab4", pnlOptions);

        pnlContent.add(tpnlContent, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 1200, 1710));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlContent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlContent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(1216, 911));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    public void initGUIComp(){
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        jLabel2.setIcon(new ImageIcon("C:\\Images\\ZombieApocalypseTitleScreen.png"));
        Image image = toolkit.getImage("C:\\Images\\ZombieHandPng.png");
        addMauseListenerTonitializelbl();
        Cursor c = toolkit.createCustomCursor(image , new Point(pnlContent.getX(), 
        pnlContent.getY()), "img");
        pnlContent.setCursor (c);
        Dimension preferredSize = new Dimension(293, 720+(120*defenses.size()-720)); //ajustar el tamaño de la interfaz de                                                                //seleccion de defensas
        pnlDefenses.setPreferredSize(preferredSize); 
    } 
        
    private void btnStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStartActionPerformed
        // TODO add your handling code here:
        Grid currentLevel = levelGrid.get(level);
        System.out.println(level);
        if(currentLevel.getTreeOfLife()!=null){
            currentLevel.generarZombies(zombies);  //genera los zombies al azar y los coloca en el tablero de modo random
            gameThread = new ThreadGame(this);
            gameThread.start();
            currentLevel.SimulacionCochina(); //empieza los threads para todas las entidades
        }
    }//GEN-LAST:event_btnStartActionPerformed

    private void btnOpcionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOpcionesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnOpcionesActionPerformed

    private void exitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_exitBtnActionPerformed

    private void addNewEntitiesBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addNewEntitiesBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addNewEntitiesBtnActionPerformed

    
    
    void addMauseListenerTonitializelbl(){
        lblInitializeGame.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                    Grid currentLevel = levelGrid.get(level);
                    addPosibleDefensesScreen();  //añade las defensas en la pantalla  para ponerlos en el tablero
                    placeButtons(currentLevel.getMatrix());
                    tpnlContent.setSelectedIndex(1);
                }

        }); 
        lblInitializeGame.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                    lblInitializeGame.setForeground(Color.red.darker().darker());
                }

        });
        lblInitializeGame.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseExited(MouseEvent e) {
                    lblInitializeGame.setForeground(Color.white);
                }

        }); 
    }
    
        
    
    
    public void initializaPossibleZombies(){
        Grid currentGrid = levelGrid.get(level);
        ImageIcon attacking = ImageManager.resize(currentGrid.getMatrix()[0][0].button, "C:\\Images\\ZombieNormal.png");
        ImageIcon moving = ImageManager.resize(currentGrid.getMatrix()[0][0].button, "C:\\Images\\ZombieNormal.png");
        Entity zombieContactoBasico = new ZombieContacto("Zombie Basico",45,5,1,1,1, currentGrid, moving, attacking);
        zombieContactoBasico.setAttackingFilepath("C:\\Images\\ZombieNormal.png"); zombieContactoBasico.setMovingFilepath("C:\\Images\\ZombieNormal.png");  
        if(!zombies.contains(zombieContactoBasico))
            zombies.add(zombieContactoBasico);
        
        attacking = new ImageIcon("C:\\Images\\BloodZombie.gif");
        moving = new ImageIcon("C:\\Images\\BloodZombie.gif");
        Entity ZombieSangriento= new ZombieContacto("Zombie Sangriento",35,12,1,3,2, currentGrid, moving, attacking);
        ZombieSangriento.setAttackingFilepath("C:\\Images\\BloodZombie.gif"); ZombieSangriento.setMovingFilepath("C:\\Images\\BloodZombie.gif");  
        if(!zombies.contains(ZombieSangriento))
            zombies.add(ZombieSangriento);
        
        moving = ImageManager.resize(currentGrid.getMatrix()[0][0].button, "C:\\Images\\ExplodingZombie.png");
        attacking = new ImageIcon( "C:\\Images\\explosion.gif");
        Entity ZombieExplosivo = new ZombieChoque("Zombie Explosivo",25,150,1,3,4, currentGrid, moving, attacking);
        ZombieExplosivo.setAttackingFilepath("C:\\Images\\explosion.gif"); ZombieExplosivo.setMovingFilepath("C:\\Images\\ExplodingZombie.png");  
         if(!zombies.contains(ZombieExplosivo))
            zombies.add(ZombieExplosivo);
        
        moving = ImageManager.resize(currentGrid.getMatrix()[0][0].button, "C:\\Images\\eyeball_attack-w.gif");
        attacking = ImageManager.resize(currentGrid.getMatrix()[0][0].button, "C:\\Images\\eyeball_attack-w.gif");
        Entity OjoDelDiablo = new ZombieMedio("OjoDelDiablo",40,15,5,2,1, currentGrid, moving, attacking);
        OjoDelDiablo.setAttackingFilepath("C:\\Images\\eyeball_attack-w.gif"); OjoDelDiablo.setMovingFilepath("C:\\Images\\eyeball_attack-w.gif");  
         if(!zombies.contains(OjoDelDiablo))
            zombies.add(OjoDelDiablo);
          
        moving = ImageManager.resize(currentGrid.getMatrix()[0][0].button, "C:\\Images\\PistolZombie.png");
        attacking = ImageManager.resize(currentGrid.getMatrix()[0][0].button, "C:\\Images\\PistolZombieAttacking.png");
        Entity ZombiePistolero = new ZombieMedio("Zombie Pistolero",50,20,1,4,7, currentGrid, moving, attacking);
        ZombiePistolero.setAttackingFilepath("C:\\Images\\PistolZombieAttacking.png"); ZombiePistolero.setMovingFilepath("C:\\Images\\PistolZombie.png");  
         if(!zombies.contains(ZombiePistolero))
            zombies.add(ZombiePistolero);
        
        moving = ImageManager.resize(currentGrid.getMatrix()[0][0].button, "C:\\Images\\BalloonZombieHD.png");
        attacking = ImageManager.resize(currentGrid.getMatrix()[0][0].button, "C:\\Images\\FlyingZombieAttacking.png");
        Entity BalloonZombie = new ZombieAereo("Zombie con globo",30,20,1,3,1, currentGrid, moving, attacking);
        BalloonZombie.setAttackingFilepath("C:\\Images\\FlyingZombieAttacking.png"); BalloonZombie.setMovingFilepath("C:\\Images\\BalloonZombieHD.png");  
         if(!zombies.contains(BalloonZombie))
            zombies.add(BalloonZombie);
        
        moving = ImageManager.resize(currentGrid.getMatrix()[0][0].button, "C:\\Images\\ImpRocket.png");
        attacking = ImageManager.resize(currentGrid.getMatrix()[0][0].button, "C:\\Images\\explosion2.png");
        Entity ImpRocket = new ZombieChoque("Imp con Coete",40,50,1,3,6, currentGrid, moving, attacking);
        ImpRocket.setAttackingFilepath("C:\\Images\\explosion2.png"); ImpRocket.setMovingFilepath( "C:\\Images\\ImpRocket.png");  
         if(!zombies.contains(ImpRocket))
            zombies.add(ImpRocket); 
    }
    
    public void initializaPossibleDefenses(){
        Grid currentGrid = levelGrid.get(level);
        ImageIcon attacking = ImageManager.resize(currentGrid.getMatrix()[0][0].button, "C:\\Images\\TreeOfLife.png");
        ImageIcon moving = ImageManager.resize(currentGrid.getMatrix()[0][0].button, "C:\\Images\\TreeOfLife.png");
        Entity  TreeOfLife = new DefensaBloque("Arbol de la vida",100,1,0,1, currentGrid, moving, attacking);
        TreeOfLife.setAttackingFilepath("C:\\Images\\TreeOfLife.png"); TreeOfLife.setMovingFilepath("C:\\Images\\TreeOfLife.png");  
         if(!defenses.contains(TreeOfLife))
            defenses.add(TreeOfLife);
      
        attacking = ImageManager.resize(currentGrid.getMatrix()[0][0].button, "C:\\Images\\PunchingPlantResting.png");
        moving = ImageManager.resize(currentGrid.getMatrix()[0][0].button, "C:\\Images\\PunchingPlantResting.png");
        Entity BonkChoy = new DefensaContacto("Bonk Choy",40,5,1,0,1, currentGrid, moving, attacking);
        BonkChoy.setAttackingFilepath("C:\\Images\\PunchingPlantResting.png"); BonkChoy.setMovingFilepath("C:\\Images\\PunchingPlantResting.png");  
         if(!defenses.contains(BonkChoy))
            defenses.add(BonkChoy);
        
        attacking = ImageManager.resize(currentGrid.getMatrix()[0][0].button, "C:\\Images\\gloomshroomattacking.png");
        moving = ImageManager.resize(currentGrid.getMatrix()[0][0].button, "C:\\Images\\gloomshroom.png");
        Entity gloomshroom= new DefensaMultiple("gloomshroom",4,10,1,0,1, currentGrid, moving, attacking);
        gloomshroom.setAttackingFilepath("C:\\Images\\gloomshroomattacking.png"); gloomshroom.setMovingFilepath("C:\\Images\\gloomshroom.png");  
         if(!defenses.contains(gloomshroom))
            defenses.add(gloomshroom);
        
        moving = ImageManager.resize(currentGrid.getMatrix()[0][0].button, "C:\\Images\\peashooter.png");
        attacking = ImageManager.resize(currentGrid.getMatrix()[0][0].button, "C:\\Images\\peashooter.png");
        Entity peashooter = new DefensaMultiple("peashooter",40,3,1,0,1, currentGrid, moving, attacking);
        peashooter.setAttackingFilepath("C:\\Images\\peashooter.png"); peashooter.setMovingFilepath("C:\\Images\\peashooter.png");  
         if(!defenses.contains(peashooter))
            defenses.add(peashooter);
        
        moving = ImageManager.resize(currentGrid.getMatrix()[0][0].button, "C:\\Images\\apisonaflormoving.png");
        attacking = ImageManager.resize(currentGrid.getMatrix()[0][0].button, "C:\\Images\\apisonaflormoving.png");
        Entity squash = new DefensaImpacto("Squash",15,70,3,0,1, currentGrid, moving, attacking);
        squash.setAttackingFilepath("C:\\Images\\apisonaflormoving.png"); squash.setMovingFilepath("C:\\Images\\apisonaflormoving.png");  
         if(!defenses.contains(squash))
            defenses.add(squash);     
        
        moving = ImageManager.resize(currentGrid.getMatrix()[0][0].button, "C:\\Images\\Chomper.png");
        attacking = ImageManager.resize(currentGrid.getMatrix()[0][0].button, "C:\\Images\\chopperEating.png");
        Entity Chopper = new DefensaContacto("Chopper",55,10,1,0,2, currentGrid, moving, attacking);
        Chopper.setAttackingFilepath( "C:\\Images\\chopperEating.png"); Chopper.setMovingFilepath("C:\\Images\\Chomper.png");  
         if(!defenses.contains(Chopper))
            defenses.add(Chopper);
        
        moving =new ImageIcon("C:\\Images\\lol.gif");
        attacking = new ImageIcon("C:\\Images\\lol.gif");
        Entity starfruit = new DefensaMultiple("starfruit",40,15,5,0,1, currentGrid, moving, attacking);
        starfruit.setAttackingFilepath("C:\\Images\\lol.gif"); starfruit.setMovingFilepath("C:\\Images\\lol.gif");  
         if(!defenses.contains(starfruit))
            defenses.add(starfruit);
        
        moving = ImageManager.resize(currentGrid.getMatrix()[0][0].button, "C:\\Images\\block.png");
        attacking = ImageManager.resize(currentGrid.getMatrix()[0][0].button, "C:\\Images\\block.png");
        Entity Bloque = new DefensaBloque("Bloque",100,1,0,1, currentGrid, moving, attacking);
        Bloque.setAttackingFilepath("C:\\Images\\block.png"); Bloque.setMovingFilepath("C:\\Images\\block.png");  
         if(!defenses.contains(Bloque))
            defenses.add(Bloque);          
    }
    
    void actualizeCurrentLevel(){
        for(Entity entity: defenses){
            entity.setGrid(getCurrentLevel());
        }
        for(Entity entity: zombies){
            entity.setGrid(getCurrentLevel());
        }
    }
    
    
    
    
    
    public void addPosibleDefensesScreen(){  //recorre el array de posibles defensas, crea una interfaz bonita para ponerla en pantalla
        Grid currentLevel = levelGrid.get(level);
        for(int i = 0; i<defenses.size();i++){
           Entity EntityDefense = defenses.get(i);
           SelectedDefense defense = new SelectedDefense(EntityDefense, currentLevel); //clase con label y referencia a 
           JLabel lbldefense = defense.getLabelDefense();
           if(EntityDefense.nivelAparicion == level){
               pnlDefenses.add(lbldefense);
               int posy = i*lbldefense.getHeight();
               lbldefense.setLocation(0, posy);
           }
        }      
    }
    
    public void placeButtons(Tile[][] matrix){  //coloca en la pantalla los botones de una partida,
        for (int i = 0; i < 25; i++) {
            for (int j = 0; j < 25; j++) {
                pnlGame.add(matrix[i][j].button, 2);
                matrix[i][j].button.setOpaque(rootPaneCheckingEnabled);
                matrix[i][j].button.setLocation(i*ancho, alto*j);
            }
        }
    }
    
    public void loadEntities(){
        //convertir a verdadera 
        getCurrentLevel().setDefenses(Factory.convertToRealEntity(game.defenses, getCurrentLevel()));
        getCurrentLevel().setZombies(Factory.convertToRealEntity(game.zombies, getCurrentLevel()));
        getCurrentLevel().setFlyingEntities(Factory.convertToRealEntity(game.flyingEntities, getCurrentLevel()));
        for(Entity entity: getCurrentLevel().getDefenses()){ //llamar con array de verdaderas entidades
            getCurrentLevel().getMatrix()[entity.getPosy()][entity.getPosx()].personaje = entity;
        }
        for(Entity entity: getCurrentLevel().getZombies()){
            getCurrentLevel().getMatrix()[entity.getPosy()][entity.getPosx()].personaje = entity;
        }
    }
    
    
    
    public void levelUpEntities(){
        Random r = new Random();
        int percent1;
        int percent2;
        int extraLife;
        int extraDamage;
        for (Entity zombie : zombies) {

            percent1 = r.nextInt(5, 20);
            percent2 = r.nextInt(5, 20);

            extraLife = (zombie.vida * percent1) / 100;
            zombie.vida+=extraLife;
            extraDamage = (zombie.cantidadGolpes * percent2) / 100;
            zombie.cantidadGolpes+=extraDamage;

        }

        for (Entity defensa : defenses) {

            percent1 = r.nextInt(5, 20);
            percent2 = r.nextInt(5, 20);

            extraLife = (defensa.vida * percent1) / 100;
            defensa.vida+=extraLife;
            extraDamage = (defensa.cantidadGolpes * percent2) / 100;
            defensa.cantidadGolpes+=extraDamage;

        }
        actualizeEntitiesGrid();
    }
    
    public void actualizeEntitiesGrid(){
        for(Entity entity: defenses){
            entity.grid = getCurrentLevel();
        }
        for(Entity entity: zombies){
            entity.grid = getCurrentLevel();
        }
    }
    
    public Grid getCurrentLevel(){
        return levelGrid.get(level);
    }

    public ComponentsManager getCM() {
        return CM;
    }

    public int getLevel() {
        return level;
    }

    public ArrayList<Grid> getLevelGrid() {
        return levelGrid;
    }

    public ArrayList<Entity> getDefenses() {
        return defenses;
    }

    public ArrayList<Entity> getZombies() {
        return zombies;
    }


    public int getAncho() {
        return ancho;
    }

    public int getAlto() {
        return alto;
    }

    public JButton getBtnOpciones() {
        return btnOpciones;
    }



    public JButton getBtnStart() {
        return btnStart;
    }

   

    public JPanel getjPanel2() {
        return jPanel2;
    }

    public JPanel getPnlContent() {
        return pnlContent;
    }

    public JPanel getPnlDefenses() {
        return pnlDefenses;
    }

    public JPanel getPnlGame() {
        return pnlGame;
    }

    public JPanel getPnlInitialScreen() {
        return pnlInitialScreen;
    }

    public JScrollPane getScrollDefenses() {
        return scrollDefenses;
    }

    public JTabbedPane getTpnlContent() {
        return tpnlContent;
    }
    
       public void setLevel(int level) {
        this.level = level;
    }
    
     public void setGameThread(ThreadGame gameThread) {
        this.gameThread = gameThread;
    }

    public ThreadGame getGameThread() {
        return gameThread;
    }

    public JLabel getLblConsulta() {
        return lblConsulta;
    }
    
    
    public void save(){
        getCurrentLevel().saveGame(game);
        game.setDefensesActive(defenses);
        game.setZombiesActive(zombies);
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GameScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GameScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GameScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GameScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GameScreen(new Partida(new User("",""),1)).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addNewEntitiesBtn;
    private javax.swing.JButton btnOpciones;
    private javax.swing.JButton btnStart;
    private javax.swing.JButton exitBtn;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblConsulta;
    private javax.swing.JLabel lblGameGrid;
    private javax.swing.JLabel lblInitializeGame;
    private javax.swing.JLabel lbltitleConsulta;
    private javax.swing.JLabel optionslbl;
    private javax.swing.JPanel pnlConsulta;
    private javax.swing.JPanel pnlContent;
    private javax.swing.JPanel pnlDefenses;
    private javax.swing.JPanel pnlGame;
    private javax.swing.JPanel pnlInitialScreen;
    private javax.swing.JPanel pnlOptions;
    private javax.swing.JPanel pnlYouLost;
    private javax.swing.JScrollPane scrollDefenses;
    private javax.swing.JTabbedPane tpnlContent;
    // End of variables declaration//GEN-END:variables
}
