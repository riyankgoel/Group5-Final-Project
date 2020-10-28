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
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JProgressBar;

/**
 *
 * @author theodore
 */
//Pretty much the mainframe of our last assignments
public class IntroPanel extends JPanel implements ActionListener, KeyListener {
    
    GameButtons gameButtons;

    JButton aboutButton,
            instructionsButton,
            optionsButton,
            playButton;
      
    MainMap mainMap;
            
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
        
        //
        if (obj == playButton){
            remove(gameButtons);
            
            
            
            
        }
        
        

    }

    @Override
    public void keyTyped(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyPressed(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyReleased(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
