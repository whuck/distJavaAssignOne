package edu.wctc.springAssignment;

import edu.wctc.springAssignment.iface.SalesInput;
import edu.wctc.springAssignment.iface.SalesReport;
import edu.wctc.springAssignment.iface.ShippingPolicy;
import edu.wctc.springAssignment.impl.CSVinput;
import edu.wctc.springAssignment.impl.FreeShipping;
import edu.wctc.springAssignment.impl.FlatRateShipping;
import edu.wctc.springAssignment.impl.Sale;
import edu.wctc.springAssignment.impl.SalesReportDetail;
import edu.wctc.springAssignment.impl.SalesReportSummary;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("edu.wctc.springAssignment")
public class AppConfig {
    @Bean
    public SalesInput salesInput() {
        return new CSVinput() {
        };
    }
    @Bean
    public SalesReport salesReport() {
        //return new SalesReportDetail();
        return new SalesReportSummary();
    }
    @Bean
    public ShippingPolicy shippingPolicy() {
        //return new FreeShipping();
        return new FlatRateShipping();
    }

}
