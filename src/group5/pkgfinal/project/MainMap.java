/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package group5.pkgfinal.project;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author theodore
 */
public class MainMap extends JPanel implements ActionListener {

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
            fayetteGame,
            gameOverGame;

    //Rectangles for intersection. Used for when the player intersects with the campus.
    Rectangle univParkRctngle, wrldCmpRctngle, brksRctngle, scrantonRctngle, fytteRctngle, gameOverRctngle;

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
    public void InitialSetUpForMainMap() {
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
        player.setText("Player");
        player.setBounds(new Rectangle(horizontal, vertical, 70, 100));

        //University Park
        univParkGame = new JButton("UniversityPark");
        univParkGame.setBackground(Color.blue);
        add(univParkGame);
        univParkGame.setBounds(new Rectangle(575, 365, 30, 30));

        //World Campus
        worldCampGame = new JButton("World Campus");
        worldCampGame.setBackground(Color.white);
        add(worldCampGame);
        worldCampGame.setBounds(new Rectangle(600, 100, 200, 30));

        //Berks Campus
        berksGame = new JButton("Berks Campus");
        berksGame.setBackground(Color.pink);
        add(berksGame);
        berksGame.setBounds(new Rectangle(935, 475, 30, 30));

        //Scranton Campus
        scrantonGame = new JButton("Scranton Campus");
        scrantonGame.setBackground(Color.yellow);
        add(scrantonGame);
        scrantonGame.setBounds(new Rectangle(980, 215, 30, 30));

        //Fayette Campus
        fayetteGame = new JButton("Fayette Campus");
        fayetteGame.setBackground(Color.red);
        add(fayetteGame);
        fayetteGame.setBounds(new Rectangle(217, 580, 30, 30));

        //Game Over Button
        gameOverGame = new JButton("Game Over");
        gameOverGame.setBackground(Color.gray);
        add(gameOverGame);
        gameOverGame.setBounds(new Rectangle(1050, 50, 100, 100));
        gameOverGame.addActionListener(this);

        setFocusable(true);
        requestFocusInWindow();
    }

    public void movePlayerRight() {
        horizontal += 30;
        player.setBounds(horizontal, vertical, 70, 100);
    }

    public void movePlayerLeft() {
        horizontal -= 30;
        player.setBounds(horizontal, vertical, 70, 100);
    }

    public void movePlayerUp() {
        vertical -= 30;
        player.setBounds(horizontal, vertical, 70, 100);

    }

    public void movePlayerDown() {
        vertical += 30;
        player.setBounds(horizontal, vertical, 70, 100);
    }

    public String intersectsWhichCampus() {
        if (ifIntersectsUnivParkGame()) {
            return "UnivPark";
        }
        if (ifIntersectsWorldCampusGame()) {
            return "World";
        }
        if (ifIntersectsBerksGame()) {
            return "Berks";
        }
        if (ifIntersectsScrantonGame()) {
            return "Scranton";
        }
        if (ifIntersectsFayetteGame()) {
            return "Fayette";
        }
        return "Nothing";
    }

    public boolean ifIntersectsUnivParkGame() {
        univParkRctngle = univParkGame.getBounds();
        playerRctngle = player.getBounds();

        return playerRctngle.intersects(univParkRctngle);
    }

    public boolean ifIntersectsWorldCampusGame() {
        wrldCmpRctngle = worldCampGame.getBounds();
        playerRctngle = player.getBounds();

        return playerRctngle.intersects(wrldCmpRctngle);
    }

    public boolean ifIntersectsBerksGame() {
        brksRctngle = berksGame.getBounds();
        playerRctngle = player.getBounds();

        return playerRctngle.intersects(brksRctngle);
    }

    public boolean ifIntersectsScrantonGame() {
        scrantonRctngle = scrantonGame.getBounds();
        playerRctngle = player.getBounds();

        return playerRctngle.intersects(scrantonRctngle);
    }

    public boolean ifIntersectsFayetteGame() {
        fytteRctngle = fayetteGame.getBounds();
        playerRctngle = player.getBounds();

        return playerRctngle.intersects(fytteRctngle);
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
    public void actionPerformed(ActionEvent eventMap) {
        Object objMap = eventMap.getSource();

    }

}
