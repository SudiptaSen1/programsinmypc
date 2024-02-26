public class ForChallenge {
    public static void main(String[] args) {
        
        for(double rate=7.5;rate<=10;rate+=0.25){
            // if(calculateInterest(100, rate)>8.5){
            //     break;
            // }
            System.out.println("$100 at " + rate +" % interest = $"+calculateInterest(100, rate));
        }
    }
    public static double calculateInterest(double amount,double rate) {

        return (amount*(rate/100));
        
    }
}
