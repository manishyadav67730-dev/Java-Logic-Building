import java.util.*;
public class solidrhombus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the length of rhombus");
        int m = sc.nextInt();

        for(int i=1; i<=m; i++){
            for(int j=1; j<=m-i;  j++){
                System.out.print(" ");
            }

            for(int j=1; j<=m; j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
     
}
