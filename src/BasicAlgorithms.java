import java.util.Scanner;

public class BasicAlgorithms {

    public static void sayHello(String num) {
        try {
            if (Integer.parseInt(num) > 7) {
                System.out.println("Hello!");
            } else {
                System.out.println("...");
            }
        } catch (NumberFormatException nfe) {
            System.out.println(num + " is not a number!");
        }
    }

    public static void helloViacheslav(String name) {
        if (name.equals("Viacheslav")) {
            System.out.println("Hello, " + name);
        } else {
            System.out.println("There is no such name :(");
        }
    }

    public static void multiplesOfThree(String sequence){
        String[] strArr = sequence.split(" ");
        int size = strArr.length;
        int[] intArr = new int[size];
        try {
            for(int i = 0; i < size; i++) {
                intArr[i] = Integer.parseInt(strArr[i]);
            }
            System.out.println("Numbers divisible by three:");
            for (int x = 0; x< size; x++) {
                if (intArr[x]%3==0) {
                    System.out.println(intArr[x]);
                }
            }
        } catch (NumberFormatException nfe) {
            System.out.println("It's not a sequence of numbers separated bu 'space'!");
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\nTask 1: Provide any number (Hint: for numbers greater than 7 You'll receive a greeting ^-^):");
            String number = sc.nextLine();
            sayHello(number);

            System.out.println("\n- Do you want to repeat? (Provide answer as 'yes' or 'no')");
            String control = sc.nextLine();
            if (control.equals("no")){
                break;
            } else if (!control.equals("yes")) {
                System.out.println("\n- Wrong command! I guess You want to repeat");
            }
        }

        while (true) {
            System.out.println("\nTask 2: Try to guess a name (Hint: Viacheslav is my favourite name ;):");
            String name = sc.nextLine();
            helloViacheslav(name);

            System.out.println("\n- Do you want to repeat? (Provide answer as 'yes' or 'no')");
            String control = sc.nextLine();
            if (control.equals("no")){
                break;
            } else if (!control.equals("yes")) {
                System.out.println("\n- Wrong command! I guess You want to repeat");
            }
        }

        while (true) {
            System.out.println("\nTask 3: Provide a sequence of numbers separated by 'space' (Example: 1 22 333):");
            String array = sc.nextLine();
            multiplesOfThree(array);

            System.out.println("\n- Do you want to repeat? (Provide answer as 'yes' or 'no')");
            String control = sc.nextLine();
            if (control.equals("no")){
                break;
            } else if (!control.equals("yes")) {
                System.out.println("\n- Wrong command! I guess You want to repeat");
            }
        }

        System.out.println("\n- Thank You, bye!");
    }
}
