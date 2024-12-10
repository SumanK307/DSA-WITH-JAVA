package _05_ARRAY;
import java.util.*;
public class D10_ten {
    public static void main(String[] args) {
        Scanner var1 = new Scanner(System.in);
      System.out.print("Enter the size of array:");
      int var2 = var1.nextInt();
      int[] var3 = new int[var2];
      System.out.print("Enter Array element(must contain -ve element for Q.1):");

      for(int var4 = 0; var4 < var2; ++var4) {
         var3[var4] = var1.nextInt();
      }
    }
}
