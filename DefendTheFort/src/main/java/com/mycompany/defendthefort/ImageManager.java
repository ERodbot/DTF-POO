/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.defendthefort;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JLabel;

/**
 *
 * @author em000
 */
public class ImageManager{
    ImageManager(){     
    }
    
    
    public static ImageIcon resize(JComponent component, String filePath){ //tomando un componente de referencia, reajusta una 
        Image img;                                                         //imagen al tamaño de este.
        try {
            img = ImageIO.read(new File(filePath));
             Image dimg = img.getScaledInstance(component.getWidth(), component.getHeight(), Image.SCALE_SMOOTH);
             return new ImageIcon(dimg);
        }catch (IOException e){
            e.printStackTrace();
        }
        return null;
    }
    

}
