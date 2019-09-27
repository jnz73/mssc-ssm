package guru.springframework.msscssm.services;

import guru.springframework.msscssm.domain.Payment;
import guru.springframework.msscssm.domain.PaymentState;
import org.springframework.statemachine.StateMachine;

public interface PaymentService {

    Payment createNewPayment(Payment payment);

    StateMachine<PaymentState, PaymentService> authorize(Long paymentId);

    StateMachine<PaymentState, PaymentService> authorizePayment(Long paymentId);

    StateMachine<PaymentState, PaymentService> declineAuth(Long paymentId);
}
