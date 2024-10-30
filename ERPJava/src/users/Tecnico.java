package users;

public class Tecnico extends Funcionario {
    private double valorVendido;
    public Tecnico(String nomeDoFuncionario, double salario, double valorVendido){
        super(nomeDoFuncionario, salario);
        this.valorVendido = valorVendido;
    }

    public double getValorVendido(){
        return valorVendido;
    }
    public void setValorVendido(double valorVendido){
        this.valorVendido = valorVendido;
    }
    public double getSalario() {
        return super.getSalario();
    }
    public void acumularValorVendido(){
        this.valorVendido += valorVendido;
    }
    @Override
    public double comissao() {
        return 0;
    }
}
