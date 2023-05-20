package type_system;

public class Str extends Primitive<String> {
    public Str(final String value) {
        this.value = value;
    }

    @Override
    public String getType() {
        return "מחרוזת";
    }
}
