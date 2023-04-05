package com.cydeo.bootstrap;

import com.cydeo.entity.Merchant;
import com.cydeo.entity.Payment;
import com.cydeo.entity.PaymentDetail;
import com.cydeo.enums.Status;
import com.cydeo.repository.PaymentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.time.LocalDate;
@Component ///Dont forget
public class DataGenerator implements CommandLineRunner {
    private final PaymentRepository paymentRepository;

    public DataGenerator(PaymentRepository paymentRepository) {
        this.paymentRepository = paymentRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Payment payment1 = new Payment(LocalDate.of(2022,4,19),new BigDecimal("150000"), Status.SUCCESS);
        PaymentDetail paymentDetail1 = new PaymentDetail(new BigDecimal("140000"),new BigDecimal("10000"),LocalDate.of(2022,4,24));

        payment1.setPaymentDetail(paymentDetail1);//we didnt put in constructor//we set here

        Payment payment2 = new Payment(LocalDate.of(2022,4,25),new BigDecimal("100000"), Status.FAILURE);
        PaymentDetail paymentDetail2 = new PaymentDetail(new BigDecimal("90000"),new BigDecimal("5000"),LocalDate.of(2022,4,29));

        payment2.setPaymentDetail(paymentDetail2);
//we could repository  paymentDatail pository and we would save them. But weused cascade
        paymentRepository.save(payment1);
        paymentRepository.save(payment2);
        System.out.println(paymentRepository.findById(2L).get().getPaymentDetail().getCommissionAmount());

//paymentRepository.delete(payment1);dont delete from table in company //
        //Thats why @OneToOne(cascade=CascadeType.PERSIST)they usually use this cascade

        Merchant merchant1 = new Merchant("AmazonSubMerchant","M123",new BigDecimal("0.25"),new BigDecimal("3.25"),5);

       // payment1.setMerchant(merchant1);
       // payment2.setMerchant(merchant1);




    }
}
