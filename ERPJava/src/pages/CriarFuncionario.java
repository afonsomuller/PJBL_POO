package pages;

import users.Funcionario;
import users.Tecnico;
import users.Vendedor;
import utilities.CampoEmBranco;
import utilities.FileManager;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.Arrays;
import java.util.Objects;

public class CriarFuncionario extends JFrame{

    private JPanel visaoGeral;
    private JButton cancelarButton;
    private JButton confirmarButton;
    private JPanel campoDeCriacao;
    private JTextField nomeDoFuncionarioTextField;
    private JComboBox comboBox1;
    private JTextField salarioFuncionarioTextField;

    public CriarFuncionario() {
        setContentPane(visaoGeral);
        setTitle("Criar Empresa");
        setSize(800,500);
        setLocationRelativeTo(null);
        setVisible(true);
        this.setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setComboBox1();

        confirmarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    FileManager fm = new FileManager("./ERPJava/database/Funcionario.txt");
                    String nomeDoFuncionario = nomeDoFuncionarioTextField.getText();
                    if (Objects.equals(nomeDoFuncionario, "")) throw new CampoEmBranco("O campo Nome do Funcionario não pode ficar em branco!");
                    double salarioFuncionario = Double.parseDouble(salarioFuncionarioTextField.getText());
                    String cargo = comboBox1.getSelectedItem().toString();
                    int nivelDePermissao = 0;
                    int resposta = JOptionPane.showConfirmDialog(CriarFuncionario.this, "Deseja Criar o Funcionário?", "Confirmação", JOptionPane.OK_CANCEL_OPTION);
                        if (resposta == 0) {
                            try{
                                switch (cargo) {
                                    case "Vendedor":
                                        nivelDePermissao = 1;
                                        Funcionario v = new Vendedor(nomeDoFuncionario, salarioFuncionario, nivelDePermissao);
                                        fm.salvarFuncionario(v);
                                        MainWindow mainWindow = new MainWindow();
                                        dispose();
                                        break;
                                    case "Técnico":
                                        nivelDePermissao = 2;
                                        Funcionario t = new Tecnico(nomeDoFuncionario, salarioFuncionario, nivelDePermissao);
                                        fm.salvarFuncionario(t);
                                        MainWindow mainWindow1 = new MainWindow();
                                        dispose();
                                        break;
                                    case "Operador de caixa":
                                        nivelDePermissao = 3;
                                        Funcionario op = new Vendedor(nomeDoFuncionario, salarioFuncionario, nivelDePermissao);
                                        fm.salvarFuncionario(op);
                                        MainWindow mw = new MainWindow();
                                        dispose();
                                        break;
                                    case "Gerente":
                                        nivelDePermissao = 4;
                                        Funcionario g = new Vendedor(nomeDoFuncionario, salarioFuncionario, nivelDePermissao);
                                        fm.salvarFuncionario(g);
                                        MainWindow mainWindow2 = new MainWindow();
                                        dispose();
                                        break;
                                    default:
                                        throw new CampoEmBranco("O campo cargo deve ser selecionado!");
                                }
                            }
                            catch (CampoEmBranco ex) {
                                JOptionPane.showMessageDialog(CriarFuncionario.this, "O campo cargo deve ser selecionado!");
                            }
                            catch (IOException ex) {
                                System.out.println(ex.getMessage());;
                            }
                        }
                }
                catch (NumberFormatException e1){
                    JOptionPane.showMessageDialog(CriarFuncionario.this, "Opa! Algum Campo está em branco", "Aviso", JOptionPane.ERROR_MESSAGE);
                }
                catch (CampoEmBranco ex){
                    JOptionPane.showMessageDialog(CriarFuncionario.this, ex.getMessage(), "Aviso", JOptionPane.WARNING_MESSAGE);

                }
            }
        });
        cancelarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int resposta = JOptionPane.showConfirmDialog(CriarFuncionario.this, "Deseja Encerrar o programa?", "Aviso", JOptionPane.WARNING_MESSAGE);
                if(resposta == 0){
                    dispose();
                }
            }
        });
    }
    private void setComboBox1(){
        for (String s : Arrays.asList("", "Gerente", "Vendedor", "Técnico", "Operador de Caixa")) {
            comboBox1.addItem(s);
        }
    }
}