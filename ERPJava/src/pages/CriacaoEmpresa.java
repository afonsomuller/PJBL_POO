package pages;

import utilities.CampoEmBranco;
import utilities.FileManager;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Objects;

public class CriacaoEmpresa extends JFrame {

    private JLabel boasVindas;
    private JTextField nomeEmpresaTextField;
    private JLabel nomeEmpresa;
    private JLabel CNPJEmpresa;
    private JTextField CNPJEmpresaTextField;
    private JButton criarEmpresaButton;
    private JPanel MainPanel;


    public CriacaoEmpresa() {
        setContentPane(MainPanel);
        setTitle("Criar Empresa");
        setSize(500,300);
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        criarEmpresaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nomeEmpresa = nomeEmpresaTextField.getText();
                String CNPJEmpresa = CNPJEmpresaTextField.getText();
                try {
                    if (Objects.equals(nomeEmpresa, "") || Objects.equals(CNPJEmpresa, "")) {
                        JOptionPane.showMessageDialog(
                                CriacaoEmpresa.this,
                                "Opa! Algum campo está vazio! Tente novamente",
                                "Aviso", JOptionPane.WARNING_MESSAGE);
                        throw new CampoEmBranco("Opa! Algum campo está vazio! Tente novamente");
                    } else {
                        int resposta = JOptionPane.showConfirmDialog(CriacaoEmpresa.this, "Empresa: " + nomeEmpresa
                                + "\nCNPJ: " + CNPJEmpresa + "\nDeseja Confirmar dados?", "Confirmar", JOptionPane.OK_CANCEL_OPTION);
                        if(resposta == 0){
                            FileManager fm = new FileManager("./ERPJava/database/Empresa.txt");
                            fm.escreverArquivoEmpresa(nomeEmpresa, CNPJEmpresa);
                            dispose();
                        }
                    }
                } catch (CampoEmBranco ex) {
                    System.out.println(ex.getMessage());
                }
            }
        });
    }
}
