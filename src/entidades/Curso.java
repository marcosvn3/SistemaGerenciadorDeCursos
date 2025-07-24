package entidades;

import java.util.List;

public class Curso {

    private String nome;
    private String descricao;
    private List<Aluno> alunos;


    /***
     * @author Cadastra um aluno ao curso.
     * @param aluno
     */
    public void cadastrarAluno(Aluno aluno){
        alunos.add(aluno);
        System.out.println("Aluno cadastrado com sucesso!");
    }

    public void removerAluno(Aluno aluno){
        alunos.remove(aluno);
        System.out.println("Aluno removido com sucesso!");
    }

    public void listarAlunos(){
        for(Aluno aluno: alunos){
            System.out.println(aluno);
        }
    }
}
