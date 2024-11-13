package pages;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import utilities.FileManager;

public class Confirmacao extends JFrame{
    private JPanel Confirmacao;
    private JButton criarEmpresaButton;
    private JButton entrarComEmpresaExistenteButton;
    private JLabel desejaFazer;

    public Confirmacao() {
        setContentPane(Confirmacao);
        setTitle("O que fazer");
        setSize(500,300);
        setLocationRelativeTo(null);
        setVisible(true);
        this.setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        criarEmpresaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CriacaoEmpresa criacaoEmpresa = new CriacaoEmpresa();
                dispose();
            }
        });
        entrarComEmpresaExistenteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                FileManager fm = new FileManager("./ERPJava/database/Empresa.txt");
                List<String> dadosEmpresa = fm.lerArquivoEmpresa();
                try{
                    dadosEmpresa.get(0);
                    dispose();
                } catch (NullPointerException ex) {
                    JOptionPane.showMessageDialog(
                            Confirmacao.this,
                            "Opa! O Arquivo está vazio! Crie uma nova empresa!",
                            "Aviso", JOptionPane.WARNING_MESSAGE);
                    CriacaoEmpresa criacaoEmpresa = new CriacaoEmpresa();
                    dispose();
                }

            }
        });
    }
}
