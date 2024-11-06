package exercicio_2;

public class SenhaInvalidaException extends RuntimeException{
    private String message;

    public SenhaInvalidaException(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
