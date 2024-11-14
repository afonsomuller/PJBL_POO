package utilities;

import users.Vendedor;

import java.util.ArrayList;

public class Vendas {
    private static int IDVenda;
    private double valorVenda;
    private String descricao;
    private Vendedor vendedor;

    public Vendas(double valorVenda, String descricao, Vendedor vendedor) {
        IDVenda++;
        this.valorVenda = valorVenda;
        this.descricao = descricao;
        this.vendedor = vendedor;
    }

    private ArrayList<Vendas> vendas = new ArrayList<>();

    public int getIDVenda() {
        return IDVenda;
    }

    public static void setIDVenda(int IDVenda) {
        Vendas.IDVenda = IDVenda;
    }

    public double getValorVenda() {
        return valorVenda;
    }

    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public void addVenda(Vendas venda) {
        vendas.add(venda);
    }

    public ArrayList<Vendas> getVendas() {

        return vendas;
    }
    public String toString() {
        return "A venda " + IDVenda + " ficou no valor " + valorVenda + descricao;
    }
}

