package type_system;

public class FloatingNumber extends Primitive<Double> {
    public FloatingNumber(final double value) {
        this.value = value;
    }

    @Override
    public String getType() {
        return "צף";
    }
}
