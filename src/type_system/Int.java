package type_system;

import errors.ArithmeticErrors;

public class Int extends Primitive<Integer> {
    public Int(final int value) {
        this.value = value;
    }

    /**
     * Addition for Int and primitive types.
     */
    public Primitive<?> add(Primitive<?> other) throws ArithmeticErrors.InvalidAdditionTypesError {
        if (other == null) return null;

        // Checking the concrete type:
        if (other instanceof Bool) return this.add((Bool) other);
        else if (other instanceof Int) return this.add((Int) other);
        else if (other instanceof FloatingNumber) return this.add((FloatingNumber) other);
        else if (other instanceof Char) return this.add((Char) other);
        else if (other instanceof Str) return this.add((Str) other);

        // If the given type is not one of the types above, throw an error:
        else throw new ArithmeticErrors.InvalidAdditionTypesError(this, other);
    }

    private Int add(Bool bool) {
        return new Int(this.value + (bool.value ? 1: 0));
    }

    private Int add(Int other) {
        return new Int(this.value + other.value);
    }

    private FloatingNumber add(FloatingNumber floatingNum) {
        return new FloatingNumber(this.value + floatingNum.value);
    }

    private Char add(Char c) {
        return new Char((char) (this.value + c.value));
    }

    private Str add(Str str) {
        return new Str(String.format("%d%s", this.value, str.value));
    }

    @Override
    public String getType() {
        return "שלם";
    }
}
