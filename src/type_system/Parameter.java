package type_system;

import type_system.primitives.Type;

public record Parameter(String name, String type) {
    /**
     * Checks whether the given value's type is valid for the current parameter.
     */
    public boolean isValidValue(Type type) {
        return this.type.equals(type.getType());
    }
}
