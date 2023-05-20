package type_system;

public class Array<T extends Primitive<?>> extends Primitive<T[]> {

    @SafeVarargs
    public Array(T ... values) {
        this.value = values;
    }

    @Override
    public String getType() {
        return null;
    }
}
