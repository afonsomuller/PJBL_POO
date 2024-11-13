package pages;

import users.Funcionario;
import utilities.CampoEmBranco;
import utilities.FileManager;
import utilities.ValidarCNPJ;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
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
        this.setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        criarEmpresaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nomeEmpresa = nomeEmpresaTextField.getText();
                String CNPJEmpresa = CNPJEmpresaTextField.getText();
                try {
                    // Verifica Se algum campo está vazio
                    if (Objects.equals(nomeEmpresa, "") || Objects.equals(CNPJEmpresa, "")) {
                        JOptionPane.showMessageDialog(
                                CriacaoEmpresa.this,
                                "Opa! Algum campo está vazio! Tente novamente",
                                "Aviso", JOptionPane.WARNING_MESSAGE);
                        throw new CampoEmBranco("Opa! Algum campo está vazio! Tente novamente");
                    }
                    else {
                        // Realiza a Validação do CNPJ. Caso seja válido, mostra a mensagem de confirmação e salva os dados em arquivo.
                        // Caso Contrário, Realiza nova verificação
                        ValidarCNPJ validarCNPJ = new ValidarCNPJ();
                        if(ValidarCNPJ.ValidaCNPJ.isCNPJ(CNPJEmpresa)){
                            String CNPJEmpresaFormatado = ValidarCNPJ.ValidaCNPJ.imprimeCNPJ(CNPJEmpresa);
                            int resposta = JOptionPane.showConfirmDialog(CriacaoEmpresa.this, "Empresa: " + nomeEmpresa
                                    + "\nCNPJ: " + CNPJEmpresaFormatado + "\nDeseja Confirmar dados?", "Confirmar", JOptionPane.OK_CANCEL_OPTION);
                            if(resposta == 0){
                                FileManager fm = new FileManager("./ERPJava/database/Empresa.txt");
                                fm.escreverArquivoEmpresa(nomeEmpresa, CNPJEmpresa);
                                FileManager fm1 = new FileManager("./ERPJava/database/Funcionario.txt");
                                try {
                                    Funcionario v = fm1.carregarPessoa();
                                    MainWindow mainWindow = new MainWindow();
                                } catch (IOException | ClassNotFoundException ex) {
                                    CriarFuncionario cf = new CriarFuncionario();
                                }
                                dispose();
                            }
                        }
                        else{
                                JOptionPane.showMessageDialog(
                                        CriacaoEmpresa.this,
                                        "Opa! O CNPJ digitado é inválido! Tente novamente",
                                        "Aviso", JOptionPane.WARNING_MESSAGE);
                        }
                    }
                }
                catch (CampoEmBranco ex) {
                    System.out.println(ex.getMessage());
                }
            }
        });
    }
}
