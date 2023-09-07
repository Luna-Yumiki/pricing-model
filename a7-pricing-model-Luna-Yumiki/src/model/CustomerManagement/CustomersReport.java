/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.CustomerManagement;

import java.util.ArrayList;

/**
 *
 * @author kal bugrara
 */
public class CustomersReport {
    ArrayList<CustomerSummary> customerlist;
    
    // public CustomersReport(){
        
    // }
    // public void addCustomerSummary(CustomerSummary cs){
        
    // }
    public CustomersReport(){
        customerlist = new ArrayList<>();
    }
    public void addCustomerSummary(CustomerSummary cs){
        customerlist.add(cs);
    }

    public void printCustomersReport(){
        System.out.println("Customers Report");
        for (CustomerSummary cs: customerlist){
            int index = customerlist.indexOf(cs);
            System.out.print((index+1) + " ");
            cs.printCustomerSummary();
        }
    }
}
