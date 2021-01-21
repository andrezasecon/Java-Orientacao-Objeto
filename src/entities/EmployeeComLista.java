package entities;

public class EmployeeComLista {

    private Integer id;
    private String name;
    private Double Salary;

    public EmployeeComLista() {
    }

    public EmployeeComLista(Integer id, String name, Double salary) {
        this.id = id;
        this.name = name;
        Salary = salary;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalary() {
        return Salary;
    }

    public void setSalary(Double salary) {
        Salary = salary;
    }
}
