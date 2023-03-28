import java.util.Arrays;

import static java.lang.Float.MAX_VALUE;
import static java.lang.Float.MIN_VALUE;

public class Main {
    static Employee[] employee = new Employee[6];

    public static void main(String[] args) {

        employee[0] = new Employee("Andy Warhol", 1, 800);
        employee[1] = new Employee("Jean-Michel Basquiat", 1, 750);
        employee[2] = new Employee("Kurt Cobain", 2, 500);
        employee[3] = new Employee("Jared Leto", 2, 900);
        employee[4] = new Employee("Johnny Depp", 3, 950);
        employee[5] = new Employee("Angelina Jolie", 3, 600);
        printAllData();
        calcPrintTotalSalary();
        minExpenses();


    }

    public static void minExpenses() {
        for (float i =0; i< employee.length-1;i++) {
            while (Employee.salary>i) {
                if(Employee.salary<i){
                    break;
                }
            }
            System.out.println(i);

        }

    }


    public static void calcPrintTotalSalary() {
        float sum = 0;
        for (Employee i : employee)
            sum += i.salary;
        System.out.println(sum);
    }


    public static void printAllData() {
        for (int i = 0; i < 6; i++) {
            System.out.println(employee[i].toString());
        }
    }


}
