package errors;

public abstract class Error extends Exception {
    public Error(String message) {
        super(message);
    }
}
