package management;

public class Director extends Manager {
    double budget;
    public Director(String name, String nationalInsuranceNumber, double salary, double budget, String department) {
        super(name, nationalInsuranceNumber, salary, department);
        this.budget = budget;
    }


    public double getBudget() {
        return budget;
    }
}
