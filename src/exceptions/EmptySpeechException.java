package exceptions;

public class EmptySpeechException extends Exception{
    public EmptySpeechException(String name) {
        super(name + " не может сказать ничего.");
    }
}
