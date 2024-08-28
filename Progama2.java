public class Programa2 {
    public static void main(String[] args) {
        
        PessoaFisica pessoafisica = new PessoaFisica();

        pessoafisica.setNome("Matheus");
        pessoafisica.setcep("30380-474");
        pessoafisica.setrg("MG-20.567.716");
        pessoafisica.setcpf("165.516.816");
        pessoafisica.setprofissao("Uber");
        
        PessoaFisica.exibirInformacoes();
    }
}