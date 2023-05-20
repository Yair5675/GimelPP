package type_system;

public class Bool extends Primitive<Boolean> {
    public Bool(final boolean value) {
        this.value = value;
    }

    @Override
    public String getType() {
        return "בוליאני";
    }
}
