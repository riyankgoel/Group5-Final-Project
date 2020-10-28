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
    
    ImageIcon pennMapImage = new ImageIcon("Penn_State_Map.jpg");
    Image pennStateMapImage = pennMapImage.getImage();

    public MainMap() {
       // super();
        //setBackground(Color.white);

        backButton = new JButton("click here to go back to the Main Menu");
        add(backButton);

    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Font f1 = new Font("Gothic", Font.BOLD, 20);
        g.setFont(f1);
        g.setColor(Color.BLUE);
        g.drawString("This is Panel #1", 50, 100);
    }

}
