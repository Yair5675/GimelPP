package errors;

public final class GeneralErrors {
    public static final class IndexError extends Error {
        public IndexError(int index) {
            super(String.format("האינדקס %d חורג מהתחום", index));
        }
    }
}
