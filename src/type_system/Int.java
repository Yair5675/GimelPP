package type_system;

public class Int extends Primitive<Integer> {
    public Int(final int value) {
        this.value = value;
    }

    @Override
    public String getType() {
        return "שלם";
    }
}
