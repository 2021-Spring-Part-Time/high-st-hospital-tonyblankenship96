package hospital;

public class Surgeon extends Doctor{

    private boolean isOperating;


    public Surgeon(String employeeNumber, String name, String specialty, boolean isOperating) {
        super(employeeNumber, name, specialty);
        this.isOperating = isOperating;
    }

    @Override
    public int calculatePay() {
        return 100000;
    }
}
