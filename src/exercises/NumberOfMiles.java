package exercises;

import java.util.Scanner;

public class NumberOfMiles {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Double numMiles;
        Double numGallons;
        Double mpg;
        System.out.println("How many miles have you driven" +
                "" +
                "?");
        numMiles=scanner.nextDouble();
        System.out.println("how many gallon did you use ?");
        numGallons=scanner.nextDouble();
        mpg=numMiles/numGallons;

        System.out.println("you are running on :"+"\n"+mpg + " mpg.");

    }
}

