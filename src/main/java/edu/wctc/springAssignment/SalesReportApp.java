package edu.wctc.springAssignment;

import edu.wctc.springAssignment.iface.SalesInput;
import edu.wctc.springAssignment.iface.SalesReport;
import edu.wctc.springAssignment.iface.ShippingPolicy;
import edu.wctc.springAssignment.impl.Sale;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

@Component
public class SalesReportApp {
    private SalesInput salesInput;
    private SalesReport report;
    private ShippingPolicy shippingPolicy;

    private List<Sale> sales = new ArrayList<>();
    //private int currentRound = 1;


    @Autowired
    public SalesReportApp(SalesInput i, SalesReport r, ShippingPolicy sp) {
        this.salesInput = i;
        this.report = r;
        this.shippingPolicy = sp;
        System.out.println("SalesReportApp created");
    }
    public void start() {
        this.sales = this.salesInput.getSales();
        System.out.println("sales gotten");
        this.report.generateReport(this.sales,this.shippingPolicy);

    }
}