package pages;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RelatorioGerencial extends JFrame {
    private JPanel RelatorioGerencial;
    private JButton erro;

    public RelatorioGerencial() {
        setContentPane(RelatorioGerencial);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);
        setLocationRelativeTo(null);
        setVisible(true);
        erro.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MainWindow mainWindow = new MainWindow();
                dispose();
            }
        });
    }
}
