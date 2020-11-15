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

    JRadioButton answer1, answer2, answer3, answer4;
    JTextField displayAnswer;
    JLabel funFact;

    RadioButtonMultipleChoice multipleChoice1, multipleChoice2, multipleChoice3, multipleChoice4;

    XML_240 berksXML;
    String xmlFile;

    //constructor
    public BerksGame() {
        super();
        setBackground(Color.white);
        setLayout(null);

        funFact = new JLabel("Fun Fact! This Campus was established in 1958");
        add(funFact);
        funFact.setBounds(new Rectangle(10, 10, 400, 30));
        funFact.setFont(new Font("Century Gothic", Font.BOLD, 16));
        funFact.setForeground(Color.white);

        backToMap = new JButton("click here to go back to the Map");
        add(backToMap);
        backToMap.setBounds(new Rectangle(500, 10, 300, 30));
        

    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(berksImage, 0, 0, this);
    }

    //This method adds math related questions.
    public void MathQuestions() {

        displayQuestion = new JLabel("What is 9 + 10 ?");
        displayQuestion.setOpaque(true);
        displayQuestion.setBackground(Color.gray);
        displayQuestion.setForeground(Color.black);
        displayQuestion.setBounds(new Rectangle(500, 50, 300, 50));
        add(displayQuestion);

        displayAnswer = new JTextField();

        //answers
        answer1 = new JRadioButton("19");
        answer2 = new JRadioButton("21");
        answer3 = new JRadioButton("43");
        answer4 = new JRadioButton("63");
        group = new ButtonGroup();
        group.add(answer1);
        group.add(answer2);
        group.add(answer3);
        group.add(answer4);

        add(answer1);
        answer1.setBounds(new Rectangle(500, 150, 300, 50));
        add(answer2);
        answer2.setBounds(new Rectangle(500, 250, 300, 50));
        add(answer3);
        answer3.setBounds(new Rectangle(500, 350, 300, 50));
        add(answer4);
        answer4.setBounds(new Rectangle(500, 450, 300, 50));
        add(displayAnswer);
        displayAnswer.setBounds(new Rectangle(500, 550, 300, 50));

        answer1.addActionListener(this);
        answer2.addActionListener(this);
        answer3.addActionListener(this);
        answer4.addActionListener(this);

    }

    //This method adds math related questions.
    public void SportsQuestions() {

        displayQuestion = new JLabel("What is Saquon Barkley's Vertical Jump");
        displayQuestion.setOpaque(true);
        displayQuestion.setBackground(Color.gray);
        displayQuestion.setForeground(Color.black);
        displayQuestion.setBounds(new Rectangle(0, 0, 300, 60));

        displayAnswer = new JTextField();

//        x2 = new XML_240();
//        
//        question1boolean = x2.readObject();
//        question1 = x2.readObject();
        //answers
        multipleChoice1 = new RadioButtonMultipleChoice("false", "");
        multipleChoice2 = new RadioButtonMultipleChoice("", "50");
        multipleChoice3 = new RadioButtonMultipleChoice("", "30");
        multipleChoice4 = new RadioButtonMultipleChoice("", "26");

        answer1 = multipleChoice1.button;
        answer2 = multipleChoice2.button;
        answer3 = multipleChoice3.button;
        answer4 = multipleChoice4.button;
        group = new ButtonGroup();
        group.add(answer1);
        group.add(answer2);
        group.add(answer3);
        group.add(answer4);

        add(displayQuestion);
        displayQuestion.setBounds(new Rectangle(500, 50, 300, 50));
        add(answer1);
        answer1.setBounds(new Rectangle(500, 150, 300, 50));
        add(answer2);
        answer2.setBounds(new Rectangle(500, 250, 300, 50));
        add(answer3);
        answer3.setBounds(new Rectangle(500, 350, 300, 50));
        add(answer4);
        answer4.setBounds(new Rectangle(500, 450, 300, 50));
        add(displayAnswer);
        displayAnswer.setBounds(new Rectangle(500, 550, 300, 50));

        answer1.addActionListener(this);
        answer2.addActionListener(this);
        answer3.addActionListener(this);
        answer4.addActionListener(this);

    }

    public void createQuestions(String curTheme) {

        if (curTheme == "Math") {
            xmlFile = "BerksGameMath.xml";

        } else if (curTheme == "Sports") {
            xmlFile = "BerksGameSports.xml";
        } else if (curTheme == "Java") {
            xmlFile = "BerksGameJava.xml";
        }
        berksXML = new XML_240();// creates the 240 class that reads and writes XML
        String q1 = "";
        String a1 = "";
        String a2 = "";
        String a3 = "";
        String a4 = "";
        
        String a1Boolean = "";
        String a2Boolean = "";
        String a3Boolean = "";
        String a4Boolean = "";
        
        berksXML.openReaderXML(xmlFile);
        q1 = (String) berksXML.ReadObject();//reads the lines in the XML file from the top to bottom.
        a1Boolean = (String) berksXML.ReadObject();
        a1 = (String) berksXML.ReadObject();
        a2Boolean = (String) berksXML.ReadObject();
        a2 = (String) berksXML.ReadObject();
        a3Boolean = (String) berksXML.ReadObject();
        a3 = (String) berksXML.ReadObject();
        a4Boolean = (String) berksXML.ReadObject();
        a4 = (String) berksXML.ReadObject();
        
        displayQuestion = new JLabel(q1);
        displayQuestion.setOpaque(true);
        displayQuestion.setBackground(Color.gray);
        displayQuestion.setForeground(Color.black);
        displayQuestion.setBounds(new Rectangle(0, 0, 300, 60));

        displayAnswer = new JTextField();
        
        
        multipleChoice1 = new RadioButtonMultipleChoice(a1Boolean, a1);
        multipleChoice2 = new RadioButtonMultipleChoice(a2Boolean, a2);
        multipleChoice3 = new RadioButtonMultipleChoice(a3Boolean, a3);
        multipleChoice4 = new RadioButtonMultipleChoice(a4Boolean, a4);

        answer1 = multipleChoice1.button;
        answer2 = multipleChoice2.button;
        answer3 = multipleChoice3.button;
        answer4 = multipleChoice4.button;
        group = new ButtonGroup();
        group.add(answer1);
        group.add(answer2);
        group.add(answer3);
        group.add(answer4);

        add(displayQuestion);
        displayQuestion.setBounds(new Rectangle(500, 50, 300, 50));
        add(answer1);
        answer1.setBounds(new Rectangle(500, 150, 300, 50));
        add(answer2);
        answer2.setBounds(new Rectangle(500, 250, 300, 50));
        add(answer3);
        answer3.setBounds(new Rectangle(500, 350, 300, 50));
        add(answer4);
        answer4.setBounds(new Rectangle(500, 450, 300, 50));
        add(displayAnswer);
        displayAnswer.setBounds(new Rectangle(500, 550, 300, 50));
        
        answer1.addActionListener(this);
        answer2.addActionListener(this);
        answer3.addActionListener(this);
        answer4.addActionListener(this);



    }

    @Override
    public void actionPerformed(ActionEvent e) {

        Object obj = e.getSource();

        if (obj == answer1) {
            
            System.out.println("ans1");
            displayAnswer.setText(multipleChoice1.isCorrect);
            remove(answer2);
            remove(answer3);
            remove(answer4);

        }
        if (obj == answer2) {
            displayAnswer.setText(multipleChoice2.isCorrect);
            remove(answer1);
            remove(answer3);
            remove(answer4);
        }
        if (obj == answer3) {
            displayAnswer.setText(multipleChoice3.isCorrect);
            remove(answer1);
            remove(answer2);
            remove(answer4);
        }
        if (obj == answer4) {
            displayAnswer.setText(multipleChoice4.isCorrect);
            remove(answer1);
            remove(answer2);
            remove(answer3);

        }

    }

}
