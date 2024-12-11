package _05_ARRAY;
import java.util.*;
public class D10_ten {
  static void printArray(int[] var0, int var1) {
    for(int var2 = 0; var2 < var1; ++var2) {
       System.out.print(var0[var2] + " ");
    }

    System.out.println();
 }

 static void reverse(int[] var0, int var1, int var2) {
  while(var1 < var2) {
     swap(var0, var1, var2);
     ++var1;
     --var2;
  }
}
static void swap(int[] var0, int var1, int var2) {
  var0[var1] += var0[var2];
  var0[var2] = var0[var1] - var0[var2];
  var0[var1] -= var0[var2];
}
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
