public class Pessoa {
    public String nome;
    public String endereco; 
   public String cpf;
    public  String rg;
    public String nasc;

    
    public Pessoa(String nome, String endereco, String cpf, String rg, String nasc) {
        this.nome = nome;
        this.endereco = endereco;
        this.cpf = cpf;
        this.rg = rg;
        this.nasc = nasc;
    }

    
    public Pessoa() {
        
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

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getNasc() {
        return nasc;
    }

    public void setNasc(String nasc) {
        this.nasc = nasc;
    }

   
    public void pessoaInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Endereço: " + endereco);
        System.out.println("CPF: " + cpf);
        System.out.println("RG: " + rg);
        System.out.println("Data de Nascimento: " + nasc);
    }
}
