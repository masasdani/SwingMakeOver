/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.masasdani.swingmakeover.draw;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Shape;
import java.awt.geom.Ellipse2D;
import java.awt.geom.GeneralPath;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author home
 */
public class PanelGambar extends JPanel{
    
    //untuk menggambar image
    Image image;

    public PanelGambar() {
        //panggil lokasi image di construktor agar terload saat pertama kali dipanggil
        image=new ImageIcon(getClass().getResource("/com/masasdani/swingmakeover/draw/icon.png")).getImage();
        
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D gd=(Graphics2D) g.create();
        
        //melakukan penggambaran terhadap image yang sudah di load diatas pada kordinat 0,0 
        //dan lebar dan tingginya menyesuaikan dengan lebar x tinggi dari panel
        gd.drawImage(image, 0, 0, getWidth(), getHeight(), null);
        
        //menggambar kotak di kordinat 100,100 dengan lebar x tinggi (200x70)
        gd.drawRect(100, 100, 200, 70);
        
        //membuat bangun -> misal elips. kemudian lakukan penggambaran
        Shape s=new Ellipse2D.Double(0,0,28,28);
        gd.draw(s);
        
        //menggambar bangun bebas
        GeneralPath gp=new GeneralPath();
        gp.moveTo(10, 10);
        gp.lineTo(200, 10);
        gp.lineTo(100, 100);
        gp.closePath();
        gd.draw(gp);
        
        //setelah penggambaran selesai objek graphics2d akan dihapus
        gd.dispose();
    }
    
    
}
