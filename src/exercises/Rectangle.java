package exercises;

import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double length ;
        double width ;
        double area;
        System.out.println("Enter the length of the rectangle ?");
        length= scanner.nextDouble();
        System.out.println("Enter the width of the rectangle?");
        width= scanner.nextDouble();
        area=length*width;
        System.out.println("the area of the rectangle is : "+area);
    }
}
