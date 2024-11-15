package _05_ARRAY;

public class D01_First {
    public static void main(String[] args){
        Scanner var1 = new Scanner(System.in);
      System.out.print("Enter size:");
      int var2 = var1.nextInt();
      int[] var3 = new int[var2];
      System.out.print("Enter Element:");

      int var4;
      for(var4 = 0; var4 < var2; ++var4) {
         var3[var4] = var1.nextInt();
      }

      System.out.print("Enter number which do you wantto find: ");
      var4 = var1.nextInt();

      for(int var5 = 0; var5 < var2; ++var5) {
         if (var3[var5] == var4) {
            System.out.println("number find at index [" + var5 + "] location");
            return;
         }
      }

      System.out.println("invalid number:");
    }
}
