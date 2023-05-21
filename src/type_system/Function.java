package type_system;

public class Function {
    private final String name;
    private final Parameter[] parameters;
    private final String returnType;

    public Function(String name, Parameter[] parameters, String returnType) {
        this.name = name;
        this.parameters = parameters;
        this.returnType = returnType;
    }


}
