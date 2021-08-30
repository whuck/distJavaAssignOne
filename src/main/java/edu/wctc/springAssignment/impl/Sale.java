package edu.wctc.springAssignment.impl;

public class Sale {
    private String name;
    private double amount;
    private double tax;
    private String country;

    public Sale(String n, String c, double a, double t){
        this.name = n;
        this.country = c;
        this.amount = a;
        this.tax = t;
    }

    public double getTax() {
        return tax;
    }

    public double getAmount() {
        return amount;
    }

    public String getName() {
        return name;
    }

    public String getCountry() {
        return country;
    }
}
