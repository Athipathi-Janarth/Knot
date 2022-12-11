/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Payment;

import Models.Order.Order;
import java.util.Date;

/**
 *
 * @author nageshsairam
 */
public class Payment {
    private String username;
    private long orgId;
    private String orgname;
    private long orderId;
    private Date paymentDate;
    private Order.OrderStatus status;
    private float amount;
    private long paymentId;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public long getOrgId() {
        return orgId;
    }

    public void setOrgId(long orgId) {
        this.orgId = orgId;
    }

    public String getOrgname() {
        return orgname;
    }

    public void setOrgname(String orgname) {
        this.orgname = orgname;
    }

    public long getOrderId() {
        return orderId;
    }

    public void setOrderId(long orderId) {
        this.orderId = orderId;
    }

    public Date getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(Date paymentDate) {
        this.paymentDate = paymentDate;
    }


    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public long getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(long paymentId) {
        this.paymentId = paymentId;
    }

    public Payment(String username, long orgId, String orgname, Date paymentDate, Order.OrderStatus status, float amount) {
        this.username = username;
        this.orgId = orgId;
        this.orgname = orgname;
        this.orderId = orderId;
        this.paymentDate = paymentDate;
        this.status = status;
        this.amount = amount;
    }

    public Order.OrderStatus getStatus() {
        return status;
    }

    public void setStatus(Order.OrderStatus status) {
        this.status = status;
    }
   
}
