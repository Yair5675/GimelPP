package type_system;

public class Int extends Primitive<Integer> {
    public Int(final int value) {
        this.value = value;
    }

    /**
     * Addition for Int and primitive types.
     */
    public Type add(Primitive<?> other) {
        if (other == null) return null;

        // Checking the concrete type:
        if (other instanceof Bool) return this.add((Bool) other);
        if (other instanceof Int) return this.add((Int) other);
        if (other instanceof FloatingNumber) return this.add((FloatingNumber) other);
        if (other instanceof Char) return this.add((Char) other);
        if (other instanceof Str) return this.add((Str) other);

        // The function should never reach here, if function returns null this might be the reason:
        return null;
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
