package type_system;

public class Array<T extends Primitive<?>> extends Primitive<T[]> {

    public Array(T ... values) {
        this.value = values;
    }

    @Override
    public String getType() {
        return "מערך";
    }
}
