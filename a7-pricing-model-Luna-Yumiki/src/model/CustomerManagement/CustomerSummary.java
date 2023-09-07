/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.CustomerManagement;
import java.util.ArrayList;

import model.OrderManagement.Order;

/**
 *
 * @author kal bugrara
 */
public class CustomerSummary {
    // Order subjectorder;
    // int ordertotal;
    String customerId;
    ArrayList<Order> subjectorders;
    int numberOfOrders;
    int numberOfItems;
    int ordersTotalAmount;
    float averageAmountPerOrder;
    float averageAmountPerItem;
    public CustomerSummary(CustomerProfile cp){
        customerId = cp.getCustomerId();
        subjectorders = cp.orders;
        numberOfOrders = cp.getNumberOfOrders();
        numberOfItems = 0;
        ordersTotalAmount = 0;
        for(Order o:subjectorders){
            numberOfItems = numberOfItems + o.getNumberOfOrderItems();
            ordersTotalAmount = ordersTotalAmount + o.getOrderTotal();
        }

        averageAmountPerOrder = (float) ordersTotalAmount / numberOfOrders;
        averageAmountPerItem = (float) ordersTotalAmount / numberOfItems;

    }
    
    public void printCustomerSummary(){
        System.out.println("| Customer #" + customerId + " | " + ordersTotalAmount + " | " + numberOfOrders + " | " + String.format("%.2f", averageAmountPerOrder) + " | " + numberOfItems + " | " + String.format("%.2f",averageAmountPerItem));
    }
    
    
}
