package com.mycompany.practica5;

//import com.sun.istack.internal.logging.Logger;
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


public class Lienzo extends JPanel{
    private BufferedImage originalImagen = null;
    private BufferedImage imagenModify = null;

    public Lienzo() throws IOException {
        try {
            originalImagen = ImageIO.read(new URL("https://dam.smashmexico.com.mx/wp-content/uploads/2018/03/Goku-el-h%C3%A9roe-que-ha-muerto-y-resucitado-en-m%C3%A1s-de-una-ocasi%C3%B3n7.jpg"));
            this.setPreferredSize(new Dimension(1024,768));
            imagenModify = originalImagen;
            }catch (MalformedURLException ex) {
          Logger.getLogger(Lienzo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
          Logger.getLogger(Lienzo.class.getName()).log(Level.SEVERE, null, ex);
        }        
    }
    
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawImage(imagenModify, 0, 0, null);
    }
    
    public BufferedImage getImg(){
        return originalImagen;
    }

    void setImg(BufferedImage img) {
        imagenModify = img;
    }
}
