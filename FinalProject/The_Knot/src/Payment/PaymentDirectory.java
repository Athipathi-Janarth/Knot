/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Payment;

import java.util.ArrayList;

/**
 *
 * @author nageshsairam
 */
public class PaymentDirectory {
    public static long paymentId = 1;
    private ArrayList<Payment> paymentList = new ArrayList<Payment>();

    public ArrayList<Payment> getPaymentList() {
        if(paymentList == null){
            paymentList = new ArrayList<Payment>();
        }
        return paymentList;
    }

    public void setPaymentList(ArrayList<Payment> paymentList) {
        this.paymentList = paymentList;
    }
    
    public Payment addPayment(Payment payment){
        paymentList.add(payment);
        payment.setPaymentId(PaymentDirectory.paymentId);
        PaymentDirectory.paymentId++;     
        return payment;
    }
    
}
