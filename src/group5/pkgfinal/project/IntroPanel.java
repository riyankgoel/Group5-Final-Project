/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package group5.pkgfinal.project;

import java.awt.Color;
import java.awt.Rectangle;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * This class is the Intro Screen to the project.
 * Includes the Image and four buttons to the project (About,Instructions,Options, and Play)
 */
public class IntroPanel extends JPanel {

    //Buttons
    JButton aboutButton,
            instructionsButton,
            optionsButton,
            playButton;

    //Image buttons
    JButton menuImageButton;
 
    //title label
    JLabel titleText;
    
    public IntroPanel() {
        super();
        setBackground(Color.white);

        //creates About Button
        setLayout(null);
        aboutButton = new JButton("About");
        add(aboutButton);
        aboutButton.setBounds(new Rectangle(810, 30, 300, 60));

        //creates Instructions Button
        instructionsButton = new JButton("Instructions");
        add(instructionsButton);
        instructionsButton.setBounds(new Rectangle(810, 130, 300, 60));

        //creates options Button
        optionsButton = new JButton("Options");
        add(optionsButton);
        optionsButton.setBounds(new Rectangle(810, 230, 300, 60));

        //creates the play(Main Map) Button
        playButton = new JButton("Play");
        add(playButton);
        playButton.setBounds(new Rectangle(810, 330, 300, 60));

        //Creates the Menu Image
        ImageIcon menuImage = new ImageIcon("images/menu_image1.jpg");//creates the image to be used in a JButton
        menuImageButton = new JButton();
        menuImageButton.setIcon(menuImage);// image added after the button is already created
        add(menuImageButton);
        menuImageButton.setBounds(new Rectangle(30, 100, 700, 306));
        
        //Label for the Title of the game
        titleText = new JLabel("IST 240 - Penn State Game");
        add(titleText);
        titleText.setBounds(new Rectangle(300, 0, 300, 60));

    }

}
