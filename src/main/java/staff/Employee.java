package staff;

public abstract class Employee {
    String name;
    String nationalInsuranceNumber;
    double salary;


    public String getName() {
        return name;
    }

    public String getNationalInsuranceNumber() {
        return nationalInsuranceNumber;
    }

    public double getSalary() {
        return salary;
    }

    public void raiseSalary(double amount){
        this.salary += amount;
    }

    public double payBonus(){
        return this.salary * 0.01;

    }


    public void addBonus(){
        double bonus = payBonus();
        System.out.println(bonus);
//        this.salary + bonus;
    }




}
