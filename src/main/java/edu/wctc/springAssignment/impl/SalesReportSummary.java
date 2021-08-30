package edu.wctc.springAssignment.impl;

import edu.wctc.springAssignment.iface.SalesReport;
import edu.wctc.springAssignment.iface.ShippingPolicy;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Service;

import java.beans.beancontext.BeanContext;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.List;

public class SalesReportSummary implements SalesReport {
    private ShippingPolicy sp;
    private List<Sale> sl;
    private List<String> countries;
    private List<Double> countrySums;
    private List<Double> countryTaxSums;
    private List<Double> countryShippingSums;
    @Override
    public void generateReport(List<Sale> salesList,ShippingPolicy shippingPolicy) {
        this.sp = shippingPolicy;
        this.sl = salesList;
        printHead();

        this.countries = new ArrayList<String>();
        this.countries.add(this.sl.get(0).getCountry());

        this.countrySums = new ArrayList<Double>();
        this.countrySums.add(0.0);

        this.countryTaxSums = new ArrayList<Double>();
        this.countryTaxSums.add(0.0);

        this.countryShippingSums = new ArrayList<Double>();
        this.countryShippingSums.add(0.0);
        //grab unique countries in saleslist
        for (int i = 0; i < this.sl.size(); i++) {
            if(!countries.contains(this.sl.get(i).getCountry())) {
                countries.add(this.sl.get(i).getCountry());
                countrySums.add(0.0);
                countryTaxSums.add(0.0);
                countryShippingSums.add(0.0);
            }
        }
        //sum each country's sales
        countries.forEach((c) -> sumCountry(c));
        //salesList.forEach((s) -> printLine(s));
        countries.forEach((c)->printLine(c));
    }
    private void printHead() {
        System.out.println("SALES SUMMARY REPORT");
        System.out.format("%22s%10s%10s%10s%n","Where","HowMuch","Tax","Shipping");
    }
    private void sumCountry(String countryName) {
        int x = countries.indexOf(countryName);
        //System.out.println("summing country:"+countryName);
        for (int i = 0; i < this.sl.size(); i++) {
            if(this.sl.get(i).getCountry()==countryName) {
                double d = countrySums.get(x);
                double t = countryTaxSums.get(x);
                double s = countryShippingSums.get(x);
                d += this.sl.get(i).getAmount();
                t += this.sl.get(i).getTax();
                s += this.sp.getShippingCost(this.sl.get(i));
//                System.out.println("amt:"+Double.parseDouble(String.format("%.2f",d)));
//                System.out.println("tax:"+Double.parseDouble(String.format("%.2f",t)));
//                System.out.println("ship"+Double.parseDouble(String.format("%.2f",s)));
                countrySums.set(x,d);
                countryTaxSums.set(x,t);
                countryShippingSums.set(x,s);

            }
        }
    }
    private void printLine(String countryName){
        int x = countries.indexOf(countryName);
        double amt = Double.parseDouble(String.format("%.2f",countrySums.get(x)));
        double tax = Double.parseDouble(String.format("%.2f",countryTaxSums.get(x)));
        double ship = Double.parseDouble(String.format("%.2f",countryShippingSums.get(x)));
        System.out.format("%22s%10s%10s%10s%n",countryName,amt,tax,ship);
    }
}
