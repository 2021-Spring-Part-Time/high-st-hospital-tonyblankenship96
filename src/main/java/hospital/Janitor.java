package hospital;

public class Janitor extends Administrator{

    private boolean isCleaning;

    public Janitor(String employeeNumber, String name, String department, boolean isCleaning) {
        super(employeeNumber, name, department);
        this.isCleaning = isCleaning;
    }

    @Override
    public int calculatePay() {
        return 50000;
    }
}
