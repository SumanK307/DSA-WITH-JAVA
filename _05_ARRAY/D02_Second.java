package _05_ARRAY;
import java.util.*;

public class D02_Second {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter row no:");
        int rows= sc.nextInt();
        System.out.print("Enter column no:");
        int cols= sc.nextInt();
        int numbers[][]= new int[rows][cols];
     System.out.print("Enter Element:");
     for(int i=0;i<rows;i++)
     {
         for(int j=0;j<cols;j++)
         {
             numbers[i][j]=sc.nextInt();
         }
     }
      System.out.println("Print Element:");
      for(int i=0;i<rows;i++)
      {   System.out.print(" ");
          for(int j=0;j<cols;j++)
          {
              System.out.print(numbers[i][j] + "  ");
          }
        System.out.println();
      }
    }
}


