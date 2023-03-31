import java.util.Arrays;

public class Main {
    static Employee[] employee = new Employee[10];

    public static void main(String[] args) {

        employee[0] = new Employee("Andy Warhol", 1, 800);
        employee[1] = new Employee("Jean-Michel Basquiat", 1, 750);
        employee[2] = new Employee("Kurt Cobain", 2, 670);
        employee[3] = new Employee("Jared Leto", 2, 850);
        employee[4] = new Employee("Johnny Depp", 3, 950);
        employee[5] = new Employee("Angelina Jolie", 3, 600);
        employee[6] = new Employee("Mike Tyson", 4, 1000);
        employee[7] = new Employee("Muhammed Ali", 4, 1200);
        employee[8] = new Employee("Lionel Messi", 5, 870);
        employee[9] = new Employee("Kylian Mbappe", 5, 990);

//        employee[4]=null;
//        employee[5]=null;
//        employee[6]=null;
//        employee[7]=null;
//        employee[8]=null;
//        employee[9]=null;
//        employee[3]=null;

        totalSalary();
        System.out.println();
        printMaxSalary();
        System.out.println();
        printMinSalary();
        System.out.println();
        printAverages();
        System.out.println();
        printFullName();
        System.out.println();
        printAllData();
        System.out.println();
        printIdexingSalary();

    }


    public static void printAllData() {
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] == null) {
                continue;
            }

            System.out.println(employee[i].toString());
        }
    }

    public static void totalSalary() {
        float total = 0;
        for (Employee value : employee) {
            if (value == null) {
                continue;
            }
            total += value.getSalary();

        }
        System.out.println("Общие затраты на зарплаты в месяц составляет: " + total);
    }


    public static void printMaxSalary() {
        int max = 0;
        String nameEmpolee = null;
        for (Employee value : employee) {
            if (value == null) {
                continue;
            }
            if (max < value.getSalary()) {
                max = (int) value.getSalary();
                nameEmpolee = value.getFullName();
            }

        }
        System.out.println("Максимальная зп у " + nameEmpolee + " : " + max);
    }

    public static void printMinSalary() {
        float min = Float.MAX_VALUE;
        String nameEmpolee = null;
        for (Employee value : employee) {
            if (value == null) {
                continue;
            }
            if (min > value.getSalary()) {
                min = value.getSalary();
                nameEmpolee = value.getFullName();
            }
        }
        System.out.println("Минимальная зп у " + nameEmpolee + " : " + min);
    }

    public static void printAverages() {
        float total = 0;
        float averages;
        for (Employee value : employee) {
            if (value == null) {
                Employee.count--;
                continue;
            }
            total += value.getSalary();

        }
        averages = total / Employee.count;
        System.out.println("Средняя запрлата всех сотрудников: " + averages);
    }

    public static void printFullName() {
        for (Employee value : employee) {
            if (value == null) continue;
            System.out.println(value.getFullName());
        }
    }

    public static void printIdexingSalary() {
        System.out.println("Зарплата сотрудников после индексации составляет :");
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] == null) {
                continue;
            }
            float index = 10;
            float procent = employee[i].getSalary() / 100;
            float indexing = procent * index;
            employee[i].setSalary(indexing + employee[i].getSalary());
            System.out.println(employee[i].getFullName() + " " + ":" + " " + employee[i].getSalary());
        }

    }

}
