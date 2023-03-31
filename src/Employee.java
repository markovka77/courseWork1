

public class Employee {

    private final String fullName;
    private int department;
    private int salary;
    private int id;
    public static int count=0;

    public Employee (String fullName,int department,int salary){
        this.fullName=fullName;
        this.department=department;
        this.salary =salary;
        count++;
        this.id=count;

    }

    public String getFullName() {
        return fullName;
    }

    public int getDepartment() {
        return department;
    }

    public float getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(float salary) {this.salary = (int) salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "fullName='" + fullName + '\'' +
                ", department=" + department +
                ", salary=" + salary +
                ", id=" + id +
                '}';
    }



        }













