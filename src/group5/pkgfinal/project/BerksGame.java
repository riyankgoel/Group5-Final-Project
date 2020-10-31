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
public class BerksGame extends JPanel {

    //Main Penn State map Image
    ImageIcon sourceBerksImage1 = new ImageIcon("images/Berks.jpg");
    Image berksImage = sourceBerksImage1.getImage();

    //back to the menu button
    JButton backToMap;

    //constructor
    public BerksGame() {
        super();
        setBackground(Color.white);
        setLayout(null);

        backToMap = new JButton("click here to go back to the Map");
        add(backToMap);
        backToMap.setBounds(new Rectangle(500, 10, 300, 30));

    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(berksImage, 0, 0, this);
    }

}