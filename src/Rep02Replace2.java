import java.util.Scanner;

public class Rep02Replace2 {
    public static void main(String[] args) {

        Scanner s= new Scanner(System.in);

        System.out.println("Enter a line of text.");

        String str = s.nextLine();

        String A = str.toLowerCase();
        int index = A.indexOf("hate");

        if(index!=-1){{
            System.out.println("First occurrence of  'hate' is at index : " +index );}
        }

        s.close();

    }
}
