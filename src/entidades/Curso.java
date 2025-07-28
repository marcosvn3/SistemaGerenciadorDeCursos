package entidades;

import exceptions.InvalidoException;
import exceptions.NaoEncontradoException;

import java.util.List;

public class Curso {

    private String nome;
    private String descricao;
    private List<Aluno> alunos;

    public Curso(String nomeCurso, String descricao) {
        this.nome = nomeCurso;
        this.descricao = descricao;
    }

    /***
     * @author Cadastra um aluno ao curso.
     * @param aluno
     */
    public void cadastrarAluno(Aluno aluno){
        if(aluno == null){
            alunos.add(aluno);
            System.out.println("Aluno cadastrado com sucesso!");
        }else{
            throw new InvalidoException("Cadastre um aluno valido!");
        }

    }

    public void removerAluno(Aluno aluno) throws Exception{
        if(alunos.contains(aluno)){
            alunos.remove(aluno);
            System.out.println("Aluno removido com sucesso!");
        }else{
            throw new NaoEncontradoException("Aluno não encontrado!");
        }
    }

    public void listarAlunos(){
        for(Aluno aluno: alunos){
            System.out.println(aluno);
        }
    }


    @Override
    public String toString() {
        return "Curso = "+ nome +", descricao=" + descricao;
    }
}
