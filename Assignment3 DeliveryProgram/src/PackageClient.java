
/*
 * Author: Ajalon Corcoran
 * Date: 02-12-17
 * Assignment: Assignment3 PackageCliant.java
 * Description: 1 :Create a regular package object and add it into the array/ArrayList of Package
2 :Create a two-day package object and add it into the array/ArrayList of Package 
3 :Create an overnight package object and add it into the array/ArrayList of Package 
4 :Loop through the array/ArrayList to show all the packages' information using polymorphism
0 :To end the program
 */
import java.util.Scanner;
import java.util.ArrayList;

public class PackageClient {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        ArrayList<Package> PackageList = new ArrayList<Package>();

        while (true) {
            System.out.print("\n1 :Create a regular package object\n"
                    + "2 :Create a two-day package object\n"
                    + "3 :Create an overnight package object\n"
                    + "4 :Loop through the array/ArrayList to show all the packages\n"
                    + "0 :To end the program   ");
            int command = console.nextInt();

            switch (command) {
                case 1:

                    System.out.print("Enter package ID: ");
                    int id = console.nextInt();
                    System.out.print("Enter package weight: ");
                    double packageWeight = console.nextDouble();
                    System.out.print("enter package cost per ounce: ");
                    double packagePricePerOunce = console.nextDouble();
                    System.out.print("enter rate of reguler package: ");
                    double rate = console.nextDouble();

                    System.out.print("enter Sender's first name: ");
                    String firstName = console.next();
                    System.out.print("enter sender's last name: ");
                    String lastName = console.next();
                    Person sender = new Person(firstName, lastName);
                    System.out.print("enter Recipient's first name: ");
                    firstName = console.next();
                    System.out.print("enter Recipient's last name: ");
                    lastName = console.next();
                    Person recever = new Person(firstName, lastName);

                    PackageList.add(new RegularPackage(rate, id, recever, sender,
                            packageWeight, packagePricePerOunce));

                    System.out.print("\n" + PackageList.toString());

                    break;
                case 2:
                    System.out.print("Enter package ID: ");
                    id = console.nextInt();
                    System.out.print("Enter package weight: ");
                    packageWeight = console.nextDouble();
                    System.out.print("Enter package cost per ounce: ");
                    packagePricePerOunce = console.nextDouble();
                    System.out.print("Enter the flat fee of two-day shiping: ");
                    double flatFee = console.nextDouble();
                    System.out.print("Enter Sender's first name: ");
                    firstName = console.next();
                    System.out.print("Enter sender's last name: ");
                    lastName = console.next();
                    sender = new Person(firstName, lastName);
                    System.out.print("Enter Recipient's first name: ");
                    firstName = console.next();
                    System.out.print("Enter Recipient's last name: ");
                    lastName = console.next();
                    recever = new Person(firstName, lastName);

                    PackageList.add(new TwoDayPackage(flatFee, id, recever, sender,
                            packageWeight, packagePricePerOunce));

                    System.out.print("\n" + PackageList.toString());

                    break;
                case 3:
                    System.out.print("Enter package ID: ");
                    id = console.nextInt();
                    System.out.print("Enter package weight: ");
                    packageWeight = console.nextDouble();
                    System.out.print("Enter package cost per ounce: ");
                    packagePricePerOunce = console.nextDouble();
                    System.out.print("Enter the additional fee of overnight package: ");
                    double fee = console.nextDouble();
                    System.out.print("Enter Sender's first name: ");
                    firstName = console.next();
                    System.out.print("Enter sender's last name: ");
                    lastName = console.next();
                    sender = new Person(firstName, lastName);
                    System.out.print("Enter Recipient's first name: ");
                    firstName = console.next();
                    System.out.print("Enter Recipient's last name: ");
                    lastName = console.next();
                    recever = new Person(firstName, lastName);

                    PackageList.add(new OvernightPackage(fee, id, recever, sender,
                            packageWeight, packagePricePerOunce));

                    System.out.print("\n" + PackageList.toString());

                    break;
                case 4:
                    for (int i = 0; i < PackageList.size(); i++) {
                        System.out.print(PackageList.get(i) + "\n");
                    }

                    break;
                case 0:

                    break;

            }

        }

    }//end main    
}//end class
