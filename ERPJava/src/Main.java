import pages.CriacaoEmpresa;
import pages.MainWindow;
import users.*;
import utilities.FileManager;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Empresa empresa = new Empresa("Onde Hoje?", "06109465000161");
        Funcionario v = new Vendedor("Afonso", 2000, 0, 4);
        empresa.addFuncionario(v);
        for(Funcionario f: empresa.getFuncionarios()) {
            if (f.getNivelDePermissao() == 4 || f.getNivelDePermissao() == 1) {
                Vendas venda = new Vendas(2000, "Venda de 2 motores");
                venda.addVenda(venda);
            }
        }
        FileManager fm = new FileManager("./ERPJava/database/txt.");
        fm.lerArquivo();
        // CriacaoEmpresa empresaC = new CriacaoEmpresa();
    }
}