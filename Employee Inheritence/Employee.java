import java.util.Scanner;

public class Employee{
    void setEmployee(){
        Scanner myScan = new Scanner(System.in);

        System.out.print("Press 1 for hourly, 2 for salary, and 3 for comission. ");
        int inputNumber = myScan.nextInt();
        if(inputNumber == 1){
            Hourly hourlyWorker = new Hourly();
        }else if(inputNumber == 2){
            Salary SalaryWorker = new Salary();
        }else if(inputNumber == 3){
            Comission ComissionWorker = new Comission();
        }else{
            System.out.println("Error. PLease enter a valid number.");
            setEmployee();
        }
    }
}
   