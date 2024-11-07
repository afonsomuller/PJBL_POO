package utilities;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Arrays;
import java.util.List;


public class FileManager {
    private final String caminhoArquivo;

    public FileManager(String caminhoArquivo) {
        this.caminhoArquivo = caminhoArquivo;
    }
    public void lerArquivo(){
        try {
            FileReader arquivo = new FileReader(caminhoArquivo);
            BufferedReader br = new BufferedReader(arquivo);
            String cabecalho = br.readLine();
            System.out.println(cabecalho);
            while (br.ready()) {
                String dado = br.readLine();
                String[] dados = dado.split(",");
                List<String> dadoTratado = Arrays.asList(dados);
                System.out.println("ID da Venda: " + dadoTratado.get(0));
                System.out.println("Valor da Venda: " + dadoTratado.get(1));
                System.out.println("Descrição da Venda: " + dadoTratado.get(2));
            }
        }
        catch(Exception e){
            System.out.println("Erro ao ler o arquivo");
        }
    }

    public void escreverArquivo(){
        File arquivo = new File(caminhoArquivo);
        try{
            FileWriter fileWriter = new FileWriter(arquivo, true);
        }
        catch(Exception e){
            System.out.println("Erro ao escrever o arquivo");
        }
    }

}
