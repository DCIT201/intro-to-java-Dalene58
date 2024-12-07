import java.util.Scanner;

//Name class TemperatureConvertor
public class TemperatureConverter{

        public static void main(String[] args) {
            //Create a Scanner objeect to accept user input
        Scanner converter=new Scanner(System.in);
            //Print message for user
            System.out.println("A Simple Temperature Converter");
            //Allow user enter first name
            System.out.println("Please enter your first name.");
            String firstName=converter.nextLine();
            //welcoming user wih first name
            System.out.println("Welcome " +firstName+ " to my Temperature Convertor");
            //Ask user to choose option
            System.out.println("Please choose between the two options below:");
            System.out.println("Option a:Convert from Celsuis to Fahrenheit");
            System.out.println("Option b: Convert from Fahrenheit to Celsuis");
            //Accept user's choice
            String options=converter.nextLine();
            //Creating an if else loop that will accept the user's input  for Celsuis temperature to be converted
            if(options.equalsIgnoreCase("Option a")){
                System.out.println("Input the desired temperature you want to convert to fahrenheit");
                double Celsuis=converter.nextDouble();
                if(Celsuis<-273.15){
                    System.out.println("The temperature cannot be lower than -273.15 Celsuis");
                }
                else{
                    //Convert Celsuis to Fahrenheit
                    double Fahrenheit=((Celsuis*9/5)+32);
                    //Print the converted temperature
                    System.out.println("The temperature in Fahrenheit = "+ Fahrenheit);
                }

            }

            //Creating an if else loop that will accept usser's input for fahrenhiet temperature to be converted
            if(options.equalsIgnoreCase("Option b")){
                System.out.println("Input the desired temperature youn want to convert to celsuis");
                double Fahrenheit=converter.nextDouble();
                if(Fahrenheit<-459.67){
                    System.out.println("The temperature cannot be lower than -459.67 Fahrenheit");
                }
                else{
                    //Convert from fahrenheit to Celsuis
                    double Celsuis=((Fahrenheit-32)*5/9);
                    //Print the converted temperature
                    System.out.println("The temperature in Celsuis = "+ Celsuis);
                }

            }
            //Thank the user for using the temperature
            System.out.println("THANK YOU FOR USING THE TEMPERATURE CONVERTOR.");
        
    }
}