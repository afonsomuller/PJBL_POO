package users;

import java.io.Serializable;

public class Vendedor extends Funcionario implements Serializable {
    private double valorVendido = 0;


    public Vendedor(String nomeDoFuncionario, double salario, int nivelDePermissao){
        super(nomeDoFuncionario, salario, nivelDePermissao);

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
    public void acumularValorVendido(double valorVendido) {
        this.valorVendido += valorVendido;
    }

}
