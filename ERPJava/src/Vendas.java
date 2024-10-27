import java.util.ArrayList;

public class Vendas {
    private double valorVenda;
    private String descricao;
    public Vendas(double valorVenda, String descricao) {
        this.valorVenda = valorVenda;
        this.descricao = descricao;
    }
    public double getValorVenda() {
        return valorVenda;
    }
    public void setValorVenda(double valorVenda) {
        this.valorVenda = valorVenda;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    ArrayList<Vendas> vendas = new ArrayList<Vendas>();
}
