//Date; 19/09/2025
//Author: Harriet Yayra Boven Fiahagbe
//Description: To Create a short Java Program that helps coach to make decisions about a player based on certain factors and statistics


//Importing Scanner Package to allow input
import java.util.Scanner;

//Declaring the main function, to allow the program to run
public class PlayerSelection {
    public static void main(String[] args) {
        //Creating Scanner object for user input
        Scanner input = new Scanner(System.in);

        //Declaring Constants
        float POUND = 0.45359237f;
        int METER = 100;

        //Declaring variable to use in the program
        String name;
        int age;
        double height;
        double weight;
        int jersey_number;
        double new_weight;
        double new_height;
        int current_height;
        int current_weight;
        String Eligibility;
        String player_type;
        String player_position= "";
        String linup_final;

        //Input from the user. (Basic Information, weight, height, name, age, etc.)
        System.out.print("Enter your name: ");
        name = input.nextLine();

        System.out.print("Enter your age: ");
        age = input.nextInt();

        System.out.print("Enter your height: ");
        height = input.nextDouble();

        System.out.print("Enter your weight: ");
        weight = input.nextDouble();

        System.out.print("Enter your jersey number: ");
        jersey_number = input.nextInt();

        //Performing Type conversion to change weight and weight to an integer
        //Coverting height to cm
        //Converting weight to Pounds






    }
}
