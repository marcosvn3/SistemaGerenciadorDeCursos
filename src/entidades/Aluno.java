package entidades;

import exceptions.InvalidoException;

//TODO O aluno precisa de uma matricula(id) que atualiza a cada nova instancia!!!
public class Aluno extends Usuario{

    public Aluno(String nome,String dataNascimento, String email,String senha) {
        super(nome,dataNascimento,email,senha);

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
    public String toString() {


        return "Aluno{" +super.toString()+'}';
    }
}
