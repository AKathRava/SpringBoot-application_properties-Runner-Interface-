package in.coderarmy.springbootdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootDemoApplication {

    public static void main(String[] args) {

//       ApplicationContext context =
         SpringApplication.run(SpringBootDemoApplication.class, args);

//        PaymentGateway paymentGateway = context.getBean(PaymentGateway.class);
////        paymentGateway.setType("Paytm");
////        paymentGateway.setRetryCount(5);
//
////        System.out.println("Payment Gateway Type : " + paymentGateway.getType());
////        System.out.println("Payment Gateway Retry Count : " + paymentGateway.getRetryCount());
//
//        paymentGateway.print();
    }
}