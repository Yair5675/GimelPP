package errors;

public final class GeneralErrors {
    public static final class IndexError extends Exception {
        public IndexError(int index) {
            super(String.format("האינדקס %d חורג מהתחום", index));
        }
    }
}
