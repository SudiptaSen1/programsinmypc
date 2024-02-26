package Inheritance;

public class Main extends Object {
    
    public static void main(String[] args) {
        SalariedEmployee mary=new SalariedEmployee("Mary", 15);
        System.out.println(mary);
        Employee sam=new Employee("Sam");
        System.out.println(sam);
        mary.terminate("31/31/2023");
    }
}
