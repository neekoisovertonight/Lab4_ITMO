package exceptions;

public class NegativeFatigueException extends RuntimeException {
    public NegativeFatigueException(String message) {
        super(message);
    }
}