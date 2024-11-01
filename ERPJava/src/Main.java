import pages.MainWindow;
import users.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Funcionario> funcionarios = new ArrayList<>();

    for(Funcionario f: funcionarios) {
        if (f.getNivelDePermissao() == 4 || f.getNivelDePermissao() == 1) {
            Vendas venda1 = new Vendas(2000, "Venda de 2 motores");
            System.out.println(venda1);
        }
    }
       MainWindow pagina = new MainWindow();
    }
}