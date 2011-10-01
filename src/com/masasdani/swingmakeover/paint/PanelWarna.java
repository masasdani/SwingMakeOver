/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.masasdani.swingmakeover.paint;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.LinearGradientPaint;
import java.awt.Paint;
import java.awt.Shape;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
import java.awt.geom.RoundRectangle2D;
import javax.swing.JPanel;

/**
 *
 * @author home
 */
public class PanelWarna extends JPanel{
    @Override
    protected void paintComponent(Graphics  g) {
        super.paintComponent(g);

        Graphics2D g2 = (Graphics2D) g.create();

        //cara menebalkan garis tepi pada bangun
        g2.setStroke(new BasicStroke(3F));
        
        //membuat gradien 4 warna untuk background
        Shape shape1 = new Rectangle2D.Double(0, 0, getWidth(), getHeight());
        Paint paint = new LinearGradientPaint(0, 0, getWidth(), getHeight(),
                new float[]{
                    0F,
                    0.3F,
                    0.6F,
                    1F
                }, new Color[]{
                    Color.RED,
                    Color.BLUE,
                    Color.YELLOW,
                    Color.GREEN
                });
        g2.setPaint(paint);
        g2.fill(shape1);

        g2.setColor(Color.RED);
        g2.draw(shape1);

        //membuat lingkaran yang diberi gradient paint
        Shape shape2=new Ellipse2D.Double(100, 100, 50, 50);
        Paint paint2=new GradientPaint(100, 100, Color.green, 150, 150, Color.blue);
        g2.setPaint(paint2);
        g2.fill(shape2);
        
        //membuat 
        Shape shape3=new RoundRectangle2D.Double(200, 100, 100, 50, 10, 10);
        Paint paint3=new GradientPaint(200, 100, Color.magenta, 300, 150, Color.gray);
        g2.setPaint(paint3);
        g2.fill(shape3);
        g2.dispose();
    }
}
