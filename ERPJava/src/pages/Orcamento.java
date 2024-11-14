package pages;

import users.Funcionario;
import users.Vendedor;
import utilities.FileManager;
import utilities.ValorNegativoException;
import utilities.Vendas;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class Orcamento extends JFrame {
    private JTextField valorTextField;
    private JTextField descricaoTextField;
    private JButton confirmarOrçamentoButton;
    private JButton cancelarButton;
    private JPanel Orcamento;


    public Orcamento() {
        setContentPane(Orcamento);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);
        setLocationRelativeTo(null);
        setVisible(true);
        FileManager fm = new FileManager("./ERPJava/database/Vendas.txt");
        FileManager fm1 = new FileManager("./ERPJava/database/Funcionario.txt");


        cancelarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int resposta = JOptionPane.showConfirmDialog(Orcamento.this,
                        "Deseja cancelar o orçamento?", "Confirmação", JOptionPane.OK_CANCEL_OPTION);
                if(resposta == 0) {
                    MainWindow mainWindow = new MainWindow();
                    dispose();
                }
            }
        });
        confirmarOrçamentoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {

                    double valor = Double.parseDouble(valorTextField.getText());
                    String descricao = descricaoTextField.getText();
                    if(valor < 0) throw new ValorNegativoException("Você digitou um valor negativo");
                    int resposta = JOptionPane.showConfirmDialog(Orcamento.this,
                            "Deseja confimar o orçamento de: " + "\nValor: " + valor + "\nDescrição: " + descricao, "Confirmação", JOptionPane.OK_CANCEL_OPTION);
                    if (resposta == 0) {
                        try {
                            Funcionario f = fm1.carregarFuncionario();
                            Vendedor v = (Vendedor) f;
                            v.acumularValorVendido(valor);
                            Vendas.setIDVenda(fm.getIDVendaArquivo());
                            Vendas vendas = new Vendas(valor, descricao, v);
                            fm.escreverArquivoVendas(vendas.getIDVenda(), vendas.getValorVenda(), vendas.getDescricao(), v.getNomeDoFuncionario());
                            Orcamento orcamento = new Orcamento();
                            dispose();
                        } catch (IOException | ClassNotFoundException ex) {
                            JOptionPane.showMessageDialog(Orcamento.this, "Vendedor não encontrado", "Erro", JOptionPane.ERROR_MESSAGE);
                        }

                    }
                } catch (ValorNegativoException e1) {
                    JOptionPane.showMessageDialog(Orcamento.this, e1.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
                }

            }
        });
    }
}
