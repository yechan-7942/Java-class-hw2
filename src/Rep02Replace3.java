import java.util.Scanner;

public class Rep02Replace3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        while (true) {
            System.out.println("Enter a line of text.");

            String str = s.nextLine();

            // quit 입력시 종료하기
            if (str.equalsIgnoreCase("quit")) {
                break;
            }

            String A = str.toLowerCase();
            int index = A.indexOf("hate");

            if (index != -1) {

                String replaced = str.replaceFirst("(?i)hate", "love");
                System.out.println("I have rephrased that line to read:\n " + replaced);
            }
        }
        s.close();



    }
}