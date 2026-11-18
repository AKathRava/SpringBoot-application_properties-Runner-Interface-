//package in.coderarmy.springbootdemo;
//
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.stereotype.Component;
//
//@Component
//public class PaymentGateway {
//
////    @Value("${paymentGateway.type}")
//    private String type;
//
////    @Value("${paymentGateway.retryCount}")
//    private int retryCount;
//
////    public PaymentGateway(@Value("${paymentGateway.type}")String type, @Value("${paymentGateway.retryCount}")int retryCount) {
////        this.type = type;
////        this.retryCount = retryCount;
////    }
//
//    public String getType() {
//        return type;
//    }
//    public void setType(String type) {
//        this.type = type;
//    }
//    public int getRetryCount() {
//        return retryCount;
//    }
//    public void setRetryCount(int retryCount) {
//        this.retryCount = retryCount;
//    }
//}

package in.coderarmy.springbootdemo;

import org.springframework.stereotype.Component;

@Component
public class PaymentGateway {

    private PaymentProperty paymentProperty;

    // Constructor injection for PaymentProperty
    public PaymentGateway(PaymentProperty paymentProperty) {
        this.paymentProperty = paymentProperty;
    }

    // Delegate the getters to the PaymentProperty object
    public String getType() {
        return paymentProperty.getType();
    }

    public int getRetryCount() {
        return paymentProperty.getRetryCount();
    }

    void print()
    {
        System.out.println("Payment Gateway Type : " + getType());
        System.out.println("Payment Gateway Retry Count : " + getRetryCount());
    }
}