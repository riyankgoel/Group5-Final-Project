/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package group5.pkgfinal.project;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author theodore
 */
public class MainMap extends JPanel {

    JButton backButton;

ImageIcon sourceImage1 = new ImageIcon("images/Penn_State_Map.jpg");
    Image myImage1 = sourceImage1.getImage();
    
    public MainMap() {
        backButton = new JButton("click here to go back to the Main Menu");
        add(backButton);

    }

    //Draws the penn state map
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(myImage1, 0, 0, this);
    }

}
