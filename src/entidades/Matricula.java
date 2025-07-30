package entidades;

public class Matricula {
    private static int matricula = 1;

    public static void atualizarMatricula(){
        matricula++;
    }

    public static int getMatricula() {
        return matricula;
    }

    public static void setMatricula(int matricula) {
        Matricula.matricula = matricula;
    }
}
