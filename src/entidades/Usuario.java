package entidades;

import java.util.Objects;

abstract class Usuario {
    private String name;
    private String dataNascimento;
    private String email;
    private String senha;


    public Usuario(String name, String dataNascimento, String email,String senha) {
        this.name = name;
        this.dataNascimento = dataNascimento;
        this.email = email;
        this.senha = senha;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    @Override
    public String toString() {
        return  "name='" + name + '\'' +
                ", dataNascimento='" + dataNascimento + '\'' +
                ", email='" + email + '\'';
    }
}
