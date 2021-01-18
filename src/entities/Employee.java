package entities;

public class Employee {

    public String name;
    public double groosSalary;
    public double tax;

    public double netSalary(){
        return groosSalary - tax;
    }

    public void increaseSalary(double percentage){
        groosSalary += groosSalary * percentage / 100.00;
    }

    public String toString(){
        return name + " , $ " + String.format("%.2f" , netSalary());
    }


}
