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
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author theodore
 */
public class MainMap extends JPanel implements KeyListener {

    //back to the menu button
    JButton backButton;

    //Main Penn State map Image
    ImageIcon sourceImage1 = new ImageIcon("images/Penn_State_Map.jpg");
    Image myImage1 = sourceImage1.getImage();

    //Game Panels to be added to map
    JButton univParkGame,
            worldCampGame,
            berksGame,
            scrantonGame,
            fayetteGame;

    //adds the player
    JButton player;
    int vertical,
        horizontal;

    Games games;

    //constructor
    public MainMap() {

        //sets a nul layout to add the buttons 
        super();
        setBackground(Color.white);
        setLayout(null);

        //adds back button to map
        backButton = new JButton("click here to go back to the Main Menu");
        add(backButton);
        backButton.setBounds(new Rectangle(500, 10, 300, 30));

        //Games to be added to map
        Games games = new Games();

        //Player
        player = new JButton();
        add(player);
        player.setBounds(new Rectangle(0, 0, 70, 100));

        //University Park
        univParkGame = new JButton("UniversityPark");
        add(univParkGame);
        univParkGame.setBounds(new Rectangle(575, 365, 30, 30));

        setFocusable(true);
        addKeyListener(this);
        requestFocusInWindow();
    }

    //Draws the penn state map
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(myImage1, 0, 0, this);
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
        int k = e.getKeyCode();

        //move left
        if (k == e.VK_LEFT) {
            System.out.println("left");
            horizontal -= 30;
            player.setBounds(horizontal,vertical, 70, 100);
        }

        //move right
        if (k == e.VK_RIGHT) {
            System.out.println("right");
            horizontal += 30;
            player.setBounds(horizontal, vertical, 70, 100);
        }

        //move up
        if (k == e.VK_UP) {
            System.out.println("up");
            vertical -= 30;
            player.setBounds(horizontal,vertical, 70, 100);
        }

        //move down
        if (k == e.VK_DOWN) {
            System.out.println("down");
            vertical += 30;
            player.setBounds(horizontal, vertical, 70, 100);
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }

}
