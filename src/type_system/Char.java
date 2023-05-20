package type_system;

import errors.ArithmeticErrors;

public class Char extends Primitive<Character> {
    public Char(final char c) {
        this.value = c;
    }

    public Primitive<?> add(Primitive<?> other) throws ArithmeticErrors.InvalidAdditionTypesError {
        if (other == null) return null;

        // Checking for concrete types:
        if (other instanceof Int) return this.add((Int) other);
        else if (other instanceof Char) return this.add((Char) other);
        else if (other instanceof Str) return this.add((Str) other);

        // All other types are invalid for addition:
        else throw new ArithmeticErrors.InvalidAdditionTypesError(this, other);
    }

    private Char add(Int num) {
        return new Char((char) (this.value + num.value));
    }

    private Char add(Char other) {
        return new Char((char) (this.value + other.value));
    }

    private Str add(Str str) {
        return new Str(String.format("%c%s", this.value, str.value));
    }

    @Override
    public String getType() {
        return "תו";
    }
}
