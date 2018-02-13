/*

 * Author: Ajalon Corcoran
 * Date: 02-12-17
 * Assignment: Assignment3 TwoDayPackage.java
 * Description: 
 */


public class TwoDayPackage extends Package {

    double flatFee;

    public TwoDayPackage() {
    }

    public TwoDayPackage(double flatFee) {
        this.flatFee = flatFee;
    }

    public TwoDayPackage(double flatFee, int id, Person recever, Person sender, double packageWeight, double packagePricePerOunce) {
        super(id, recever, sender, packageWeight, packagePricePerOunce);
        if (flatFee < 0) {
            this.flatFee = 0;
        } else {
            this.flatFee = flatFee;
        }
    }

    public double getFlatFee() {
        return flatFee;
    }

    public void setFlatFee(double flatFee) {
        this.flatFee = flatFee;
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
        this.packageWeight = packageWeight;
    }

    public double getPackagePricePerOunce() {
        return packagePricePerOunce;
    }

    @Override
    public void setPackagePricePerOunce(double packagePricePerOunce) {
        this.packagePricePerOunce = packagePricePerOunce;
    }
    
    @Override
    public double calculateCost() {        
     return  packageWeight * packagePricePerOunce + flatFee;
    }

    @Override
    public String toString() {
        return "\nflatFee:" + flatFee + '}';
    }
    
    

=======



public class TwoDayPackage {

}
