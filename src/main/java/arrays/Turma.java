package arrays;

import java.util.Arrays;

public class Turma {
    String id;
    String nome;
    String nomeProfessor;
    Aluno[] alunos = new Aluno[0];

    //método para adicionar um novo aluno, descartando assim, a necessidade de informar o tamanho inicial do array
    void adicionarAluno(Aluno aluno) {
        this.alunos = Arrays.copyOf(this.alunos, this.alunos.length + 1);
        this.alunos[this.alunos.length - 1] = aluno;
    }

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
