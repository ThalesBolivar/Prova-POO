package questao2;

public class Main {
    public static void main(String[] args) {
        // Criando um objeto do tipo Professor com os dados “mocados”
        Professor prof = new Professor("Thales", "thalesauguto@gmail.com", "123", 50f, 20);
        System.out.println(prof.mostraProfessor());

        // Criando um objeto do tipo Aluno com os dados “mocados”
        Aluno aluno = new Aluno("Helena", "helenazano@gmail.com", "helenalinda", 2, 5);
        System.out.println(aluno.mostraAluno());
    }
}