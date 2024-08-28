
public class Universidade {
    
    private String nome;
    private String endereco;
    private String cnpj; 
    private int qtdSalas;

   
    public Universidade(String nome, String endereco, String cnpj, int qtdSalas) {
        this.nome = nome;
        this.endereco = endereco;
        this.cnpj = cnpj;
        this.qtdSalas = qtdSalas;
    }

    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    
    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

 
    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    
    public int getQtdSalas() {
        return qtdSalas;
    }

    public void setQtdSalas(int qtdSalas) {
        this.qtdSalas = qtdSalas;
    }

    
    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Endereço: " + endereco);
        System.out.println("CNPJ: " + cnpj);
        System.out.println("Quantidade de Salas: " + qtdSalas);
    }
}
