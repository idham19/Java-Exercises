package exercises;

import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        System.out.println("hello world");
        String name;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Hello , what is your name: ");
        name=scanner.nextLine();
        System.out.println("Hello "+name);

    }
}
