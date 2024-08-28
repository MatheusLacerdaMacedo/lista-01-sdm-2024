public class PessoaFisica {
    // Atributos privados
    private String nome;
    private String cep;
    private String rg;
    private String cpf;
    private String profissao;

    // Construtor vazio
    public PessoaFisica() {
    }

    // Construtor com todos os atributos
    public PessoaFisica(String nome, String cep, String rg, String cpf, String profissao) {
        this.nome = nome;
        this.cep = cep;
        this.rg = rg;
        this.cpf = cpf;
        this.profissao = profissao;
    }

    // Métodos get e set para o atributo nome
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    // Métodos get e set para o atributo cep
    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    // Métodos get e set para o atributo rg
    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    // Métodos get e set para o atributo cpf
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    // Métodos get e set para o atributo profissão
    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    // Método toString para exibir informações da pessoa
    @Override
    public String toString() {
        return "PessoaFisica{" +
               "nome='" + nome + '\'' +
               ", cep='" + cep + '\'' +
               ", rg='" + rg + '\'' +
               ", cpf='" + cpf + '\'' +
               ", profissao='" + profissao + '\'' +
               '}';
    }
}

public void exibirInformacoes() {
    System.out.println("Nome: " + nome);
    System.out.println("Pais: " + Pais);
    System.out.println("CEP: " + cep);
    System.out.println("CPF: " + cpf);
    System.out.println("Profissão:  " + profissão);
    
}

