import java.util.Scanner;
public class CountDigit {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number ");
        int n = sc.nextInt();
        int dig=0;
        while(n!=0){
            n=n/10;
            dig++;
        }
        System.out.println("The Number of Count Is" + dig);
        sc.close();
    }
}
