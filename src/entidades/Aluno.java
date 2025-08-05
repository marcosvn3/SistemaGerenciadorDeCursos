package entidades;

import exceptions.InvalidoException;

//TODO O aluno precisa de uma matricula(id) que atualiza a cada nova instancia!!!
public class Aluno extends Usuario{

    public Aluno(String nome,String dataNascimento, String email,String senha) {
        super(nome,dataNascimento,email,senha);

    }

    @Override
    public String toString() {
        return "Aluno{" +super.toString()+'}';
    }
}
