/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package group5.pkgfinal.project;

import java.awt.Color;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JProgressBar;

/**
 *
 * @author theodore
 */
//Pretty much the mainframe of our last assignments
public class IntroPanel extends JPanel implements ActionListener {

    JButton aboutButton,
            instructionsButton,
            optionsButton,
            playButton;

    public IntroPanel() {
        super();
        setBackground(Color.white);

        //creates About Button
        setLayout(null);
        aboutButton = new JButton("About");
        add(aboutButton);
        aboutButton.setBounds(new Rectangle(600, 10, 300, 60));
        aboutButton.addActionListener(this);
        
        //creates Instructions Button
        instructionsButton = new JButton("Instructions");
        add(instructionsButton);
        instructionsButton.setBounds(new Rectangle(600, 110, 300, 60));
        instructionsButton.addActionListener(this);
        
        //creates options Button
        optionsButton = new JButton("Instructions");
        add(optionsButton);
        optionsButton.setBounds(new Rectangle(600, 210, 300, 60));
        optionsButton.addActionListener(this);
        
        //creates the play(Main Map) Button
        playButton = new JButton("Play");
        add(playButton);
        playButton.setBounds(new Rectangle(600, 310, 300, 60));
        playButton.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

}
