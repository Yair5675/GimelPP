package type_system;

public class Char extends Primitive<Character> {
    public Char(final char c) {
        this.value = c;
    }

    @Override
    public String getType() {
        return "תו";
    }
}
