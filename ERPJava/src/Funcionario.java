public abstract class Funcionario {
    private String nomeDoFuncionario;
    private double salario;

    public Funcionario(String nomeDoFuncionario, double salario){
        this.nomeDoFuncionario = nomeDoFuncionario;
        this.salario = salario;
    }

    public String getNomeDoFuncionario() {
        return nomeDoFuncionario;
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
