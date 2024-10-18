public class Gerente extends Funcionario {

    public Gerente(String nomeDoFuncionario, double salario){
        super(nomeDoFuncionario, salario);
    }

    @Override
    public double comissao() {
        return getSalario() * 0.25;
    }
}
