
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {
    public static void main(String[] args) {
        
        try (Scanner sc = new Scanner(System.in)){
            System.out.print("Enter First number : ");
            double a = sc.nextDouble();
            System.out.print("Enter Second number : ");
            double b= sc.nextDouble();
            
            if(b==0.0){
                throw new ArithmeticException();
            }

            double ans= a/b;
            System.out.println("\n"+ a + "/" + b +" = " + (float)ans);
            
        } 
        catch (InputMismatchException ie) {
            System.out.println("Sorry, We are accepting only numbers :(");
        }
        catch(ArithmeticException ae){
            System.out.println("Nahh you can't divide it by ZERO!");
        }
        finally{
            System.out.println("\nIf not answered , Please follow the above Instruction");
        }

    }
}
