/*
Brice Widger
3/14/2020
Bellevue University
Assignment 7.1
File: InternationalDivision.java

Purpose:
Create a subclass named InternationalDivision which includes a field for the 
country in which the division is located, a field for the language spoken, and 
a constructor that requires all fields when created. Save as InternationalDivision.java.

Sources:
Java Programming; Joyce Farrell; Course Technology
*/

//child class (InternationalDivision) extends parent class (Division)
public class InternationalDivision extends Division {
   private String country;
   private String languageSpoken;

   /**
   * @param divisionName
   * @param accountNumber
   * @param country
   * @param languageSpoken
   */
   public InternationalDivision(String divisionName, int accountNumber,
           String country, String languageSpoken) {
       super(divisionName, accountNumber);
       this.country = country;
       this.languageSpoken = languageSpoken;
   }

   /**
   * @return the country
   */
   public String getCountry() {
       return country;
   }

   /**
   * @param country
   * the country to set
   */
   public void setCountry(String country) {
       this.country = country;
   }

   /**
   * @return the languageSpoken
   */
   public String getLanguageSpoken() {
       return languageSpoken;
   }

   /**
   * @param languageSpoken
   * the languageSpoken to set
   */
   public void setLanguageSpoken(String languageSpoken) {
       this.languageSpoken = languageSpoken;
   }
   
   //override coporate.java's id1.display(); and id2.display();
   @Override
   public void display() { //implements abstract display() method from Division.java
       System.out.println("Division Name: " + getDivisionName());
       System.out.println("Account Number: " + getAccountNumber());

       System.out.println("Country: " + getCountry());
       System.out.println("Language Spoken: " + getLanguageSpoken() + "\n");

   }

}