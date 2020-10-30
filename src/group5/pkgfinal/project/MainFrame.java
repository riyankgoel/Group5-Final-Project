package group5.pkgfinal.project;

import java.awt.*;
import javax.swing.*;

public class MainFrame extends JFrame {

    ControlPanel introPanel;

    public MainFrame() {
        super("Penn State Game");
        MacLayoutSetup();
        introPanel = new ControlPanel();
        getContentPane().add(introPanel, "Center");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(1200, 700);
        setVisible(true);
    }

    public void MacLayoutSetup() {
        // On some MACs it might be necessary to have the statement below 
        //for the background color of the button to appear 
        try {
            UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
