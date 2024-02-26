package Inheritance;

public class Employee extends java.lang.Object {
    
    private String name;
    private long id;
    private static long employeeid=1;
    protected String endDate;

    public Employee(String name){
        this.name=name;
        this.id = Employee.employeeid++;
    }

    public double collectPay(){
        return 0.0;
    }
    public void terminate(String endDate){
        this.endDate=endDate;
    }

    public String toString(){
        return "Employee {"+name+"\\"+id+"}";
    }
}
