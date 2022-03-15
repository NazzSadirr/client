package dao;

import model.Payment;

import java.util.List;

public interface PaymentDao {
    List<Payment> paymentList()throws Exception;
}
