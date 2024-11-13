import pages.Confirmacao;
import pages.CriarFuncionario;
import pages.MainWindow;
import users.*;
import utilities.FileManager;

import java.awt.font.TextHitInfo;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;



public class Main {
    public static void main(String[] args) {
        FileManager fm = new FileManager("./ERPJava/database/Empresa.txt");
        FileManager fm1 = new FileManager("./ERPJava/database/Funcionario.txt");
        FileManager fm2 = new FileManager("./ERPJava/database/vendas.txt");
        List<String> dadosEmpresa = fm.lerArquivoEmpresa();
        System.out.println(fm2.getIDVendaArquivo());
        try {
            Empresa empresa = new Empresa(dadosEmpresa.get(0), dadosEmpresa.get(1));
            MainWindow mainWindow = new MainWindow();
        } catch (NullPointerException e) {
            Confirmacao confirmacao = new Confirmacao();
        }
    }
}