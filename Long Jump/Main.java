
/*
..Q4  Project 1: Long Jump 2 .. Period D

..Create a class called 'LongJumpAthlete' 

..Each athlete should have a name, id number, school/team name and 3 attempts - measured in feet and inches.(and anything else you would like to include)

..By entering the Feehan ID, this should assign the correct name to the competitor.

..Include a method to calculate the competitor's best attempt. 

''Include a method to display all of the info: name, id, school, all 3 attempts and best.

..............

.. Continue Project 7 to include:
.. Include  multiple athletes. Feehan competitors should be entered by their ID#, non-Feehan competitors should enter their name and school number (a default ID number should be assigned)
.. Include a method to determine the place of finish
.. Include a method to calculate the points earned by each competitor and each team.
.. All data should be written to a file

*/

import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    
    Scanner myScan = new Scanner(System.in);
    System.out.print("How many Atheletes will be competing?  ");
    int n = myScan.nextInt();
    Athlete player = new Athlete();
    Jumps jumper = new Jumps();
    for(int i = 0; i < n; i++){
      player.setData();
      jumper.Attempt();
      
    }
    jumper.displayHighestJumps();
  }
}