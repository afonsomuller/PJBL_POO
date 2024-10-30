package users;

public class OperadorDeCaixa extends Funcionario {

    public OperadorDeCaixa(String nomeDoFuncionario, double salario) {
        super(nomeDoFuncionario, salario);
    }

    @Override
    public double comissao() {
        return 0;
    }
}
