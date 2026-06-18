import java.util.*;
public class drivenprogram {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int choice;
        int marks;


        do {
            System.out.println("for input marks enter 1");
            System.out.println("for not input marks enter 0");
             choice = sc.nextInt();
            if (choice == 1){
                System.out.println("enter marks");
                marks = sc.nextInt();
                if(marks >= 90 && marks <=100 ){
                    System.out.println("marks is good");
                }
                else if(marks<=89 && marks>=60){
                    System.out.println("this is also good marks");
                }
                else if(marks>=0 && marks <=59){
                    System.out.println("this is good as well");
                }
                else{
                    System.out.println("invalid marks");
                }
                
            }
        }
        while (choice != 0 );
            System.out.println("program stopped");
    }                  

                    
    
}
