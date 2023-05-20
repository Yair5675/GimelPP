package type_system.primitives;

import errors.ArithmeticErrors;

public class FloatingNumber extends SingleValuePrimitive<Double> {
    public FloatingNumber(final double value) {
        this.value = value;
    }

    public SingleValuePrimitive<?> add(SingleValuePrimitive<?> other) throws ArithmeticErrors.InvalidAdditionTypesError {
        if (other == null) return null;

        // Checking concrete types:
        if (other instanceof Bool) return this.add((Bool) other);
        else if (other instanceof Int) return this.add((Int) other);
        else if (other instanceof FloatingNumber) return this.add((FloatingNumber) other);
        else if (other instanceof Str) return this.add((Str) other);

        // Only the types above are valid for addition with float, everything else is not:
        else throw new ArithmeticErrors.InvalidAdditionTypesError(this, other);
    }

    private FloatingNumber add(Bool bool) {
        return new FloatingNumber(this.value + (bool.value ? 1 : 0));
    }

    private FloatingNumber add(Int num) {
        return new FloatingNumber(this.value + num.value);
    }

    private FloatingNumber add(FloatingNumber other) {
        return new FloatingNumber(this.value + other.value);
    }

    private Str add(Str str) {
        return new Str(this.value + str.value);
    }

    @Override
    public String getType() {
        return "צף";
    }
}
