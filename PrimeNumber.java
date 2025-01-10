import java.util.ArrayList;
import java.util.Scanner;

public class PrimeNumber{
    public static void main(String[] args) {
        
        System.out.println("Welcome, Here you can Find the sum of prime numbers between range.");
        int start;
        int end;
        ArrayList<Integer> arr=new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Starting number : ");
        start=sc.nextInt();

        System.out.print("Enter the Last number : ");
        end=sc.nextInt();

        
        for(int i=start; i<=end ; i++){
            
            boolean flag=true;

            for(int z=2; z<=i/2 ; z++){
                if(i%z == 0 ){
                    flag =false;
                    break;
                }
            }
            if (flag) arr.add(i);
        }

        int sum=0;
        for(int i : arr){
            sum+=i;
        }
        
        System.out.println("Array : "+ arr);

        System.out.println("\nSum of Prime Numbers B/W "+start+" and "+end+" = "+sum);
    }
}