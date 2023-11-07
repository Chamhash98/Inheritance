public class Employee {
    double salary = 219957.86;
}
class Programmer extends Employee{

    int bonus = 45000;

    public static void main(String[] args) {
        Programmer p = new Programmer();
        System.out.println("Programmer salary: "+ p.salary);
        System.out.println("Programmer bonus: "+ p.bonus);
        double x = p.salary;
        double y = p.bonus;
        System.out.println("Programmer income: "+(x+y));
    }
}