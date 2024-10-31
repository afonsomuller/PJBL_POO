import users.Funcionario;
import users.Tecnico;
import users.Vendedor;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Funcionario> funcionarios = new ArrayList<>(){
            Funcionario v = new Vendedor("Afonso", 2500, 0, 4);
            Funcionario t = new Tecnico("Gabriel", 2000, 0, 1);
        };
    

    for(Funcionario f: funcionarios) {
        if (f.getNivelDePermissao() == 4 || f.getNivelDePermissao() == 1) {
            Vendas venda1 = new Vendas(2000, "Venda de 2 motores");
            System.out.println(venda1);
        }
    }


    }
}