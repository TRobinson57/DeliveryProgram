/*
 * Author: Ajalon Corcoran
 * Date: 02-12-17
 * Assignment: Assignment3 Package.java
 * Description: 
 */


public abstract class Package {

    int id;
    Person recever;
    Person sender;
    double packageWeight;
    double packagePricePerOunce;

    public Package() {
    }

    public Package(int id, Person recever, Person sender, double packageWeight, double packagePricePerOunce) {
        this.id = id;
        this.recever = recever;
        this.sender = sender;
        if (packageWeight < 0) {
            this.packageWeight = 0;
        }
        this.packageWeight = packageWeight;
        if (packagePricePerOunce < 0) {
            this.packagePricePerOunce = 0;
        }
        this.packagePricePerOunce = packagePricePerOunce;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Person getRecever() {
        return recever;
    }

    public void setRecever(Person recever) {
        this.recever = recever;
    }

    public Person getSender() {
        return sender;
    }

    public void setSender(Person sender) {
        this.sender = sender;
    }

    public double getPackageWeight() {
        return packageWeight;
    }

    public void setPackageWeight(double packageWeight) {
        if (packageWeight < 0) {
            this.packageWeight = 0;
        }
        this.packageWeight = packageWeight;
    }

    public double getPackagePricePerOunce() {
        return packagePricePerOunce;
    }

    public void setPackagePricePerOunce(double packagePricePerOunce) {
        if (packagePricePerOunce < 0) {
            this.packagePricePerOunce = 0;
        }
        this.packagePricePerOunce = packagePricePerOunce;
    }

    abstract public double calculateCost();

    @Override
    public String toString() {
        return "\nid: " + id
                + "\nrecever: " + recever
                + "\nsender: " + sender
                + "\npackageWeight: " + packageWeight
                + "\npackagePricePerOunce: " + packagePricePerOunce;
    }
}
