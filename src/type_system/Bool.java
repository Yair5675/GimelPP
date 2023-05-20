package type_system;

import errors.ArithmeticErrors;

public class Bool extends Primitive<Boolean> {
    public Bool(final boolean value) {
        this.value = value;
    }

    public Primitive<?> add(Primitive<?> other) throws ArithmeticErrors.InvalidAdditionTypesError {
        if (other == null) return null;

        // Checking for concrete types:
        if (other instanceof Bool) return this.add((Bool) other);
        else if (other instanceof Int) return this.add((Int) other);
        else if (other instanceof FloatingNumber) return this.add((FloatingNumber) other);
        else if (other instanceof Str) return this.add((Str) other);

        // For any other type addition is invalid:
        else throw new ArithmeticErrors.InvalidAdditionTypesError(this, other);
    }

    private Bool add(Bool other) {
        return this.or(other);
    }

    private Int add(Int num) {
        return new Int(num.value + (this.value ? 1 : 0));
    }

    private FloatingNumber add(FloatingNumber floatingNum) {
        return new FloatingNumber(floatingNum.value + (this.value ? 1 : 0));
    }

    private Str add(Str str) {
        return new Str(this.value + str.value);
    }

    public Bool not() {
        return new Bool(!this.value);
    }

    public Bool or(Bool other) {
        return new Bool(this.value || other.value);
    }

    public Bool and(Bool other) {
        return new Bool(this.value && other.value);
    }

    public Bool xor(Bool other) {
        return new Bool(this.value ^ other.value);
    }

    @Override
    public String getType() {
        return "בוליאני";
    }
}
