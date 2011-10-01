/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.masasdani.swingmakeover.button;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;

/**
 *
 * @author home
 */
public class ButtonEfek extends JButton{

    public ButtonEfek() {
        setOpaque(false);
        setContentAreaFilled(false);
        addMouseListener(new MouseAdapter() {

            @Override
            public void mouseEntered(MouseEvent e) {
                setLocation((int) getLocation().getX(), (int) (getLocation().getY() - 10));
                
            }

            @Override
            public void mouseExited(MouseEvent e) {
                setLocation((int) getLocation().getX(), (int) (getLocation().getY() + 10));
            }

        });
    }
    
}
