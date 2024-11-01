package pages;

import javax.swing.*;
import java.awt.*;

public abstract class MainWindow{
    private static final JFrame frame = new JFrame();

    public static void abrir(JPanel panel){
        frame.add(panel);
        frame.setSize(500,300);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void changePanel(JPanel panel){
        frame.getContentPane().removeAll();
        frame.getContentPane().add(panel);
        frame.revalidate();
        frame.repaint();
    }
//    public abstract JPanel mostrar();
}
