package users;

public class OperadorDeCaixa extends Funcionario {

    public OperadorDeCaixa(String nomeDoFuncionario, double salario, int nivelDePermissao) {
        super(nomeDoFuncionario, salario, nivelDePermissao);
    }

    @Override
    public double comissao() {
        return 0;
    }
}
