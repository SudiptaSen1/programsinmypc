public class NumberOfDaysInMonth {
    public static void main(String[] args) {

        System.out.println(getDaysInMonth(-1,2020));

    }
    public static boolean isLeapYear(int year){

        if(year>=1 && year<=9999){
            if(year%400==0||(year%100!=0 && year%4==0)){

                return true;

            }else{

                return false;

            }
        }else{

            return false;
            
        }

    }
    public static int getDaysInMonth(int month,int year){
        int result = -1;
        if(year>=1 && year<=9999){
            if(month>=1 && month<=12){
                if(isLeapYear(year) == true){
                    switch(month){
                        case 1 :
                            result = 31;
                            break;
                        case 2 :
                            result = 29;
                            break;
                        case 3 :
                            result = 31;
                            break;
                        case 4 :
                            result = 30;
                            break;
                        case 5 :
                            result = 31;
                            break;
                        case 6 :
                            result = 30;
                            break;
                        case 7 :
                            result = 31;
                            break;
                        case 8 :
                            result = 31;
                            break;
                        case 9 :
                            result = 30;
                            break;
                        case 10 :
                            result = 31;
                            break;
                        case 11 :
                            result = 30;
                            break;
                        default : result = 31;
                    }
                }else{
                    switch(month){
                        case 1 :
                            result = 31;
                            break;
                        case 2 :
                            result = 28;
                            break;
                        case 3 :
                            result = 31;
                            break;
                        case 4 :
                            result = 30;
                            break;
                        case 5 :
                            result = 31;
                            break;
                        case 6 :
                            result = 30;
                            break;
                        case 7 :
                            result = 31;
                            break;
                        case 8 :
                            result = 31;
                            break;
                        case 9 :
                            result = 30;
                            break;
                        case 10 :
                            result = 31;
                            break;
                        case 11 :
                            result = 30;
                            break;
                        default : result = 31;
                    }
                }
            }
        }else{
            result = -1;
        }
        return  result;
    }
}
