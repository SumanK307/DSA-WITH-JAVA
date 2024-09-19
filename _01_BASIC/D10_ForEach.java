package _01_BASIC;
import java.util.*;
public class D10_ForEach {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        for (String i : cars) { 
            System.out.println(i);
        }
    }
}
