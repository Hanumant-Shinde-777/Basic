import java.util.Scanner;
import java.util.Scanner.*;
public class pattern40 {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
  System.out.println("Enter the value of n:");
    int n = sc.nextInt();
    int sp=n-1; 
    int st =1;
    for (int i = 1; i <= n; i++) {
        //System.out.print(sp+""+ st);
        for (int j =1; j<=sp; j++) {
            System.out.print("\t");
        }
        for (int j = 1; j <= st; j++) {
            System.out.print("*\t");
        }   
        sp--;
        st++;
        System.out.println();
    }
    }
}
