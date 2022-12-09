/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Finance;

import java.util.Date;

/**
 *
 * @author nageshsairam
 */
public class Payment {
    private long orderId;
    private Date paymentDate;
    private float amount;
    private String status;

    public Payment(long orderId, Date paymentDate, float amount, String status) {
        this.orderId = orderId;
        this.paymentDate = paymentDate;
        this.amount = amount;
        this.status = status;
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
