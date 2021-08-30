package edu.wctc.springAssignment.impl;

import edu.wctc.springAssignment.iface.SalesReport;
import edu.wctc.springAssignment.iface.ShippingPolicy;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Service;

import java.beans.beancontext.BeanContext;
import java.util.Formatter;
import java.util.List;

public class SalesReportDetail implements SalesReport {
    private ShippingPolicy sp;
    @Override
    public void generateReport(List<Sale> salesList,ShippingPolicy shippingPolicy) {
        this.sp = shippingPolicy;
        printHead();
        //System.out.printf(salesList.toString());
        salesList.forEach((s) -> printLine(s));
    }
    private void printHead() {
        System.out.println("SALES DETAIL REPORT");
        System.out.format("%22s%22s%10s%10s%10s%n","Who","Where","HowMuch","Tax","Shipping");
    }
    private void printLine(Sale s){
        System.out.format("%22s%22s%10s%10s%10s%n",s.getName(),s.getCountry(),s.getAmount(),s.getTax(), this.sp.getShippingCost(s));
    }
}
