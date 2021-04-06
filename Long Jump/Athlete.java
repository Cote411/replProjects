import java.util.Scanner;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;

class Athlete {
  private String firstName;
  private String lastName;
  private String idNum;
  private String teamName;
  private String idNumConfirmation;
  private String[] studentInfo;


  Athlete(){
    setData();
  }

  void setData() {
    Scanner myScan = new Scanner(System.in);
    System.out.print("Do you have a Feehan id number? Yes or No: ");
    idNumConfirmation = myScan.nextLine();
    if (idNumConfirmation.equals("Yes") || idNumConfirmation.equals("yes")) {
      System.out.print("Enter id Number: ");
      idNum = myScan.nextLine();
      Read();

    } else {
      System.out.print("Enter Jumper First Name: ");
      firstName = myScan.nextLine();
      System.out.print("Enter Jumper Last Name: ");
      lastName = myScan.nextLine();
      System.out.print("Enter Jumper Team/School: ");
      teamName = myScan.nextLine();
      System.out.print(firstName + " " + lastName + ", " + teamName + "\n\n");


    }
  }

  void Read() {
    String line = "";
    String delimeter = ",";
    

    try{
      File myObj = new File("StudentStaff.csv");
      Scanner myReader = new Scanner(myObj);
      while (myReader.hasNextLine()) {
        line = myReader.nextLine();
        if (line.contains(idNum)){
          studentInfo = line.split(delimeter);
          firstName = studentInfo[0];
          lastName = studentInfo[1];
          idNum = studentInfo[2];
          System.out.print("--\n--\n\n");
          System.out.println(firstName + " " + lastName + " Team: Feehan  ID Number: " + idNum);
          break;
        }
      }    
      myReader.close();
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
  }
}
