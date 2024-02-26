package Inheritance;

public class SalariedEmployee extends Employee{

    private double hourlyPay;

    public SalariedEmployee(String name,double hourlyPay){
        super(name);
        this.hourlyPay=hourlyPay;
    }
    
    @Override
    public double collectPay(){
        return 40*hourlyPay;
    }

    public double doublePay(){
        return 2*collectPay();
    }
    
    @Override
    public String toString(){
        return super.toString()+"SalariedEmployee"+"{"+hourlyPay+"}";
    }
}
