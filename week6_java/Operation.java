import java.util.*;

public class Operation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str;
        int choice;

        System.out.print("Enter a string: ");
        str = sc.nextLine();

        do {
            System.out.println("Menu:");
            System.out.println("1. Check Palindrome, 2. Alphabetical Order, 3. Reverse String, 4. Concatenate Original and Reversed");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    String rev = "";
                    for (int i = str.length() - 1; i >= 0; i--) {
                        rev += str.charAt(i);
                    }
                    System.out.println(str.equals(rev) ? "Palindrome" : "Not Palindrome");
                    break;
                case 2:
                    char[] arr = str.toCharArray();
                    Arrays.sort(arr);
                    System.out.println(new String(arr));
                    break;
                case 3:
                    String revStr = "";
                    for (int i = str.length() - 1; i >= 0; i--) {
                        revStr += str.charAt(i);
                    }
                    System.out.println(revStr);
                    break;
                case 4:
                    String concat = str;
                    for (int i = str.length() - 1; i >= 0; i--) {
                        concat += str.charAt(i);
                    }
                    System.out.println(concat);
                    break;
                default:
                    System.out.println("Exiting...");
            }
        } while (choice < 5 & choice > 0);
    }
}
