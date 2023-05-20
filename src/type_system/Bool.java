package type_system;

public class Bool extends Primitive<Boolean> {
    public Bool(final boolean value) {
        this.value = value;
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
