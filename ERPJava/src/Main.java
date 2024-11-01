import pages.MainWindow;
import users.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Empresa empresa = new Empresa("Onde Hoje?", "06109465000161");
    Funcionario v = new Vendedor("Afonso", 2000, 0, 4);
    Funcionario v2 = new Vendedor("Ana", 2000, 0, 1);
    empresa.addFuncionario(v);
    empresa.addFuncionario(v2);
    for(Funcionario f: empresa.getFuncionarios()) {
        if (f.getNivelDePermissao() == 4 || f.getNivelDePermissao() == 1) {
            Vendas venda = new Vendas(2000, "Venda de 2 motores");
            System.out.println(venda);
        }
    }

    }
}