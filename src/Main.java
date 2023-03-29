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


        printAllData();
        totalSalary();
        printMaxSalary();
        printMinSalary();
        printAverages();
        printFullName();


    }


    public static void printAllData() {
        for (int i = 0; i < 6; i++) {
            System.out.println(employee[i].toString());
        }
    }

    public static void totalSalary() {
        float total = 0;
        for (Employee value : employee) {
            total += value.getSalary();

        }
        System.out.println("Общие затраты на зарплаты в месяц составляет: " + total);
    }


    public static void printMaxSalary() {
        float max = 0;
        String nameEmpolee = null;
        for (Employee value : employee) {
            if (max < value.getSalary()) {
                max = value.getSalary();
                nameEmpolee = value.getFullName();
            }

        }
        System.out.println("Максимальная зп у "+ nameEmpolee+" : "+max);
    }

    public static void printMinSalary() {
        float min = Float.MAX_VALUE;
        String nameEmpolee = null;
        for (Employee value : employee) {
            if (min > value.getSalary()) {
                min = value.getSalary();
                nameEmpolee = value.getFullName();
            }
        }
        System.out.println("Минимальная зп у " + nameEmpolee +" : "+ min);
    }

    public static void printAverages() {
        float total = 0;
        float averages;
        for (Employee value : employee) {
            total += value.getSalary();

        }
        averages = total / employee.length;
        System.out.println("Средняя запрлата всех сотрудников: " + averages);
    }

    public static void printFullName(){
        for (Employee value:employee) {
            System.out.println(value.getFullName());
        }
    }

}
