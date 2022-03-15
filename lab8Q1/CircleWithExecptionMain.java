package lab8Q1;

import java.util.Scanner;

public class CircleWithExecptionMain {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        CircleWithException c = new CircleWithException();

        System.out.println("Enter the radius in cm: ");
        double radius = input.nextDouble(); 
         
         

        try{
            c.setRadius(radius);
            System.out.println("The area is: " + String.format("%.2f", c.getArea()) + " square cm");
        }
        
        catch (IllegalArgumentException e){
            System.out.println(e + ": Radius cannot be a negative number");
        } 

        catch (Exception e){
            System.out.println(e + ": Area exceeds 1000 square cm");
        }

        input.close();

    }

        
}


