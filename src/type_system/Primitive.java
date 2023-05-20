package type_system;

public abstract class Primitive<T> extends Type {
    protected T value;

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}
