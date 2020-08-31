/*
Brice Widger
3/14/2020
Bellevue University
Assignment 7.1
File: Division.java

Purpose:
Create an abstract Division class with fields for a company's division name and 
account number, and an abstract display() method that will be defined in the 
subclasses.  Use a constructor in the superclass that requires values for both 
fields. Save as Division.java.

Sources:
Java Programming; Joyce Farrell; Course Technology
https://www.geeksforgeeks.org/abstract-methods-in-java-with-examples/
*/

//parent class (Division)
//child classes (InternationalDivision & DomesticDivision)
public abstract class Division {
   private String divisionName;
   private int accountNumber;

   //abstract display() method used for child classes InternationDivison.java and
   //DomesticDivision.java
   //reference: https://www.geeksforgeeks.org/abstract-methods-in-java-with-examples/
   public abstract void display();

   /**
   * @param divisionName
   * @param accountNumber
   */
   public Division(String divisionName, int accountNumber) {
       this.divisionName = divisionName;
       this.accountNumber = accountNumber;
   }

   /**
   * @return the divisionName
   */
   public String getDivisionName() {
       return divisionName;
   }

   /**
   * @param divisionName
   * the divisionName to set
   */
   public void setDivisionName(String divisionName) {
       this.divisionName = divisionName;
   }

   /**
   * @return the accountNumber
   */
   public int getAccountNumber() {
       return accountNumber;
   }

   /**
   * @param accountNumber
   * the accountNumber to set
   */
   public void setAccountNumber(int accountNumber) {
       this.accountNumber = accountNumber;
   }

}