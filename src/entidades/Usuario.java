package entidades;

import java.util.Objects;

abstract class Usuario {
    private String name;
    private String dataNascimento;
    private String email;

    public Usuario(String name, String dataNascimento, String email) {
        this.name = name;
        this.dataNascimento = dataNascimento;
        this.email = email;
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

    @Override
    public String toString() {
        return  "name='" + name + '\'' +
                ", dataNascimento='" + dataNascimento + '\'' +
                ", email='" + email + '\'';
    }
}
