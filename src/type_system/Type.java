package type_system;

public abstract class Type {
    private boolean isPrimitive;
    public abstract String getType();

    public boolean isPrimitive() {
        return this.isPrimitive;
    }
}
