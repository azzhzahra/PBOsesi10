/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sesi12;

/**
 *
 * @author Lenovo
 */
import java.awt.Graphics;
import java.io.IOException;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.*;

public class PanelForm {
    BufferedImage image;
    PanelForm(){
        
        try {
            image = ImageIO.read(new File(""));
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    
    public void paintComponent(Graphics g){
        g.drawImage(image,0,0, (ImageObserver) this);
    }
}
