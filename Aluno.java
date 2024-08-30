public class Aluno extends Pessoa {
    private String ra;
    private String aulas;
    private String curso;
    private int faltas;


    public Aluno() {
        super();
    }

    
    public Aluno(String nome, String endereco, String cpf, String rg, String nasc,
                 String ra, String aulas, String curso, int faltas) {
        super(nome, endereco, cpf, rg, nasc); 
        this.ra = ra;
        this.aulas = aulas;
        this.curso = curso;
        this.faltas = faltas;
    }

    
    public String getRa() {
        return ra;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }

    public String getAulas() {
        return aulas;
    }

    public void setAulas(String aulas) {
        this.aulas = aulas;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public int getFaltas() {
        return faltas;
    }

    public void setFaltas(int faltas) {
        this.faltas = faltas;
    }
    public void alunoInformacoes() {
        System.out.println("Ra: " + ra);
        System.out.println("Curso:" + curso);
        System.out.println("Aulas:"+aulas);
        System.out.println("Faltas: " + faltas);
        System.out.println("Nome: " + nome);
        System.out.println("Endereço: " + endereco);
        System.out.println("CPF: " + cpf);
        System.out.println("RG: " + rg);
        System.out.println("Data de Nascimento: " + nasc);
       
    }
}
