import java.util.*;
public class halfpyramid {
 public static void main(String[] args) {
    Scanner sc = new Scanner(System .in);
    System.out.println("enter height of the half pyramid");
    int m = sc.nextInt();

    for(int i =  1;  i<=m;  i++){
        for(int j=1; j<=i ; j++){
            System.out.print("*");
        }
    
    System.out.println();
    }
 }   
}
