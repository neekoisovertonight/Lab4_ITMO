package exceptions;

public class NoClothesException extends Exception {
    public NoClothesException(String name) {
        super(name + " не может надеть ничего.");
    }
}

