package errors;

import type_system.Type;

public final class ArithmeticErrors {
    public static final class InvalidAdditionTypesError extends Exception {
        public InvalidAdditionTypesError(Type type1, Type type2) {
            super(String.format("אי אפשר להוסיף את הסוג %s לסוג %s", type1.getType(), type2.getType()));
        }
    }
}
