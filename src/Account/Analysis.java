package Account;

import java.util.Scanner;

public class Analysis {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int passed = 0;
        int failures = 0;
        int studentCounter = 1;

        while (studentCounter <= 10){
            System.out.println("Enter result (1 = pass, 2 = fail): ");
            int result = input.nextInt();

            if (result == 1){
                passed = passed + 1;
            }else {
                failures = failures + 1;
            }
            studentCounter = studentCounter + 1;
        }
        System.out.println("pass: " + passed + "" + " failure: " + failures);

        if (passed > 8){
            System.out.println("Bonus to instructor! ");
        }
    }
}
