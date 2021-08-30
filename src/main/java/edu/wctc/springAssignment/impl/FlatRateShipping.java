package edu.wctc.springAssignment.impl;

import edu.wctc.springAssignment.iface.ShippingPolicy;

public class FlatRateShipping implements ShippingPolicy {
    @Override
    public double getShippingCost(Sale sale) {
        double a = (sale.getAmount() + sale.getTax()) * 0.05;
        String b = String.format("%.2f",a);
        return Double.parseDouble(b);
        //yikes there's got to be a better way :P
    }
}
