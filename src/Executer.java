import errors.Error;

public class Executer {
    private static Executer INSTANCE = null;

    private Executer() {
    }

    public static Executer getInstance() {
        if (INSTANCE == null)
            INSTANCE = new Executer();
        return INSTANCE;
    }

    public Error execute() {
        // TODO: 21/05/2023 Complete the function after parsing is complete
        return null;
    }
}
