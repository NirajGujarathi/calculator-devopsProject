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
            System.out.println("Calculator Devops Project \nwith following list of operations : ");
            System.out.println("");
            System.out.println("1. Square Root");
            System.out.println("2. Factorial ");
            System.out.println("3. Natural Logarithm");
            System.out.println("4. Power");
            System.out.println("5. Exit from Application");
            System.out.println("");
            System.out.print("Enter your choice(number): ");
            System.out.println("");
            choices = reader.nextInt();
            if(choices==5) flag = 1;
            else{
                switch(choices){

                    case 1:
                        System.out.println("Square Root - option selected");
                        System.out.println("");
                        System.out.print("Enter number: ");
                        num = reader.nextDouble();
                        squareRoot_Function(num);
                        break;

                    case 2:
                        System.out.println("Factorial - option selected");
                        System.out.println("");
                        System.out.print("Enter number: ");
                        fact_num = reader.nextInt();
                        factorial_Function(fact_num);
                        break;

                    case 3:
                        System.out.println("Natural Log - option selected");
                        System.out.println("");
                        System.out.print("Enter number: ");
                        num = reader.nextDouble();
                        naturalLog_Function(num);
                        break;

                    case 4:
                        System.out.println("Power - option selected");
                        System.out.println("");
                        System.out.print("Enter number: ");
                        num = reader.nextDouble();
                        System.out.print("Enter exponent: ");
                        exp = reader.nextDouble();
                        power_Function(num,exp);
                        break;

                    default:
                        System.out.println("Invalid Choice! Exit application!");
                        flag = 1;
                }
            }
        }while(flag == 0);
    }

    public static double squareRoot_Function(double num){
        double ans = Math.sqrt(num);
        System.out.println("\nThe Result is \n"+ ans);
        logger.info("Executing squareRoot function!");
        return ans;
    }

    //Factorial
    public static int factorial_Function(int num){
        int ans = num ;
        for(int i=num-1; i>=1; i--) {
            ans = ans * i;
        }
        System.out.println("\nThe Result is \n"+ ans);
        logger.info("Executing Factorial function!");
        return ans;
    }
    public static double naturalLog_Function(double num){
        double ans = Math.log(num);
        System.out.println("\nThe Result is \n"+ ans);
        logger.info("Executing NaturalLog function!");
        return ans;
    }
    public static double power_Function(double num, double exp){
        double ans = Math.pow(num,exp);
        System.out.println("\nThe Result is \n"+ ans);
        logger.info("Executing Power function!");
        return ans;
    }

}