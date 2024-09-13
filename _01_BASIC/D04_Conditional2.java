package _01_BASIC;

public class D04_Conditional2 {
    public static void main(String args[]) {
        int time = 22;
        if (time < 10) {
            System.out.println("Good morning.");
        } 
        else if (time < 18) {
            System.out.println("Good day.");
        } 
        else {
            System.out.println("Good evening.");
        }
    }
}