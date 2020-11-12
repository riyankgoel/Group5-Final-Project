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
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

/**
 *
 * Berks Game
 */
public class BerksGame extends JPanel implements ActionListener {

    //Main Penn State map Image
    ImageIcon sourceBerksImage1 = new ImageIcon("images/Berks.jpg");
    Image berksImage = sourceBerksImage1.getImage();

    //back to the menu button
    JButton backToMap;
    JLabel displayQuestion;
    ButtonGroup group;
    
    JRadioButton answer1,answer2,answer3;
    JTextField displayAnswer;

    //constructor
    public BerksGame() {
        super();
        setBackground(Color.white);
        setLayout(null);

        
                //Test
        MathQuestions();

        backToMap = new JButton("click here to go back to the Map");
        add(backToMap);
        backToMap.setBounds(new Rectangle(500, 10, 300, 30));
        

        

    }
    

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(berksImage, 0, 0, this);
    }
    
    public void MathQuestions(){
        

        
        displayQuestion = new JLabel("What is 9 + 10 ?");
        displayQuestion.setOpaque(true);
        displayQuestion.setBackground(Color.gray);
        displayQuestion.setForeground(Color.black);
        displayQuestion.setBounds(new Rectangle(0, 0, 300, 60));
        
        displayAnswer = new JTextField();
        
        //answers
        answer1 = new JRadioButton("19");
        answer2 = new JRadioButton("21");
        answer3 = new JRadioButton("43");
        group = new ButtonGroup();
        group.add(answer1);
        group.add(answer2);
        group.add(answer3);
        
        add(displayQuestion);
        displayQuestion.setBounds(new Rectangle(600, 50, 300, 50));
        add(answer1);
        answer1.setBounds(new Rectangle(600, 150, 300, 50));
        add(answer2);
        answer2.setBounds(new Rectangle(600, 250, 300, 50));
        add(answer3);
        answer3.setBounds(new Rectangle(600, 350, 300, 50));
        add(displayAnswer);
        displayAnswer.setBounds(new Rectangle(600, 450, 300, 50));
        
        answer1.addActionListener(this);
        answer2.addActionListener(this);
        answer3.addActionListener(this);
        // set the button with a default selection
        answer1.setSelected(true);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
         Object obj = e.getSource();

        if (obj == answer1)
        {
            displayAnswer.setForeground(Color.pink);
            displayAnswer.setText("WRONG !!");
        }
        if (obj == answer2)
        {
            displayAnswer.setForeground(Color.blue);
            displayAnswer.setText("CORRECT !!");
        }
        if (obj == answer3)
        {
            displayAnswer.setForeground(Color.red);
            displayAnswer.setText("WRONG !!");
        }
        
    }
    

}