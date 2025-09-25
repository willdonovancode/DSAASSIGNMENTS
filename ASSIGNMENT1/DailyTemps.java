// Name: Will Donovan
// Class: CS 3305
// Term: Fall 2025
// Instructor: Dr. Haddad
// Assignment: 1
// IDE Name: IntelliJ
public class DailyTemps {
    int[] dailytemps= new int[7];

    public DailyTemps(int[] dailytemps) {
        this.dailytemps = dailytemps;
    }
    //change temperature of certain day
    public void setTemp(int index,int temp){
        this.dailytemps[index]=temp;
    }
    //finds number of days below freezing
    public int Freezing(){
        int count=0;
        //iterate through temps in daily temp
        //if freezing increment count
        for (int t: dailytemps){
            if (t<32){
                count++;
            }
        }
        return count;
    }
    
    //finds warmest day of the week
    public String Warmest(){

        int warmest=dailytemps[0];
        int idx=0;
        for (int i=1;i<dailytemps.length;i++){
            if (dailytemps[i]>warmest){
                warmest=dailytemps[i];
                idx=i;
            }
        }
        //matches index to it's weekday
        switch (idx){
            case 0:
                return "The warmest day of the week is Monday";
            case 1:
                return "The warmest day of the week is Tuesday";
            case 2:
                return "The warmest day of the week is Wednesday";
            case 3:
                return "The warmest day of the week is Thursday";
            case 4:
                return "The warmest day of the week is Friday";
            case 5:
                return "The warmest day of the week is Saturday";
            case 6:
                return "The warmest day of the week is Sunday";
        }
        //default return even thought it wont reach here
        return "The warmest day of the week is Monday";
    }
    //prints the temps for each weekday
    public void printTemps() {
        int day = 0;
        //i could have just written seven print statements i guess
        while (day < 7) {
            switch (day) {
                case 0:
                    System.out.println("Monday " + dailytemps[day]);
                    break;
                case 1:
                    System.out.println("Tuesday " + dailytemps[day]);
                    break;
                case 2:
                    System.out.println("Wednesday " + dailytemps[day]);
                    break;
                case 3:
                    System.out.println("Thursday " + dailytemps[day]);
                    break;
                case 4:
                    System.out.println("Friday " + dailytemps[day]);
                    break;
                case 5:
                    System.out.println("Saturday " + dailytemps[day]);
                    break;
                case 6:
                    System.out.println("Sunday " + dailytemps[day]);
                    break;
            }
            day++;
        }
        //done
    }
}
