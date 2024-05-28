public class Employee {
    String name;
    int salary;
    int Id;

    public Employee(String name, int Id) {
        this.name = name;
        this.Id = Id;
    }

    public void show() {
        System.out.println("name:" + this.name);
        System.out.println("Id: " + this.Id);
    }

    public double calculated(double salary) {
        return salary * 12.0;
    }
    public static void main(String[] args) {
        Employee em = new Employee("Anwar", 1);
        double Wage = em.calculated(15000.0);
        System.out.println("Salary:" + Wage);
        em.show();
    }
}



