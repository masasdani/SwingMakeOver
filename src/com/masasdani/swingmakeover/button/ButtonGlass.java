/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.masasdani.swingmakeover.button;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Paint;
import javax.swing.JButton;

/**
 *
 * @author home
 */
public class ButtonGlass extends JButton{
    private Paint glass;

    public ButtonGlass() {
        setOpaque(false);
        setContentAreaFilled(false);
        setBorderPainted(false);
        setFocusPainted(false);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        Graphics2D gd = (Graphics2D) g.create();

        glass = new GradientPaint(0, 0, new Color(1F, 1F, 1F, 0.5F), 0, getHeight(), new Color(1F, 1F, 1F, 0F));
        gd.setPaint(glass);
        gd.fillRoundRect(0, 0, getWidth(), getHeight(), 50, 50);

        gd.dispose();
    }
}
