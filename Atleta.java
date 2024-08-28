public class Atleta {
    private String nome;
    private String Pais;
    private int Medalhas;
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getPais() {
        return Pais;
    }
    public void setPais(String pais) {
        Pais = pais;
    }
    public int getMedalhas() {
        return Medalhas;
    }
    public void setMedalhas(int medalhas) {
        Medalhas = medalhas;
    }
public void exibirInformacoes() {
    System.out.println("Nome: " + nome);
    System.out.println("Pais: " + Pais);
    System.out.println("Medalhas " + Medalhas);
    
}
}

