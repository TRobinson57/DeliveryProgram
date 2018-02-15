/*
 * Author: Timothy Robinson
 * Date: 02-12-17
 * Assignment: Assignment3 RegularPackage.java
 * Description: Stores a multiplier rate, 
 *  which could be used to give discounts in the form of a percentage off. 
 */


public class RegularPackage extends Package {
    
    double rate;
    
    
    public RegularPackage() {
    }

    public RegularPackage(double rate) {
        this.rate = rate;
    }
        
    public RegularPackage(double rate, int id, Person recever, Person sender, 
                         double packageWeight, double packagePricePerOunce) {
        super(id, recever, sender, packageWeight, packagePricePerOunce);
        if (rate < 0.0) {
            this.rate = 1.0;
        } 
        else {
            this.rate = rate;
        }
    }
    

    public double getRegularRate() {
        return rate;
    }

    public void setRegularRate(double rate) {
        this.rate = rate;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

    @Override
    public Person getRecever() {
        return recever;
    }

    @Override
    public void setRecever(Person recever) {
        this.recever = recever;
    }

    @Override
    public Person getSender() {
        return sender;
    }

    @Override
    public void setSender(Person sender) {
        this.sender = sender;
    }

    @Override
    public double getPackageWeight() {
        return packageWeight;
    }

    @Override
    public void setPackageWeight(double packageWeight) {
        this.packageWeight = packageWeight;
    }

    @Override
    public double getPackagePricePerOunce() {
        return packagePricePerOunce;
    }

    @Override
    public void setPackagePricePerOunce(double packagePricePerOunce) {
        this.packagePricePerOunce = packagePricePerOunce;
    }
    
        
    @Override
    public double calculateCost() {
        return (packageWeight *packagePricePerOunce) * rate;
    }
    

    @Override
    public String toString() {
        return "\nThe rate: " + rate
                + "\nid: " + id
                + "\nreceve: " + recever
                + "\nsender: " + sender
                + "\npackageWeight: " + packageWeight
                + "\npackagePricePerOunce: " + packagePricePerOunce;

    }    
    
}