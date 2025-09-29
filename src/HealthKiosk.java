//Class:HealthKiosk
//Date:29/09/2025
//Author: Edward Anokye Jnr.
//Purpose:Creating a check-in system for students at the Ashesi Health Kiosk

import java.util.Random;
import java.util.Scanner;



public class HealthKiosk {
    public static void main(String[] args) {

   Scanner input = new Scanner(System.in);
//Task 1
   System.out.println("Enter service code(P/L/T/C): ");

   String sc = input.nextLine();
   String serviceCode = sc.toUpperCase();

   switch (serviceCode) {
       case "P":
           System.out.println("Go to: Pharmacy Desk");
           break;

       case "L":
           System.out.println("Go to: Lab Desk");
           break;

       case "T":
           System.out.println("Go to: Triage Desk");
           break;
       case "C":
           System.out.println("Go to: Counselling Desk");
           break;

       default:
           System.out.println("Invalid service code");
   }


System.out.println("Enter weight (kg):");
   double weight = input.nextDouble();

   System.out.println("Enter height (m):");
   double height = input.nextDouble();

   double BMI= weight / Math.pow(height,2);
   System.out.println("BMI is "+BMI);

   double newBMI =Math.round(BMI*10)/10.0 ;
   System.out.println("New BMI is "+newBMI);

   if(newBMI < 18.5)
       System.out.println("Underweight");
   else if (newBMI > 18.5 && BMI < 25)
       System.out.println("Normal");
   else if (newBMI > 25 && BMI < 30)
       System.out.println("Overweight");
   else
        System.out.println("Obese");

   System.out.println("Enter dosage(of 250mg): ");
   double dosage = input.nextDouble();
   int dosageUpdated= (int)Math.ceil(dosage)/ 250 ;

   System.out.println("Dosage updated is "+  dosageUpdated);

   System.out.println("Enter an angle in degrees: ");
   double angle = input.nextDouble();
   double angleUpdated= Math.toRadians(angle);
   System.out.println(  Math.round(Math.sin(angleUpdated)*1000 / 1000.0));
   System.out.println(Math.round(Math.cos(angleUpdated )*1000 /1000.0));

   //Question 3
char randomCharacter = (char)('A'+ (int)(Math.random()*26));
String numbers ="";
for(int i=0;i<4;i++){ //runs for times to pick a random number
    int num =3 +(int)(Math.random()*7);
   numbers +=num;}


 String codeID = randomCharacter + numbers;
System.out.println(codeID);
        boolean b = Character.isDigit(codeID.charAt(3)) && Character.isDigit(codeID.charAt(4));
        if (codeID.length() != 5)
        System.out.println("Code unacceptable");
        else {
            if (!Character.isLetter(codeID.charAt(0)))
                    System.out.println("Code must begin with a letter");
            else{
                    if (!(Character.isDigit(codeID.charAt(1))&&Character.isDigit(codeID.charAt(2)) && Character.isDigit(codeID.charAt(3)) && Character.isDigit(codeID.charAt(4)))) {
                        System.out.println("Code must end with a letter");}
                else
                        System.out.println("You're good to go");
                }

            //Task 4


            System.out.println("Tell me your first name");
            String firstName = input.nextLine();
            char letter =  firstName.charAt(0);
            char baseCode =Character.toUpperCase(letter);

            System.out.println("The base code is "+baseCode);

            char shiftedLetterBase = (char)('A'+ (baseCode- 'A'+2)%26);
            System.out.println("The shifted letter in the base code is "+shiftedLetterBase);
            String finalTwo = codeID.substring(codeID.length()-2);
            System.out.println("The final two in the base code is "+finalTwo);





}

    }

}
