/*
 * Author: Timothy Robinson
 * Date: 02-12-17
 * Assignment: Assignment3 OvernightPackage.java
 * Description: Stores the additional fee used on overnight packages
 */


public class OvernightPackage extends Package {
    
    double fee;

    
    public OvernightPackage() {
    }

    public OvernightPackage(double fee) {
        this.fee = fee;
    }

    public OvernightPackage(double fee, int id, Person recever, Person sender, 
                          double packageWeight, double packagePricePerOunce) {
        super(id, recever, sender, packageWeight, packagePricePerOunce);
        if (fee <0.0) {
            this.fee = 0.0;
        }
        else {
            this.fee = fee;
        }
    }

    
    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
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
        return packageWeight * packagePricePerOunce + fee;
    }
    
    
    @Override
    public String toString() {

        return "\nThe additional fee: " + fee 
                + "\nid: " + id
                + "\nreceve: " + recever
                + "\nsender: " + sender
                + "\npackageWeight: " + packageWeight
                + "\npackagePricePerOunce: " + packagePricePerOunce;
    }

 }
