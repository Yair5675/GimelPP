package type_system.primitives;

public abstract class SingleValuePrimitive <T> extends Primitive {
    protected T value;

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}
