public class Empresa {
    private String nomeDaEmpresa;
    private String CNPJ;

    public Empresa(String nomeDaEmpresa, String CNPJ){
        this.nomeDaEmpresa = nomeDaEmpresa;
        this.CNPJ = CNPJ;
    }

    public String getNomeDaEmpresa() {
        return nomeDaEmpresa;
    }

    public String getCNPJ() {
        return CNPJ;
    }

    public void setNomeDaEmpresa(String nomeDaEmpresa) {
        this.nomeDaEmpresa = nomeDaEmpresa;
    }

    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }
}

