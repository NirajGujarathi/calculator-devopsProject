package Application;
import java.util.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Calculator {
    private static final Logger logger = LogManager.getLogger(Calculator.class);
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        int choices, flag=0;
        double num, exp;
        int fact_num;
        System.out.println("-*-*-*-*-*-*-*-Calculator-*-*-*-*-*-*-*-");
        do{
            System.out.println("\nCalculator Devops Project \nwith following list of operations : ");
            System.out.println("1. Square Root");
            System.out.println("2. Factorial ");
            System.out.println("3. Natural Logarithm");
            System.out.println("4. Power");
            System.out.println("5. Exit from Application");
            System.out.print("Enter your choice(number): ");
            choices = reader.nextInt();
            if(choices==5) flag = 1;
            else{
                switch(choices){

                    case 1:
                        System.out.println("Square Root - option selected\n");
                        System.out.print("Enter number: ");
                        num = reader.nextDouble();
                        squareRoot_Function(num);
                        break;

                    case 2:
                        System.out.println("Factorial - option selected\n");
                        System.out.print("Enter number: ");
                        fact_num = reader.nextInt();
                        factorial_Function(fact_num);
                        break;

                    case 3:
                        System.out.println("Natural Log - option selected\n");
                        System.out.print("Enter number: ");
                        num = reader.nextDouble();
                        naturalLog_Function(num);
                        break;

                    case 4:
                        System.out.println("Power - option selected\n");
                        System.out.print("Enter number: ");
                        num = reader.nextDouble();
                        System.out.print("Enter exponent: ");
                        exp = reader.nextDouble();
                        power_Function(num,exp);
                        break;

                    default:
                        System.out.println("Invalid Choice! Exit application!\n");
                        flag = 1;
                }
            }
        }while(flag == 0);
    }

    public static double squareRoot_Function(double num){
        double ans = Math.sqrt(num);
        System.out.println("The Result is "+ ans);
        logger.info("SquareRoot calculation");
        return ans;
    }

    //Factorial
    public static int factorial_Function(int num){
        int ans = 1;
        for(int i=num; i>=1; i--) {
            ans = ans * i;
        }
        System.out.println("The Result is "+ ans);

        logger.info("Factorial calculation");
        return ans;
    }
    public static double naturalLog_Function(double num){
        double ans = Math.log(num);
        System.out.println("The Result is "+ ans);

        logger.info("NaturalLog calculation");
        return ans;
    }
    public static double power_Function(double num, double exp){
        double ans = Math.pow(num,exp);
        System.out.println("The Result is "+ ans);

        logger.info("Power calculation");
        return ans;
    }

}