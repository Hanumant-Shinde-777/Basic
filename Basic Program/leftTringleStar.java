//Java Program to Print Left Triangle Star Pattern
public class leftTringleStar {
    public static void main(String[] args) {
       for(int i=0;i<5;i++)
       {
          for(int j=0;j<5;j++)
          {
              if(j+i>=4)
              {
                 System.out.print("*");
              }
                else{
                      System.out.print(" ");
                }
              }
                System.out.println();

          }
       }
    }

