public class Tecnico extends Funcionario {

    public Tecnico(String nomeDoFuncionario, double salario){
        super(nomeDoFuncionario, salario);
    }

    @Override
    public double comissao() {
        return 0;
    }
}
