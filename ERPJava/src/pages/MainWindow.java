package pages;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainWindow extends JFrame {
    private JPanel MainWindow;
    private JButton orçamentoButton;
    private JButton relatórioGerencialButton;

    public MainWindow() {
        setContentPane(MainWindow);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);
        setLocationRelativeTo(null);
        setVisible(true);

        orçamentoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Orcamento o = new Orcamento();
                dispose();
            }
        });
        relatórioGerencialButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                RelatorioGerencial re = new RelatorioGerencial();
                dispose();
            }
        });
    }
}
