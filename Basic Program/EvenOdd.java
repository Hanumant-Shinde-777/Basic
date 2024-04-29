import java.util.Scanner;
class EvenOdd{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       int num = sc.nextInt();       
        System.out.print("Enter the number: ");
        if(num % 2 ==0){
            System.out.println(num +"NUmber is Even");
        }else{
            System.out.println(num +"NUmber is Odd");
        }

    }
}