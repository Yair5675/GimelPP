package type_system.primitives;

import errors.GeneralErrors;

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

    public T get(final int index) throws GeneralErrors.IndexError {
        if (index >= this.length)
            throw new GeneralErrors.IndexError(index);
        return this.values.get(index);
    }

    public void set(final int index, T value) throws GeneralErrors.IndexError {
        if (index >= this.length)
            throw new GeneralErrors.IndexError(index);
        this.values.set(index, value);
    }
}
