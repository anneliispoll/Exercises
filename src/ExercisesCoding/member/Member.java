package ExercisesCoding.member;

class Member {

    protected String name;
    protected int age;
    protected String phoneNumber;
    protected String address;
    int salary;

    public void printSalary() {
        System.out.println("Salary is: " + salary);
    }
}
class Employee extends Member {
    String specialization;
}
class Manager extends Member {
        String department;
}

