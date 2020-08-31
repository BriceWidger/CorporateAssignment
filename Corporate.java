/*
Brice Widger
3/14/2020
Bellevue University
Assignment 7.1
File: Corporate.java

Purpose:
Write an application named Corporate that creates two instances of each of these
concrete classes (4 total instances). Save as Corporate.java.

Sources:
Java Programming; Joyce Farrell; Course Technology
https://www.geeksforgeeks.org/abstract-methods-in-java-with-examples/
*/

//driver class reference: https://www.geeksforgeeks.org/abstract-methods-in-java-with-examples/
public class Corporate {

   //main method
   public static void main(String[] args) {
        
   InternationalDivision id1=new InternationalDivision("First",1234545,"India","English");
   //overridden by InternationalDivision.java
   id1.display();
   InternationalDivision id2=new InternationalDivision("Second",456677,"USA","English");
   //overridden by InternationalDivision.java
   id2.display();
  
   
   DomesticDivision dd1=new DomesticDivision("Third",435567,"CA");
   DomesticDivision dd2=new DomesticDivision("Fourth",656777,"NY");
   //overridden by DomesticDivision.java
   dd1.display();
   dd2.display();
  

   }

}