package edu.wctc.springAssignment.iface;
import edu.wctc.springAssignment.impl.Sale;

public interface ShippingPolicy {
    double getShippingCost(Sale sale);
}
