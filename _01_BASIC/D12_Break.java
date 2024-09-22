package _01_BASIC;
import java.util.*;
public class D12_Break{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        while (i < n) {
            System.out.println(i);
            i++;
            if (i == 4) {
                break;
            }
        }
    }
}
