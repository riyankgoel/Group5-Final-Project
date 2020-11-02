/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package group5.pkgfinal.project;

import java.awt.BorderLayout;
import java.awt.Color;
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
import javax.swing.JProgressBar;

/**
 *
 * Main Controller for the entire program. Tells code which panel to display
 */
//
public class ControlPanel extends JPanel implements ActionListener, KeyListener {

    IntroPanel introPanel;

    JButton aboutButton,
            instructionsButton,
            optionsButton,
            playButton;
    
    //Menu Options
    Options optionsMenu;
    About aboutMenu;
    Instructions instructionsMenu;

    //adds other panels to access
    MainMap mainMap;
    UniversityParkGame universityPark;
    ScrantonGame scranton;
    FayetteGame fayette;
    WorldCampusGame worldCampus;
    BerksGame berks;
    GameOver gameOver;
    

    //constructor
    public ControlPanel() {
        super();
        InitialSetUpForControlPanel();
        CreateComponentsThatWillBeSwapped();
        setFocusable(true);
        addKeyListener(this);

    }

    //Run this method to go back to the intro screen. 
    public void InitialSetUpForControlPanel() {
        //create the layout and graphic components
        //add listeners
        setBackground(Color.white);
        BorderLayout bl = new BorderLayout();
        setLayout(bl);

        //Adds the Buttons 
        IntroPanel introPanel = new IntroPanel();
        introPanel.setBounds(new Rectangle(0, 0, 1200, 700));
        this.aboutButton = introPanel.aboutButton;
        this.instructionsButton = introPanel.instructionsButton;
        this.optionsButton = introPanel.optionsButton;
        this.playButton = introPanel.playButton;

        aboutButton.addActionListener(this);
        instructionsButton.addActionListener(this);
        optionsButton.addActionListener(this);
        playButton.addActionListener(this);
        add(introPanel);
    }

    //Put your class here so they can be used to switch between panels
    public void CreateComponentsThatWillBeSwapped() {
        
        
        mainMap = new MainMap();
        mainMap.backButton.addActionListener(this);//adds a back button to return to the main menu
        mainMap.gameOverGame.addActionListener(this);//adds a game over screen button
       
        optionsMenu = new Options();
        optionsMenu.backButton.addActionListener(this);//adds a back button to return to the main menu
        
        aboutMenu = new About();
        aboutMenu.backButton.addActionListener(this);//adds a back button to return to the main menu
        
        instructionsMenu = new Instructions();
        instructionsMenu.backButton.addActionListener(this);//adds a back button to return to the main menu
        
        //creates object of each panel for game and adds a back button
        universityPark = new UniversityParkGame();
        universityPark.backToMap.addActionListener(this);
        scranton = new ScrantonGame();
        scranton.backToMap.addActionListener(this);
        fayette = new FayetteGame();
        fayette.backToMap.addActionListener(this);
        worldCampus = new WorldCampusGame();
        worldCampus.backToMap.addActionListener(this);
        berks = new BerksGame();
        berks.backToMap.addActionListener(this);
        gameOver = new GameOver();
        gameOver.backToMainMenu.addActionListener(this);
        
        

    }

    public void pickGame() {
        String campus = mainMap.intersectsWhichCampus();
        if (campus == "UnivPark") {
            remove(mainMap);
            add(universityPark);
            validate();
            repaint();
        } else if (campus == "Scranton") {
            remove(mainMap);
            add(scranton);
            validate();
            repaint();
        } else if (campus == "Berks") {
            remove(mainMap);
            add(berks);
            validate();
            repaint();
        } else if (campus == "Fayette") {
            remove(mainMap);
            add(fayette);
            validate();
            repaint();
        } else if (campus == "World") {
            remove(mainMap);
            add(worldCampus);
            validate();
            repaint();           
        } else {
        }
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        Object obj = event.getSource();

        //Goes to the About Menu
        if (obj == aboutButton){
            removeAll();
            add(aboutMenu);
            validate();
            repaint();            
        }
        //Goes back to the main menu
        if (obj == aboutMenu.backButton){
            removeAll();
            InitialSetUpForControlPanel(); //rebuild the original ControlPanel again
            validate();
            repaint();         
        }
        
        if (obj == optionsButton){
            removeAll();
            add(optionsMenu);
            validate();
            repaint();            
        }
        //Goes back to the main menu
        if (obj == optionsMenu.backButton){
            removeAll();
            InitialSetUpForControlPanel(); //rebuild the original ControlPanel again
            validate();
            repaint();         
        }
        if (obj == instructionsButton){
            removeAll();
            add(instructionsMenu);
            validate();
            repaint();            
        }
        //Goes back to the main menu
        if (obj == instructionsMenu.backButton){
            removeAll();
            InitialSetUpForControlPanel(); //rebuild the original ControlPanel again
            validate();
            repaint();         
        }
        
        //Goes to the Main Map through the play button
        if (obj == playButton) {
            removeAll();
            add(mainMap);
            validate();
            repaint();
        }
        //back to the intro panel from the main map
        if (obj == mainMap.backButton) {
            removeAll();
            InitialSetUpForControlPanel(); //rebuild the original ControlPanel again
            validate();
            repaint();
        }
        
        //All these if statementrs allow each game panel to return back to the main map
        if (obj == universityPark.backToMap) {
            remove(universityPark);
            add(mainMap);//returns and rebuilds the map
            validate();
            repaint();
        }
        if (obj == scranton.backToMap) {
            remove(scranton);
            add(mainMap);//returns and rebuilds the map
            validate();
            repaint();
        }
        if (obj == fayette.backToMap){
            remove(fayette);
            add(mainMap);//returns and rebuilds the map
            validate();
            repaint();            
        }
        if (obj == worldCampus.backToMap){
            remove(worldCampus);
            add(mainMap);//returns and rebuilds the map
            validate();
            repaint();  
        }
        if (obj == berks.backToMap){
            remove(berks);
            add(mainMap);//returns and rebuilds the map
            validate();
            repaint();  
        }
        if (obj == gameOver.backToMainMenu) {
            removeAll();
            InitialSetUpForControlPanel(); //rebuild the original ControlPanel again
            validate();
            repaint();
        }
        if (obj == mainMap.gameOverGame){
            removeAll();
            add(gameOver);
            validate();
            repaint();            
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyPressed(KeyEvent event) {
        int key = event.getKeyCode();

        if (key == KeyEvent.VK_RIGHT) {
            mainMap.movePlayerRight();
            pickGame();
        }

        if (key == KeyEvent.VK_LEFT) {
            mainMap.movePlayerLeft();
            pickGame();
        }

        if (key == KeyEvent.VK_UP) {
            mainMap.movePlayerUp();
            pickGame();
        }

        if (key == KeyEvent.VK_DOWN) {
            mainMap.movePlayerDown();
            pickGame();
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
