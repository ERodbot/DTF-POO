package com.mycompany.defendthefort;

import java.awt.HeadlessException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import javax.swing.JOptionPane;

public class ComManGUI extends javax.swing.JFrame {
    public ComManGUI() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGroupZombieTipo = new javax.swing.ButtonGroup();
        btnGroupDefensasTipo = new javax.swing.ButtonGroup();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        pnlDefensas = new javax.swing.JPanel();
        pnlInternoDefensas = new javax.swing.JPanel();
        lblInfoDefensas = new javax.swing.JLabel();
        btnDefensaAceptar = new javax.swing.JButton();
        btnDefensaReiniciarValores = new javax.swing.JButton();
        pnlTipoDefensa = new javax.swing.JPanel();
        btnDefensaContacto = new javax.swing.JRadioButton();
        btnDefensaMedio = new javax.swing.JRadioButton();
        btnDefensaAereo = new javax.swing.JRadioButton();
        btnDefensaImpacto = new javax.swing.JRadioButton();
        btnDefensaMultiple = new javax.swing.JRadioButton();
        btnDefensaBloque = new javax.swing.JRadioButton();
        lblDefensaNivel = new javax.swing.JLabel();
        lblDefensaNombre = new javax.swing.JLabel();
        lblDefensaVida = new javax.swing.JLabel();
        lblDefensaGolpes = new javax.swing.JLabel();
        lblDefensaEspacios = new javax.swing.JLabel();
        txfDefensaEspacios = new javax.swing.JTextField();
        txfDefensaVida = new javax.swing.JTextField();
        txfDefensaGolpes = new javax.swing.JTextField();
        txfDefensaNivel = new javax.swing.JTextField();
        txfDefensaNombre = new javax.swing.JTextField();
        lblDefensaPath = new javax.swing.JLabel();
        txfDefensaPath = new javax.swing.JTextField();
        pnlEnemigos = new javax.swing.JPanel();
        pnlInternoEnemigos = new javax.swing.JPanel();
        lblZombieInfo = new javax.swing.JLabel();
        btnZombieAceptar = new javax.swing.JButton();
        btnZombieReiniciarValores = new javax.swing.JButton();
        pnlTipoZombie = new javax.swing.JPanel();
        btnEnemigoContacto = new javax.swing.JRadioButton();
        btnEnemigoMedio = new javax.swing.JRadioButton();
        btnEnemigoImpacto = new javax.swing.JRadioButton();
        btnEnemigoAereo = new javax.swing.JRadioButton();
        lblZombieNivel = new javax.swing.JLabel();
        lblZombieNombre = new javax.swing.JLabel();
        lblZombieVida = new javax.swing.JLabel();
        lblZombieGolpes = new javax.swing.JLabel();
        lblZombieEspacios = new javax.swing.JLabel();
        txfEnemigoEspacios = new javax.swing.JTextField();
        txfEnemigoVida = new javax.swing.JTextField();
        txfEnemigoGolpes = new javax.swing.JTextField();
        txfEnemigoNivel = new javax.swing.JTextField();
        txfEnemigoNombre = new javax.swing.JTextField();
        lblZombiePath = new javax.swing.JLabel();
        txfEnemigoPath = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblInfoDefensas.setText("¡Agrega a las defensas que deseas mostrar en el juego!");

        btnDefensaAceptar.setText("Aceptar");
        btnDefensaAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDefensaAceptarActionPerformed(evt);
            }
        });

        btnDefensaReiniciarValores.setText("Reiniciar valores");
        btnDefensaReiniciarValores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDefensaReiniciarValoresActionPerformed(evt);
            }
        });

        pnlTipoDefensa.setBorder(javax.swing.BorderFactory.createTitledBorder("Tipo de defensa"));

        btnGroupDefensasTipo.add(btnDefensaContacto);
        btnDefensaContacto.setText("Contacto");

        btnGroupDefensasTipo.add(btnDefensaMedio);
        btnDefensaMedio.setText("Medio alcance");

        btnGroupDefensasTipo.add(btnDefensaAereo);
        btnDefensaAereo.setText("Aéreos");

        btnGroupDefensasTipo.add(btnDefensaImpacto);
        btnDefensaImpacto.setText("Impacto");

        btnGroupDefensasTipo.add(btnDefensaMultiple);
        btnDefensaMultiple.setText("Múltiple");

        btnGroupDefensasTipo.add(btnDefensaBloque);
        btnDefensaBloque.setText("Bloque");

        javax.swing.GroupLayout pnlTipoDefensaLayout = new javax.swing.GroupLayout(pnlTipoDefensa);
        pnlTipoDefensa.setLayout(pnlTipoDefensaLayout);
        pnlTipoDefensaLayout.setHorizontalGroup(
            pnlTipoDefensaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTipoDefensaLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(pnlTipoDefensaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnDefensaBloque)
                    .addComponent(btnDefensaMultiple)
                    .addComponent(btnDefensaImpacto)
                    .addComponent(btnDefensaAereo)
                    .addComponent(btnDefensaMedio)
                    .addComponent(btnDefensaContacto))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        pnlTipoDefensaLayout.setVerticalGroup(
            pnlTipoDefensaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTipoDefensaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnDefensaContacto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDefensaMedio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDefensaAereo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDefensaImpacto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDefensaMultiple)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDefensaBloque)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        lblDefensaNivel.setText("Nivel de aparición:");

        lblDefensaNombre.setText("Nombre de la defensa:");

        lblDefensaVida.setText("Vida:");

        lblDefensaGolpes.setText("Golpes por segundo:");

        lblDefensaEspacios.setText("Espacios en el ejército:");

        lblDefensaPath.setText("Dirección de la imagen:");

        javax.swing.GroupLayout pnlInternoDefensasLayout = new javax.swing.GroupLayout(pnlInternoDefensas);
        pnlInternoDefensas.setLayout(pnlInternoDefensasLayout);
        pnlInternoDefensasLayout.setHorizontalGroup(
            pnlInternoDefensasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlInternoDefensasLayout.createSequentialGroup()
                .addGroup(pnlInternoDefensasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlInternoDefensasLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnDefensaReiniciarValores)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDefensaAceptar))
                    .addGroup(pnlInternoDefensasLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(pnlInternoDefensasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(pnlInternoDefensasLayout.createSequentialGroup()
                                .addGroup(pnlInternoDefensasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(pnlInternoDefensasLayout.createSequentialGroup()
                                        .addGroup(pnlInternoDefensasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblDefensaNivel)
                                            .addComponent(lblDefensaVida, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblDefensaGolpes)
                                            .addComponent(lblDefensaEspacios))
                                        .addGap(33, 33, 33))
                                    .addGroup(pnlInternoDefensasLayout.createSequentialGroup()
                                        .addComponent(lblDefensaNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(27, 27, 27)))
                                .addGroup(pnlInternoDefensasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txfDefensaNivel, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
                                    .addComponent(txfDefensaEspacios)
                                    .addComponent(txfDefensaGolpes)
                                    .addComponent(txfDefensaVida)
                                    .addComponent(txfDefensaNombre)))
                            .addGroup(pnlInternoDefensasLayout.createSequentialGroup()
                                .addComponent(lblDefensaPath)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                                .addComponent(txfDefensaPath, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 50, Short.MAX_VALUE)
                        .addComponent(pnlTipoDefensa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)))
                .addGap(31, 31, 31))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlInternoDefensasLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblInfoDefensas)
                .addGap(125, 125, 125))
        );
        pnlInternoDefensasLayout.setVerticalGroup(
            pnlInternoDefensasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlInternoDefensasLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(lblInfoDefensas)
                .addGap(28, 28, 28)
                .addGroup(pnlInternoDefensasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlInternoDefensasLayout.createSequentialGroup()
                        .addGroup(pnlInternoDefensasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlInternoDefensasLayout.createSequentialGroup()
                                .addComponent(lblDefensaNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(pnlInternoDefensasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(pnlInternoDefensasLayout.createSequentialGroup()
                                        .addGroup(pnlInternoDefensasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(lblDefensaVida, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txfDefensaVida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblDefensaGolpes, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txfDefensaGolpes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(txfDefensaNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnlInternoDefensasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblDefensaEspacios)
                            .addComponent(txfDefensaEspacios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnlInternoDefensasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txfDefensaNivel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblDefensaNivel, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnlInternoDefensasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txfDefensaPath, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblDefensaPath, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(pnlTipoDefensa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(pnlInternoDefensasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDefensaAceptar)
                    .addComponent(btnDefensaReiniciarValores))
                .addGap(24, 24, 24))
        );

        javax.swing.GroupLayout pnlDefensasLayout = new javax.swing.GroupLayout(pnlDefensas);
        pnlDefensas.setLayout(pnlDefensasLayout);
        pnlDefensasLayout.setHorizontalGroup(
            pnlDefensasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDefensasLayout.createSequentialGroup()
                .addComponent(pnlInternoDefensas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1, Short.MAX_VALUE))
        );
        pnlDefensasLayout.setVerticalGroup(
            pnlDefensasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDefensasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlInternoDefensas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(11, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Defensas", pnlDefensas);

        lblZombieInfo.setText("¡Agrega a los enemigos que deseas mostrar en el juego!");

        btnZombieAceptar.setText("Aceptar");
        btnZombieAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnZombieAceptarActionPerformed(evt);
            }
        });

        btnZombieReiniciarValores.setText("Reiniciar valores");
        btnZombieReiniciarValores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnZombieReiniciarValoresActionPerformed(evt);
            }
        });

        pnlTipoZombie.setBorder(javax.swing.BorderFactory.createTitledBorder("Tipo de zombie"));

        btnGroupZombieTipo.add(btnEnemigoContacto);
        btnEnemigoContacto.setText("Contacto");

        btnGroupZombieTipo.add(btnEnemigoMedio);
        btnEnemigoMedio.setText("Medio alcance");

        btnGroupZombieTipo.add(btnEnemigoImpacto);
        btnEnemigoImpacto.setText("Impacto");

        btnGroupZombieTipo.add(btnEnemigoAereo);
        btnEnemigoAereo.setText("Aéreo");

        javax.swing.GroupLayout pnlTipoZombieLayout = new javax.swing.GroupLayout(pnlTipoZombie);
        pnlTipoZombie.setLayout(pnlTipoZombieLayout);
        pnlTipoZombieLayout.setHorizontalGroup(
            pnlTipoZombieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTipoZombieLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(pnlTipoZombieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnEnemigoAereo)
                    .addComponent(btnEnemigoImpacto)
                    .addComponent(btnEnemigoMedio)
                    .addComponent(btnEnemigoContacto))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        pnlTipoZombieLayout.setVerticalGroup(
            pnlTipoZombieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTipoZombieLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(btnEnemigoContacto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEnemigoMedio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEnemigoImpacto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEnemigoAereo)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        lblZombieNivel.setText("Nivel de aparición:");

        lblZombieNombre.setText("Nombre del enemigo:");

        lblZombieVida.setText("Vida:");

        lblZombieGolpes.setText("Golpes por segundo:");

        lblZombieEspacios.setText("Espacios en el ejército:");

        lblZombiePath.setText("Dirección de la imagen:");

        javax.swing.GroupLayout pnlInternoEnemigosLayout = new javax.swing.GroupLayout(pnlInternoEnemigos);
        pnlInternoEnemigos.setLayout(pnlInternoEnemigosLayout);
        pnlInternoEnemigosLayout.setHorizontalGroup(
            pnlInternoEnemigosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlInternoEnemigosLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(pnlInternoEnemigosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblZombieNivel)
                    .addComponent(lblZombieVida, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblZombieGolpes)
                    .addComponent(lblZombieEspacios)
                    .addComponent(lblZombiePath)
                    .addComponent(lblZombieNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(pnlInternoEnemigosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txfEnemigoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlInternoEnemigosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(pnlInternoEnemigosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txfEnemigoNivel, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
                            .addComponent(txfEnemigoEspacios)
                            .addComponent(txfEnemigoGolpes)
                            .addComponent(txfEnemigoVida))
                        .addComponent(txfEnemigoPath, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(pnlTipoZombie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59))
            .addGroup(pnlInternoEnemigosLayout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addComponent(lblZombieInfo)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlInternoEnemigosLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnZombieReiniciarValores)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnZombieAceptar)
                .addGap(30, 30, 30))
        );
        pnlInternoEnemigosLayout.setVerticalGroup(
            pnlInternoEnemigosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlInternoEnemigosLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(lblZombieInfo)
                .addGap(30, 30, 30)
                .addGroup(pnlInternoEnemigosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlInternoEnemigosLayout.createSequentialGroup()
                        .addGroup(pnlInternoEnemigosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(pnlInternoEnemigosLayout.createSequentialGroup()
                                .addGroup(pnlInternoEnemigosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblZombieNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txfEnemigoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(pnlInternoEnemigosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblZombieVida, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txfEnemigoVida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblZombieGolpes, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txfEnemigoGolpes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(pnlInternoEnemigosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlInternoEnemigosLayout.createSequentialGroup()
                                .addComponent(lblZombieEspacios)
                                .addGap(18, 18, 18)
                                .addComponent(lblZombieNivel, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblZombiePath, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlInternoEnemigosLayout.createSequentialGroup()
                                .addComponent(txfEnemigoEspacios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txfEnemigoNivel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txfEnemigoPath, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(pnlTipoZombie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(pnlInternoEnemigosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnZombieAceptar)
                    .addComponent(btnZombieReiniciarValores))
                .addGap(24, 24, 24))
        );

        javax.swing.GroupLayout pnlEnemigosLayout = new javax.swing.GroupLayout(pnlEnemigos);
        pnlEnemigos.setLayout(pnlEnemigosLayout);
        pnlEnemigosLayout.setHorizontalGroup(
            pnlEnemigosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEnemigosLayout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addComponent(pnlInternoEnemigos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlEnemigosLayout.setVerticalGroup(
            pnlEnemigosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEnemigosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlInternoEnemigos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Enemigos", pnlEnemigos);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 531, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 378, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static boolean isNumeric(String str) { 
        try {  
          Double.parseDouble(str);  
          return true;
        } catch(NumberFormatException e){  
          return false;  
        }  
    }
    
    private void btnZombieAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnZombieAceptarActionPerformed
        
        //Se tomarán en cuenta 7 valores para agregar al archivo JSON:      
        String nombre = txfEnemigoNombre.getText();; 
        String path = txfEnemigoPath.getText();
        int vida;
        int golpes;
        int espacios;
        int nivel;
        String tipo = "";
        //--------------------------------------------------------------
        
        //Comprobación de que el path existe en el dispositivo
        Path pathRoute = Paths.get(path);
        
        if (!(Files.exists(pathRoute))){
            JOptionPane.showMessageDialog(this,"Dirección de imagen no encontrada");
            return;
        }
        //--------------------------------------------------------------
        
        //Comprobación de parámetros válidos (string que sean números para los valores numéricos)
        if (isNumeric(txfEnemigoEspacios.getText()) == false || isNumeric(txfEnemigoGolpes.getText()) == false 
            || isNumeric(txfEnemigoNivel.getText()) == false || isNumeric(txfEnemigoVida.getText()) == false 
            || "".equals(txfEnemigoNombre.getText()) ||"".equals(txfEnemigoPath.getText())){
            
            JOptionPane.showMessageDialog(this,"Los parámetros son inválidos");
            return;
        }
        //--------------------------------------------------------------
        
        //Ya verificado, se pasa el string a int, y se declaran las variables anteriormente inicializadas
        golpes   = Integer.parseInt(txfEnemigoGolpes.getText());
        vida     = Integer.parseInt(txfEnemigoVida.getText());
        espacios = Integer.parseInt(txfEnemigoEspacios.getText());
        nivel    = Integer.parseInt(txfEnemigoNivel.getText());
        
        //--------------------------------------------------------------
        
        //Según el botón, se escoge el tipo de enemigo/zombie que el administrador escogió
        if(btnEnemigoContacto.isSelected()){
            tipo = "ZombieContacto";
        }
        if(btnEnemigoImpacto.isSelected()){
            tipo = "ZombieChoque";
        }
        if (btnEnemigoMedio.isSelected()){
            tipo = "ZombieMedio";
        }
        if (btnEnemigoAereo.isSelected()){
            tipo = "ZombieAereo";
        }
        if(!btnEnemigoContacto.isSelected() && !btnEnemigoImpacto.isSelected() && !btnEnemigoMedio.isSelected() && !btnEnemigoAereo.isSelected()){
            JOptionPane.showMessageDialog(this,"Seleccione el tipo");
            return;
        }
        //--------------------------------------------------------------
        
        //Si todo sale bien, el enemigo será escrito en enemigos.json
        ComponentsManager.writeEntity(nombre, tipo, path, vida, nivel, golpes, espacios,0);
        JOptionPane.showMessageDialog(this,"Enemigo agregado");
        //--------------------------------------------------------------
    }//GEN-LAST:event_btnZombieAceptarActionPerformed

    private void btnZombieReiniciarValoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnZombieReiniciarValoresActionPerformed
        //Se limpian todos los text fields y botones
        txfEnemigoEspacios.setText("");
        txfEnemigoPath.setText("");
        txfEnemigoNombre.setText("");
        txfEnemigoVida.setText("");
        txfEnemigoGolpes.setText("");
        txfEnemigoEspacios.setText("");
        txfEnemigoNivel.setText("");
        btnGroupZombieTipo.clearSelection();
        //--------------------------------------------------------------
    }//GEN-LAST:event_btnZombieReiniciarValoresActionPerformed

    private void btnDefensaAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDefensaAceptarActionPerformed
        /*
        
        MISMO PROCESO QUE EN EL BOTÓN DE LOS ZOMBIES, SOLO QUE LA DEFENSA SE ESCRIBE EN defensas.json
        
        */ 
        String nombre = txfDefensaNombre.getText();;
        String path = txfDefensaPath.getText();
        int vida;
        int golpes;
        int espacios;
        int nivel;
        String tipo = ""; 
        Path pathRoute = Paths.get(path);      
        if (!(Files.exists(pathRoute))){
            JOptionPane.showMessageDialog(this,"Dirección de imagen no encontrada");
            return;
        }  
        if (isNumeric(txfDefensaEspacios.getText()) == false || isNumeric(txfDefensaGolpes.getText()) == false || isNumeric(txfDefensaNivel.getText()) == false || isNumeric(txfDefensaVida.getText()) == false || "".equals(txfDefensaNombre.getText()) ||"".equals(txfDefensaPath.getText())){
            JOptionPane.showMessageDialog(this,"Los parámetros son inválidos");
            return;
        }
        golpes = Integer.parseInt(txfDefensaGolpes.getText());
        vida = Integer.parseInt(txfDefensaVida.getText());
        espacios = Integer.parseInt(txfDefensaEspacios.getText());
        nivel = Integer.parseInt(txfDefensaNivel.getText());
        
        if(btnDefensaContacto.isSelected()){
            tipo = "DefensaContacto";
        }
        if(btnDefensaImpacto.isSelected()){
            tipo = "DefensaChoque";
        }
        if (btnDefensaMedio.isSelected()){
            tipo = "DefensaMedio";
        }
        if (btnDefensaAereo.isSelected()){
            tipo = "DefensaAereo";
        }
        if (btnDefensaMultiple.isSelected()){
            tipo = "DefensaMultiple";
        }
        if (btnDefensaBloque.isSelected()){
            tipo = "DefensaBloque";
        }
        if(!btnDefensaContacto.isSelected() && !btnDefensaImpacto.isSelected() && !btnDefensaMedio.isSelected() && !btnDefensaAereo.isSelected()){
            JOptionPane.showMessageDialog(this,"Seleccione el tipo");
            return;
        }
        ComponentsManager.writeEntity(nombre, tipo, path, vida, nivel, golpes, espacios,1);
        JOptionPane.showMessageDialog(this,"Defensa agregada");
    }//GEN-LAST:event_btnDefensaAceptarActionPerformed

    private void btnDefensaReiniciarValoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDefensaReiniciarValoresActionPerformed
        //Se limpian todos los text fields y botones
        txfDefensaEspacios.setText("");
        txfDefensaPath.setText("");
        txfDefensaNombre.setText("");
        txfDefensaVida.setText("");
        txfDefensaGolpes.setText("");
        txfDefensaEspacios.setText("");
        txfDefensaNivel.setText("");
        btnGroupDefensasTipo.clearSelection();
        //--------------------------------------------------------------
    }//GEN-LAST:event_btnDefensaReiniciarValoresActionPerformed

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
            java.util.logging.Logger.getLogger(ComManGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ComManGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ComManGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ComManGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new ComManGUI().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDefensaAceptar;
    private javax.swing.JRadioButton btnDefensaAereo;
    private javax.swing.JRadioButton btnDefensaBloque;
    private javax.swing.JRadioButton btnDefensaContacto;
    private javax.swing.JRadioButton btnDefensaImpacto;
    private javax.swing.JRadioButton btnDefensaMedio;
    private javax.swing.JRadioButton btnDefensaMultiple;
    private javax.swing.JButton btnDefensaReiniciarValores;
    private javax.swing.JRadioButton btnEnemigoAereo;
    private javax.swing.JRadioButton btnEnemigoContacto;
    private javax.swing.JRadioButton btnEnemigoImpacto;
    private javax.swing.JRadioButton btnEnemigoMedio;
    private javax.swing.ButtonGroup btnGroupDefensasTipo;
    private javax.swing.ButtonGroup btnGroupZombieTipo;
    private javax.swing.JButton btnZombieAceptar;
    private javax.swing.JButton btnZombieReiniciarValores;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lblDefensaEspacios;
    private javax.swing.JLabel lblDefensaGolpes;
    private javax.swing.JLabel lblDefensaNivel;
    private javax.swing.JLabel lblDefensaNombre;
    private javax.swing.JLabel lblDefensaPath;
    private javax.swing.JLabel lblDefensaVida;
    private javax.swing.JLabel lblInfoDefensas;
    private javax.swing.JLabel lblZombieEspacios;
    private javax.swing.JLabel lblZombieGolpes;
    private javax.swing.JLabel lblZombieInfo;
    private javax.swing.JLabel lblZombieNivel;
    private javax.swing.JLabel lblZombieNombre;
    private javax.swing.JLabel lblZombiePath;
    private javax.swing.JLabel lblZombieVida;
    private javax.swing.JPanel pnlDefensas;
    private javax.swing.JPanel pnlEnemigos;
    private javax.swing.JPanel pnlInternoDefensas;
    private javax.swing.JPanel pnlInternoEnemigos;
    private javax.swing.JPanel pnlTipoDefensa;
    private javax.swing.JPanel pnlTipoZombie;
    private javax.swing.JTextField txfDefensaEspacios;
    private javax.swing.JTextField txfDefensaGolpes;
    private javax.swing.JTextField txfDefensaNivel;
    private javax.swing.JTextField txfDefensaNombre;
    private javax.swing.JTextField txfDefensaPath;
    private javax.swing.JTextField txfDefensaVida;
    private javax.swing.JTextField txfEnemigoEspacios;
    private javax.swing.JTextField txfEnemigoGolpes;
    private javax.swing.JTextField txfEnemigoNivel;
    private javax.swing.JTextField txfEnemigoNombre;
    private javax.swing.JTextField txfEnemigoPath;
    private javax.swing.JTextField txfEnemigoVida;
    // End of variables declaration//GEN-END:variables
}
