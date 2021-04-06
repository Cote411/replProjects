import java.util.Scanner;

class Jumps {

  void Attempt() {
    Scanner myScan = new Scanner(System.in);
    int[] feet = { 0, 0, 0 };
    int[] inches = { 0, 0, 0 };
    double[] highest = new double[2];

    System.out.print("Enter Jump 1 Feet: ");
    feet[0] = myScan.nextInt();
    System.out.print("Enter Jump 1 Inches: ");
    inches[0] = myScan.nextInt();
    System.out.print("Enter Jump 2 Feet: ");
    feet[1] = myScan.nextInt();
    System.out.print("Enter Jump 2 Inches: ");
    inches[1] = myScan.nextInt();
    System.out.print("Enter Jump 3 Feet: ");
    feet[2] = myScan.nextInt();
    System.out.print("Enter Jump 3 Inches: ");
    inches[2] = myScan.nextInt();

    System.out.print("Jumps: \n#1 " + feet[0] + "' " + inches[0] + "'' \n#2 " + feet[1] + "' " + inches[1] + "'' \n#3 "
        + feet[2] + "' " + inches[2] + "'' \n");

    int att1 = feet[0] * 12 + inches[0];
    int att2 = feet[1] * 12 + inches[1];
    int att3 = feet[2] * 12 + inches[2];

    if (att1 > att2) {
      if (att1 > att3) {
        highest[0] = att1;
      }
    }
    if (att2 > att1) {
      if (att2 > att3) {
        highest[0] = att2;
      }
    }
    if (att3 > att2) {
      if (att3 > att1) {
        highest[0] = att3;
      }
    }
    highest[0] /= 12;

    highest[1] = highest[0] % 12;

    //System.out.print("Highest Jump: " + highest[0] + "' " + (highest[1] + 1) + "'' \n");
    System.out.print("Highest Jump: " + highest[0] + " Feet \n");

  }
}