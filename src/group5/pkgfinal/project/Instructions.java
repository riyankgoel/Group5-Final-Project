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
 * Berks Game
 */
public class Instructions extends JPanel {

    //main menu
    ImageIcon sourceImage1 = new ImageIcon("images/GameOver.jpg");
    Image menuImage = sourceImage1.getImage();

    //back to the menu button
    JButton backButton;

    //constructor
    public Instructions() {
        super();
        setBackground(Color.white);
        setLayout(null);

        backButton = new JButton("click here to go back to the Menu Screen");
        add(backButton);
        backButton.setBounds(new Rectangle(500, 10, 300, 30));

    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(menuImage, 0, 0, this);
    }

}
