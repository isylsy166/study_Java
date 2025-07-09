package com.example.payment;

public class Main {
    public static void main(String[] args) {
        PaymentService cardPayment = new CardPaymentService(); // 실제 객체: CardPaymentService
        PaymentService kakaoPay = new KakaoPayService();       // 실제 객체: KakaoPayService

        PaymentProcessor processor1 = new PaymentProcessor(cardPayment);
        processor1.executePayment(5000);   // 결과: 카드 결제

        PaymentProcessor processor2 = new PaymentProcessor(kakaoPay);
        processor2.executePayment(8000);   // 결과: 카카오페이 결제
    }
}
