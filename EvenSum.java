import java.util.Scanner;

public class evenIntSum {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number larger than 2");
        int num = input.nextInt();
        if (num >= 2) {
            int sum = 0;
            for (int i = 2; i <= num; i +=2) {
                sum += i;
            }
            System.out.println("sum of all even numbers is " + sum);
                } else {
            System.out.println("please enter a number above 2");
        }
    }
}