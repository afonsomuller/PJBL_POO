import users.Funcionario;
import users.Vendedor;

import java.util.ArrayList;

public class Empresa {
    private String nomeDaEmpresa;
    private String CNPJ;

    public Empresa(String nomeDaEmpresa, String CNPJ){
        this.nomeDaEmpresa = nomeDaEmpresa;
        this.CNPJ = CNPJ;
    }
    private ArrayList<Funcionario> funcionarios = new ArrayList<>();
    private ArrayList<Empresa>empresas  = new ArrayList<>();

    @Override
    public String toString() {
        return "Empresa: " + nomeDaEmpresa + " CNPJ: " + CNPJ;
    }

    public String getNomeDaEmpresa() {
        return nomeDaEmpresa;
    }

    public String getCNPJ() {
        return CNPJ;
    }

}

