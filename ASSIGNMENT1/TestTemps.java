// Name: Will Donovan
// Class: CS 3305
// Term: Fall 2025
// Instructor: Dr. Haddad
// Assignment: 1
// IDE Name: IntelliJ
import java.util.*;
public class TestTemps {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int index=0;
        int[] dailytemps=new int[7];
        //ask for 7 temperatures for the week
        while (index<7){
            System.out.println("Enter the temp for the day: ");
            int t=input.nextInt();
            dailytemps[index]=t;
            index++;
        }
        //create newWeek with daily temps
        DailyTemps myWeek= new DailyTemps(dailytemps);
        //test setTemp
        myWeek.setTemp(0,5);
        //test Freezing
        System.out.println("Number of freezing days this week: "+myWeek.Freezing());
        //test Warmest
        System.out.println(myWeek.Warmest());
        //test printTemps
        myWeek.printTemps();
    }
}