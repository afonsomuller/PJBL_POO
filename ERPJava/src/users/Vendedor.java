package users;

public class Vendedor extends Funcionario {
    private double valorVendido;


    public Vendedor(String nomeDoFuncionario, double salario, double valorVendido, int nivelDePermissao){
        super(nomeDoFuncionario, salario, nivelDePermissao);
        this.valorVendido = valorVendido;

    }

    @Override
    public double comissao() {
        if(getNivelDePermissao() == 4) {
            return getSalario() * (this.valorVendido * 0.02);
        }
        else {
            return getSalario() + (this.valorVendido * 0.005);
        }
    }


    public double getValorVendido() {
        return valorVendido;
    }
    public void setValorVendido(double valorVendido) {
        this.valorVendido = valorVendido;
    }
    public void acumularValorVendido(double valorVendido){
        this.valorVendido += valorVendido;
    }

}
