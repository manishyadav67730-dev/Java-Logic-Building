import java.util.*;

public class calculator {
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first number");
        int a =  sc.nextInt();
        System.out.println("enter second number");
        int b = sc.nextInt();
        System.out.println("1. add ,  2. sub , 3. div, 4. mul , 5. remainder");
        int calculate = sc.nextInt();

        switch(calculate){
            case 1 : System.out.println("addition = " + (a + b) );
            break;
             
            case 2 : System.out.println("subtraction = " + (a - b) );
            break;

            case 3 : System.out.println("division = " + (a / b) );
            break;

            case 4 : System.out.println("multiplication = " + (a * b) );
            break;

            case 5 : System.out.println("remainder = " + (a % b) );
            break;

            default : System.out.println("invalid");
        }

    }
}
