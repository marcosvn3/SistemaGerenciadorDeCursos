package entidades;

import exceptions.InvalidoException;

import java.util.Objects;

public class Aluno extends Usuario{

    private Long matricula;

    public Aluno(String nome,String dataNascimento, String email,Long matricula) {
        super(nome,dataNascimento,email);
        this.matricula = matricula;
    }

    public Long getMatricula() {
        return matricula;
    }

    public void setMatricula(Long matricula) {
        this.matricula = matricula;
    }

    /***
     * @param curso
     */
    public void inscreverCurso(Curso curso){
        if(curso != null){
            curso.cadastrarAluno(this);
        }else{
            throw new InvalidoException("Se inscreva em um curso válido!");
        }

    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Aluno aluno = (Aluno) o;
        return Objects.equals(matricula, aluno.matricula);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), matricula);
    }

    @Override
    public String toString() {


        return "Aluno{" +super.toString()+
                "matricula=" + matricula +
                '}';
    }
}
