import java.util.ArrayList;

public class Vendas {
    private static int IDVenda = 0;
    private double valorVenda;
    private String descricao;

    public Vendas(double valorVenda, String descricao) {
        this.IDVenda++;
        this.valorVenda = valorVenda;
        this.descricao = descricao;
    }
    public String toString() {
        return "A venda " + IDVenda + " ficou no valor " + valorVenda;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    ArrayList<Vendas> vendas = new ArrayList<Vendas>();
}
