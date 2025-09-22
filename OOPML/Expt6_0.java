import java.util.*;

class Employee implements Comparable<Employee> {
    private String eName;
    private int eId;
    private double eSalary;

    public Employee(String eName, int eId, double eSalary) {
        this.eName = eName;
        this.eId = eId;
        this.eSalary = eSalary;
    }

    public String getEName() {
        return eName;
    }

    public int getEId() {
        return eId;
    }

    public double getESalary() {
        return eSalary;
    }

    @Override
    public int compareTo(Employee other) {
        return Double.compare(this.eSalary, other.eSalary);
    }

    @Override
    public String toString() {
        return "[ID: " + eId + ", Name: " + eName + ", Salary: " + eSalary + "]";
    }
}

class EmployeeManager {
    private List<Employee> employees;

    public EmployeeManager() {
        employees = new ArrayList<>();
    }

    public void create(List<Employee> empList) {
        employees.addAll(empList);
        Collections.sort(employees);
    }

    public void insert(Employee emp) {
        int index = Collections.binarySearch(employees, emp);
        if (index < 0) {
            index = -(index + 1);
        }
        employees.add(index, emp);
    }
    
    public void deleteByEName(String name) {
        Iterator<Employee> iterator = employees.iterator();
        boolean found = false;
        while (iterator.hasNext()) {
            if (iterator.next().getEName().equalsIgnoreCase(name)) {
                iterator.remove();
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Employee with name " + name + " not found.");
        }
    }

    public void deleteByEId(int id) {
        boolean removed = employees.removeIf(employee -> employee.getEId() == id);

        if (!removed) {
            System.out.println("Employee with ID " + id + " not found.");
        }
    }

    public void displayAll() {
        if (employees.isEmpty()) {
            System.out.println("No employees to display.");
            return;
        }
        for (Employee e : employees) {
            System.out.println(e);
        }
    }
}

public class Expt6_0 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            EmployeeManager manager = new EmployeeManager();

            System.out.print("Enter number of employees to create: ");
            int n = sc.nextInt();
            sc.nextLine();

            List<Employee> empList = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                System.out.println("Enter Employee " + (i + 1) + " details:");
                
                System.out.print("Name: ");
                String name = sc.nextLine(); 

                System.out.print("ID: ");
                int id = sc.nextInt();

                System.out.print("Salary: ");
                double salary = sc.nextDouble();
                sc.nextLine();

                empList.add(new Employee(name, id, salary));
            }

            manager.create(empList);
            System.out.println("\n--- Employees after Create() ---");
            manager.displayAll();

            System.out.println("\nEnter details of Employee to Insert:");
            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("ID: ");
            int id = sc.nextInt();

            System.out.print("Salary: ");
            double salary = sc.nextDouble();
            sc.nextLine();

            manager.insert(new Employee(name, id, salary));
            System.out.println("\n--- After Insert() ---");
            manager.displayAll();

            System.out.print("\nEnter name of Employee to delete: ");
            String delName = sc.nextLine();
            manager.deleteByEName(delName);
            System.out.println("\n--- After deleteByEName() ---");
            manager.displayAll();

            System.out.print("\nEnter ID of Employee to delete: ");
            int delId = sc.nextInt();
            sc.nextLine();

            manager.deleteByEId(delId);
            System.out.println("\n--- After deleteByEId() ---");
            manager.displayAll();
        }
    }
}

