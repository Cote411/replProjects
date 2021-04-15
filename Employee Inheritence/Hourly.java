import java.util.Scanner;

public class Hourly extends Employee{
    Hourly(){
        Scanner myScan = new Scanner(System.in);
        System.out.print("Please enter name. First nad Last: ");
        String str = myScan.nextLine();
        System.out.print("PLease enter hourly wage: ");
        int hourlyWage = myScan.nextInt();
        
        System.out.print("Name: " + str + "\n Wage: " + hourlyWage);
        
    }
    

}
