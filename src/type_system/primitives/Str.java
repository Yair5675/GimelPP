package type_system.primitives;

import errors.ArithmeticErrors;

public class Str extends SingleValuePrimitive<String> {
    public Str(final String value) {
        this.value = value;
    }

    public Str add(SingleValuePrimitive<?> other) {
        return new Str(this.value + other.value);
    }

    @Override
    public String getType() {
        return "מחרוזת";
    }
}
