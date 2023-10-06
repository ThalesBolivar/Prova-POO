package questao2;

public class Aluno extends Pessoa {
    private int periodo;
    private int turma;

    public Aluno(String nome, String email, String senha, int periodo, int turma) {
        super(nome, email, senha);
        this.periodo = periodo;
        this.turma = turma;
    }

    // Getters and setters

    public String mostraAluno() {
        return "Nome: " + getNome() + "\nEmail: " + getEmail() + "\nPeriodo: " + periodo + "\nTurma: " + turma;
    }
}
