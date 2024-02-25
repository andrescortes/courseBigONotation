package algorithm.functional;

public class Employ extends Person {

    private float salary;

    public Employ(String name, int age, float salary) {
        super(name, age);
        this.salary = salary;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employ{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", salary=" + salary +
                '}';
    }
}
