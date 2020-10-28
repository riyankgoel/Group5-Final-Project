/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package group5.pkgfinal.project;

import java.awt.Color;
import java.awt.Rectangle;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author theodore
 */
public class GameButtons extends JPanel {

    JButton aboutButton,
            instructionsButton,
            optionsButton,
            playButton;

    public GameButtons() {
        super();
        setBackground(Color.white);

        //creates About Button
        setLayout(null);
        aboutButton = new JButton("About");
        add(aboutButton);
        aboutButton.setBounds(new Rectangle(0, 0, 300, 60));

        //creates Instructions Button
        instructionsButton = new JButton("Instructions");
        add(instructionsButton);
        instructionsButton.setBounds(new Rectangle(0, 100, 300, 60));

        //creates options Button
        optionsButton = new JButton("Instructions");
        add(optionsButton);
        optionsButton.setBounds(new Rectangle(0, 200, 300, 60));

        //creates the play(Main Map) Button
        playButton = new JButton("Play");
        add(playButton);
        playButton.setBounds(new Rectangle(0, 300, 300, 60));

    }

}
