package com.david.mc.services;

import org.springframework.mail.SimpleMailMessage;

import com.david.mc.domain.Pedido;

public interface EmailService {
	
	void sendOrderConfirmationEmail(Pedido obj);
	
	void sendEmail(SimpleMailMessage msg);
}
