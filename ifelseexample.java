import java.util.Scanner;

public class ifelseexample {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer value: ");
        int user_Val = input.nextInt();

        if (user_Val == 5) {
            while (user_Val <= 10) {
                System.out.println(user_Val);
                user_Val++;
            }

        } else {
            System.out.println("You entered: " + user_Val);
        }
    input.close();
    }
}
