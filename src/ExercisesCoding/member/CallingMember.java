package ExercisesCoding.member;

public class CallingMember {
    public static void main(String[] args) {

        Employee employee = new Employee();
        employee.name = "Mia";
        employee.age = 25;
        employee.phoneNumber = "45865425";
        employee.address = "Address 12-4";
        employee.salary = 1500;
        employee.specialization = "Specialist";
        employee.printSalary();

        Manager manager = new Manager();
        manager.name = "Mary";
        manager.age = 33;
        manager.phoneNumber = "4343434";
        manager.address = "My Address 56-45";
        manager.salary = 2000;
        manager.department = "Sales department";
        manager.printSalary();

    }
}
