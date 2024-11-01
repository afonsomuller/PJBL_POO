package pages;

import javax.swing.*;
import java.awt.*;

public class MainWindow{

    public MainWindow(){
        JFrame frame = new JFrame("Pagina Principal");
        frame.setSize(800, 600);
        frame.setBackground(Color.BLACK);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
