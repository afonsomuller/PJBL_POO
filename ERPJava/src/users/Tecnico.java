package users;

import java.io.IOException;
import java.io.Serializable;

public class Tecnico extends Funcionario {
    private double valorVendido = 0;
    public Tecnico(String nomeDoFuncionario, double salario, int nivelDePermissao){
        super(nomeDoFuncionario, salario, nivelDePermissao);
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
