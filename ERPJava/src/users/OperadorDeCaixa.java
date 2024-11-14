package users;

import java.io.IOException;
import java.io.Serializable;

public class OperadorDeCaixa extends Funcionario {

    public OperadorDeCaixa(String nomeDoFuncionario, double salario, int nivelDePermissao) {
        super(nomeDoFuncionario, salario, nivelDePermissao);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public double comissao() {
        return 0;
    }

}
