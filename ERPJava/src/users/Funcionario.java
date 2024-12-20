package users;

import com.sun.source.tree.LabeledStatementTree;

import java.io.*;

public abstract class Funcionario {
    private String nomeDoFuncionario;
    private double salario;
    private int nivelDePermissao;

    public Funcionario(String nomeDoFuncionario, double salario, int nivelDePermissao){
        this.nomeDoFuncionario = nomeDoFuncionario;
        this.salario = salario;
        this.nivelDePermissao = nivelDePermissao;
    }

    @Override
    public String toString(){
        return "Nome do funcionário: " + nomeDoFuncionario + " Salário: " + salario;
    }
    public String getNomeDoFuncionario() {
        return nomeDoFuncionario;
    }

    public int getNivelDePermissao() {
        return nivelDePermissao;
    }

    public double getSalario() {
        return salario;
    }

    public void setNomeDoFuncionario(String nomeDoFuncionario) {
        this.nomeDoFuncionario = nomeDoFuncionario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public abstract double comissao();



}


