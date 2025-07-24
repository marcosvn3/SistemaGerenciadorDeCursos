package exceptions;

public class CursoNaoEncontrado extends RuntimeException {
    public CursoNaoEncontrado(String message) {
        super(message);
    }
}
