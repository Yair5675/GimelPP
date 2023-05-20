package type_system.primitives;


public class Array<T> extends MultiValuePrimitive<T> {

    @Override
    public String getType() {
        return "מערך";
    }
}
