import java.util.*;
public class invertedhalfpy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter height of the pyramid");
        int m = sc.nextInt();
        
        for(int i=m; i>=1; i--){
            for(int j=1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        } 
    }
   
}