package type_system.primitives;

import java.util.ArrayList;
import java.util.List;

public abstract class MultiValuePrimitive<T> extends Primitive {
    protected final int length;
    protected ArrayList<T> values;

    @SafeVarargs
    public MultiValuePrimitive(T ... values) {
        this.values = (ArrayList<T>) List.of(values);
        this.length = this.values.size();
    }

    public int length() {
        return length;
    }
}
