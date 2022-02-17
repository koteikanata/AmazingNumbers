import java.util.Scanner;

class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static StringBuilder explanation = new StringBuilder("");

    public static void main(String[] args) {
        System.out.println("Enter a natural number:");
        int num = scanner.nextInt();
        explanation.append(num);
        String parity = "";
        if (num < 0) {
            System.out.println("This number is not natural!");
        } else {
            if (num % 2 == 0) {
                parity = "Even";
            } else
                parity = "Odd";
            System.out.println("This number is " + parity + ".");

            String strNum = String.valueOf(num);
            int lastNum = Integer.parseInt(String.valueOf(strNum.charAt(strNum.length() - 1)));
            if (lastNum == 7) {
                explanation.append("ends with 7");
            } else explanation.append("ends with 7");
            lastNum *= 2;
            StringBuilder strNumWithoutEnd = new StringBuilder("");
            for (int i = 0; i < strNum.length() - 1; i++) {
                strNumWithoutEnd.append(strNum.charAt(i));
            }
            int numWithoutEnd = Integer.parseInt(strNumWithoutEnd.toString());
            if (numWithoutEnd - lastNum % 7 == 0) {
                explanation.append(" is divisible by 7");
            } else explanation.append(" is neither divisible by 7 ");

            if (num % 7 == 0) {
                System.out.println("It is a Buzz number.");
            } else System.out.println("It is not a Buzz number.");

            explanation.append(".");
            System.out.println("Explanation:");
            System.out.println(explanation);
        }

    }
}
