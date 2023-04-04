package arraysalgaworks;

public class Turma {
    String id;
    String nome;
    String nomeProfessor;
    Aluno[] alunos;

    public void listarInformacoesTurma(){
        System.out.printf("Turma: %s (%s)%n", this.nome, this.id);
        System.out.printf("Professor(a): %s%n", this.nomeProfessor);
        System.out.println("alunos:");

        for (int i = 0; i < alunos.length; i++) {
            Aluno aluno = this.alunos[i];

            if (aluno != null) {
                System.out.printf("%d - %s (%d anos)%n", i + 1, aluno.nome, aluno.idade);
            }
        }

    }
}
