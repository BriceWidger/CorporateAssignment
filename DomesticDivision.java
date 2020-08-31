/*
Brice Widger
3/14/2020
Bellevue University
Assignment 7.1
File: DomesticDivision.java

Purpose:
Create a subclass named DomesticDivision which includes a field for the state in
which the division is located and a constructor that requires all fields when 
created.  Save as DomesticDivision.java.

Sources:
Java Programming; Joyce Farrell; Course Technology
https://www.geeksforgeeks.org/super-keyword/
*/

//child class (DomesticDivision) extends parent class (Division)
public class DomesticDivision extends Division {
private String state;
  
  
   /**
   * @param divisionName
   * @param accountNumber
   * @param state
   */
   public DomesticDivision(String divisionName, int accountNumber, String state) {
       //The super keyword in java is a reference variable that is used to refer
       //parent class objects. Reference: https://www.geeksforgeeks.org/super-keyword/
       super(divisionName, accountNumber);
       this.state = state;
   }

   /**
   * @return the state
   */
   public String getState() {
       return state;
   }

   /**
   * @param state the state to set
   */
   public void setState(String state) {
       this.state = state;
   }

   //override coporate.java's dd1.display(); and dd2.display();
   @Override
   public void display() { //implements abstract display() method from Division.java
       System.out.println("Division Name: " + getDivisionName());
       System.out.println("Account Number: " + getAccountNumber());

       System.out.println("State: " + getState() + "\n");

      
      

   }

}