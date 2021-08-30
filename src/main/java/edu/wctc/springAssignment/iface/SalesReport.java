package edu.wctc.springAssignment.iface;

import edu.wctc.springAssignment.impl.Sale;

import java.util.List;

public interface SalesReport {
    void generateReport(List<Sale> salesList,ShippingPolicy shippingPolicy);
}
