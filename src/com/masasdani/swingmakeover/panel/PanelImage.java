/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.masasdani.swingmakeover.panel;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author home
 */
public class PanelImage extends JPanel{
    private Image image; 

    public PanelImage() {
        image = new ImageIcon(getClass().getResource("/com/masasdani/swingmakeover/panel/main-bg.png")).getImage();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        Graphics2D gd = (Graphics2D) g.create();

        gd.drawImage(image, 0, 0, getWidth(), getHeight(), null);

        gd.dispose();
    }
}
