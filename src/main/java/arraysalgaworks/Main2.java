package arraysalgaworks;

public class Main2 {
    public static void main(String[] args) {
        Turma turmaA = new Turma();
        turmaA.id = "1248755";
        turmaA.nome = "3°A";
        turmaA.nomeProfessor = "Jorge Alencar";
        turmaA.alunos = new Aluno[3];

        turmaA.alunos[0] = new Aluno();
        turmaA.alunos[1] = new Aluno();
        turmaA.alunos[2] = new Aluno();

        turmaA.alunos[0].nome = "Daniel";
        turmaA.alunos[0].idade = 15;
        turmaA.alunos[1].nome = "Letícia";
        turmaA.alunos[1].idade = 17;
        turmaA.alunos[2].nome = "Lais";
        turmaA.alunos[2].idade = 13;

        turmaA.listarInformacoesTurma();
    }
}
