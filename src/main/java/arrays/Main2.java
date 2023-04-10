package arrays;

public class Main2 {
    public static void main(String[] args) {
        Turma turmaA = new Turma();
        turmaA.id = "1248755";
        turmaA.nome = "3°A";
        turmaA.nomeProfessor = "Jorge Alencar";

        Aluno aluno1 = new Aluno();
        aluno1.nome = "Daniel";
        aluno1.idade = 15;

        Aluno aluno2 = new Aluno();
        aluno2.nome = "Letícia";
        aluno2.idade = 17;

        Aluno aluno3 = new Aluno();
        aluno3.nome = "Lais";
        aluno3.idade = 13;

        turmaA.adicionarAluno(aluno1);
        turmaA.adicionarAluno(aluno2);
        turmaA.adicionarAluno(aluno3);

        turmaA.listarInformacoesTurma();
    }
}
