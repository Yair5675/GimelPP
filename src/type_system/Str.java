package type_system;

import errors.ArithmeticErrors;

public class Str extends Primitive<String> {
    public Str(final String value) {
        this.value = value;
    }

    public Str add(Primitive<?> other) throws ArithmeticErrors.InvalidAdditionTypesError {
        // Addition with Str is valid for all primitive types except Array:
        if (other instanceof Array<?>)
            throw new ArithmeticErrors.InvalidAdditionTypesError(this, other);
        return new Str(this.value + other.value);
    }

    @Override
    public String getType() {
        return "מחרוזת";
    }
}
