package com.isrdc.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;
@Controller
public class SMSController {
   @Value("${twilio.auth.token}")
   private String authToken;
   @Value("${twilio.auth.sid}")
   private String authSID;
   @Value("${twilio.auth.number}")
   private String phone;

   @PostMapping("/send_sms")
   public String sendSMS(String name,String phone) {
	   Twilio.init(authSID, authToken);
String message="Hello "+ name +" from Twilio 📞";
       Message.creator(new PhoneNumber("+91"+phone),
                       new PhoneNumber(phone), message).create();
	   return "index";
   }
}














