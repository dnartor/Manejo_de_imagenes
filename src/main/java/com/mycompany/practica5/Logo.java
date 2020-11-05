/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.practica5;

import com.sun.prism.paint.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JPanel;

/**
 *
 * @author danint
 */
public class Logo extends JPanel {
    private BufferedImage imagen=null;
    private int x=704,y=20;
    
    public Logo() throws IOException{ 
        try {
            imagen = ImageIO.read(new URL("https://www.deanime.info/wp-content/uploads/2018/10/logo-dragon-ball-z-1-300x131.png"));
            this.setOpaque(false);
            
            
        } catch (MalformedURLException ex) {
            Logger.getLogger(Logo.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.setPreferredSize(new Dimension(50,50));
        
    }
    
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawImage(imagen, x, y, null);
        
        
    }
    public void setPosition(int x,int y){
        this.x=x;
        this.y=y;
    }
}
