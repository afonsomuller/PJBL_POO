public class Vendedor extends Funcionario {
    private double valorVendido;
    public Vendedor(String nomeDoFuncionario, double salario, double valorVendido){
        super(nomeDoFuncionario, salario);
        this.valorVendido = valorVendido;
    }
    @Override
    public double comissao() {
        return getSalario() + (this.valorVendido * 0.005);
    }
}
