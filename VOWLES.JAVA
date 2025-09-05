// Name: Will Donovan
// Class: CS 3305
// Term: Fall 2025
// Instructor: Dr. Haddad
// Assignment: 2
// IDE Name: IntelliJ
import java.util.Scanner;
public class Vowels {
    int count=0;
    //counts the number of vowels in a string
    public int countVowels(String s,int i){
        //prevents out of bounds exceptions
        if (i==s.length()){
            return count;
        }
        s=s.toLowerCase();
        //cast string to lowercase
        if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u'){
            count++;
            //increment count of vowels
        }
        //increments index since strings are similar to arrays
        countVowels(s,i+1);
        return count;
    }
    public static void main(String[] args) {
        Vowels v=new Vowels();
        Scanner input=new Scanner(System.in);
        Boolean loop=true;
        String s="";
        while(loop){
            //menu
            System.out.println("---------MAIN MENU---------");
            System.out.println("1: Read input string ");
            System.out.println("2: Compute number of vowels");
            System.out.println("3: Exit ");
            System.out.print("Enter option number: ");
            //get choice
            int choice=input.nextInt();
            input.nextLine();
            //based on choice
            switch(choice){
                case 1:
                    //reads string
                    System.out.println("Enter input string: ");
                    s=input.nextLine();
                    break;
                case 2:
                    //counts num vowels in string
                    int numVowels=v.countVowels(s,0);
                    System.out.println("You entered string: "+s);
                    System.out.println("Number of vowels: "+numVowels);
                    break;
                case 3:
                    //user exits program
                    loop=false;
                    break;
                default:
                    System.out.println("Please enter a valid choice");
            }
        }
    }
}
