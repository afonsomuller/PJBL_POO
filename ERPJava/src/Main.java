import pages.Confirmacao;
import pages.CriarFuncionario;
import pages.MainWindow;
import users.*;
import utilities.FileManager;

import java.io.IOException;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        FileManager fm = new FileManager("./ERPJava/database/Empresa.txt");
        FileManager fm1 = new FileManager("./ERPJava/database/Funcionario.txt");
        List<String> dadosEmpresa = fm.lerArquivoEmpresa();
        try {
            Empresa empresa = new Empresa(dadosEmpresa.get(0), dadosEmpresa.get(1));
            empresa.getEmpresa();
            Funcionario f = fm1.carregarFuncionario();
            MainWindow mainWindow = new MainWindow();
        } catch (NullPointerException e) {
            Confirmacao confirmacao = new Confirmacao();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Arquivo não encontrado ou funcionario não criado!");
            CriarFuncionario criarFuncionario = new CriarFuncionario();
        }
    }
}