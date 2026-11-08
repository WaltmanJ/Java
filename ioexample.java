import java.util.Scanner;

public class ioexample {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int user_Num = scanner.nextInt();
        System.out.println("You entered: " + user_Num);
    }
}
