package errors;

import type_system.primitives.Type;

public final class ArithmeticErrors {
    public static final class InvalidAdditionTypesError extends Error {
        public InvalidAdditionTypesError(Type type1, Type type2) {
            super(String.format("אי אפשר להוסיף את הסוג %s לסוג %s", type1.getType(), type2.getType()));
        }
    }
}
