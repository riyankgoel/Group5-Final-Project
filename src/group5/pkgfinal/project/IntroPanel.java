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
    
    GameButtons gameButtons;

    JButton aboutButton,
            instructionsButton,
            optionsButton,
            playButton;
            
    public IntroPanel() {
        super();
        setBackground(Color.white);
        setLayout(null);
        
        
        //Adds the Buttons 
        GameButtons gameButtons = new GameButtons();
        gameButtons.setBounds(new Rectangle(850,50, 300, 600));
        this.aboutButton = gameButtons.aboutButton;
        this.instructionsButton = gameButtons.instructionsButton;
        this.optionsButton = gameButtons.optionsButton;
        this.playButton = gameButtons.playButton;
        
        aboutButton.addActionListener(this);
        instructionsButton.addActionListener(this);
        optionsButton.addActionListener(this);
        playButton.addActionListener(this);
        add(gameButtons);
        
    
        
                
        
   
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        Object obj = event.getSource();
        
        

    }

}
