package edu.wctc.springAssignment.impl;

import edu.wctc.springAssignment.iface.ShippingPolicy;

public class FreeShipping implements ShippingPolicy {
    @Override
    public double getShippingCost(Sale sale) {
        return 0;
    }
}
