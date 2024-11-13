import pages.Confirmacao;
import pages.MainWindow;
import users.*;
import utilities.FileManager;

import java.util.List;


public class Main {
    public static void main(String[] args) {
        FileManager fm = new FileManager("./ERPJava/database/Empresa.txt");
        FileManager fm2 = new FileManager("./ERPJava/database/vendas.txt");
        List<String> dadosEmpresa = fm.lerArquivoEmpresa();
        try {
            Empresa empresa = new Empresa(dadosEmpresa.get(0), dadosEmpresa.get(1));
            MainWindow mainWindow = new MainWindow();
        } catch (NullPointerException e) {
            Confirmacao confirmacao = new Confirmacao();
        }
    }
}