public class Programa2 {
    public static void main(String[] args) {
        
        Atleta atleta = new Atleta();

        atleta.setNome("Neymar");
        atleta.setPais("Brasil");
        atleta.setMedalhas(1);
        
        System.out.println("Nome do atleta: " + atleta.getNome());
        System.out.println("Pais: " + atleta.getPais());
        System.out.println("Medalhas: " + atleta.getMedalhas());
    }
}
