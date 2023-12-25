package exceptions;

import creatures.humans.Rachel;

public class UnexpectedStateException extends RuntimeException {
    public UnexpectedStateException(String message) {
        super(message);
    }
}
