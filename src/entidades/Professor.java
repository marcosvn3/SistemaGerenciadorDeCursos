package entidades;

import exceptions.InvalidoException;

import java.util.ArrayList;
import java.util.List;

public class Professor extends Usuario{

    private String departamento;
    private List<Curso> cursoList =  new ArrayList<>();

    public Professor(String name, String dataNascimento, String email,String departamento) {
        super(name, dataNascimento, email);
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public List<Curso> getCursoList() {
        return cursoList;
    }

    public void criarCurso(Curso curso){
        if(curso != null){
            cursoList.add(curso);
            System.out.println("Curso criado com sucesso");
        }else{
            throw new InvalidoException("Crie um curso Válido!");
        }

    }


}
