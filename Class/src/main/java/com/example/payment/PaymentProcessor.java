package com.example.payment;

public class PaymentProcessor {

    private final PaymentService paymentService;

    // 동적 바인딩: 어떤 구현체가 들어오느냐에 따라 런타임 시점에 호출 메서드 결정
    public PaymentProcessor(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    public void executePayment(int amount) {
        paymentService.pay(amount); // 동적 바인딩
    }

}
