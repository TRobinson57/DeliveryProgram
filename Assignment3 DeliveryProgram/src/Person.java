 /*
   *Author: Timothy Robinson
 - *Date:
 - *Assignment: Assignment .java
 - *Description:
 + *Date:1/29/2018
 + *Assignment: Assignment2 Person.java
 + *Description: Stores persons first name and last name.
   */
  
  
 public class Person {

        //data members
    private String firstName;
    private String lastName;



            //default constructor
    public Person() {
    }


            //override constructor
    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }



    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName;
    }





}       //end class