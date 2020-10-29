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
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author theodore
 */
public class MainMap extends JPanel implements KeyListener,ActionListener {

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
    
    //Rectangles for intersection. Used for when the player intersects with the campus.
    Rectangle univParkRctngle, wrldCmpRctngle, brksRctngle, scrantonRctngle, fytteRctngle;

    //adds the player
    JButton player;
    Rectangle playerRctngle;
    int vertical, horizontal;
     
    //Game Classes
    UniversityParkGame universityPark;

    //constructor
    public MainMap() {

        //sets a nul layout to add the buttons 
        super();
        InitialSetUpForMainMap();
        CreateGamesThatWillBeSwapped();

    }
    
    //The Initial Setup when the player goes to the Main Map
    public void InitialSetUpForMainMap(){
                //sets a nul layout to add the buttons 
        setBackground(Color.white);
        setLayout(null);

        //adds back button to map
        backButton = new JButton("click here to go back to the Main Menu");
        add(backButton);
        backButton.setBounds(new Rectangle(500, 10, 300, 30));


        //Player
        player = new JButton();
        add(player);
        player.setBounds(new Rectangle(horizontal, vertical, 70, 100));

        //University Park
        univParkGame = new JButton("UniversityPark");
        add(univParkGame);
        univParkGame.setBounds(new Rectangle(575, 365, 30, 30));

        setFocusable(true);
        addKeyListener(this);
        requestFocusInWindow();
    }
    
    //Put your Game Class here so they can be used to switch between panels
    public void CreateGamesThatWillBeSwapped() {
        universityPark = new UniversityParkGame();
        universityPark.backToMap.addActionListener(this);//adds a back button to return to the main menu

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
        
        univParkRctngle = univParkGame.getBounds();
        playerRctngle = player.getBounds();
        
        //move left
        if (k == e.VK_LEFT) {
            horizontal -= 30;
            player.setBounds(horizontal, vertical, 70, 100);
        }

        //move right
        if (k == e.VK_RIGHT) {
            horizontal += 30;
            player.setBounds(horizontal, vertical, 70, 100);
        }

        //move up
        if (k == e.VK_UP) {
            vertical -= 30;
            player.setBounds(horizontal, vertical, 70, 100);
        }

        //move down
        if (k == e.VK_DOWN) {
            vertical += 30;
            player.setBounds(horizontal, vertical, 70, 100);
        }
        
        //Enters the University Park Game Map.
        if (playerRctngle.intersects(univParkRctngle)){
            removeAll();
            add(universityPark);
            validate();
            repaint();
            
        }

        
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }

    @Override
    public void actionPerformed(ActionEvent eventMap) {
        Object objMap = eventMap.getSource();
        
            if (objMap == universityPark.backToMap) {
            removeAll();
            InitialSetUpForMainMap(); //rebuild the Map.
            validate();
            repaint();
        }
    }

}
