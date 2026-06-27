package org.example.ordersystem.model;

/**
 * This class represents the orders details.
 * @author satya
 * @version 06/27/2026
 */
public class Order {

    private String orderId;
    private String customerId;
    private double amount;
    private String status;

    /**
     * This constructor is used initialize the parameters.
     * @param orderId represents the id of the order.
     * @param customerId represents the id of the customer.
     * @param amount represents the amount of the order.
     * @param status represents the status of the order.
     */
    public Order(String orderId, String customerId, double amount, String status){

        this.customerId = customerId;
        this.amount = amount;
        this.status = status;
        this.orderId = orderId;

    }

    /**
     * This method is used to get the order id;
     * @return the order id.
     */
    public String getOrderId()
    {
        return orderId;
    }

    /**
     * This method is used to set the order id.
     */
    public void setOrderId(){
        this.orderId = orderId;
    }

    /**
     * This method is used to get the customer id.
     * @return the customer id.
     */
    public String getCustomerId(){
        return customerId;
    }

    /**
     * This method is used to set the customer id.
     */
    public void setCustomerId(){
        this.customerId = customerId;
    }

    /**
     * This method is used to get the amount.
     * @return the amount.
     */
    public double getAmount(){
        return amount;
    }

    /**
     * This method is used to set the amount.
     */
    public void setAmount(){
        this.amount = amount;
    }

    /**
     * This method is used to get the status of the order.
     * @return The status.
     */
    public String getStatus(){
        return status;
    }

    /**
     * This method is used to set the status.
     */
    public void setStatus(){
        this.status = status;
    }

}
