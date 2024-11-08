import pages.CriacaoEmpresa;
import pages.MainWindow;
import users.*;
import utilities.FileManager;

import java.awt.desktop.ScreenSleepEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Empresa empresa = new Empresa("Onde Hoje?", "06109465000161"); 06109465000161

        FileManager fm = new FileManager("./ERPJava/database/Empresa.txt");
        List<String> dadosEmpresa = fm.lerArquivoEmpresa();
        if(dadosEmpresa.get(0) == null){
            CriacaoEmpresa empresaC = new CriacaoEmpresa();
        }
        else{
            Empresa empresa = new Empresa(dadosEmpresa.get(0), dadosEmpresa.get(1));
            System.out.println(empresa);
        }


        //Funcionario v = new Vendedor("Afonso", 2000, 0, 4);

        //empresa.addFuncionario(v);
        //for(Funcionario f: empresa.getFuncionarios()) {
            //if (f.getNivelDePermissao() == 4 || f.getNivelDePermissao() == 1) {
                //Vendas venda = new Vendas(2000, "Venda de 2 motores");
                //fm.escreverArquivoVendas();
            }
        }

 //   }
//}